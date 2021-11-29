import java.util.Scanner;
import java.util.Random;
public class Persona {

    void Persona() {}

    boolean talking() {
        boolean finish = false;

        System.out.println("Qüestionari:");
        System.out.println("    1. Quin tipus de persona ets?");
        System.out.println("    2. Quin esport t'agrada?");
        System.out.println("    3. Quin és el teu número favorit entre 0 i ...?");
        System.out.println("    4. Sabries llistar tots els nombres parells resultants de la multiplicació, entre el valor enter de a i b, on el valor de a creixerà fins b, b decreixerà fins a ?");
        System.out.println("    5. Juguem a pedra paper i tisora?");
        System.out.println("    6. Posa-li un nom:");
        System.out.println("    7. Pots recordar-me la nostra conversa?");
        System.out.println("    8. Sortir");
        Scanner sc = new Scanner(System.in);
        System.out.println("Opció:");
        int Opció = sc.nextInt();
        switch (Opció) {
            case 1:
                Scanner enter = new Scanner(System.in);
                System.out.println("Introdueix un enter entre 0 i 100");
                int numenter = enter.nextInt();

                while (true)
                    if (numenter % 2 == 0 && numenter % 3 != 0) {
                        System.out.println("Home");
                        break;
                    } else if (numenter % 2 != 0 && numenter % 3 == 0) {
                        System.out.println("Dona");
                        break;
                    } else if (numenter % 2 == 0 && numenter % 3 == 0) {
                        System.out.println("No binari");
                        break;
                    } else if (numenter < 100) numenter += 2;
                    else numenter -= 4;
                return true;

            case 2:
                Scanner esport = new Scanner(System.in);
                System.out.println("Escriu un número (1..10)");
                int sport = esport.nextInt();
                switch (sport) {
                    case 1:
                        System.out.println("Fútbol");
                        break;
                    case 2:
                        System.out.println("Bàsquet");
                        break;
                    case 3:
                        System.out.println("Tennis");
                        break;
                    case 4:
                        System.out.println("Surf");
                        break;
                    case 5:
                        System.out.println("Cricket");
                        break;
                    case 6:
                        System.out.println("Badminton");
                        break;
                    case 7:
                        System.out.println("Padel");
                        break;
                    case 8:
                        System.out.println("Esquí");
                        break;
                    case 9:
                        System.out.println("Natació");
                        break;
                    case 10:
                        System.out.println("Dança");
                        break;

                }
                return true;
            case 3: {
                Scanner preferit = new Scanner(System.in);
                System.out.println("Dis-li un número màxim");
                int maxim = preferit.nextInt();
                int x = maxim / 2;
                int y = 0;
                for (y = 0; y < x; y++) {
                    System.out.print(y + " ");
                }
                System.out.print("... He escollit el " + x);
            }
            return true;

            case 4:
                Scanner multiplicar = new Scanner(System.in);
                System.out.println("Introdueix dos enters");
                int num1 = multiplicar.nextInt();
                int num2 = multiplicar.nextInt();
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

                return true;


            case 5:
                Scanner scanner = new Scanner(System.in);
                //Entrada de la IA
                //Entrada normal
                int entrada;
                //Puntuació
                int puntsIA = 0;
                int punts = 0;

                while (punts != 5 || puntsIA != 5) {

                    Random iaentrada = new Random();
                    int Iaentrada = iaentrada.nextInt(3) + 1;

                    System.out.println("Tria un:");
                    System.out.println(" "+"1. Pedra");
                    System.out.println(" "+"2. Paper");
                    System.out.println(" "+"3. Tisora");
                    System.out.print(" "+"Opcio: ");
                    entrada = scanner.nextInt();

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

            case 6:
                Scanner meunom = new Scanner(System.in);
                System.out.println("Quin vols que sigui el meu nom?");
                String nom = meunom.nextLine();
                System.out.println("Gràcies! Magrada " + nom);
                return true;

        }
        return false;
    }


    //Constructor
}
