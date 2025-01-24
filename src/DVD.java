// Classe DVD qui hérite de Media et implémente les interfaces Empruntable et Consultable
public class DVD extends Media implements Empruntable, Consultable{
    // Indique si le DVD est actuellement emprunté
    private boolean estEmprunte = false;
    // Durée du DVD
    private String duree;

    // Constructeur pour initialiser un DVD avec un titre et une durée
    public DVD(final String titre, final String duree) {
        super(titre);
        this.duree = duree;
    }

    // Implémentation de la méthode emprunter() définie dans l'interface Empruntable
    @Override
    public void emprunter() {
        if (!estEmprunte) {
            estEmprunte = true;
            System.out.println(titre + " a été emprunté.");
        } else {
            System.out.println(titre + " est déjà emprunté.");
        }
    }

    // Implémentation de la méthode retourner() définie dans l'interface Empruntable
    @Override
    public void retourner() {
        if (estEmprunte) {
            estEmprunte = false;
            System.out.println(titre + " a été retourné.");
        } else {
            System.out.println(titre + " n'est pas emprunté.");
        }
    }

    // Implémentation de la méthode consulter() définie dans l'interface Consultable
    @Override
    public void consulter() {
        System.out.println("DVD : " + titre);
    }

    // Implémentation de la méthode afficher() héritée de la classe Media
    @Override
    public void afficher() {
        System.out.println("Vous regardé le DVD " + titre + ", il dure : " + duree);
    }
}
