import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        System.out.print("Enter a float: ");
        System.out.println(inputFloat());


    }
    static float inputFloat() throws InputMismatchException{
        Scanner in = new Scanner(System.in);
        float a = 0.0F;
        while (true){
            try {
                a = in.nextFloat();
                break;
            }catch (InputMismatchException e) {
                System.err.println("Incorrect! Try again...");
                in.next();
            }
        }
        return a;
    }
}
