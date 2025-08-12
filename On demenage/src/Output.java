public class Output {
    public static void  tripMessage(int boxesThisTrip){
            System.out.println("Le voyage a fait " + boxesThisTrip + " colis transporter");
    }
    public static void  tripMessageError(){
        System.out.println("Erreur entrée invalide");
    }
    public static void  endMessage(int totalTrips){
        System.out.println("Le déménagement est terminé en " + totalTrips + "!");
    }
    public static void  inputMessageBoxes(){
        System.out.print("Veuillez saisir le nombre de cartons: ");
    }
    public static void  inputMessageCapacity(){
        System.out.print("Veuillez saisir votre capacité: ");
    }

}
