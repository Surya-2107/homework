public class IntegerReplacement {
    public int integerReplacement(int n) {
        int i=0;
        while(n!=1){
            if((n&1)==0){
                n>>>=1;
            }else if (n!=3 && (n&3)==3){
                ++n;
            }else {
                --n;
            }
            ++i;
        }
        return i;
    }
    public static void main(String[] args) {
        int n = 8;
        IntegerReplacement output = new IntegerReplacement();
        int result = output.integerReplacement(n);
        System.out.println(result);
    }
}
