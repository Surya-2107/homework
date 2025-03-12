public class ShiftingLetters {
    public String shiftingLetters(String s, int[] shifts) {
        char[] c=s.toCharArray();
        int sum=0;
       
        for(int i=c.length-1;i>=0;i--){
            sum=(sum+shifts[i])%26;
             c[i]=(char)('a'+((sum+c[i]-'a')%26));
        }
        return new String(c);
    }
    public static void main(String[] args) {
        String s = "abc";
        int[] shifts = {3,5,9};
        ShiftingLetters output = new ShiftingLetters();
        String result = output.shiftingLetters(s, shifts);
        System.out.println(result);
    }
}
