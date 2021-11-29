import java.util.Scanner;
import  java.util.Random;
public class Animal {
    //Constructor de la branca Animal per al programa de simulació de conversses
    void Animal() {
    }
    boolean talking() {
        boolean finish = false;
        Scanner scanner = new Scanner(System.in);
        boolean finishA = false;
        
        //Inicialitzem les clases pare que necesitarem per fer els prints corresponents a l'ultim excercici.
        int contadoronomatopeies = 0;
        int caracter = 0;
        int animal = 0;
        // Introduïm una descripció per a cada cas del switch.
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
        
        //Inicialitzem un bucle per executar el switch de forma il·limitada fins que li indiquem que s'acabi el procés.
        do {
            System.out.println("Tria una opció:");
            //Menú d'opcions de la classe Animals
            Scanner sc = new Scanner(System.in);
            switch (scanner.nextLine()) {
                case "1":
                    //Problema 9
                    System.out.println("Defineix quin tipus d'animal ets:");
                    Scanner ani = new Scanner(System.in);
                    // Iniciem una variable 'animal' i definim un un rang entre caracters mitjançant operadors matematics.
                    animal = ani.next().charAt(0);
                    int difG = 'g' - animal;
                    int difS = 's' - animal;

                    if (difG >= -3 || animal <= 'g')
                        System.out.println("Gos");
                    else if (difS <= -3 || animal >= 's')
                        System.out.println("Serp");
                    else System.out.println("Mono");
                    break;
                case "2":
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
                case "3":
                    //Problema 11
                    Scanner car = new Scanner(System.in);
                    System.out.println("Tria el teu caracter favorit:");
                    // Iniciem la variable 'caracter' i un iterador per variar el bucle i els operadors indicats a l'enunciat.
                    caracter = car.next().charAt(0);
                    char iterador = 'a';
                    char counter = (char) (((caracter - 'a') / 2));
                    char finalchar = (char) (counter + 'a');

                    while (iterador != (char) (counter + 'a')) {
                        System.out.print(iterador + ",");
                        ++iterador;
                    }
                    // Fem un print tabulat per mostar tots els valors definits.
                    System.out.printf(String.valueOf(finalchar + ","));
                    break;

                case "4":
                    //Problema 12
                    System.out.println("Aquesta opció encara esta en desenvolupament (Work In Progress)");
                    break;
                case "5":
                    //Problema 13
                    //Iniciem les variables indicades a l'enunciat.
                    Scanner ono = new Scanner(System.in);
                    Random r = new Random();
                    System.out.println("Tria un caracter per formar una onomatopeia: ");
                    int numloop = 0;
                    
                    //Execució de variables dintre d'un bucle el qual executa un joc en forma de torns en el qual s'introdueixen caracters.
                    //Posteriorment, es crea un string de tres caracters en aquestes variables i es te en conte la lletra central.
                    //Mitjançant condicionals, si la central es vocal, la contabilitza com onomatopeia. 
                    
                    while (numloop != 5) {
                        char variable1 = ono.next().charAt(0);
                        System.out.println("TU:" + variable1);
                        char variable2 = (char) (r.nextInt(26) + 'a');
                        System.out.println("ELL: " + variable2);
                        char variable3 = ono.next().charAt(0);
                        System.out.println("TU: " + variable3);
                        String str = new StringBuilder().append(variable1).append(variable2).append(variable3).toString();
                        char vocal = str.charAt(1);
                        if (vocal == 'a' || vocal == 'e' || vocal == 'i' || vocal == 'o' || vocal == 'u') {
                            System.out.println("La combinació " + str + " es una onomatopeia");
                            ++contadoronomatopeies;
                        }
                        else
                            System.out.println("La combinació " + str + " no es una onomatopeia");
                        char variable4 = (char) (r.nextInt(26) + 'a');
                        System.out.println("ELL: " + variable4);
                        char variable5 = ono.next().charAt(0);
                        System.out.println("TU: " + variable5);
                        char variable6 = (char) (r.nextInt(26) + 'a');
                        System.out.println("ELL: " + variable6);
                        String str2 = new StringBuilder().append(variable4).append(variable5).append(variable6).toString();
                        char vocal2 = str2.charAt(1);
                        if (vocal2 == 'a' || vocal2 == 'e' || vocal2 == 'i' || vocal2 == 'o' || vocal2 == 'u') {
                            System.out.println("La combinació " + str + " es una onomatopeia");
                            ++contadoronomatopeies;
                        }
                        else
                            System.out.println("La combinació " + str2 + " no es una onomatopeia");
                        ++numloop;
                    }
                    System.out.println("Has format onomatopeies "+contadoronomatopeies);
                    break;
                case "6":
                    //Problema 14
                    //Defeinició d'un String seguit d'un print d'aquest nom.
                    Scanner nm = new Scanner(System.in);
                    String nom;
                    nom = nm.nextLine();
                    System.out.println(nom + " Grácies. M'agrada aquest nom");
                    break;
                case "7":
                    //Problema 15
                    //Fem un print de les varibles previament donades Nom + tipus animal + caràcter favorit + sombre onomatopies
                    System.out.println(animal);
                    System.out.println(caracter);
                    System.out.println(contadoronomatopeies);
                    break;
                case "8":
                    //Execució de codi per finalitzar el switch
                    System.out.println("Tria SI o NO");
                    Scanner conv = new Scanner(System.in);
                    String conversa = conv.nextLine();
                    if (conversa.equals("SI")) {
                        return true;
                    }
                    if (conversa.equals("NO")) {
                        break;
                    }
            }
        }
        while (!finishA);
        return true;
    }
}
