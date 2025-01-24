Gestion de Bibliothèque en Java

Description

Ce projet implémente un système de gestion de bibliothèque en Java. L'application permet de gérer l'emprunt, le retour, et la consultation de différents types de médias, tels que des livres, magazines, journaux, enregistrements audio et DVD. Elle est conçue pour illustrer les concepts avancés de programmation orientée objet (POO) et l'utilisation des interfaces et collections en Java.

Fonctionnalités

Gestion des emprunts et des retours de médias.

Consultation des médias directement dans la bibliothèque.

Suivi des emprunts en cours.

Affichage des informations des médias (titre).

Structure du Projet

1. Classes principales

Media (classe abstraite) : Classe de base pour tous les médias. Elle gère le titre des médias et un compteur statique.

Livre, DVD, Magazine, Journal, EnregistrementAudio : Sous-classe de Media qui implémente les interfaces Empruntable et Consultable.

Bibliotheque : Gère une collection de médias et d'emprunts.

2. Interfaces

Empruntable : Déclare les méthodes emprunter(), retourner(), et getTitre().

Consultable : Déclare la méthode consulter().

3. Classe principale

Main : Fournit des exemples d'utilisation du système.

Prérequis

Java 8 ou version supérieure

Un environnement de développement Java (Eclipse, IntelliJ IDEA, ou Visual Studio Code avec l'extension Java).

Instructions d'Installation et d'Exécution

Clonez le projet ou téléchargez les fichiers source.

Importez le projet dans votre IDE.

Compilez les fichiers Java.

Exécutez la classe Main pour tester le programme.

Exemple d'Utilisation

Voici un exemple d'utilisation du système dans la classe Main :

```
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
```

Organisation du Projet

Media.java : Classe abstraite de base.

Livre.java/ Journal.java / ... : Classe représentant un livre/ journal / ..., qui peut être emprunté ou consulté.

Bibliotheque.java : Classe gérant les médias et les emprunts.

Main.java : Point d'entrée pour tester le programme.


Auteur 

Nom : Ogier Kenji 
Email : kenjiogier@gmail.com
