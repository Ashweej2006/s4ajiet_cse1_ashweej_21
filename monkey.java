import java.util.Scanner; 

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int k = sc.nextInt();
        int j = sc.nextInt(); 
        int m = sc.nextInt(); 
        int p = sc.nextInt();

        if (n < 0 || k <= 0 || j <= 0 || m < 0 || p < 0) {
            System.out.println("INVALID INPUT");
        } else {
            int eatBananas = 0;
            int eatPeanuts = 0;
            
            if (k > 0) {
                eatBananas = m / k;
                if (m % k != 0) {
                    eatBananas++;
                }
            }
            if (j > 0) {
                eatPeanuts = p / j;
                if (p % j != 0) {
                    eatPeanuts++;
                }
            }
            
            int totEatMonkeys = eatBananas + eatPeanuts;
           
            int remainMonkeys = n - totEatMonkeys;
            
            System.out.println("Number of Monkeys left on the Tree:" + remainMonkeys);
        }
    }
}
