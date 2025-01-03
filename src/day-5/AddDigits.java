public class AddDigits {
    public int addDigits(int num) {
        if (num == 0){
            return 0;
        }
        if (num%9 ==0){
            return 9;
        }else {
            return num%9;
        }
    }
    public static void main(String[] args){
        int input = 1234;
        AddDigits answer = new AddDigits();
        int output=answer.addDigits(input);
        System.out.println(output);
    }
}
