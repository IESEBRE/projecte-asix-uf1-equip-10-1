import java.util.Scanner;
import  java.util.Random;
public class Animal {
    //Constructor de la branca Animal
    void Animal() {}
    boolean talking() {
        boolean finish = false;

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
        System.out.println("8. Vols sortir de la conversa?");

        int opcio = sc.nextInt();
        switch (opcio) {
            case 1:
                //Problema 9
                Scanner ani = new Scanner(System.in);
                System.out.println("Defineix quin tipus d'animal ets:");
                char animal = ani.next().charAt(0);
                int difG = 'g' - animal;
                int difS = 's' - animal;
                //Definim els condiconals en funcion a la posició numerica en valor Unicode dels caracters alfanumerics.
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
          /*  case 4:
                //Problema 12
                Scanner uni = new Scanner(System.in);
                System.out.println("Introdueix dos caràcters: ");
                //Iniciem les nostres variables a introduïr quan iniciem el programa.
                char char1 = uni.next().charAt(0);
                char char2 = uni.next().charAt(0);
                char b = char2;
                char resultat;
                while (char1 <= char2) {
                    resultat = char1 + b;
                    while (resultat != char1) {
                        System.out.println(resultat + "  ");
                    }
                    b--;
                    resultat = char1 + b;
                }
                char1++;
                b = char2;
                System.out.println("");
                break; */


            case 5:
                //Problema 13
                //Definició de les variables de la onomatopeia
                //Problema 13
                //Definició de les variables de la onomatopeia
                Scanner ono = new Scanner(System.in);
                Random r = new Random();
                System.out.println("Tria un caracter per formar una onomatopeia: ");
                //Definim la variable per inciar el bucle i la condició per finalitzarlo
                int numloop = 0;
                //En lloc de fer 3 variables i fer 10 cops el bucle, n'iniciem 6 i el fem només 5, aixi podem fer els torns correctament.
                while (numloop != 5) {
                    char variable1 = ono.next().charAt(0);
                    System.out.println("TU:" + variable1);
                    char variable2 = (char) (r.nextInt(26) + 'a');
                    System.out.println("ELL: " + variable2);
                    char variable3 = ono.next().charAt(0);
                    System.out.println("TU: "+ variable3);

                    String str = new StringBuilder().append(variable1).append(variable2).append(variable3).toString();
                    char vocal = str.charAt(1);

                    if (vocal == 'a' || vocal == 'e' || vocal == 'i' || vocal == 'o' || vocal == 'u')
                        System.out.println("La combinació " + str + " es una onomatopeia");
                    else
                        System.out.println("La combinació " + str + " no es una onomatopeia");

                    char variable4 = (char) (r.nextInt(26) + 'a');
                    System.out.println("ELL: "+ variable4);
                    char variable5 = ono.next().charAt(0);
                    System.out.println("TU: "+ variable5);
                    char variable6 = (char) (r.nextInt(26) + 'a');
                    System.out.println("ELL: "+ variable6);

                    String str2 = new StringBuilder().append(variable4).append(variable5).append(variable6).toString();
                    char vocal2 = str.charAt(1);

                    if (vocal2 == 'a' || vocal2 == 'e' || vocal2 == 'i' || vocal2 == 'o' || vocal2 == 'u')
                        System.out.println("La combinació " + str + " es una onomatopeia");
                    else
                        System.out.println("La combinació " + str2 + " no es una onomatopeia");
                    ++numloop;
                }
                System.out.println("Has format onomatopeies");
                break;

            case 6:
                //Problema 14
                Scanner nm = new Scanner(System.in);
                String nom;
                nom = nm.nextLine();
                System.out.println(nom + " Grácies. M'agrada aquest nom");
                break;
        }
        return true;
    }
}


            /*case 7:
                //Problema 15
                //Nom + tipus animal + caràcter favorit + sombre onomatopies
                System.out.println(animal);
                System.out.println(caracter);
                System.out.println(onomatopeia);
                break;

            case 8:
                System.out.println("Tria SI o NO");
                Scanner conv = new Scanner(System.in);
                    String conversa = conv.nextLine();
                if (conversa.equals ('SI')){
                    return true;
                    }
                if (conversa.equals ('NO')){
                    break;
                    }

            default:
                System.out.println("ERROR 404, option not found");
                break;*/
