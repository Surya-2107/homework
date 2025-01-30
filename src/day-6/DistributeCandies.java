import java.util.HashSet;
public class DistributeCandies {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> types = new HashSet<>();
        int canEat = candyType.length/2;
        for (int i=0; i<candyType.length; i++){
            if(types.size() >= canEat){
                return canEat;
            }
            types.add(candyType[i]);
        }
        return Math.min(canEat,types.size());
    }
    public static void main(String[] args) {
        int[] candyType = {1,1,2,2,3,3};
        DistributeCandies output = new DistributeCandies();
        int result = output.distributeCandies(candyType);
        System.out.println(result);
    }
}
