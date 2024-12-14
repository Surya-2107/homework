package Leet1;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++){
            int diff= target-nums[i];
            if(map.containsKey(diff)){
                return new int[] {
                    map.get(diff), i
                };
            }
            map.put(nums[i], i);
            }
            return new int[] {};
        }
    public static void main(String[] args) {
        int nums[] = {1,3,6,4,8,9};
        int target = 10;
        TwoSum ts = new TwoSum();
        int[] result = ts.twoSum(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
    }

