public class MajorityElement {
    public int majorityElement(int[] nums) {
        int count=0;
        int element=0;
        for (int i=0; i<nums.length;i++) {
            if(count==0){
                element = nums[i];
            }else if (element == nums[i]){
                count++;
            }else {
                count--;
            }
        }
        return element;
    }
    public static void main(String[] args) {
        int[] nums= {2,2,1,2,1,1,1};
        MajorityElement output = new MajorityElement();
        int result = output.majorityElement(nums);
        System.out.println(result);
    }
}
