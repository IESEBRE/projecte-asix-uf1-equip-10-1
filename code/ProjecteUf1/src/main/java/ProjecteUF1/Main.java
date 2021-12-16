package ProjecteUF1;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static boolean show;


    public static void main(String[] args) {
        int num = Integer.parseInt(sc.nextLine());
        show = num != 0;
        int quants;
        int quant= -1;
        String[] converses;
        quants = Integer.parseInt(sc.nextLine());
        num = quants;
        converses = new String[quants];
        while (true) {
            if (show) System.out.println("1. Conversar.");
            if (show) System.out.println("2. Mostrar conversa.");
            if (show) System.out.println("3. Sortir del programa.");
            switch (sc.nextInt()) {

                case 1:
                    if(num == 0) {System.out.println("No pots fer mes converses!!");break;}
                    boolean finish = false;
                    if (show) System.out.println("Amb qui vols conversar?");
                    if (show) System.out.println(" - ProjecteUF1.Persona");
                    if (show) System.out.println(" - Animal");
                    if (show) System.out.println(" - Extraterrestre");
                    if (show) System.out.print("Opció: ");

                    do {

                        // Escollir amb qui volem conversar

                        switch (sc.nextLine()) {
                            case "ProjecteUF1.Persona":
                                Persona person = new Persona();
                                quant++;
                                converses[quant] = person.talking();
                                num--;
                                break;

                            case "Animal":
                                Animal animal = new Animal();
                                quant++;
                                converses[quant] = animal.talking();
                                num--;
                                break;

                            case "Extraterrestre":
                                quant++;
                                Alien extraterrestre = new Alien();
                                converses[quant] = extraterrestre.talking();
                                num--;
                                break;

                            default:
                                System.out.println("Ens inexistent, prova en un altre!!");
                                break;
                        }
                    } while (num != 0);
                    break;
                case 2:
                    if (quant==-1) System.out.println("No hi ha converses a mostrar!!");
                    else{
                        if (show) System.out.printf("quina conversa vols veure (1-%d):",quants);
                        int i = sc.nextInt();
                        System.out.println(converses[i-1]);}
                    break;
                case 3:

                    return;

                default:
                    System.out.println("Opcio incorrecta. Torna-ho a intentar!!");
                    break;
            }
        }
    }
}

