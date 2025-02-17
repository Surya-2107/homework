import java.util.HashSet;
import java.util.Set;

public class FindTheDuplicateNumber {
    public int findDuplicate(int[] nums) {
        Set<Integer> map = new HashSet<>();
        for (int i=0; i<nums.length; i++){
            if(map.contains(nums[i])){
                return nums[i];
            }else {
                map.add(nums[i]);
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        FindTheDuplicateNumber output = new FindTheDuplicateNumber();
        int result = output.findDuplicate(nums);
        System.out.println(result);
    }
}
