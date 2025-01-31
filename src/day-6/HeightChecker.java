import java.util.Arrays;

public class HeightChecker {
    public int heightChecker(int[] heights) {
        int num = heights.length;
        int total = 0;
        int expected[] = new int[num];
        for (int i=0; i<num;i++) {
            expected[i] = heights[i];
        }
        Arrays.sort(expected);
        for (int i=0; i<num; i++){
            if(heights[i] != expected[i]){
                total++;
            }
        }
        return total;
    }
    public static void main(String[] args) {
        int[] heights = {1,1,4,2,1,3};
        HeightChecker output = new HeightChecker();
        int result = output.heightChecker(heights);
        System.out.println(result);
}
}
