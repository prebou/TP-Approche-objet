package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CreerFichier {
    public static void main(String[] args) throws IOException {
        String fichier = "recensement.csv",fichierSorti = "recensement100l.csv";

        Path cheminFichier = Paths.get("E:/documents/parameswaran/diginamic/Java/CSV/"+fichier);
        List<String> lignes = Files.readAllLines(cheminFichier,StandardCharsets.UTF_8);

        ArrayList<String> lignesModif = new ArrayList<>();
        for (int i = 0; i < 100 ; i++) {
            lignesModif.add(lignes.get(i));
        }
        Path cheminFichierModif = Paths.get("E:/documents/parameswaran/diginamic/Java/CSV/"+fichierSorti);
        Files.write(cheminFichierModif,lignesModif,StandardCharsets.UTF_8);
        System.out.println("le fichier " + fichierSorti + " a bien été généré");
    }
}
