import java.util.Scanner;

public class met{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. For KM to Mile");
        System.out.println("2. For Mile to KM");
        System.out.println("0. For Exit");
        System.out.print("Enter Your Choice: ");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.print("Enter the Distance in km : ");
                double distanceInKm = sc.nextDouble();
                double distanceInMiles = Metric.kmToMile(distanceInKm);
                System.out.println(distanceInKm + " Kilometres = " + distanceInMiles + " Miles");
                break;
            case 2: 
                System.out.print("Enter the Distance in Miles : ");
                double distanceInmiles = sc.nextDouble();
                sc.close();
                double distanceInkm = Metric.mileToKm(distanceInmiles);
                System.out.println(distanceInmiles + " Miles = " + distanceInkm + " Kilometer");
                break;
            case 0:
            System.exit(0);
        }  
        }   
        

    }

class Metric {
    public static double kmToMile(double distance) {
        return distance / 1.5;
    }

    public static double mileToKm(double distance) {
        return distance * 1.5;
    }
}