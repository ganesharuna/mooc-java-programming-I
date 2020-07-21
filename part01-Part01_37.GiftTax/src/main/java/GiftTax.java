
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift? ");
        double value=Double.valueOf(scan.nextLine());
        if (value<5000){
            System.out.println("No tax!");
        }else if (value>=5000 && value<25000){
            double tax=((value-5000)*0.08)+100;
            System.out.println("Tax:"+tax);
        }else if (value>=25000 && value<55000){
            double tax=((value-25000)*0.10)+1700;
            System.out.println("Tax:"+tax);
        } else if (value>=55000 && value<200000){
            double tax=((value-55000)*0.12)+4700;
            System.out.println("Tax:"+tax);
        }else if (value>=200000 && value<1000000){
            double tax=((value-200000)*0.15)+22100;
            System.out.println("Tax:"+tax);
        }else{
            double tax=((value-1000000)*0.17)+142100;
            System.out.println("Tax:"+tax);
        }
            

    }
}
