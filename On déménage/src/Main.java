import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.print("Veuillez saisir le nombre de cartons: ");
        int numberCarton = clavier.nextInt();
        System.out.print("Quelle capacité a votre camion ? ");
        int numberCartonVoyage = clavier.nextInt();
        int numberVoyage = 0;
        while (numberCarton > 0){
            if(numberCarton<numberCartonVoyage){
                numberCartonVoyage = numberCarton;
                System.out.println("Le voyage a fait " + numberCarton + " colis transporter");
                numberCarton = numberCarton - numberCartonVoyage;
            }
            else{
                System.out.println("Le voyage a fait " + numberCartonVoyage + " colis transporter"); }
            numberCarton = numberCarton - numberCartonVoyage;
            numberVoyage++;
        }
        System.out.println("Le déménagement est terminé en " + numberVoyage + "!");
    }
}