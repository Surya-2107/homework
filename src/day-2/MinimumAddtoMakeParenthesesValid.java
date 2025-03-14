public class MinimumAddtoMakeParenthesesValid {
    public int minAddToMakeValid(String s) {
        int open = 0;
        int count = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                open++;
            } else {
                open--;
            }

            if (open < 0) {
                open = 0;
                count++;
            }
        }

        return open + count;
    }
    public static void main(String[] args) {
        String s = "(((";
        MinimumAddtoMakeParenthesesValid output = new MinimumAddtoMakeParenthesesValid();
        int result = output.minAddToMakeValid(s);
        System.out.println(result);
    }
}
