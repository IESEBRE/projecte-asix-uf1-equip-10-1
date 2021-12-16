package ProjecteUF1;
import java.util.Scanner;
import  java.util.Random;
import static ProjecteUF1.Main.sc;
import static ProjecteUF1.Main.show;

public class Alien {
    //Constructor de la branca Alien per al programa de simulació de conversses
    void Alien() {
    }
    String talking() {
        boolean ordre [];
        ordre = new boolean [7];
        String alienrecap = "";
        String nomrecap = "";
        String numfavrecap = " ";
        int cout = 0;
        String obci;
        String converses = "";
        String vehicle = "";
        while (true) {
            System.out.println("");
            byte opcio;
            String tipus;

            if (show) System.out.println("Selecciona quina pregunta vols:");
            if (show) System.out.println("1. Quin tipus d'extraterrestre ets: ");
            if (show) System.out.println("2. Com et desplaces?");
            if (show) System.out.println("3. Quin és el teu número favorit entre 0,0 i ...?");
            if (show)
                System.out.println("4. Sabries llista tots els números que amb decimal després de la coma igual a #,5 després\n" +
                        "de la operació (a+b)/2, entre el valor float de a i b, on el valor de a creixerà fins b, b\n" +
                        "decreixerà fins a ?");
            if (show) System.out.println("5. Juguem als barquets?");
            if (show) System.out.println("6. Posa-li un nom:");
            if (show) System.out.println("7.Pots recordar-me la nostra conversa?");
            if (show) System.out.println("8.Sortida");

            opcio = sc.nextByte();
            switch (opcio) {
                case 1:
                    float type = sc.nextFloat();
                    int type2 = (int) type;
                    float rest = type - type2;
                    float arrodoniment = Math.round(rest * 10) / 10f;
                    if (arrodoniment > 0.5) {
                        System.out.println(arrodoniment + type2 + " Pau");
                        converses += ("Pau" + "\n");
                    }else if (arrodoniment < 0.5){
                        System.out.println(arrodoniment + type2 + " Assassí");
                        converses += ("Assassí" + "\n");
                    }else if (arrodoniment == 0.5)
                        System.out.println(arrodoniment + type2 + " Sucubo");
                        converses += ("Sucubo" + "\n");

                    ordre[0] = true;
                    break;

                case 2:
                    //Problema 10
                    if (ordre[0] && ordre[1] == false) {
                        if (show) System.out.println("Com et desplaces? ");
                        float desplaces = sc.nextFloat();
                        if (desplaces == 0.1f) System.out.println("Navegant");
                        else if (desplaces == 0.2f) System.out.println("Flotant");
                        else if (desplaces == 0.3f) System.out.println("Propulsat");
                        else if (desplaces == 0.4f) System.out.println("Patinant");
                        else if (desplaces == 0.5f) System.out.println("Caminant");
                        else if (desplaces == 0.6f) System.out.println("Coetejant");
                        else if (desplaces == 0.7f) System.out.println("Planejant");
                        else if (desplaces == 0.8f) System.out.println("Corrent");
                        else if (desplaces == 0.9f) System.out.println("Saltant");
                        else if (desplaces == 1) System.out.println("Levitant");
                        converses += vehicle + "\n";
                        ordre[1] = true;
                        break;
                    }
                    else {
                        System.out.println("Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!!");}
                    break;

                case 3:
                    //Problema 11
                    if (ordre[1] && ordre[2] == false) {
                        System.out.println("Quin és el teu número favorit entre 0,0 i ...?");
                        float max = sc.nextFloat();
                        float x = max / 2;
                        for (float y = 0f; y < x; y += 0.1f) {

                            System.out.printf("%.1f%n", y);
                        }
                        System.out.printf(String.valueOf("...He triat el " + numfavrecap + "!"));
                        converses += ("...He triat el " + numfavrecap + "!") + "\n";
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
                        System.out.println("Aquest problema encara no está complet");
                        ordre[3] = true;
                        break;
                    }
                    else System.out.println("Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!!");
                    break;

                case 5:
                    //Problema 13
                    if (show) {
                        if (ordre[3] && ordre[4] == false) {
                            System.out.println("Juguem als barquets?");
                            Scanner barco = new Scanner(System.in);
                            float random = (float) Math.floor(Math.random() * 4.0f);
                            float barquito = barco.nextFloat();
                            System.out.printf("%.1f%n", random);

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
                        System.out.println("Em dic " +nomrecap+ " i soc un Alien " +alienrecap+". Em solo transportar en" + vehicle + ". El meu numero favorit es el  " + numfavrecap + ".");
                        converses += ("Em dic " + nomrecap + " i soc un Alien " +alienrecap+ ".Em solo transportar en" + vehicle + ". El meu numero favorit es el  " + numfavrecap + "." + "\n");
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