import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            System.out.println("Name: ");
            String name=scanner.nextLine();
            if (name.isEmpty()){
                break;
            }
            System.out.println("Duration: ");
            int time=Integer.valueOf(scanner.nextLine());
            
            programs.add(new TelevisionProgram(name,time));

        }
        System.out.println("Program's max duration?");
        int max_duration=Integer.valueOf(scanner.nextLine());
        
        for (TelevisionProgram program: programs){
            if (program.getDuration()<=max_duration){
                System.out.println(program+" minutes");
            }
        }
       
    }
}
