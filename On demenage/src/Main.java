import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * The main class of the program in Java
 */
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int totalBoxes = 0;
        int boxesThisTrip = 0;
        boolean validBoxes = false;
        boolean validCapacity = false;
        while(!validBoxes) {
            Output.inputMessageBoxes();
            try {
                totalBoxes = keyboard.nextInt();
                validBoxes = true;
            } catch (InputMismatchException e) {
                Output.tripMessageError();
                keyboard.nextLine();
            }
        }
        while(!validCapacity){
            Output.inputMessageCapacity();
            try {
                boxesThisTrip = keyboard.nextInt();
                validCapacity = true;
            }
            catch (InputMismatchException e) {
                Output.tripMessageError();
                keyboard.nextLine();
            }
        }
        Moving moving = new Moving(totalBoxes, boxesThisTrip);
        moving.performMoving();
        keyboard.close();
        }
}
