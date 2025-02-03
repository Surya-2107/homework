public class FindErrorNumber {
    public int[] findErrorNums(int[] nums) {
        int[] res = new int[2];
       int[] temp = new int[nums.length];
       for(int i=0; i<nums.length; i++){
           temp[nums[i]-1] += 1;
       }
       for(int i=0; i<nums.length; i++){
           if(temp[i] == 0)
               res[1] = i+1;
           if(temp[i] == 2)
               res[0] = i+1;
       }
       return res;
   }
   public static void main(String[] args) {
    int[] nums = {1,2,2,4};
    FindErrorNumber output = new FindErrorNumber();
    int[] result = output.findErrorNums(nums);
    System.out.println(result);
   }
}
