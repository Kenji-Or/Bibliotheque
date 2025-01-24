import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {
    private List<Media> medias = new ArrayList<>();
    private List<Empruntable> emprunts = new ArrayList<>();

    public void ajouterMedia(Media media) {
        medias.add(media);
    }

    public void emprunterMedia(Empruntable media) {
        // Vérifie si le média n'est pas déjà emprunté
        if (!emprunts.contains(media)) {
            media.emprunter();
            emprunts.add(media);
        } else {
            System.out.println(media.getTitre() + " est déjà emprunté.");
        }
    }

    public void retournerMedia(Empruntable media) {
        if (emprunts.contains(media)) {
            media.retourner();
            emprunts.remove(media);
        } else {
            System.out.println(media.getTitre() + " n'est pas dans la liste des emprunts.");
        }
    }

    public void afficherEmprunts() {
        System.out.println("Liste des médias empruntés :");
        for (Empruntable emprunt : emprunts) {
            System.out.println("- " + emprunt.getTitre());
        }
    }

    public void afficherMedias() {
        System.out.println("Liste des medias :");
        for (Media media : medias) {
            System.out.println("- " + media.getTitre());
        }
    }

    public void consulterMedia(Media media) {
        media.afficher();
    }
}
