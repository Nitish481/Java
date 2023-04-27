import java.util.Scanner;

class sum{
    public static void main(String[] args)
    {
        int sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Value of A: ");
        short a = sc.nextShort();
        System.out.println("Enter The Value of B: ");
        short b = sc.nextShort();
        sc.close();
        sum=a+b;
        System.out.println("Sum = " +sum);
         
    }
}