public class SimpleDuplicate {
    public static void main(String[] args) {
        String str = "Ashweej Pajithaya AJIET ";
        char[] carray = str.toCharArray();
        System.out.println("Duplicate characters:");
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
              
                if (carray[i] == carray[j] && carray[i] != ' ') {
                    System.out.print(carray[j] + " ");
                    break; 
                }
            }
        }
    }
}
