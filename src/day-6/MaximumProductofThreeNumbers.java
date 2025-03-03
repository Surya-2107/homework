import java.util.Arrays;

public class MaximumProductofThreeNumbers {
    public int maximumProduct(int[] nums) {
        int i = nums.length;
        Arrays.sort(nums);
        int max1 = nums[i-1]*nums[i-2]*nums[i-3];
        int max2 = nums[0]*nums[1]*nums[i-1];
        if(max1>max2){
            return max1;
        }
        else{
            return max2;
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        MaximumProductofThreeNumbers output = new MaximumProductofThreeNumbers();
        int result = output.maximumProduct(nums);
        System.out.println(result);
    }
}
