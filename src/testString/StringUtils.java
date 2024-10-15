package testString;

public class StringUtils {
    public static String append(Object... valeur){
        StringBuilder builder = new StringBuilder();

        for (Object o : valeur){
            builder.append(o);
        }
        return builder.toString();
    }
}
