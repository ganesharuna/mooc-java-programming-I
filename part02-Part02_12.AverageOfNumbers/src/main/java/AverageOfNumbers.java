
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        int total=0;
        
        while (true){
            System.out.println("Give a number: ");
            int value=Integer.valueOf(scanner.nextLine());
            
            if (value==0){
                break;
            }
            sum=sum+value;
            total=total+1;
        }
        double average=1.0*sum/total;
        System.out.println("Average of the numbers: "+average);
        
                

    }
}
