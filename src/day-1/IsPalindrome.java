public class IsPalindrome {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()){
            return true;
        }
        int start = 0;
        int last = s.length()-1;
        while (start<=last) {
            char cF = s.charAt(start);
            char cL = s.charAt(last);
            if (!Character.isLetterOrDigit(cF)){
                start++;
            }else if (!Character.isLetterOrDigit(cL)){
                last--;
            }else {
                if (Character.toLowerCase(cF)!=Character.toLowerCase(cL)){
                    return false;
                }
                start++;
                last--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        IsPalindrome output = new IsPalindrome();
        boolean result = output.isPalindrome(s);
        System.out.println(result);
    }
}
