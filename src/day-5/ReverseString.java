public class ReverseString {
    public String reverseWords(String s) {
        s=s.trim();
        int n=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)== ' ' ){
                n++;
            }
        }
        String[] words = new String[n+1];
        int j=0;
        for (int i=0; i<s.length();i++){
            String st = "";
            while (i<s.length() && s.charAt(i)!=' ') {
                st = st+s.charAt(i);
                i++;
            }
            words[j]=st;
            j++;
        }
    StringBuilder str = new StringBuilder();
    for(int i=words.length-1;i>=0;i--){
        if(words[i]==""){
            continue;
        }
        str.append(words[i]);
        if(i>0){
            str.append(" ");
        }
    }
    return str.toString();
}
public static void main(String[] args) {
    String s= "hello world";
    ReverseString output = new ReverseString();
    String result = output.reverseWords(s);
    System.out.println(result);
}
}
