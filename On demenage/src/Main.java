import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * The main class of the program in Java
 */
public class Main {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        int totalBoxes = 0;
        int boxesThisTrip = 0;
        boolean validBoxes = false;
        boolean validCapacity = false;
        while(!validBoxes) {
            Output.inputMessageBoxes();
            try {
                totalBoxes = clavier.nextInt();
                validBoxes = true;
            } catch (InputMismatchException e) {
                Output.tripMessageError();
                clavier.nextLine();
            }
        }
        while(!validCapacity){
            Output.inputMessageCapacity();
            try {
                boxesThisTrip = clavier.nextInt();
                validCapacity = true;
            }
            catch (InputMismatchException e) {
                Output.tripMessageError();
                clavier.nextLine();
            }
        }
        Moving moving = new Moving(totalBoxes, boxesThisTrip);
        moving.performMoving();
        clavier.close();
        }
}
