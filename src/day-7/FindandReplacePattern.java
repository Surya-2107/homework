import java.util.ArrayList;
import java.util.List;

public class FindandReplacePattern {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
            List<String> res = new ArrayList<>();
        for (String word : words) {
            if (check(word, pattern)) {
                res.add(word);
        }
    }
        return res;
}
        boolean check(String a, String b) {
            for (int i = 0; i < a.length(); i++) {
                if (a.indexOf(a.charAt(i)) != b.indexOf(b.charAt(i))) return false;
            }
            return true;
        }
    public static void main(String[] args) {
        String[] words = {"abc","deq","mee","aqq","dkd","ccc"}; 
        String pattern = "abb";
        FindandReplacePattern output = new FindandReplacePattern();
        List<String> result = output.findAndReplacePattern(words, pattern);
        System.out.println(result);
    }
}

