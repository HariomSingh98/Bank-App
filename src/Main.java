import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
//        SBIAccount user1 = new SBIAccount("hari",5000,"Harry798231");
//        System.out.println(user1.depositMoney(4000));
//        System.out.println( user1.getBalance());
//        System.out.println( user1.withdraw(2000,"Harry798231"));
//        System.out.println(user1.getBalance());
//        System.out.println(  user1.calculateInterest(5));
        System.out.println("Enter Your Account Credentials");
        String name = sc.next();
        int initialBalance = sc.nextInt();
        String password = sc.next();

        UnionAccount hariom = new UnionAccount(name,initialBalance,password);
        //getbalance
        System.out.println(hariom.getBalance());

        //depositMoney
        System.out.println("Enter Amount to Deposit:");
        int amountD = sc.nextInt();
        System.out.println(hariom.depositMoney(amountD));

        System.out.println("current Balance is :"+" "+ hariom.getBalance());

        //withdrawMoney
        System.out.println("Enter Amount to be withdraw:");
        int amountW = sc.nextInt();
        System.out.println("Enter the Account Password");
        String accountPassword= sc.next();
        System.out.println(hariom.withdraw(amountW,accountPassword));

        System.out.println("current Balance is :"+" "+hariom.getBalance());

        //rate of interest
        System.out.println("Enter interest time period :");
        int time = sc.nextInt();
        System.out.println("Your Interest Amount is :"+" "+ hariom.calculateInterest(time));




    }
}