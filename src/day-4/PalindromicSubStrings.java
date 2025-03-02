public class PalindromicSubStrings {
    public int countSubstrings(String s) {
        int m=0;
        for (int i=0; i<s.length(); i++){
            int j=i-1;
            int k=i;
            while (k<s.length() -1 && s.charAt(k) == s.charAt(k+1)) {
                k++;
            }
            m = m + (k-j) * (k-j+1) /2;
            i = k++;
            while (j>=0 && k<s.length() && s.charAt(k++) == s.charAt(j--)) {
                m++;
            }
        }
        return m;
    }
    public static void main(String[] args) {
        String s = "aaa";
        PalindromicSubStrings output = new PalindromicSubStrings();
        int result = output.countSubstrings(s);
        System.out.println(result); 
    }
}
