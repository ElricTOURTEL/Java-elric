import java.util.Scanner;
/**
 * The main class of the program in Java
 */
public class Main {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.print("Veuillez saisir le nombre de cartons puis la capacité par voyage (Séparé les input par un espace): ");
        int totalBoxes = clavier.nextInt();
        int boxesThisTrip = clavier.nextInt();
        Moving moving = new Moving(totalBoxes, boxesThisTrip);
        moving.PerformMoving();
    }
}