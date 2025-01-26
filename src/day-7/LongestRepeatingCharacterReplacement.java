import java.util.HashMap;

public class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map = new HashMap<>();
        int z=0;
        int maxR =0;
        int maxW =0;
        for (int y=0; y<s.length(); y++){
            char ch = s.charAt(y);
            if(!map.containsKey(ch)){
                map.put(ch,0);
            }
            map.put(ch,map.get(ch)+1);
            maxR=Math.max(maxR,map.get(ch));
            if(y-z+1-maxR>k){
                char remove = s.charAt(z);
                map.put(remove,map.get(remove)-1);
                z++;
            }
            maxW=Math.max(maxW,y-z+1);
        }
        return maxW;
    }
    public static void main(String[] args) {
        String s ="AABABBA";
        int k=1;
        LongestRepeatingCharacterReplacement output = new LongestRepeatingCharacterReplacement();
        int result = output.characterReplacement(s, k);
        System.out.println(result);
    }
}
