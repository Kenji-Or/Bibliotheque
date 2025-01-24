public class Main {
    public static void main(String[] args) {
        Bibliotheque bibliotheque = new Bibliotheque();

        // Création des médias
        Livre livre1 = new Livre("Les Misérables");
        Livre livre2 = new Livre("1984");
        DVD dvd1 = new DVD("Retour vers le futur", "1h31");
        EnregistrementAudio audio1 = new EnregistrementAudio("Enregistrement1", "35min");
        Journal journal1 = new Journal("Lundi 1 janvier 1975");
        Magazine magazine1 = new Magazine("La start des réseaux sociaux");

        // Ajout des médias a la liste des médias
        bibliotheque.ajouterMedia(livre1);
        bibliotheque.ajouterMedia(livre2);
        bibliotheque.ajouterMedia(dvd1);
        bibliotheque.ajouterMedia(magazine1);
        bibliotheque.ajouterMedia(journal1);
        bibliotheque.ajouterMedia(audio1);

        //affichage des médias
        bibliotheque.afficherMedias();

        // Test emprunt des médias
        bibliotheque.emprunterMedia(livre1);
        bibliotheque.emprunterMedia(livre1);

        // afficher liste des médias emprunte
        bibliotheque.afficherEmprunts();

        // test retourner media
        bibliotheque.retournerMedia(livre1);
        // test retourner media qui n'est pas emprunte
        bibliotheque.retournerMedia(livre1);
        // emprunt de média
        bibliotheque.emprunterMedia(dvd1);
        bibliotheque.emprunterMedia(journal1);
        bibliotheque.emprunterMedia(magazine1);
        bibliotheque.emprunterMedia(audio1);

        bibliotheque.afficherEmprunts();

        // consultation des médias
        bibliotheque.consulterMedia(magazine1);
        bibliotheque.consulterMedia(journal1);
        bibliotheque.consulterMedia(audio1);
        bibliotheque.consulterMedia(livre2);
        bibliotheque.consulterMedia(dvd1);
    }
}