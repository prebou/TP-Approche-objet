package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LectureFichier {
    public static void main(String[] args) throws IOException {
        ArrayList<Commune> communes = new ArrayList<>();
        ArrayList<Commune> header = new ArrayList<>();
        ArrayList<String> enregistrementCommunes = new ArrayList<>();

        String fichier = "recensement.csv";
        Path cheminFichier = Paths.get("E:/documents/parameswaran/diginamic/Java/CSV/"+fichier);
        List<String> lignes = Files.readAllLines(cheminFichier, StandardCharsets.UTF_8);

        for (int i = 0; i < lignes.size(); i++){
            if (i < 1){
                String ligne = lignes.get(i);
                String[] elements = ligne.split(";");
                String nom = elements[6];
                String codeDepartement = elements[2];
                String nomRegion = elements[1];
                String populationTotal = elements[9];
                header.add(new Commune(nom, codeDepartement, nomRegion, populationTotal));
                String[] commune = {nom, codeDepartement, nomRegion, populationTotal};
                enregistrementCommunes.add(String.join(";",commune));
                System.out.println(ligne);
            }else {
                String ligne = lignes.get(i);
                String[] elements = ligne.split(";");
                String nom = elements[6];
                String codeDepartement = elements[2];
                String nomRegion = elements[1];
                String populationTotal = elements[9];
                int population = Integer.parseInt(elements[9].replaceAll(" ",""));
                communes.add(new Commune(nom, codeDepartement, nomRegion, populationTotal));

                if (population >= 25000){
                    String[] commune = {nom, codeDepartement, nomRegion, populationTotal};
                    enregistrementCommunes.add(String.join(";",commune));
                    System.out.println(ligne);
                }

            }

        }
        String fichierSorti = "plusHabitants.csv";
        Path cheminFichierModif = Paths.get("E:/documents/parameswaran/diginamic/Java/CSV/"+fichierSorti);
        Files.write(cheminFichierModif,enregistrementCommunes,StandardCharsets.UTF_8);
    }
}
