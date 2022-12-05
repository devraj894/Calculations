import java.util.Scanner;
public class Calculations{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int x = sc.nextInt();
        System.out.print("Enter the second number : ");
        int y = sc.nextInt();

        while(true){
        System.out.println("Enter 1 for SUM \nEnter 2 for DIFFERENCE \nEnter 3 for PRODUCT \nEnter 4 for DIVISION");
        int n = sc.nextInt();

        switch(n){
            case 1:
            int a = x+y;
            System.out.println("SUM of entered number is : "+a);
            break;

            case 2:
            int b = x-y;
            System.out.println("DIFFERENCE of entered number is : "+b);
            break;

            case 3:
            int c = x*y;
            System.out.println("PRODUCT of entered number is : "+c);
            break;

            case 4:
            int d = x/y;
            System.out.println("DIVISION of entered number is : "+d);
            break;

            default:
            System.out.println("Please enter a valid number......!");
        }
        }
    }
}