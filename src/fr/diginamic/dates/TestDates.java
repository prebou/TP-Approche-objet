package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        Date date = new Date(124,9,14);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        Date date1 = new Date(116,4,19,23,59,30);
        Date dateActuelle = new Date();
        stringBuilder.append(dateFormat.format(date));
        stringBuilder.append("\n");
        stringBuilder.append(dateFormat1.format(date1));
        stringBuilder.append("\n"+dateFormat1.format(dateActuelle));
        System.out.println(stringBuilder);
    }

}
