import java.util.Scanner;
public class Animal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Problema 9
        System.out.println("Quin tipus d'animal ets?");
        char animal = sc.next().charAt(0);
        int difG = 'g' - animal;
        int difS = 's' - animal;

        //Definim els condiconals en funcions a la posició numerica dels caracters alfanumerics.
        if (difG>=-3 || animal<='g')
            System.out.println("Gos");
        else if (difS<=-3 || animal>='s')
            System.out.println("Serp");
        else System.out.println("Mono");

        //Problema 10
        System.out.println("A que t'agrada jugar?");
        char joc = sc.next().charAt(0);
        if (joc == 'a')
            System.out.println("Among Us");
        else if (joc == 'b')
            System.out.println("A la nova season del League of Legends");
        else if (joc == 'c')
            System.out.println("Compra i venta de monedes NFT");
        else if (joc == 'd')
            System.out.println("Traficar en bots de Discord per a servers d'amics de la jungla");
        else if (joc == 'e')
            System.out.println("Fer pagines de compra i venta de pedres");
        else if (joc == 'f')
            System.out.println("Fer un casinet del chill en Bayo");
        else if (joc == 'g')
            System.out.println("Instalar Windows 11 en Nigerià al meridià de Zimbawe");
        else if (joc == 'h')
            System.out.println("Hackejarli a Gonçal l'ordenador");
        else if (joc == 'i')
            System.out.println("Fer una recreació cutre en coreà de JigSaw i posar-li nom de cefalopode");
        else if (joc == 'j')
            System.out.println("Fer problemes al JO-EL");


        //Problema 11
        System.out.println("Quin es el teu caràcter favorit?");
        char caracter = sc.next().charAt(0);
        int iterador = 'a';

        while (caracter!=iterador-1){
            System.out.println((char)iterador);
            iterador++;
        }

        //Problema 12

        //Problema 13


        //Problema 14
        System.out.println("Posa-li un nom");
        String nom;

        nom = sc.nextLine();
        System.out.println(nom + " Grácies. M'agrada aquest nom");

        //Problema 15
            System.out.println("Podríes recordar-me la nostra conversa?");
            //Nom + tipus animal + caràcter favorit + nombre onomatopies
            System.out.println(nom);
            System.out.println(animal);
            System.out.println(caracter);
            System.out.println();
    }
}




















    /*Constructor
    void Animal () {}

    boolean talking () {
        System.out.println("bup bup");
        return true;
    }
    }

     */