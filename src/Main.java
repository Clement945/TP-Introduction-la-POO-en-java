import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;
import java.util.Scanner;
public class Main {     //point d'entrée du programme

    // 1ère étape
    // Caractéristique données (attributs)
    static class Bateau {           //Classe de référence. Il y a tous les attributs en private car il joue dans l'encapsulation
        //comme de la patte a modelé
        private int poidsMax;
        private int taille;
        private int longueur;
        private int largeur;
        private int hauteur;
        private String matiereTransportee;
        private int tirrantdeau;
        private int propulsion;
        private int vitesse;
        private char categorie;
        private int charge;  //demmander pourquoi on a mis ça dans les attributs ?
        private int membreequipage;
        private int nbPassagers;

        //2ème étape

        // Constructeur relatif à la classe de base
        // = Assemblage
        //nom du contructeur = nom de la classe (Bateau)
        public Bateau(int poidsMax, int taille, int longueur, int largeur, int hauteur, String matiereTransportee,
                      int tirrantdeau, int propulsion, int vitesse, char categorie, int charge, int membreequipage, int nbPassagers) {
            this.poidsMax = poidsMax;  //this. permet de fixer et de créer l'attribut au niveau du constructeur
            this.taille = taille;
            this.longueur = longueur;
            this.largeur = largeur;
            this.hauteur = hauteur;
            this.matiereTransportee = matiereTransportee;
            this.tirrantdeau = tirrantdeau;
            this.propulsion = propulsion;
            this.vitesse = vitesse;
            this.categorie = categorie;
            this.charge = charge;
            this.membreequipage = membreequipage;
            this.nbPassagers = nbPassagers;

            System.out.println("Constructeur bateau Ok");  //Voit si ça marche

        }

        //3ème étape : Méthode

        //get = donner l'information et/ou afficher et set = recevoir l'information et/ou stocker
        // get et set sont des méthodes particulières

        //set c'est void
        //get c'est return (retourner une valeur) // Méthode = comportement
        public int getPoidsMax() {
            return poidsMax;
        }

        public void setPoidsMax(int poidsMax) {
            this.poidsMax = poidsMax;
            // echo 'poidsmax'
        }

        public int getTaille() {
            return taille;
        }

        public void setTaille(int taille) {
            this.taille = taille;
        }

        public int getLongueur() {
            return longueur;
        }

        public void setLongueur(int longueur) {
            this.longueur = longueur;
        }

        public int getLargeur() {
            return largeur;
        }

        public void setLargeur(int largeur) {
            this.largeur = largeur;
        }

        public int getHauteur() {
            return hauteur;
        }

        public void setHauteur(int hauteur) {
            this.hauteur = hauteur;
        }

        public String getMatiereTransportee() {
            return matiereTransportee;
        }

        public void setMatiereTransportee(String matiereTransportee) {
            this.matiereTransportee = matiereTransportee;
        }

        public int getTirrantdeau() {
            return tirrantdeau;
        }

        public void setTirrantdeau(int tirrantdeau) {
            this.tirrantdeau = tirrantdeau;
        }

        public int getPropulsion() {
            return propulsion;
        }

        public void setPropulsion(int propulsion) {
            this.propulsion = propulsion;
        }

        public int getVitesse() {
            return vitesse;
        }

        public void setVitesse(int vitesse) {
            this.vitesse = vitesse;
        }

        public char getCategorie() {
            return categorie;
        }

        public void setCategorie(char categorie) {
            this.categorie = categorie;
        }

        public int getCharge() {
            return charge;
        }

        public void setCharge(int charge) {
            this.charge = charge;
        }

        public int getMembreequipage() {
            return membreequipage;
        }

        public void setMembreequipage(int membreequipage) {
            this.membreequipage = membreequipage;
        }

        public int getNbPassagers() {
            return nbPassagers;
        }

        public void setNbPassagers(int nbPassagers) {
            this.nbPassagers = nbPassagers;
        }
/*
        public int derteminenombreequipage(int membreequipage){
            Random rand = new Random();
            int membreeequipage = 0;


            return membreeequipage;
        }
*/
        public void afficherCaracteristiqueBateau(Bateau unbateau) {  //variable unbateau // dans la fonction il y a 600
            System.out.println("Longueur " + unbateau.getLongueur());
            System.out.println("Largeur " + unbateau.getLargeur());
            System.out.println("Catégorie " + unbateau.getCategorie());
            System.out.println("Taille du Bateau " + unbateau.getTaille());
            System.out.println("Nombre de passagers " + unbateau.getNbPassagers());
        }

    }


    //4ème étape

    //classe fille ici (static class etc.)


    // Avec extends = récupérer (caractéristique) toutes les informations qu'elle a de base et rajouter en plus

    //utilisé super pour la classe fille en référence à la classe mère
    //Le but est de déclanché l'héritage
    static class Tanker extends Bateau {  //mettre extends

        public Tanker(int poidsMax, int taille, int longueur, int largeur, int hauteur, String matiereTransportee, int tirrantdeau, int propulsion, int vitesse, char categorie, int charge, int membreequipage, int nbPassagers) {
            super(poidsMax, taille, longueur, largeur, hauteur, matiereTransportee, tirrantdeau, propulsion, vitesse, categorie, charge, membreequipage, nbPassagers);

        }

    }

    static class Cargo extends Bateau {

        public Cargo(int poidsMax, int taille, int longueur, int largeur, int hauteur, String matiereTransportee, int tirrantdeau, int propulsion, int vitesse, char categorie, int charge, int membreequipage, int nbPassagers) {
            super(poidsMax, taille, longueur, largeur, hauteur, matiereTransportee, tirrantdeau, propulsion, vitesse, categorie, charge, membreequipage, nbPassagers);
        }
    }

