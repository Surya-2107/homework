public class AddStrings {
    public String addStrings(String num1, String num2) {
        StringBuilder nums = new StringBuilder();
        int i = num1.length()-1;
        int j = num2.length()-1;
        int rem = 0;
        while(i>=0||j>=0||rem>0){
            int digit1 = (i>=0)? num1.charAt(i--)-'0' : 0;
            int digit2 = (j>=0)? num2.charAt(j--)-'0' : 0;
            int sum = digit1+digit2+rem;
            nums.append(sum%10);
            rem = sum/10;
        }
        return nums.reverse().toString();
    }
    public static void main(String[] args) {
        String num1 = "456";
        String num2 = "77";
        AddStrings output = new AddStrings();
        String result = output.addStrings(num1, num2);
        System.out.println(result);
    }
}
