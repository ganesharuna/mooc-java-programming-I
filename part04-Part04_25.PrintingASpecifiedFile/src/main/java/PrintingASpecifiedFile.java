
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its content printed? ");
        String input=scanner.nextLine();
        try (Scanner line= new Scanner(Paths.get(input))){
            
            while (line.hasNextLine()){
                String row=line.nextLine();
                System.out.println(row);
            }
            
        }

    }
}
