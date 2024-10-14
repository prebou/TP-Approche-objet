package fr.diginamic.chaines.StringBuilders;

import java.util.Date;

public class TestStringBuilder {
    public static void main(String[] args) {
        //StringBuilder builder = new StringBuilder();
        String chaine = "";
        long debut = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            //builder.append(i); // resultat 8ms
            chaine = i +" "+ i; // 496ms
            System.out.println(chaine);

        }
        long fin = System.currentTimeMillis();
        System.out.println("Temps écoulé en millisecondes :" + (fin - debut));
        Date date = new Date(124,9,14);

    }
}
