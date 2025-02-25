/* 
 * 
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
 * 
 * EXPLANATION
 * There is no string in strs that can be rearranged to form "bat".
 * The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
 * The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.
 */

import java.util.Arrays;

class groupAnagram_BruteForce {
    
    /*
     * 
     * method that takes the array and returns if the index at position is a string
     * 
     */
    public static void isAnagram(String[] strs) {
        String reversedString;
        reversedString = strs[0];

        // thought process: double for loop again
        // check 1st against next by the reverse
        // if equal then that means its anagram
        // trouble 1: now that i cant just reverse it, how would i find if its an anagram...
        // trouble 2: how to group them though...

    }
    
    public static void main(String[] args) {
        //test cases

        // Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
    }
}
