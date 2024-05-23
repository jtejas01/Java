
import java.util.Scanner;

class Division
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        int Number1 = sc.nextInt();
        int Number2 = sc.nextInt();
        int Division = Number1 / Number2;
        System.out.println("Division of "+Number1+" by "+Number2+" is "+Division);
    }
}