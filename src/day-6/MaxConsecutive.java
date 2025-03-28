public class MaxConsecutive {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count =0;
        int max=0;
        for (int i=0; i<nums.length;i++){
            if(nums[i] == 1) {
                count++;
            }else {
                max=Math.max(max,count);
                count=0;
            }
        }
        if(count>max){
            max=count;
        }
        return max;
    }
    public static void main (String[] args){
        int[] nums = {1,1,0,1,1,1};
        MaxConsecutive output = new MaxConsecutive();
        int result=output.findMaxConsecutiveOnes(nums);
        System.out.println(result);
    }
}
