import java.util.Arrays;

public class PreviousPermutationWithOneSwap {
    public int[] prevPermOpt1(int[] arr) {
        int index = arr.length -2;
        int i = arr.length -1;
        while (index >=0 && arr[index] <= arr[index+1]) {
            index--;
        }
        if (index<0) {
            return arr;
        }
        while (arr[i] >= arr[index] || (i>0 && arr[i]==arr[i-1])){
            i--;
        }
        int temp = arr[i];
        arr[i] = arr[index];
        arr[index] = temp;
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {3,2,1};
        PreviousPermutationWithOneSwap output = new PreviousPermutationWithOneSwap();
        int[] result = output.prevPermOpt1(arr);
        System.out.println(Arrays.toString(result));
    }
}
