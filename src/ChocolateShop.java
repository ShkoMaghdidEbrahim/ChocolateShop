import java.util.Scanner;

public class ChocolateShop {
    public static int total_chk = 0;
    public static int wraps = 0;
    public static int money = 0;
    public static int current_chock = 0;
    
    public static void main(String[] args) {
        // buy_chocolate => eatChocolate and sell wraps => if you have money buy_chocolate again
        Scanner sn = new Scanner(System.in);
        System.out.print("how much dollars you want to spend? : \t");
        money = sn.nextInt();
        
        buy_chocolate(money);
        System.out.println("Finally, you got " + total_chk + " and " + wraps + " wrap(s)");
    }
    
    private static void buy_chocolate(int dollar) {
        System.out.println("================================================");
        current_chock = dollar; // 1$ is chocolate price
        money = money - dollar;
        System.out.print("You spend " + dollar + "$ ");
        total_chk += current_chock;
        System.out.println("Then, you will have " + total_chk + " chocolates");
        eatChocolates_and_sell_wraps(current_chock);
    }
    
    private static void eatChocolates_and_sell_wraps(int chocks) {
        wraps += chocks;
        System.out.println("After eating " + chocks + " chocolates, you will get " + wraps + " wrap(s) ");
        money += wraps / 3;
        System.out.println("you exchanged " + money * 3 + " wraps For " + money + "$");
        wraps -= money * 3;
        if (money > 0) {
            buy_chocolate(money);
        }
    }
}