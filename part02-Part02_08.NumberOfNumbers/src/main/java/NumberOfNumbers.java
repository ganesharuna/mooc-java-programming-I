 
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int entry=0;
        
        while (true){
            System.out.println("Give a number: ");
            int value=Integer.valueOf(scanner.nextLine());
            if (value==0){
                break;
            }
            
            if (value!=0){
                entry=entry+1;
             
            }
        }
        System.out.println("Number of numbers: "+entry);
        
                

    }
}
