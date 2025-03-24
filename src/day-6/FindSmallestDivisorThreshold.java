public class FindSmallestDivisorThreshold {
    public int smallestDivisor(int[] nums, int threshold) {
        int min = 1;
        int max = 1000000;
        while (min<max) {
            int avg = (min+max) >>1;
            int sum=0;
            for(int num:nums){
                sum = sum + (num+avg-1)/avg;
            }
        if(sum <=threshold) {
            max = avg;
        }else {
            min = avg+1;
        }
    }
    return min;
}
public static void main(String[] args) {
    int[] nums = {1,2,5,9};
    int threshold = 6;
    FindSmallestDivisorThreshold output = new FindSmallestDivisorThreshold();
    int result = output.smallestDivisor(nums,threshold);
    System.out.println(result);
}
}
