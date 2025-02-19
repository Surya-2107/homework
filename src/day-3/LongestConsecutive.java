import java.util.Arrays;

public class LongestConsecutive {
    public int longestConsecutive(int[] nums) {
        if (nums.length==0) {
            return 0;
        }
        Arrays.sort(nums);
        int maxi=1;
        int temp=1;
        for (int i=0; i<nums.length-1; i++) {
            if (nums[i] == nums[i+1]) {
                continue;
            }else if (nums[i]+1 == nums[i+1]) {
                temp++;
            }else {
                maxi = Math.max(maxi,temp);
                temp=1;
            }
        }
        return maxi>temp? maxi:temp;
    }
    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        LongestConsecutive output = new LongestConsecutive();
        int result = output.longestConsecutive(nums);
        System.out.println(result);
    }
}
