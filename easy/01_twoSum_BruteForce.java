import java.util.*;

class twoSum_BruteForce {
    public static int[] twoSum(int[] nums, int target) {
        // thought process: go in order with for loop
        // i and then i+1, add then together and keep moving?

        // did this before with largestPalindrome
        // brute force double for loop
        int[] answer = new int[2];

        // first stuck: nums=[2,5,5,11] target=10
        // its giving [2,1] instead of [1,2]
        for (int i = 0; i <= nums.length-1; i++) {
            for (int j = 1; j <= nums.length-1; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    // this fixed the stuck!
                    // fixed it so it goes it in smaller to bigger order?
                    if (j > i) {
                        answer[1] = j;
                        answer[0] = i;
                    }
                    else {
                        answer[0] = j;
                        answer[1] = i;
                    }
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] nums1 = {3,4,5,6};
        int[] nums2 = {4,5,6};
        int[] nums3 = {5,5};

        int target1 = 7;
        int target2 = 10;
        int target3 = 10;
        System.out.println(Arrays.toString(twoSum(nums1, target1)));
        System.out.println(Arrays.toString(twoSum(nums2, target2)));
        System.out.println(Arrays.toString(twoSum(nums3, target3)));

    }
}