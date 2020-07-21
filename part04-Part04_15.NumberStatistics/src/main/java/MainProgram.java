
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics statistics = new Statistics();
        Statistics even=new Statistics();
        Statistics odd=new Statistics();

        
        while (true){
            System.out.println("Enter numbers: ");
            int input=Integer.valueOf(scanner.nextLine());
            if (input==-1){
                break;
            }
            statistics.addNumber(input);
            if (input%2==0){
                even.addNumber(input);
            }else{
                odd.addNumber(input);
            }
        }
        System.out.println("Sum: "+ statistics.sum());
        System.out.println("Sum of even numbers : "+ even.sum());
        System.out.println("Sum of odd numbers : "+ odd.sum());
    }
}
