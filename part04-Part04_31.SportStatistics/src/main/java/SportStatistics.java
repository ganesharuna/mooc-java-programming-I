
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("File: ");
        String file=scan.nextLine();
        int count=0;
        int wins=0;
        int losses=0;
        String team=scan.nextLine();
        try (Scanner fileReader=new Scanner(Paths.get(file))){
            
            while (fileReader.hasNextLine()){
                String line = fileReader.nextLine();
                String[] parts = line.split(",");
                String home=parts[0];
                String away=parts[1];
                int h_score=Integer.valueOf(parts[2]);
                int a_score=Integer.valueOf(parts[3]);
                if (home.contains(team)||away.contains(team)){
                    count++;
                }
                if (home.contains(team)){
                    if (h_score>a_score){
                        wins++;
                    }else{
                        losses++;
                    }
                }else if (away.contains(team)){
                    if(a_score>h_score){
                        wins++;
                    }else{
                        losses++;
                    }
                }
                
            }
            System.out.println("Games: "+count);
            System.out.println("Wins: "+wins);
            System.out.println("Losses: "+losses);
        }

    }

}
