
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a string: ");
        String variable1=scan.nextLine();
        System.out.println("Give an integer: ");
        int variable2=Integer.valueOf(scan.nextLine());
        System.out.println("Give a double: ");
        double variable3=Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean: ");
        boolean variable4=Boolean.valueOf(scan.nextLine());
        
        System.out.println("You gave the string "+variable1);
        System.out.println("You gave the integer "+variable2);
        System.out.println("You gave the double "+variable3);
        System.out.println("You gave the boolean "+variable4);
        
        
                

        // Write your program here

    }
}