    static class Catamaran extends Bateau {
        public Catamaran(int poidsMax, int taille, int longueur, int largeur, int hauteur, String matiereTransportee, int tirrantdeau, int propulsion, int vitesse, char categorie, int charge, int membreequipage, int nbPassagers) {
            super(poidsMax, taille, longueur, largeur, hauteur, matiereTransportee, tirrantdeau, propulsion, vitesse, categorie, charge, membreequipage, nbPassagers);


        }
    }

    static class Plaisancier extends Bateau {

        private int poidslege;
        private int poidsnongerer;

        public Plaisancier(int poidsMax, int taille, int longueur, int largeur, int hauteur, String matiereTransportee, int tirrantdeau,
                           int propulsion, int vitesse, char categorie, int charge, int membreequipage, int nbPassagers, int poidslege, int poidsnongerer) {
            super(poidsMax, taille, longueur, largeur, hauteur, matiereTransportee, tirrantdeau, propulsion, vitesse, categorie, charge, membreequipage, nbPassagers);

            this.poidslege = poidslege;  //this. permet de fixer et de créer l'attribut au niveau du constructeur
            this.poidsnongerer = poidsnongerer;


        }

        public int getPoidslege() {

            return poidslege;
        }

        public void setPoidslege(int poidslege) {

            this.poidslege = poidslege;
        }

        public int getPoidsnongerer() {
            return poidsnongerer;
        }

        public void setPoidsnongerer(int poidsnongerer) {
            this.poidsnongerer = poidsnongerer;
        }


        public void afficherCaracteristiquePlaisancier(Plaisancier unbateau) {  //variable unbateau
            System.out.println("Poids leger " + unbateau.getPoidslege());
            System.out.println("Poids non gérer " + unbateau.getPoidsnongerer());
            System.out.println("Nombre d'équipage "+unbateau.getMembreequipage());
        }

    }
                /*Ce que ça fait : Plaisancier (classe fille) --> variable unbateau
            --> pour être précis à l'affichage, utilisé la varibable unbateau vers la méthode: unbateau.getPoidsLege()
            --> avec la fonction : utilisé avec la classe Plaisancier avec l'objet plaisancier
            --> ce qui donne plaisancier.afficherCaractéristiquePlaisancier(plaisancier);
            */

    // Instanciation d'un objet = avec l'instruction new //allumer le moteur pour mettre sur l'eau
    // (moteur d'un bateau que l'on met en marche = on)
    // L'instanciation se trouve dans le programme principal


    //5ème étape (Instanciation)
    public static void main(String[] args) {        //programme principal
        Collection<String> flotte = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 4; i > 0; i--) { // boucle for pour ajouter 3 bateaux
            System.out.print("Saisir un type de bateau pour constituer la collection (tanker, cargo, catamaran, plaisancier) : ");
            String lebateau = scanner.nextLine();
            flotte.add(new String(lebateau));

            System.out.println("Constitution en cours de la flotte " + flotte.toString());

            System.out.println();
            System.out.println("Traitement de la flotte de bateaux");

            switch (lebateau) {
                case "tanker":
               /* Tanker tanker = new Tanker(200, 500, 600, 300, 400, "Textile", 10,200
                        ,60, 'A', 20,100, 60);

                tanker.afficherCaracteristiqueTanker(tanker);*/
                    break;

                case "cargo":
              /*  Cargo cargo = new Cargo(200, 500, 600, 300, 400, "Textile", 10,200
                        ,60, 'A', 20,100, 60);

                cargo.afficherCaracteristiqueCargo(cargo);*/
                    break;

                case "catamaran":
              /*  Catamaran catamaran = new Catamaran(200, 500, 600, 300, 400, "Textile", 10,200
                        ,60, 'A', 20,100, 60);

                catamaran.afficherCaracteristiqueCatamaran(catamaran);*/
                    break;

                case "plaisancier":
                    Plaisancier plaisancier = new Plaisancier(300, 100, 100, 300, 200,
                            "Coton", 600, 200,
                            1000, 'B', 20, 300,
                            100, 20,600);
                  /*  plaisancier.derteminenombreequipage(plaisancier); */
                    plaisancier.afficherCaracteristiquePlaisancier(plaisancier);

                    break;

                default:
                    System.out.println("Bateau non prévu");
            }
        }
    }
}

/*

        Bateau bateau = new Bateau(200, 500, 600, 300, 400, "Textile", 10,200
        ,60, 'A', 20,100, 60);

            bateau.afficherCaracteristiqueBateau(bateau);  //appeller elle-même le bateau, en gros bateau.unbateau(bateau) bateau appelle elle-même

*/

     /*Donc unbateau (Variable donné par la classe Bateau) est liée avec get,
         puis unbateau (dont la fonction est afficherCaracteristiqueBateau) est liée avec bateau
         pour ensuite l'appeler lui-même et affiché quelque choses*/

    /*Plaisancier : Le nom de la classe qui définit la structure et le comportement des objets de type Plaisancier.
    Donc une instanciation

    plaisancier : c'est un objet, une variable qui référence un objet de type Plaisancier

    new : Un mot-clé qui indique que nous créons une nouvelle instance de la classe Plaisancier.
    nous utilisons new Plaisancier(...) pour créer un nouvel objet de la classe Plaisancier

    Plaisancier : C'est lié à la classe fille.
    La méthode constructeur de la classe Plaisancier
    qui prend 15 paramètres pour initialiser les attributs de l'objet que nous créons
    Ces valeurs sont fournies pour initialiser les attributs de l'objet que nous créons
    */