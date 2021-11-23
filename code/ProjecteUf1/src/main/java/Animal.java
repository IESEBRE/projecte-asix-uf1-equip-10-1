import java.util.Scanner;
public class Animal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcio = sc.nextInt();

        System.out.println("Questionari");
        System.out.println("1. Quin tipus d'animal ets?");
        System.out.println("2. A que t'agrada jugar?");
        System.out.println("3. Quin es el teu caràcter favorit?");
        System.out.println("4. Sabries llista tots els caràcters amb valor Unicode parell i menors o iguals a Z resultants\n" +
                "de la suma, entre el valor Unicode del primer i segon caràcter, on el valor Unicode del\n" +
                "primer creixerà fins al segon, el segon decreixerà fins primer ?");
        System.out.println("5. Juguem a fer onomatopeies?");
        System.out.println("6. Posa-li un nom");
        System.out.println("7. Podríes recordar-me la nostra conversa?");

        switch (opcio) {
            case 1:
                //Problema 9
                Scanner ani = new Scanner(System.in);
                char animal = ani.next().charAt(0);
                int difG = 'g' - animal;
                int difS = 's' - animal;
                //Definim els condiconals en funcions a la posició numerica dels caracters alfanumerics.
                if (difG >= -3 || animal <= 'g')
                    System.out.println("Gos");
                else if (difS <= -3 || animal >= 's')
                    System.out.println("Serp");
                else System.out.println("Mono");
                break;

            case 2:

                //Problema 10
                //Definim una variable assignada al cas que volem seleccionar. Cada cas de 'a-j' esta assignat a un joc.
                Scanner jc = new Scanner(System.in);
                char joc = jc.next().charAt(0);
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
                break;

            case 3:
                //Problema 11
                Scanner car = new Scanner(System.in);
                char caracter = car.next().charAt(0);
                char iterador = 'a';
                char counter = (char)(((caracter-'a')/2));
                char finalchar = (char)(counter+'a');

                    while (iterador !=(char)(counter + 'a' )){
                        System.out.print(iterador + ",");
                         ++iterador;
                         }
                System.out.printf(String.valueOf(finalchar + ","));
                break;

            case 4:
                //Problema 12
                break;

            case 5:
                //Problema 13

                break;

            case 6:
                //Problema 14
                Scanner nm = new Scanner(System.in);
                String nom;
                nom = nm.nextLine();
                System.out.println(nom + " Grácies. M'agrada aquest nom");
                break;

                //Problema 15
                //Nom + tipus animal + caràcter favorit + nombre onomatopies
/*                System.out.println(animal);
                System.out.println(caracter);
                System.out.println();
                break;
                /*
 */
        }
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