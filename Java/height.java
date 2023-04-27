import java.util.Scanner;
public class height {
    public static void main(String args[])
    {
        int cm;
        double inch,foot;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Height in cm: ");
        cm=sc.nextInt();
        inch=cm*2.54;
        foot=cm*30.5;
        sc.close();
        System.out.println("The Height in inch: "+inch);
        System.out.println("The Height in foot: "+foot);
    }
}
