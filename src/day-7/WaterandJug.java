public class WaterandJug {
    public boolean canMeasureWater(int x, int y, int target) {
        if (x+y<target){
            return false;
        }
        if(x==target||y==target ||x+y==target){
            return true;
        }
        return target% gcd(x,y) ==0;
    }
    int gcd (int a, int b) {
        while (b!=0) {
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public static void main(String[] args) {
        int x=2; 
        int y=6; 
        int target=5;
        WaterandJug output = new WaterandJug();
        boolean result = output.canMeasureWater(x, y, target);
        System.out.println(result);
    }
}
