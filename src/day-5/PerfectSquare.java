public class PerfectSquare {
    public static boolean isPerfectSquare(int num) {
        int result = num/4;
        int i=1;
        while (i<=result+1){
            if(i*i == num){
                return true;
            }else {
                i++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int num = 17;
        if (isPerfectSquare(num)) {
            System.out.println("Given Number is a Perfect Square");
        } else {
            System.out.println("Given Number is not a Perfect Square");
        }
    }
}
