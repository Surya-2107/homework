public class FindtheDifference {
    public char findTheDifference(String s, String t) {
        StringBuilder st = new StringBuilder(s);
        int i=0;
        for(i=0; i<t.length();i++){
            for(int j=0;j<st.length();j++){
                if(st.charAt(j)==t.charAt(i)){
                    st.deleteCharAt(j);
                    break;
                }
                if(j==st.length()-1){
                    return t.charAt(i);
                }
            }
        }
        return t.charAt(i-1);
    }
    public static void main(String[] args) {
        String s= "abc";
        String t = "abcd";
        FindtheDifference output = new FindtheDifference();
        char result = output.findTheDifference(s,t);
        System.out.println(result);
    }
}
