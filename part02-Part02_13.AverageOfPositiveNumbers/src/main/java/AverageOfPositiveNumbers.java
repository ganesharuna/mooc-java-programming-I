
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total=0;
        int sum=0;
        
        while (true){
            int value=Integer.valueOf(scanner.nextLine());
            
            if (value==0){
                break;
            }
            if (value<0){
                continue;
            }
            total=total+1;
            sum=sum+value;
        }
        if (total==0){
            System.out.println("cannot calculate the average");
        }else{
            double average=1.0*sum/total;
            System.out.println(average);
        }
                

    }
}
