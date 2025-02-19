import java.util.Arrays;

class Solution {

    public static boolean containsDuplicate(int[] nums) {
        // solution, sort the array, this means its all in order, so if like nums1[] would go to
        // {1,1,2,3}, then the for method would check nums[i] which starts at 0 which would be 
        // 1 == then for nums[i+1], that means to check the next one in front of it which would 
        // be 1 == 1, which would make it true;
        // the sort is the biggest thing here since it automatically makes it so that all the duplicates would be
        // next to each other
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i+1]) {
                return true;
            }
        }
        return false;
}

    public static void main(String[] args) {
        //test cases
        int nums1[] = {1,2,3,1};
        int nums2[] = {1,2,3,4};
        int nums3[] = {1,1,1,3,3,4,3,2,4,2};
        int nums4[] = {2,14,18,22,22};
        int nums5[] = {2,3,100,22,22,100};
        
        System.out.println(containsDuplicate(nums1)); //true
        System.out.println(containsDuplicate(nums2)); //false
        System.out.println(containsDuplicate(nums3)); //true
        System.out.println(containsDuplicate(nums4)); //true
        System.out.println(containsDuplicate(nums5)); //true
    }
}