public class PivotIndex {
    public int pivotIndex(int[] nums) {
        int left = 0;
        int total = 0;
        for (int i=0; i<nums.length; i++){
            total = total + nums[i];
        }
        for (int i=0; i<nums.length; i++){
          int  right = total-left - nums[i];
            if (left == right) {
                return i;
            }
            left = left+nums[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        PivotIndex output = new PivotIndex();
        int result = output.pivotIndex(nums);
        System.out.println(result);
    }
}
