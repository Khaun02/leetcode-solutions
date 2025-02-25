/* 
 * 
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
 * 
 * EXPLANATION
 * There is no string in strs that can be rearranged to form "bat".
 * The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
 * The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class groupAnagram_BruteForce {
    
    /*
     * 
     * method that takes the array and returns if the index at position is a string
     * 
     * 02.21.25
        // thought process: double for loop again
        // check 1st against next by the reverse
        // if equal then that means its anagram
        // trouble 1: now that i cant just reverse it, how would i find if its an anagram...
        // trouble 2: how to group them though...''
     * 
     * 02.24.25
     * original thought process: i thought about it, to see if anagram just sort and see if its equal
     * 
     * q1: how do i know how many arraylist to create though...
     * s1: chatgpt told me to check for unique identifier, still confused
     * s1 cont: then gave me hint about keys and pairs, so first time implementing "hashmap"!
     */
    public static List<List<String>> isAnagram(String[] strs) {
        
        // declaration of variables
        String sortedString;
        sortedString = strs[0];
        List<List<String>> masterAnagramList = new ArrayList<>();
        List<String> anagramList = new ArrayList<>();

        // first time implementing hashmap
        HashMap<String, String> anagramPairs = new HashMap<String, String>();

        // edge cases
        if (strs.length == 0) {
            return masterAnagramList;
        }

        // calculation 1: go through iteratively, sort and then add to the hashmap
        for (int i = 0; i < strs.length-1; i++) {
            // maybe helper method here?
        }

        return masterAnagramList;
    }
    
    public static void main(String[] args) {
        //test cases

        // Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
    }
}
