import java.util.Scanner;

public class testCode {

    public static void main (String args[]){
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter a danm name: ");
        String pangalan = scan.nextLine();

        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        System.out.print("The name you typed in is: "+pangalan+"\n");
        System.out.print("The number "+number+" you have entered is that.");


    }

}
