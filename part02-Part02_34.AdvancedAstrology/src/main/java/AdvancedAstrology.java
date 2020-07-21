
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        int count=1;
        while(count<=number){
            System.out.print("*");
            count++;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        int i=1;
        while(i<=number){
            System.out.print(" ");
            i++;
        }
        
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int row=1;
        int back=size-1;
        while (row<=size){
            printSpaces(back);
            printStars(row);
            row++;
            back--;
              
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int row=1;
        int back=height-1;
        while (row<(height*2)){
            printSpaces(back);
            printStars(row);
            row=row+2;
            back--;
        }
        printSpaces(height-2);
        printStars(3);
        printSpaces(height-2);
        printStars(3);
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
