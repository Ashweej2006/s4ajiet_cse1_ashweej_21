import java.util.Arrays;
class Solution {
    public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    char[] s = {'h', 'e', 'l', 'l', 'o'};
    char[] o = s;
    System.out.println(Arrays.toString(s));
    new Solution().reverseString(s);
    System.out.println(Arrays.toString(s));
}
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;
        while(start <= end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
}
