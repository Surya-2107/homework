import java.util.Stack;

public class ValidParenthesis {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(int i=0; i<s.length(); i++){
            if (s.charAt(i)=='(') {
                stack.push(')');
            }else if (s.charAt(i) == '{') {
                stack.push('}');
            }else if (s.charAt(i) == '['){
                stack.push(']');
            }else if (stack.isEmpty()|| stack.pop()!=s.charAt(i)){
                return false;   
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String s= "[{}()]";
        ValidParenthesis output = new ValidParenthesis();
        boolean result = output.isValid(s);
        System.out.println(result);
    }
}
