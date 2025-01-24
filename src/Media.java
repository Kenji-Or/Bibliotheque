public abstract class Media {
    protected String titre;
    private static int quantiteMedias;

    public Media(final String titre) {
        this.titre = titre;
        quantiteMedias++;
    }

    public String getTitre() {
        return titre;
    }

    public void afficher(){}
}

// Interfaces Empruntable et Consultable
interface Empruntable {
    void emprunter();
    void retourner();
    String getTitre();
}

interface Consultable {
    void consulter();
}
