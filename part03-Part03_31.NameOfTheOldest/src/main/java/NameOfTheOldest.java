
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String big="";
        int oldest=0;
        while (true){
            String word=scanner.nextLine();
            if (word.equals("")){
                break;
            }
            String[]pieces=word.split(",");
            int age=Integer.valueOf(pieces[1]);
            String name=(pieces[0]);
            if (age>oldest){
                oldest=age;
                big=name;
            }
            System.out.println("Name of the oldest: "+big);
        }
                


    }
}
