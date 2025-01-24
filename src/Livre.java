// Classe Livre qui hérite de Media et implémente les interfaces Empruntable et Consultable
public class Livre extends Media implements Empruntable, Consultable{
    // Indique si le livre est actuellement emprunté
    private boolean estEmprunte = false;

    // Constructeur pour initialiser un Livre avec son titre
    public Livre(final String titre) {
        super(titre);
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
        System.out.println("Consultation de " + titre);
    }

    // Implémentation de la méthode afficher() héritée de la classe Media
    @Override
    public void afficher() {
        System.out.println("Livre: " + titre);
    }
}
