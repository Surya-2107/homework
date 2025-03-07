import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {
    public List<String> letterCasePermutation(String s) {
        List<String> perm = new ArrayList<>();
        if (s == null) {
            return perm;
        }
        
        perm.add(s);
        
        for (int i=0; i<s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                int n = perm.size();
                
                for (int j=0; j<n; j++) {
                    char[] ch = perm.get(j).toCharArray();
                    if (Character.isUpperCase(ch[i])) {
                        ch[i] = Character.toLowerCase(ch[i]);
                    } else {
                        ch[i] = Character.toUpperCase(ch[i]);
                    }
                    
                    perm.add(String.valueOf(ch));
                }
            }
        }
        
        return perm;
    }
    public static void main(String[] args) {
        String s = "a1b2";
        LetterCasePermutation output = new LetterCasePermutation();
        List<String> result = output.letterCasePermutation(s);
        System.out.println(result);
    }
}
