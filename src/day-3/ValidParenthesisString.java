public class ValidParenthesisString {
    public boolean checkValidString(String s) {
        int low = 0;
        int high = 0;
        for (int i=0; i<s.length(); i++){
            if (s.charAt(i) == '(') {
                low++;
                high++;
            }else if (s.charAt(i) == ')') {
                if(low>0) {
                    low--;
                }
                high--;
            }else {
                if (low>0) {
                    low--;
                }
                high++;
            }
            if (high<0) {
                return false;
            }
        }
        return low == 0;
    }
    public static void main(String[] args) {
        String s = "()";
        ValidParenthesisString output = new ValidParenthesisString();
        boolean result = output.checkValidString(s);
        System.out.println(result);
    }
}
