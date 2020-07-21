
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String file=scanner.nextLine();
        
        try(Scanner fileReader=new Scanner(Paths.get(file))){
            
            while (fileReader.hasNextLine()){
                String line=fileReader.nextLine();
                
                String[]parts=line.split(",");
                String name=parts[0];
                int age=Integer.valueOf(parts[1]);
                
                if (age!=1){
                    System.out.println(name+", age: "+age+" years");
                }else{
                    System.out.println(name+", age: "+age+" year");
                }
            }
        }

    }
}
