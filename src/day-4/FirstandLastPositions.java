import java.util.Arrays;

public class FirstandLastPositions {
    public int[] searchRange(int[] nums, int target) {
        int first = -1;
        int last = -1;
        for (int i=0; i<nums.length; i++){
            if(nums[i]==target){
                if(first==-1){
                    first = i;
                }
                last = i;
            }
        }
        return new int[]{first,last};
    }
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        FirstandLastPositions output = new FirstandLastPositions();
        int[] result = output.searchRange(nums, target);
        System.out.println(Arrays.toString(result));
    }
}
