import java.util.ArrayList;
import java.util.List;

public class FindDisAppearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
    ArrayList<Integer> arr =new ArrayList<>();
    int[] dis = new int[nums.length+1];
    for (int i=0;i<nums.length;i++){
        dis[nums[i]]=dis[nums[i]]+1;
    }
    for (int i=1; i<=nums.length; i++){
        if(dis[i]<=0){
            arr.add(i);
        }
    }
    return arr;
    }
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        FindDisAppearedNumbers output = new FindDisAppearedNumbers();
        List<Integer> result = output.findDisappearedNumbers(nums);
        System.out.println(result);
    }
}