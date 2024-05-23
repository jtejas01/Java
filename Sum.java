
import java.util.Scanner;

class Sum
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        int Number1 = sc.nextInt();
        int Number2 = sc.nextInt();
        int Sum = Number1 + Number2;
        System.out.println("Sum of "+Number1+" and "+Number2+" is "+Sum);
    }
}