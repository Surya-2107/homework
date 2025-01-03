public class UglyNumber {
    public static boolean isUgly(int n) {
        if(n <= 0) {
            return false;
        }
        if(n<=6) {
            return true;
        }
        while (n>1) {
            if (n%2==0) {
                n=n/2;
            }else if (n%3==0) {
                n=n/3;
            }else if (n%5==0) {
                n=n/5;
            }
            return false;
        }
        return false;
    }
    public static void main(String[] args) {
        int n = 7;
        if (isUgly(n)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
