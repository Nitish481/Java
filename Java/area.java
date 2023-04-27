import java.util.Scanner;

public class area {
    public static void main(String args[])
    {
        final double pi =3.14;
        double area,r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius of the circle: ");
        r=sc.nextInt();
        area=pi*r*r;
        sc.close();
        System.out.println("Area of The Circle is: " +area);

    }
}
