public class PerfectNumber {
    public boolean checkPerfectNumber(int num) {
        if(num<=1){
            return false;
        }
        int total=1;
        for(int i=2; i*i<=num; i++){
            if(num%i == 0){
                total = total +i;
                if(i != num/i) {
                    total = total+(num/i);
                }
            }
        }
        return total==num;
    }
    public static void main(String[] args) {
        int num =7;
        PerfectNumber output = new PerfectNumber();
        boolean result = output.checkPerfectNumber(num);
        System.out.println(result);
    }
}
