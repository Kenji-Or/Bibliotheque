// Import des outils nécessaire
import java.util.ArrayList;
import java.util.List;

// Classe Bibliotheque pour gérer les médias et les emprunts
public class Bibliotheque {
    // déclaration de la liste contenant tous les médias disponibles dans la bibliothèque
    private List<Media> medias = new ArrayList<>();
    // Liste des médias actuellement empruntés
    private List<Empruntable> emprunts = new ArrayList<>();

    // Ajoute un média à la liste des médias disponibles
    public void ajouterMedia(Media media) {
        medias.add(media); // Ajout dans la liste des médias
    }

    // Permet d'emprunter un média qui implémente l'interface Empruntable
    public void emprunterMedia(Empruntable media) {
        // Vérifie si le média n'est pas déjà emprunté
        if (!emprunts.contains(media)) {
            media.emprunter(); // Appelle la méthode emprunter() du média
            emprunts.add(media); // Ajoute le média à la liste des emprunts
        } else {
            // Message si le média est déjà emprunté
            System.out.println(media.getTitre() + " est déjà emprunté.");
        }
    }

    // Permet de retourner un média emprunté
    public void retournerMedia(Empruntable media) {
        // Vérifie si le média est dans la liste des emprunts
        if (emprunts.contains(media)) {
            media.retourner(); // Appelle la méthode retourner() du média
            emprunts.remove(media); // Retire le média de la liste des emprunts
        } else {
            // Message si le média n'est pas dans la liste des emprunts
            System.out.println(media.getTitre() + " n'est pas dans la liste des emprunts.");
        }
    }

    // Affiche la liste des médias actuellement empruntés
    public void afficherEmprunts() {
        System.out.println("Liste des médias empruntés :");
        for (Empruntable emprunt : emprunts) { // Parcourt la liste des emprunts
            System.out.println("- " + emprunt.getTitre()); // Affiche le titre de chaque média emprunté
        }
    }

    // Affiche tous les médias disponibles dans la bibliothèque
    public void afficherMedias() {
        System.out.println("Liste des medias :");
        for (Media media : medias) { // Parcourt la liste des médias
            System.out.println("- " + media.getTitre()); // Affiche le titre de chaque média
        }
    }

    // Permet de consulter un média (affichage des détails du média)
    public void consulterMedia(Media media) {
        media.afficher(); // Appelle la méthode afficher() du média
    }
}
