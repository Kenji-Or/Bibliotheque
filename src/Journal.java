public class Journal extends Media implements Empruntable, Consultable{
    private boolean estEmprunte = false;

    public Journal(final String titre) {
        super(titre);
    }

    @Override
    public void emprunter() {
        if (!estEmprunte) {
            estEmprunte = true;
            System.out.println(titre + " a été emprunté.");
        } else {
            System.out.println(titre + " est déjà emprunté.");
        }
    }

    @Override
    public void retourner() {
        if (estEmprunte) {
            estEmprunte = false;
            System.out.println(titre + " a été retourné.");
        } else {
            System.out.println(titre + " n'est pas emprunté.");
        }
    }

    @Override
    public void consulter() {
        System.out.println("Consultation de " + titre);
    }

    @Override
    public void afficher() {
        System.out.println("Journal: " + titre);
    }
}
