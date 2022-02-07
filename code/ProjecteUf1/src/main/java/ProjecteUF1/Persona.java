package ProjecteUF1;
import java.util.Scanner;
import  java.util.Random;
import static ProjecteUF1.Main.sc;
import static ProjecteUF1.Main.show;

public class Persona {
    //Constructor de la branca Animal per al programa de simulació de conversses
    void Persona() {
    }
    String talking() {
        boolean ordre [];
        ordre = new boolean [7];
        String personarecap = "";
        String nomrecap = "";
        int numrecap;
        int cout = 0;
        String obci;
        String converses = "";
        String esports = "";
        while (true) {
            System.out.println("");
            byte opcio;
            String tipus;

            if (show) System.out.println("Selecciona quina pregunta vols:");
            if (show) System.out.println("1. Quin tipus de persona ets?");
            if (show) System.out.println("2. Quin esport t'agrada?");
            if (show) System.out.println("3. Quin és el teu número favorit entre 0 i ...?");
            if (show) System.out.println("4. Sabries llistar tots els nombres parells resultants de la multiplicació, entre el valor enter de a i b, on el valor de a creixerà fins b, b decreixerà fins a ?");
            if (show) System.out.println("5. Juguem a pedra paper i tisora?");
            if (show) System.out.println("6.Posa-li un nom:");
            if (show) System.out.println("7.Pots recordar-me la nostra conversa?");
            if (show) System.out.println("8.Sortida");

            opcio = sc.nextByte();
            switch (opcio) {
                case 1:
                    if (show) System.out.println("Introdueix un enter entre 0 i 100");
                    int numenter = sc.nextInt();

                    while (true)
                        if (numenter % 2 == 0 && numenter % 3 != 0) {
                            System.out.println("Home");
                            personarecap = "home";
                            converses += ("Home" + "\n");
                            break;
                        } else if (numenter % 2 != 0 && numenter % 3 == 0) {
                            System.out.println("Dona");
                            personarecap = "dona";
                            converses += ("Dona" + "\n");
                            break;
                        } else if (numenter % 2 == 0 && numenter % 3 == 0) {
                            System.out.println("No binari");
                            personarecap = "no binari";
                            converses += ("No binari" + "\n");
                            break;
                        } else if (numenter < 100) numenter += 2;
                        else numenter -= 4;

                        converses += ("Soc un/a " +personarecap);
                        ordre[0] = true;
                        break;

                case 2:
                    //Problema 10
                    if (ordre[0] && ordre[1] == false) {
                        if (show) System.out.println("Escriu un número (1..10)");
                        String joc = sc.nextLine();
                        if (joc.equals("1")) {
                            System.out.println("Pilla-pilla");
                            esports = "pilla-pilla";
                        }
                        if (joc.equals("2")) {
                            System.out.println("Pilota");
                            esports = "pilota";
                        }
                        if (joc.equals("3")) {
                            System.out.println("Saltar");
                            esports = "saltar";
                        }
                        if (joc.equals("4")) {
                            System.out.println("Circuit");
                            esports = "circuit";
                        }
                        if (joc.equals("5")) {
                            System.out.println("Correr");
                            esports = "correr";
                        }
                        if (joc.equals("6")) {
                            System.out.println("Dinamica");
                            esports = "dinamica";
                        }
                        if (joc.equals("7")) {
                            System.out.println("Vols");
                            esports = "vols";
                        }
                        if (joc.equals("8")) {
                            System.out.println("Amagar");
                            esports = "amagar";
                        }
                        if (joc.equals("9")) {
                            System.out.println("Cercar");
                            esports = "cercar";
                        }
                        if (joc.equals("10")) {
                            System.out.println("Estirar");
                            esports = "estirar";
                        }
                        converses += esports + "\n";
                        ordre[1] = true;
                        break;
                    }
                    else {
                        System.out.println("Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!!");}
                    break;
                case 3:
                    //Problema 11
                    if (ordre[1] && ordre[2] == false) {
                        if (show) System.out.println("Dis-li un número màxim");

                        int maxim = sc.nextInt();
                        int x = maxim / 2;
                        int y = 0;
                        for (y = 0; y < x; y++) {
                            System.out.print(y + " ");
                        }
                        System.out.print("... He escollit el " + x);
                    break;
                    }
                    else {
                        System.out.println("Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!!");
                        break;
                    }

                case 4:
                    //Problema 12
                    if (ordre[2] && ordre[3] == false) {
                        if (show) System.out.println("Introdueix dos enters");
                        int num1 = sc.nextInt();
                        int num2 = sc.nextInt();
                        int b = num2;
                        int resultat;
                        while (num1 <= b) {
                            resultat = num1 * b;
                            while (resultat != num1) {
                                if (resultat % 2 == 0) {
                                    System.out.print(resultat + "     ");
                                }
                                b--;
                                resultat = num1 * b;
                            }
                            num1++;
                            b = num2;
                            System.out.println("");
                        }
                        break;
                    }
                    else System.out.println("Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!!");
                    break;

                case 5:
                    //Problema 13
                    if (show) {
                        int entrada;
                        //Puntuació
                        int puntsIA = 0;
                        int punts = 0;
                        if (ordre[3] && ordre[4] == false) {

                            if (show) System.out.println("Tria un:");
                            if (show)  System.out.println(" "+"1. Pedra");
                            if (show)  System.out.println(" "+"2. Paper");
                            if (show)  System.out.println(" "+"3. Tisora");
                            if (show)   System.out.print(" "+"Opcio: ");

                            //Entrada de la IA
                            //Entrada normal

                            while (punts != 5 || puntsIA != 5) {

                                Random iaentrada = new Random();
                                int Iaentrada = iaentrada.nextInt(3) + 1;

                                entrada = sc.nextInt();

                                if (entrada == Iaentrada) {
                                    System.out.println(entrada + " VS " + Iaentrada + "\n Empat!!");}
                                else if (entrada == 1 && Iaentrada == 2) {
                                    System.out.println(entrada + " VS " + Iaentrada + "\n Has perdut!!");
                                    puntsIA++;
                                    System.out.println("Tens: "+punts+"\n"+"Te: "+puntsIA);
                                } else if (entrada == 1 && Iaentrada == 3) {
                                    System.out.println(entrada + " VS " + Iaentrada + "\n Has guanyat!!");
                                    punts++;
                                    System.out.println("Tens: "+punts+"\n"+"Te: "+puntsIA);
                                } else if (entrada == 2 && Iaentrada == 1) {
                                    System.out.println(entrada + " VS " + Iaentrada + "\n Has guanyat!!");
                                    punts++;
                                    System.out.println("Tens: "+punts+"\n"+"Te: "+puntsIA);
                                } else if (entrada == 2 && Iaentrada == 3) {
                                    System.out.println(entrada + " VS " + Iaentrada + "\n Has perdut!!");
                                    puntsIA++;
                                    System.out.println("Tens: "+punts+"\n"+"Te: "+puntsIA);
                                } else if (entrada == 3 && Iaentrada == 1) {
                                    System.out.println(entrada + " VS " + Iaentrada + "\n Has perdut!!");
                                    puntsIA++;
                                    System.out.println("Tens: "+punts+"\n"+"Te: "+puntsIA);
                                } else if (entrada == 3 && Iaentrada == 2) {
                                    System.out.println(entrada + " VS " + Iaentrada + "\n Has guanyat!!");
                                    punts++;
                                    System.out.println("Tens: " + punts + "\n" + "Te: " + puntsIA);
                                }
                                if (punts == 5) {
                                    System.out.println("Has guanyat la parrtida");
                                    break;
                                }
                                else if(puntsIA == 5){
                                    System.out.println("Has perdut la partida");
                                    break;
                                }
                            }
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
                        System.out.println("Opció no disponible");
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