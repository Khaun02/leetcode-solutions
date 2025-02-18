class Solution {

    public static boolean containsDuplicate(int[] nums) {
        int numToCheck = nums[0];
        for (int i = 0; i < nums.length-1; i++) {
            if (numToCheck == nums[i+1]) {
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
        
        System.out.println(containsDuplicate(nums1));
        System.out.println(containsDuplicate(nums2));
        System.out.println(containsDuplicate(nums3));
    }
}