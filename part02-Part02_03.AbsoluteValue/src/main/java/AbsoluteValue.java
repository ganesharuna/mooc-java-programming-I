
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value=Integer.valueOf(scanner.nextLine());
        if (value<0){
            int abs=value*-1;
            System.out.println(abs);
        }else{
            System.out.println(value);
        }

    }
}
