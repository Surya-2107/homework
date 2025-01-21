public class SumofTwoIntegers {
    public int getSum(int a, int b) {
        while (b!=0){
            int out=(a&b)<<1;
            int ans=a^b;
            a=ans;
            b=out;
        }
        return a;
    }
    public static void main(String[] args) {
        int a=2;
        int b=3;
        SumofTwoIntegers output = new SumofTwoIntegers();
        int result =output.getSum(a, b);
        System.out.println(result);
    }
}
