
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        ArrayList<Integer>list=new ArrayList<>();
        while (true){
            int value=Integer.valueOf(scanner.nextLine());
            if (value==-1){
            break;
             }
            list.add(value);
        }
        System.out.println("");
        // Then it computes the average of the numbers on the list
        // and prints it.
        int sum=0;
        for (int number: list){
            sum+=number;
        }
        
        int index=0;
        int count=0;
        while (index<list.size()){
            count+=1;
            index++;
        }
        double average=1.0*sum/count;
        System.out.println("Average: "+average);
        
    }
}
