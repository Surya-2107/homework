public class NonDecreasingArray {
    public boolean checkPossibility(int[] nums) {
        int value = 0;
        int n = nums.length;
        for (int i=1; i<n; i++) {
            if(nums[i] < nums [i-1]){
                value++;
                if(value>1) {
                    return false;
                }
                if(i-2 >=0 && nums[i] < nums[i-2]) {
                    nums[i] = nums[i-1];
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] nums = {4,2,3};
        NonDecreasingArray output = new NonDecreasingArray();
        boolean result = output.checkPossibility(nums);
        System.out.println(result);
    } 
}
