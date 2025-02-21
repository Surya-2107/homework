import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesinanArray {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i=0; i<nums.length; ++i){
            int index = Math.abs(nums[i])-1;
            if (nums[index]<0){
                result.add(Math.abs(index+1));
            }
            nums[index] = -nums[index];
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        FindAllDuplicatesinanArray output = new FindAllDuplicatesinanArray();
        List<Integer> result = output.findDuplicates(nums);
        System.out.println(result);
    }
}
