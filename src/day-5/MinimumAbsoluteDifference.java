import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> resultArr = new ArrayList<>();
        int minDiff = Integer.MAX_VALUE;

        for(int i=1; i<arr.length; i++){
            int diff =  arr[i] - arr[i-1];
            if(diff < minDiff){
                resultArr.clear();
                minDiff = diff;
            }
            if(minDiff == diff){
                resultArr.add(Arrays.asList(arr[i-1], arr[i]));
            }
        }
        return resultArr;
    }
    public static void main(String[] args) {
        int[] arr = {3,8,-10,23,19,-4,-14,27};
        MinimumAbsoluteDifference output = new MinimumAbsoluteDifference();
        List<List<Integer>> result = output.minimumAbsDifference(arr);
        System.out.println(result);
    }
}
