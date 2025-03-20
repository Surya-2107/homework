import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberofOccurrences {
        public boolean uniqueOccurrences(int[] arr) {
            Map<Integer, Integer> map = new HashMap<>();
		    for (int num : arr) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		    Set<Integer> set = new HashSet<>(map.values());
		    return set.size()==map.keySet().size();
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,1,3};
        UniqueNumberofOccurrences output = new UniqueNumberofOccurrences();
        boolean result = output.uniqueOccurrences(arr);
        System.out.println(result);
    }
}
