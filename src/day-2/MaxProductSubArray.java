public class MaxProductSubArray {
    public int maxProduct(int[] nums) {
        int m = nums[0];
        int prefix=1;
        int suffix=1;
        for (int i=0;i<nums.length;i++){
            if(prefix==0){
                prefix=1;
            }
            if(suffix==0){
                suffix=1;
            }
        prefix=prefix*nums[i];
        suffix=suffix*nums[nums.length-i-1];
        m=Math.max(m,Math.max(prefix,suffix));
        }
        return m;
    }
    public static void main(String[] args) {
        int[] nums = {2,3,-2,4};
        MaxProductSubArray output = new MaxProductSubArray();
        int result = output.maxProduct(nums);
        System.out.println(result);
    }
}
