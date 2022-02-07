package ProjecteUF1;
import java.util.Scanner;
import  java.util.Random;
import static ProjecteUF1.Main.sc;
import static ProjecteUF1.Main.show;

public class Animal {
    //Constructor de la branca Animal per al programa de simulació de conversses
    void Animal() {
    }
    String talking() {
        boolean ordre [];
        ordre = new boolean [7];
        String animalrecap = "";
        String nomrecap = "";
        char caracterrecap = ' ';
        int cout = 0;
        String obci;
        String converses = "";
        String jocs = "";
        while (true) {
            System.out.println("");
            byte opcio;
            String tipus;

            if (show) System.out.println("Selecciona quina pregunta vols:");
            if (show) System.out.println("1.Quin tipus d’animal ets?");
            if (show) System.out.println("2.A que t’agrada jugar? ");
            if (show) System.out.println("3.Quin es el teu caracter favorit?");
            if (show)
                System.out.println("4.Sabries llista tots els caràcters amb valor Unicode parell i menors o iguals a Z resultants\n" +
                        "de la suma, entre el valor Unicode del primer i segon caracter, on el valor Unicode del\n" +
                        "primer creixerà fins al segon, el segon decreixera fins primer ? ");
            if (show) System.out.println("5.Juguem a fer onomatopeies? ");
            if (show) System.out.println("6.Posa-li un nom:");
            if (show) System.out.println("7.Pots recordar-me la nostra conversa?");
            if (show) System.out.println("8.Sortida");

            opcio = sc.nextByte();
            switch (opcio) {
                case 1:
                    if (show) System.out.println("Defineix quin tipus d'animal ets:");
                    char animal = sc.next().charAt(0);
                    int difG = 'G' - animal;
                    int difS = 'S' - animal;

                    //Definició dels condicionals en funció a la posició numerica dels caracters a introduïr
                    if (difG >= -3 || animal <= 'G') {
                        System.out.println("Gos");
                        animalrecap = "gos";
                        converses += ("Gos" + "\n");
                    }
                   else if (difS <= -3 || animal >= 'S') {
                        System.out.println("Serp");
                        animalrecap = "serp";
                        converses += ("Serp" + "\n");
                    }
                    else
                    animalrecap = "mono";
                    converses += ("Mono" + "\n");

            System.out.println("No esta amb " + animal + ", el mes proxim es " + animalrecap);
            converses += ("No esta amb " + animal + ", el mes proxim es " + animalrecap);
            ordre[0] = true;
            break;

                case 2:
                    //Problema 10
                    if (ordre[0] && ordre[1] == false) {
                        if (show) System.out.println("A que t'agrada jugar? ");
                        char joc = sc.next().charAt(0);
                        if (joc == 'A') {
                            System.out.println("Pilla-pilla");
                            jocs = "pilla-pilla";
                        }
                        if (joc == 'B') {
                            System.out.println("Pilota");
                            jocs = "pilota";
                        }
                        if (joc == 'C') {
                            System.out.println("Saltar");
                            jocs = "saltar";
                        }
                        if (joc == 'D') {
                            System.out.println("Circuit");
                            jocs = "circuit";
                        }
                        if (joc == 'E') {
                            System.out.println("Correr");
                            jocs = "correr";
                        }
                        if (joc == 'F') {
                            System.out.println("Dinamica");
                            jocs = "dinamica";
                        }
                        if (joc == 'G') {
                            System.out.println("Vols");
                            jocs = "vols";
                        }
                        if (joc == 'H') {
                            System.out.println("Amagar");
                            jocs = "amagar";
                        }
                        if (joc == 'I') {
                            System.out.println("Cercar");
                            jocs = "cercar";
                        }
                        if (joc == 'J') {
                            System.out.println("Estirar");
                            jocs = "estirar";
                        }
                        converses += jocs + "\n";
                        ordre[1] = true;
                        break;
                    }
                    else {
                        System.out.println("Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!!");}
                    break;
                case 3:
                    //Problema 11
                    if (ordre[2] == false) {
                    char caracter;
                    char impresio = 'A';
                    if (show) System.out.println("Quin es el teu caracter favorit?");

                    caracter = sc.next().charAt(0);
                    char contador = (char) ((caracter - 'A') / 2);
                    caracterrecap = (char) (contador + 'A');

                    while (impresio != (char) (contador + 'A')) {
                        System.out.print(impresio + ",");
                        converses += (impresio + ",");
                        ++impresio;
                    }
                    System.out.printf(String.valueOf("...He triat el " + caracterrecap + "!"));
                    converses += ("...He triat el " + caracterrecap + "!") + "\n";
                    ordre[2] = true;
                    break;
                   }
                    else {
                     System.out.println("Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!!");
                break;
               }
            case 4:
                //Problema 12
                if (ordre[2] && ordre[3] == false) {
                    char lletra1, lletra2;
                    if (show) System.out.println ("Disme una lletra de la A a la Z");
                    lletra1 = sc.next().charAt(0);
                    System.out.println("Disme una segona lletra més gran que l'anterior dins del rang de la A a la Z");
                    lletra2 = sc.next().charAt(0);

                    if ((((lletra1 - 'A') + (lletra2 - 'A') + 'A') % 2 == 0) && (((lletra1 - 'A') + (lletra2 - 'A') + 'A') <= 'Z')) {
                        for (int contador1 = lletra1; contador1 < lletra2; contador1++) {
                            System.out.printf((char) (contador1) + "   ");
                            for (int contador2 = lletra2; contador2 > contador1; contador2--) {
                                System.out.printf((char) (contador2) + "   ");
                            }
                            System.out.println();
                        }
                    } else System.out.println("Valors incorrectes!!");
                    ordre[3] = true;
                    break;
                    }
                    else System.out.println("Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!!");
                    break;

                    case 5:
                        //Problema 13
                        if (show) {
                            if (ordre[3] && ordre[4] == false) {
                                Random r = new Random();
                                if (show) System.out.println("Tria un caracter per formar una onomatopeia: ");

                                int numloop = 0;
                                while (numloop != 10) {

                                    char variable1 = sc.next().charAt(0);
                                    System.out.println("TU:" + variable1);
                                    char variable2 = (char) (r.nextInt(26) + 'a');
                                    System.out.println("ELL: " + variable2);
                                    char variable3 = sc.next().charAt(0);
                                    System.out.println("TU: " + variable3);
                                    ++numloop;
                                    String str = new StringBuilder().append(variable1).append(variable2).append(variable3).toString();
                                    char vocal = str.charAt(1);

                                    if (vocal == 'a' || vocal == 'e' || vocal == 'i' || vocal == 'o' || vocal == 'u') {
                                        System.out.println("La combinació " + str + " es una onomatopeia");
                                        cout++;
                                    } else {
                                        System.out.println("La combinació " + str + " no es una onomatopeia");
                                        cout++;
                                    }
                                }
                                ordre[4] = true;
                                break;
                            } else {
                                System.out.println("Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!!");
                                break;
                            }
                        } else {
                            System.out.println("No es pot jugar en mode JOEL!!");
                            ordre[4] = true;
                        }
                        break;

                case 6:
                    if (ordre[4] && ordre[5] == false) {
                        if (show) System.out.println("Dona'm un nom");

                        nomrecap = sc.nextLine();
                        System.out.println("Gracies, m'agrada molt el nom de " + nomrecap);
                        converses += ("Gracies, m'agrada molt el nom de " + nomrecap);
                        ordre[5] = true;
                        break;
                    } else {
                        System.out.println("Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!!");
                        break;
                    }

                case 7:
                    if (ordre[5] && ordre[6] == false) {
                        System.out.println("Em dic " +nomrecap+ " i soc un " +animalrecap+". El meu joc favorit es " + jocs + ". El meu caracter favorit es el  " + caracterrecap + ".");
                        converses += ("Em dic " + nomrecap + " i soc un " + animalrecap + ". El meu joc favorit es " + jocs + ". El meu caracter favorit es el  " + caracterrecap + "." + "\n");
                        ordre[6] = true;
                        break;
                    } else {
                        System.out.println("Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!!");
                        break;
                    }

                case 8:
                    if (ordre[6] == true) {
                        return converses;
                    } else {
                        System.out.println("Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!!");
                        break;
                    }
            }
        }
    }
}
