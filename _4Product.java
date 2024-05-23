import java.util.Scanner;

class _4Product
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        int Number1 = sc.nextInt();
        int Number2 = sc.nextInt();
        int Product = Number1 * Number2;
        System.out.println("Product of "+Number1+" by "+Number2+" is "+Product);
    }
}