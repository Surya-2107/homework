public class JumpGame {
    public boolean canJump(int[] nums) {
        int maxReach=0;
        for (int i=0; i<nums.length; i++){
            if(i>maxReach) {
                return false;
            }
        maxReach=Math.max(maxReach, i+nums[i]);
        }
        return true;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,1,0,4};
        JumpGame output = new JumpGame();
        boolean result=output.canJump(nums);
        System.out.println(result);
    }
}
