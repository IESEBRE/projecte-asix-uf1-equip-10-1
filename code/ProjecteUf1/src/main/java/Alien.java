import java.util.Scanner;

public class Alien {
//Constructor
        void Alien () {}
        boolean talking () {
            boolean finish = false;

            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("Qüestionari");
                System.out.println("1. Quin tipus d'extraterrestre ets: ");
                System.out.println("2. Com et desplaces?");
                System.out.println("3. Quin és el teu número favorit entre 0,0 i ...?");
                System.out.println("4. Sabries llista tots els números que amb decimal després de la coma igual a #,5 després\n" +
                        "de la operació (a+b)/2, entre el valor float de a i b, on el valor de a creixerà fins b, b\n" +
                        "decreixerà fins a ?");
                System.out.println("5. Juguem als barquets?");
                System.out.println("6. Posa-li un nom:");
                System.out.println("7. Pots recordar-me la nostra conversa?");
                System.out.println("8. Sortir de la conversa:");
                System.out.println(" ");
                System.out.print("Opció: ");
                int opcio = sc.nextInt();
                switch (opcio) {
                    case 1:
                        System.out.println("Quin tipus d'extraterrestre ets: ");
                        float tipus = sc.nextFloat();
                        int tipus2 = (int) tipus;
                        float rest = tipus - tipus2;
                        float arrodoniment = Math.round(rest * 10) / 10f;
                        if (arrodoniment > 0.5)
                            System.out.println(arrodoniment + tipus2 + " Pau");
                        else if (arrodoniment < 0.5)
                            System.out.println(arrodoniment + tipus2 + " Assassí");
                        else if (arrodoniment == 0.5)
                            System.out.println(arrodoniment + tipus2 + " Sucubo");
                        break;


                    case 2:
                        System.out.println("Com et desplaces? ");
                    {
                        float desplaces = sc.nextFloat();
                        if (desplaces == 0.1f) System.out.println("Cotxe");
                        else if (desplaces == 0.2f) System.out.println("Tren");
                        else if (desplaces == 0.3f) System.out.println("Moto");
                        else if (desplaces == 0.4f) System.out.println("Bicicleta");
                        else if (desplaces == 0.5f) System.out.println("Vaixell");
                        else if (desplaces == 0.6f) System.out.println("Coet");
                        else if (desplaces == 0.7f) System.out.println("Helicopter");
                        else if (desplaces == 0.8f) System.out.println("Avio");
                        else if (desplaces == 0.9f) System.out.println("Autobus");
                        else if (desplaces == 1) System.out.println("Nau espacial");

                    }

                    break;

                    case 3:
                        System.out.println("Quin és el teu número favorit entre 0,0 i ...?");
                        Scanner pref = new Scanner(System.in);
                        float max = pref.nextFloat();
                        float x = max / 2;
                        for (float y = 0f; y < x; y += 0.1f) {

                            System.out.printf("%.1f%n", y);

                        }
                        break;

                    case 4:
                        System.out.println("");

                        break;

                    case 5:
                        System.out.println("Juguem als barquets?");
                        Scanner barco = new Scanner(System.in);
                        float random = (float) Math.floor(Math.random() * 4.0f);
                        float barquito = barco.nextFloat();
                        System.out.printf("%.1f%n", random);

                    case 6:
                        System.out.println("Posa-li un nom:");
                        Scanner noun = new Scanner(System.in);
                        String nom = noun.nextLine();
                        System.out.println(nom + ". Gràcies, m’agrada aquest nom");
                        break;
                    case 7:
                        System.out.println();
                    case 8:
                        System.out.println("Vols sortir de la conversa?");
                        Scanner sortir = new Scanner(System.in);
                         String no = sortir.nextLine();
                        if (no.equals("si")){
                            return true;}
                        if (no.equals("no")){
                            break;}

                }

            }
        }
}


