package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class TestCalendar {
    public static void main(String[] args) throws Exception{
        Calendar date = Calendar.getInstance();
        date.set(2016,4,19,23,59,30);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");
        Locale russe = Locale.of("ru","RU");
        Locale chinois = Locale.of("zh","CN");
        Locale allemagne = Locale.of("de","GER");

        SimpleDateFormat dateFormat1 = new SimpleDateFormat("EEEE dd MMMM YYYY HH:mm:ss");
        System.out.println(dateFormat.format(date.getTime()));
        System.out.println(dateFormat1.format(date.getTime()));

        SimpleDateFormat dateFormatRusse = new SimpleDateFormat("EEEE dd MMMM YYYY HH:mm:ss",russe);
        System.out.println(dateFormatRusse.format(date.getTime()));

        SimpleDateFormat dateFormatChine = new SimpleDateFormat("EEEE dd MMMM YYYY HH:mm:ss",chinois);
        System.out.println(dateFormatChine.format(date.getTime()));

        SimpleDateFormat dateFormatAllemagne = new SimpleDateFormat("EEEE dd MMMM YYYY HH:mm:ss",allemagne);
        System.out.println(dateFormatAllemagne.format(date.getTime()));


    }
}
