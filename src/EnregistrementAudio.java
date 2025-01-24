// Classe EnregistrementAudio qui hérite de Media et implémente les interfaces Empruntable et Consultable
public class EnregistrementAudio extends Media implements Empruntable, Consultable{
    // Indique si l'enregistrement est actuellement emprunté
    private boolean estEmprunte = false;
    // Durée de l'enregistrement audio
    private String duree;

    // Constructeur pour initialiser un EnregistrementAudio avec un titre et une durée
    public EnregistrementAudio(final String titre, final String duree) {
        super(titre); // Appelle le constructeur de la classe parente Media pour initialiser le titre
        this.duree = duree; // Initialise la durée de l'enregistrement
    }

    // Implémentation de la méthode emprunter() définie dans l'interface Empruntable
    @Override
    public void emprunter() {
        if (!estEmprunte) { // Si l'enregistrement n'est pas déjà emprunté
            estEmprunte = true; // Marque l'enregistrement comme emprunté
            System.out.println(titre + " a été emprunté.");
        } else { // Si l'enregistrement est déjà emprunté
            System.out.println(titre + " est déjà emprunté."); // Message d'erreur
        }
    }

    // Implémentation de la méthode retourner() définie dans l'interface Empruntable
    @Override
    public void retourner() {
        if (estEmprunte) { // Si l'enregistrement est actuellement emprunté
            estEmprunte = false; // Marque l'enregistrement comme disponible
            System.out.println(titre + " a été retourné.");
        } else { // Si l'enregistrement n'était pas emprunté
            System.out.println(titre + " n'est pas emprunté."); // Message d'erreur
        }
    }

    // Implémentation de la méthode consulter() définie dans l'interface Consultable
    @Override
    public void consulter() {
        System.out.println("Enregistrement audio : " + titre); // Affiche que l'enregistrement est consulté
    }

    // Implémentation de la méthode afficher() héritée de la classe Media
    @Override
    public void afficher() {
        // Affiche des informations sur l'enregistrement (titre et durée)
        System.out.println("Vous écouté l'enregistrement : " + titre + " , il dure : " + duree);
    }
}
