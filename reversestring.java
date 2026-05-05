class Solution {
    public static void main(String[] args) {
    char[] s = {'h', 'e', 'l', 'l', 'o'};
    new Solution().reverseString(s);

   
    StringBuilder sb = new StringBuilder();
    for (char c : s) {
        sb.append(c);
    }
    System.out.println(sb.toString()); 
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
