import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.print("Veuillez saisir le nombre de cartons: ");
        int numberCarton = clavier.nextInt();
        int numberCartonVoyage = 0;
        int numberVoyage = 0;
        while (numberCarton > 0){
            if(numberCarton<9){
                numberCartonVoyage = numberCarton;
                System.out.println("Le voyage a fait " + numberCarton + " colis transporter");
                numberCarton = numberCarton - numberCartonVoyage;
            }
            else{
                numberCartonVoyage=9;
                System.out.println("Le voyage a fait " + numberCartonVoyage + " colis transporter"); }
            numberCarton = numberCarton - numberCartonVoyage;
            numberVoyage++;
        }
        System.out.println("Le déménagement est terminé en " + numberVoyage + "!");
    }
}