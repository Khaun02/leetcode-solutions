import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class x_largestPalindrome_bruteForce {

    // this method checks to see if a integer, n, is a palindrome
    // to do this would split in half, or idk, and see if the first half
    // can be read the same as the second half
    // stuck: what to do if its like 121?

    // to check if palindrome, get the number, make it into a string? or an array?
    // then check it against itself reversed?
    // (906609) = string.reverse(906609) or something
    // if no reverse method could just for loop the string reverse starting at last index
    // 1052 != 2501 but 9009 DOES EQUAL 9009
    public static boolean isPalindrome(int n) {
        
        String palindrome = Integer.toString(n);
        String reversePalindrome = "";

        // start the the end index of palindrome's length
        // it will keep going while i >= 0; stopping at 0
        // it will decrement by 1
        // the function then adds the last char of palindrome to reversePalindrome
        // essentially creating a reverse of it
        for (int i = palindrome.length()-1; i >= 0; i--) {
            reversePalindrome += palindrome.charAt(i);
        }

        // if the reverse, right to left, is the same as the original, then its a palindrome
        if (reversePalindrome.equalsIgnoreCase(palindrome)) {
            return true;
        }

        return false;
    }


    // this method does the calculations but then uses the isPalindrome helper
    // method to check if its a palindrome, if it is then it sets the
    // variable to be it

    /*
     * 
     * could not optimize for n = 5 on coderpad
     * optimization: consider other cases
     * edge case: consider edge cases?
     * 
     */
    public static int largestPalindrome(int n) {

        // declaration of variables
        int biggestPalindrome = 0; // a variable that will track the biggestPalindrome so far, sets at 0
        int upperBound; // gets the upper range to check against | ex: input = 2 then upper bound is 99
        int lowerBound; // gets the range for the lower bound | ex: input = 2 then lower bound is 10
        int current; // the value that is going to be checked

        // calculations
        upperBound = (int) Math.pow(10, n)-1; // exm if n = 2 | upperBOund = 10^2 = 100-1 = 99
        lowerBound = (int) Math.pow(10, n-1); //ex: if n = 2 | lowerBound = 10^ (2-1) = 10^1 =10

        // QUESTION: why is it when i added 5, it started working
        int forLoopUpper = (int) ((int) upperBound-Math.pow(10, n-1));
        // this is to optimize it slightly, since i assume the bigger palindrome numbers will always be above 5*10^n-1
        int forLoopLower = (int) ((int) Math.pow(10, n-1)*8);

        // brute force, 2 for loops
        // I GOT IT, 10 is for 10; should be 100 for 3
        // question: how am i going to 99 though..
        for (int i = forLoopLower; i <= forLoopUpper; i++) {         
            for (int j = forLoopLower; j <= forLoopUpper; j++) {
                // the lowerBound + i
                // lowerBound is always the lowerBound of n, so ex: 2 = 10, 3 = 100;
                // then i add either 80->89 for n=2 | 800-899 for n=3 which..
                // lowerBound(ex:10) + i(89) = 99 which;
                // the forLoopLower i added the *8 to move the lower bound up higher since
                // we dont need to check the lower bounds of 10->79 since they wont be big enough
                current = (lowerBound+i) * (lowerBound+j);
                // this was where my issue was:
                // as long as the number was a palindrome, it would get reset with current
                // gotta set the first one then ONLY if its bigger would i make it current
                if (isPalindrome(current) == true) {
                    if (current > biggestPalindrome) {
                        biggestPalindrome = current;
                    }
                }
            }
        }
        return biggestPalindrome;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        // ANSWER
        System.out.println(largestPalindrome(n));

    }
}

