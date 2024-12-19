public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int i=0;
        int j=nums.length-1;
        while(i<=j){
            int middle = i + (j-i)/2;
            if(nums[middle]==target) {
                return middle;
            }else if (nums[middle]>target) {
                j = middle-1;
            }else {
                i= middle+1;
            }
        }
        return i;
    }
    public static void main (String[] args){
        int[] nums= {1,3,4,6};
        int target=5;
        SearchInsertPosition output = new SearchInsertPosition();
        int result = output.searchInsert(nums,target);
        System.out.println(result);
    }
}