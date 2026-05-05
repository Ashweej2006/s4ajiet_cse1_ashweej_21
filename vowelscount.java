import java.util.Arrays;
class Solution {
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        Solution sol = new Solution();
        int vcount = sol.countVowels(s);
        int ccount = sol.countCons(s);
        System.out.println("Number of vowels: " + vcount);
        System.out.println("Number of consonants: " + ccount);
    }
    public int countVowels(char[] s) {
        int count = 0;
        for (char c : s) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                count++;
            }
        }
        return count;
    }
    public int countCons(char[] s) {
        int count = 0;
        for (char c : s) {
                if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                      c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')) {
                    count++;
                }
            }
        
        return count;
    }
}
