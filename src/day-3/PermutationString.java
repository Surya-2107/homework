import java.util.HashMap;

public class PermutationString {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for (char C: s1.toCharArray()) {
            map1.put (C, map1.getOrDefault(C,0) + 1);
        }
        for (int i=0; i<=s2.length() - s1.length(); i++) {
            String subString = s2.substring(i, i+s1.length());
            for (char S: subString.toCharArray()) {
                map2.put (S, map2.getOrDefault(S, 0) + 1);
            }
            if (map1.equals(map2)) {
                return true;
            }else {
                map2.clear();
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        PermutationString output = new PermutationString();
        boolean result = output.checkInclusion(s1, s2);
        System.out.println(result);
    }
}
