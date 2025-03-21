import java.util.Stack;

public class RemoveAllAdjacentDuplicatesinString {
        public String removeDuplicates(String s, int k) {
        char[] SC = s.toCharArray();
        int i;
        int j;
        Stack<Integer> st = new Stack<>();
        st.add(0);
        for (i = 1, j = 1; j < s.length(); i++, j++) {
            char chr = SC[i] = SC[j];
            if (i == 0 || chr != SC[i-1]) st.add(i);
            else if (i - st.peek() + 1 == k) i = st.pop() - 1;
        }
        return new String(SC, 0, i);
    }
    public static void main(String[] args) {
        String s = "abcd";
        int k = 2;
        RemoveAllAdjacentDuplicatesinString output = new RemoveAllAdjacentDuplicatesinString();
        String result = output.removeDuplicates(s, k);
        System.out.println(result);
    }
}
