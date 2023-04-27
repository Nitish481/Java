import java.util.*;
public class str {
    public static void main(String aegs[])
    {
        String S1,S2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        S1=sc.nextLine();
        S2=S1;
        System.out.println(S1==S2);
        System.out.println(S1.equals(S2));

        System.out.println("Enter First String: ");
        S1=sc.nextLine();
        System.out.println("Enter Second String (same as first): ");
        S2=sc.nextLine();
        System.out.println(S1==S2);
        System.out.println(S1.equals(S2));
        sc.close();

    }
    
}
