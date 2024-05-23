import java.util.Scanner;

class _5ArithmaticOperations
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        int Number1 = sc.nextInt();
        int Number2 = sc.nextInt();

        int Sum  = Number1 + Number2;
        int Subtraction  = Number1 - Number2;
        int Product = Number1 * Number2;
        int Division  = Number1 / Number2;
        System.out.println("Sum of "+Number1+" and "+Number2+" is "+Sum);
        System.out.println("Subtraction of "+Number1+" and "+Number2+" is "+Subtraction);
        System.out.println("Product of "+Number1+" by "+Number2+" is "+Product);
        System.out.println("Division of "+Number1+" by "+Number2+" is "+Division);
    }
}