import java.util.HashMap;

public class FirstUniqueCharacterInString {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map =new HashMap<>();
        char[] ch = s.toCharArray();
        for ( int i=0; i<ch.length; i++){
            char c=ch[i];
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for (int j=0; j<s.length();j++){
            if(map.get(s.charAt(j))==1){
                return j;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String s="loveleetcode";
        FirstUniqueCharacterInString output = new FirstUniqueCharacterInString();
        int result = output.firstUniqChar(s);
        System.out.println(result);
    }
}
