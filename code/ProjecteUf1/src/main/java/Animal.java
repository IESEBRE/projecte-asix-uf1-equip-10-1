import java.util.Scanner;
import  java.util.Random;
public class Animal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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

        int opcio = sc.nextInt();
        switch (opcio) {
            case 1:
                //Problema 9
                Scanner ani = new Scanner(System.in);
                System.out.println("Defineix quin tipus d'animal ets:");
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
                System.out.println("Tria el teu joc favorit:");
                char joc = jc.next().charAt(0);
                if (joc == 'a')
                    System.out.println(" A Nerfejar a Aurelion Sol i buffar a Zed perque fa molta falta");
                else if (joc == 'b')
                    System.out.println("A la nova season del League of Legends");
                else if (joc == 'c')
                    System.out.println("Compra i venta de monedes NFT");
                else if (joc == 'd')
                    System.out.println("Reviure el GroovyBot per tal de idolatrar-lo com el deu que es");
                else if (joc == 'e')
                    System.out.println("Fer pagines de compra i venta de pedres");
                else if (joc == 'f')
                    System.out.println("Fer un casinet del chill en Bayo");
                else if (joc == 'g')
                    System.out.println("Instalar Windows 11 en Nigerià al meridià de Zimbawe");
                else if (joc == 'h')
                    System.out.println("Hackejarli a Gonçal l'ordenador per baixar mes OVEs de Metasploitable");
                else if (joc == 'i')
                    System.out.println("Fer una recreació cutre en coreà de JigSaw i posar-li nom de cefalopode");
                else if (joc == 'j')
                    System.out.println("Fer problemes al JO-EL i fomentar la nostra ludopatia");
                else
                    System.out.println("No es un joc!");
                break;

            case 3:
                //Problema 11
                Scanner car = new Scanner(System.in);
                System.out.println("Tria el teu caracter favorit:");
                //Definim la nostra variable
                char caracter = car.next().charAt(0);
                //Creem una variable que iteri el nostre bucle, que en aquest cas prendra el valor minim del nostre rang
                char iterador = 'a';
                /* Definim finalment el nostre parametre que permeti fer el punt mig al bucle i finalment els caracters
                que s'anirant imprimint a mesura que el bucle avança. */
                char counter = (char) (((caracter - 'a') / 2));
                char finalchar = (char) (counter + 'a');
                /*Creem un bucle per tal d'anar sumant '1' a la variable minima per tal d'aumentar d'un en un el minim
                valor que iniciem, per tant obtindrem de forma ordenada els caracters de forma com s'indica al enunciat*/
                while (iterador != (char) (counter + 'a')) {
                    System.out.print(iterador + ",");
                    ++iterador;
                }
                System.out.printf(String.valueOf(finalchar + ","));
                break;
            case 4:
                //Problema 12
                Scanner uni = new Scanner(System.in);
                System.out.println("Introdueix dos caràcters: ");
                //Iniciem les nostres variables a introduïr quan iniciem el programa.
                char a = uni.next().charAt(0);
                char b = uni.next().charAt(0);
                char max = 'a';
                char min = 'z';
                int iterator = 0;
                break;


            case 5:
                //Problema 13
                //Definició de les variables de la onomatopeia
                //Problema 13
                //Definició de les variables de la onomatopeia
                Scanner ono = new Scanner(System.in);
                Random r = new Random();
                System.out.println("Tria un caracter per formar una onomatopeia: ");

                int numloop = 0;
                while (numloop != 10) {
                    char variable1 = ono.next().charAt(0);
                    char variable2 = (char) (r.nextInt(26) + 'a');

                    System.out.println("TU:" + variable1);
                    System.out.println("ELL: " + variable2);

                    String str = new StringBuilder().append(variable1).append(variable2).append(variable1).toString();
                    char vocal = str.charAt(1);

                    if (vocal == 'a' || vocal == 'e' || vocal == 'i' || vocal == 'o' || vocal == 'u')
                        System.out.println("La combinació "+str + " es una onomatopeia");
                    else
                        System.out.println("La combinació "+str + " no es una onomatopeia");
                    ++numloop;
                }
                break;

                    case 6:
                        //Problema 14
                        Scanner nm = new Scanner(System.in);
                        String nom;
                        nom = nm.nextLine();
                        System.out.println(nom + " Grácies. M'agrada aquest nom");
                        break;

                    case 7:
                        //Problema 15
                        //Nom + tipus animal + caràcter favorit + nombre onomatopies
                        System.out.println(animal);
                        System.out.println(caracter);
                        System.out.println();
                        break;

                    default:
                        System.out.println("ERROR 404, option not found");
                        break;
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