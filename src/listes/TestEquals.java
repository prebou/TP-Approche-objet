package listes;

public class TestEquals {
    public static void main(String[] args) {

        Ville ville1 = new Ville("Paris", 2_087_577);
        Ville ville2 = new Ville("Paris", 2_087_577);
        Ville ville3 = new Ville("Lyon", 522_250);
        Ville ville4 = ville1;
        String a = "";

        System.out.println("avec la methode equals : " + (ville1.equals(ville2)));
        System.out.println("avec la methode equals different type: " + (ville1.equals(a)));
        System.out.println("avec égal : " + (ville1 == ville2));
        System.out.println("avec égal : " + (ville1 == ville4));

        System.out.println("avec la methode equals : " + (ville1.equals(ville3)));

    }
}
