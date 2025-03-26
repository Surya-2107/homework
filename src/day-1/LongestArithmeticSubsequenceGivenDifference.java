import java.util.HashMap;

public class LongestArithmeticSubsequenceGivenDifference {
    public int longestSubsequence(int[] arr, int difference) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(arr[0],1);
        for (int i=1; i<arr.length;i++){
            int value=arr[i]-difference;
            if(map.containsKey(value)){
                map.put(arr[i],map.get(value)+1);
            }else {
                map.put(arr[i],1);
            }
        }
        int ans=1;
        for(int i:map.keySet()){
            ans = Math.max(ans,map.get(i));
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int differnce = 1;
        LongestArithmeticSubsequenceGivenDifference output = new LongestArithmeticSubsequenceGivenDifference();
        int result = output.longestSubsequence(arr, differnce);
        System.out.println(result);
    }
}
