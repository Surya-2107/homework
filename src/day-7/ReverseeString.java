public class ReverseeString {
    public char[] reverseString(char[] s) {
        int i=0;
        int j=s.length-1;
        while (i<=j){
            char ans = s[i];
            s[i] = s[j];
            s[j] = ans;
            i++;
            j--;
        }
        return s;
    }
    public static void main(String[] args) {
        char[] s= {'h','e','l', 'l', 'o'};
        ReverseeString output = new ReverseeString();
        char[] result = output.reverseString(s);
        System.out.print("{");
        for (int i = 0; i < result.length; i++) {
            System.out.print("'" + result[i] + "'");
            if (i < result.length - 1) {
                System.out.print(", "); 
            }
        }
                System.out.println("}");
    
}
}



   

