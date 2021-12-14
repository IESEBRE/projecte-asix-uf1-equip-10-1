import java.util.Scanner;
import  java.util.Random;
import java.util.Arrays;

public class Animal {
    //Constructor de la branca Animal per al programa de simulació de conversses
    void Animal() {
    }

    boolean talking() {
        //Inicialitzar Array
        Boolean[] boolArray = new Boolean[8];
        for(int i = 0; i < boolArray.length; i++){
            boolArray[i] = false;
        }

        boolean finish = false;
        Scanner scanner = new Scanner(System.in);
        boolean finishA = false;

        //Inicialitzem les clases pare que necesitarem per fer els prints corresponents a l'ultim excercici.
        char contadoronomatopeies = 0;
        char caracter = 0;
        char animal = 0;
        String nom = "";
        char joc = 0;
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
                    if (boolArray[0] != false) {
                        System.out.println("Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!!");
                        break;
                    }
                    //Problema 9
                    System.out.println("Defineix quin tipus d'animal ets:");
                    Scanner ani = new Scanner(System.in);
                    // Iniciem una variable 'animal' i definim un un rang entre caracters mitjançant operadors matematics.
                    animal = ani.next().charAt(0);
                    int difG = 'G' - animal;
                    int difS = 'S' - animal;

                    if (difG >= -3 || animal <= 'G')
                        System.out.println("Gos");
                    else if (difS <= -3 || animal >= 'S')
                        System.out.println("Serp");
                    else System.out.println("Mono");
                    boolArray[0] = true;
                    break;
                case "2":
                    if (boolArray[0] == false) {
                        System.out.println("Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!!");
                        break;
                    }
                    //Problema 10
                    //Definim una variable assignada al cas que volem seleccionar. Cada cas de 'a-j' esta assignat a un joc.
                    Scanner jc = new Scanner(System.in);
                    System.out.println("Tria el teu joc favorit:");
                    joc = jc.next().charAt(0);
                    if (joc == 'A')
                        System.out.println("Pilla-pilla");
                    else if (joc == 'B')
                        System.out.println("Pilota");
                    else if (joc == 'C')
                        System.out.println("Saltar");
                    else if (joc == 'D')
                        System.out.println("Circuit");
                    else if (joc == 'E')
                        System.out.println("Correr");
                    else if (joc == 'F')
                        System.out.println("Dinamica");
                    else if (joc == 'G')
                        System.out.println("Vols");
                    else if (joc == 'H')
                        System.out.println("Amagar");
                    else if (joc == 'I')
                        System.out.println("Cercar");
                    else if (joc == 'J')
                        System.out.println("Estirar");
                    else
                        System.out.println("No es un joc!");
                    boolArray[1] = true;
                    break;
                case "3":
                    if (boolArray[1] == false) {
                        System.out.println("Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!!");
                        break;
                    }
                    //Problema 11
                    Scanner car = new Scanner(System.in);
                    System.out.println("Tria el teu caracter favorit:");
                    // Iniciem la variable 'caracter' i un iterador per variar el bucle i els operadors indicats a l'enunciat.
                    caracter = car.next().charAt(0);
                    char iterador = 'A';
                    char counter = (char) (((caracter - 'A') / 2));
                    char finalchar = (char) (counter + 'A');

                    while (iterador != (char) (counter + 'A')) {
                        System.out.print(iterador + " ");
                        ++iterador;
                    }
                    // Fem un print tabulat per mostar tots els valors definits.
                    System.out.printf(String.valueOf("...He triat el "+finalchar+"!"));
                    boolArray[2] = true;
                    break;

                case "4":
                    if (boolArray[2] == false) {
                        System.out.println("Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!!");
                        break;
                    }
                    //Problema 12
                    System.out.println("Aquesta opció encara esta en desenvolupament (Work In Progress)");
                    boolArray[3] = true;
                    break;
                case "5":
                    if (boolArray[3] == false) {
                        System.out.println("Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!!");
                        break;
                    }
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
                        char variable2 = (char) (r.nextInt(26) + 'A');
                        System.out.println("ELL: " + variable2);
                        char variable3 = ono.next().charAt(0);
                        System.out.println("TU: " + variable3);
                        String str = new StringBuilder().append(variable1).append(variable2).append(variable3).toString();
                        char vocal = str.charAt(1);
                        if (vocal == 'A' || vocal == 'E' || vocal == 'I' || vocal == 'O' || vocal == 'U') {
                            System.out.println("La combinació " + str + " es una onomatopeia");
                            ++contadoronomatopeies;
                        } else
                            System.out.println("La combinació " + str + " no es una onomatopeia");
                        char variable4 = (char) (r.nextInt(26) + 'A');
                        System.out.println("ELL: " + variable4);
                        char variable5 = ono.next().charAt(0);
                        System.out.println("TU: " + variable5);
                        char variable6 = (char) (r.nextInt(26) + 'A');
                        System.out.println("ELL: " + variable6);
                        String str2 = new StringBuilder().append(variable4).append(variable5).append(variable6).toString();
                        char vocal2 = str2.charAt(1);
                        if (vocal2 == 'A' || vocal2 == 'E' || vocal2 == 'I' || vocal2 == 'O' || vocal2 == 'U') {
                            System.out.println("La combinació " + str + " es una onomatopeia");
                            ++contadoronomatopeies;
                        } else
                            System.out.println("La combinació " + str2 + " no es una onomatopeia");
                        ++numloop;
                    }
                    System.out.println("Has format onomatopeies " + contadoronomatopeies);
                    boolArray[4] = true;
                    break;
                case "6":
                    if (boolArray[4] == false) {
                        System.out.println("Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!!");
                        break;
                    }
                    //Problema 14
                    //Defeinició d'un String seguit d'un print d'aquest nom.
                    System.out.println("Tira un nom per posar-me:");
                    Scanner nm = new Scanner(System.in);
                    nom = nm.nextLine();
                    System.out.println(nom + " Grácies. M'agrada aquest nom");
                    boolArray[5] = true;
                    break;
                case "7":
                    if (boolArray[5] == false) {
                        System.out.println("Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!!");
                        break;
                    }
                    //Problema 15
                    //Fem un print de les varibles previament donades Nom + tipus animal + caràcter favorit + sombre onomatopies
                    System.out.println("Em dic "+nom+ "i soc un "+animal+"el meu joc favorit es el "+joc+" i el meu caracter favorit es el "+caracter);
                    boolArray[6] = true;
                    break;

                case "8":
                    if (boolArray[6] == false) {
                        System.out.println("Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!!");
                        break;
                    }
                    //Execució de codi per finalitzar el switch
                    System.out.println("Tria SI o NO");
                    Scanner conv = new Scanner(System.in);
                    String conversa = conv.nextLine();
                    if (conversa.equals("SI")) {
                        return true;
                    }
                    if (conversa.equals("NO")) {
                        boolArray[7] = true;
                        break;
                    }
            }
        }
        while (!finishA);
        return true;
    }
}
