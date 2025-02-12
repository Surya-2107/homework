import java.util.Arrays;
public class MaximumGap {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int n=0;
        int m=0;
        for (int i=1;i<nums.length;i++){
            n=nums[i]-nums[i-1];
            m=Math.max(m,n);
        }
        return m;
    }
    public static void main(String[] args) {
        int[] nums = {3,6,9,1};
        MaximumGap output = new MaximumGap();
        int result = output.maximumGap(nums);
        System.out.println(result);
    }
}
