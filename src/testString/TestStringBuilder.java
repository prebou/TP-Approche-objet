package testString;

public class TestStringBuilder {
    public static void main(String[] args) {
        int date = 17;
        String result = StringUtils.append("bonjour, ", "tous le monde ", "on est le ", date);
        System.out.println(result);
    }
}
