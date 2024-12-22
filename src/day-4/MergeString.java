public class MergeString {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder str=new StringBuilder();
        int i=0;
        int j=0;
        while (i<word1.length()|| j<word2.length()){
            if(i<word1.length()){
            System.out.print(word1.charAt(i));
            i++;
        }
            if(j<word2.length()){
            System.out.print(word2.charAt(j));
            j++;
        }
        }
        return str.toString();
    }
    public static void main(String[] args) {
        String word1 = "listen";
        String word2 = "silent";
        MergeString output = new MergeString();
        String result = output.mergeAlternately(word1,word2);
        System.out.println(result);
    }
}
