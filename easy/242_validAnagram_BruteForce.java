import java.util.Arrays;

class validAnagram_BruteForce {
    public static boolean isAnagram(String s, String t) {
        // first thought, since you have both s and t, if i were doing on paper
        // i would just try to match up the letters from s to t in their
        // respective index, will try to bruteforce that
        if (s == null || t == null || s.isEmpty() || t.isEmpty()) {
            return false;
        }

        char[] charsS = s.toCharArray();
        char[] charsT = t.toCharArray();

        Arrays.sort(charsS);
        Arrays.sort(charsT);

        String sortedS = new String(charsS);
        String sortedT = new String(charsT);

        if (sortedS.equalsIgnoreCase(sortedT)) {
            return true;
        }
        
        return false;
    }

    public static void main(String[] args) {
        // test case 1
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }
}