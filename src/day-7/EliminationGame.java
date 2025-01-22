public class EliminationGame {
    public int lastRemaining(int n) {
        boolean left=true;
        int x=1;
        int y=1;
        while(n>1){
            if(left||n%2==1){
                x=x+y;
            }
            y=y*2;
            n=n/2;
            left=!left;
        }
        return x;
    }
    public static void main(String[] args) {
        int n =9;
        EliminationGame output = new EliminationGame();
        int result = output.lastRemaining(n);
        System.out.println(result);
    }
}
