public class Main {
    public static void main(String[] args) {
        String str = "  A S H W E E J  P A J I T H A Y A  ";
        String noSpaces = str.replaceAll(" ", "");
        System.out.println("Original: [" + str + "]");
        System.out.println("Result: [" + noSpaces + "]");
    }
}
