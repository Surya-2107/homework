public class NumberComplement {
    public int findComplement(int num) {
        StringBuilder s = new StringBuilder();
        while (num>0) {
            int t=num%2;
            s.insert(0,t);
            num = num/2;
        }
        for (int i=0; i<s.length(); i++){
            if(s.charAt(i)=='1'){
                s.setCharAt(i, '0');
            }else {
                s.setCharAt(i, '1');
            }
        }
        return Integer.parseInt(s.toString(),2);
    }
    public static void main(String[] args) {
        int num = 5;
        NumberComplement output = new NumberComplement();
        int result=output.findComplement(num);
        System.out.println(result);
    }
}
