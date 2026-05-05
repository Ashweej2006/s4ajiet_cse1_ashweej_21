import java.util.Scanner;
class CandyJar {
    public static void main(String[] args) {
        final int N=10;
        final int K=5;
        int candies=N;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of candies to buy:");
        int order=sc.nextInt();
        if(order<=0||order>candies){
            System.out.println("INVALID INPUT");
            return;
        }
        candies-=order;
        System.out.println("Number of Candies Sold:"+order);
        if(candies<=K){
            candies=N;
        }
        System.out.println("Number of Candies available:"+candies);
    }
}
