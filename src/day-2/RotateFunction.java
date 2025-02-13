public class RotateFunction {
    public int maxRotateFunction(int[] nums) {
        int sum = 0;
        int function = 0;
        for(int i=0;i<nums.length;i++){
            sum = sum+nums[i];
            function = function + i*nums[i];
        }
        int max=function;
        for (int i=nums.length-1;i>0;i--){
            max=Math.max(max,function+sum-(nums.length*nums[i]));
            function=function+sum-(nums.length*nums[i]);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums = {4,3,2,6};
        RotateFunction output = new RotateFunction();
        int result = output.maxRotateFunction(nums);
        System.out.println(result);
    }
}
