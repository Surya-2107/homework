public class PlussOne {
    public int[] plusOne(int[] digits){
        for (int i=digits.length-1; i>=0; i--){
            if(digits[i]<9){
                digits[i]=digits[i]+1;
                return digits;
            }
            digits[i]=0;
        }
        digits = new int [digits.length+1];
        digits[0]=1;
        return digits;
    }
    public static void main(String[] args) {
        int[] digits = {1, 2, 3, 2, 5, 6};
        PlussOne output = new PlussOne(); 
        int[] result = output.plusOne(digits);
        System.out.print("[");
         for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print("]");
}
}