public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count=0;
        for (int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==0 &&(i==0||flowerbed[i-1]==0)&&
            (i==flowerbed.length-1||flowerbed[i+1]==0)){
                flowerbed[i]=1;
                count++;
                if(count>=n){
                    return true;
                }
            }
        }
        return count >=n;
    }
    public static void main(String[] args) {
        int[] flowerbed = {1,0,0,0,1};
        int n=2;
        CanPlaceFlowers output = new CanPlaceFlowers();
        boolean result = output.canPlaceFlowers(flowerbed, n);
        System.out.println(result);
    }
}
