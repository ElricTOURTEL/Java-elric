/**
 * The class Demenagement
 */
public class Moving {
    private int totalBoxes;
    private int boxesThisTrip;
    private int totalTrips;

    /**
     * The constructor for the class Moving
     */
    public Moving(int totalBoxes, int boxesThisTrip) {
        this.totalBoxes = totalBoxes;
        this.boxesThisTrip = boxesThisTrip;
        this.totalTrips = 0;
    }
    /**
     * The method who calculate the process of doing the Moving
     */
    public void performMoving(){
            while (totalBoxes > 0){
                if(totalBoxes < boxesThisTrip){
                    boxesThisTrip = totalBoxes;
                }
                totalTrips++;
                totalBoxes -= boxesThisTrip;
                System.out.println("Le voyage a fait " + boxesThisTrip + " colis transporter");
            }
            System.out.println("Le déménagement est terminé en " + totalTrips + "!");
        }
}
