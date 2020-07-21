
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            String first=scanner.nextLine();
            if (first.isEmpty()){
                break;
            }
            
            String last=scanner.nextLine();
            String ID=(scanner.nextLine());
            
            infoCollection.add(new PersonalInformation(first,last,ID));
        }
        
        for (PersonalInformation PersonalInformation: infoCollection){
            String f=PersonalInformation.getFirstName();
            String l=PersonalInformation.getLastName();
            System.out.println(f+" "+l);
        }

    }
}
