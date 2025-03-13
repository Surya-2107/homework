import java.util.Arrays;

public class MinimumIncrementToMakeArrayUnique {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int cnt = 0;
        for (int n : nums) {
        i = Math.max(i, n);
        cnt += i++ - n;
    }
    return cnt;
  }
  public static void main(String[] args) {
    int[] nums = {1,2,2};
    MinimumIncrementToMakeArrayUnique output = new MinimumIncrementToMakeArrayUnique();
    int result = output.minIncrementForUnique(nums);
    System.out.println(result);
  }
}
