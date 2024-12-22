public class SingleNumber {
    public int singleNumber(int[] nums){
        int number = 0;
        for (int i=0; i<nums.length; i++){
            number = number^nums[i];
        }
        return number;
    }
    public static void main(String[] args) {
        int[] nums= {4,1,2,1,2};
        SingleNumber output = new SingleNumber();
        int result = output.singleNumber(nums);
        System.out.println(result);
    }
}
