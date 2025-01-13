import java.util.Arrays;
public class Product {
        public int[] productExceptSelf(int[] nums) {
            int n= nums.length;
            int[] ans = new int[n];
            int prodL = 1;
            int prodR = 1;
            for (int i =n-1; i>-1; i--){
                ans[i] = prodR;
                prodR = prodR* nums[i];
            }
            for (int i=0; i<nums.length; i++){
                ans[i] = prodL * ans[i];
                prodL = prodL * nums[i];
            }
            return ans;
            }
            public static void main(String[] args) {
                int[] nums = {1, 2, 3, 4};
                Product output = new Product(); 
                int[] result = output.productExceptSelf(nums);
                System.out.print(Arrays.toString(result));
        }
}
    

