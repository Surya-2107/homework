package Leet1;
import java.util.HashMap;

public class containsDuplicate {
    public static boolean Duplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length;i++ ) {
            if (map.containsKey(nums[i])) {
                return true;  
            }
            map.put(nums[i], 1);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        if (Duplicate(nums)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
