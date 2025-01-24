public class EnregistrementAudio extends Media implements Empruntable, Consultable{
    private boolean estEmprunte = false;
    private String duree;

    public EnregistrementAudio(final String titre, final String duree) {
        super(titre);
        this.duree = duree;
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
        System.out.println("Enregistrement audio : " + titre);
    }

    @Override
    public void afficher() {
        System.out.println("Vous écouté l'enregistrement : " + titre + " , il dure : " + duree);
    }
}
