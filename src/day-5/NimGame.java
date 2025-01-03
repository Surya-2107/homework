public class NimGame {
    public static boolean canWinNim(int n) {
        if(n%4==0){
           return false;
        }else {
           return true;
        }
   }
   public static void main(String[] args) {
    int n = 33;
    if (canWinNim(n)){
        System.out.println(true);
    }else {
        System.out.println(false);
    }
   }
}
