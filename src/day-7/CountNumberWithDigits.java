public class CountNumberWithDigits {
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0) {
            return 1;
        }
        int sum=10;
        int product =9;
        for (int i=2; i<n+1;i++){
            sum = sum+(product*(11-i));
            product=product*(11-i);
        }
        return sum;
    }
    public static void main(String[] args) {
        int n = 0;
        CountNumberWithDigits output = new CountNumberWithDigits();
        int result = output.countNumbersWithUniqueDigits(n);
        System.out.println(result);
    }
}
