public class MissingNumber {
    public int missingNumber(int[] nums) {
        for (int i=0; i<=nums.length;i++){
            int number=0;
            for (int j=0; j<nums.length;j++){
                if (nums[j]==i){
                    number =1;
                    break;
                }
            }
            if(number==0){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        MissingNumber output = new MissingNumber(); 
        int result = output.missingNumber(nums);
        System.out.print(result);
    }
}
