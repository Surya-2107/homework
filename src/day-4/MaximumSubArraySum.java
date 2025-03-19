public class MaximumSubArraySum {
    public int maximumSum(int[] arr) {
        int x = arr[0];
        int y = arr[0];
        int z = arr[0];
        int n = arr.length;
        for(int i=1; i<n; i++){
            x= Math.max(z,x+arr[i]);
            z= Math.max(z+arr[i],arr[i]);
            y= Math.max(y,Math.max(x,z));
        }
        return y;
    }
    public static void main(String[] args) {
        int[] arr = {1,-2,0,3};
        MaximumSubArraySum output = new MaximumSubArraySum();
        int result = output.maximumSum(arr);
        System.out.println(result);
    }
}
