
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum=0;
        int count=0;
        String big="";
        while (true){
            String word=scanner.nextLine();
            if (word.equals("")){
                break;
            }
            String[]pieces=word.split(",");
            int year=Integer.valueOf(pieces[1]);
            String name=pieces[0];
            sum+=year;
            count+=1;
            if (name.length()>big.length()){
                big=name;
            }
        }
        double average=1.0*sum/count;
        System.out.println("Longest name: "+big);
        System.out.println("Average of the birth years: "+average);
        


    }
}
