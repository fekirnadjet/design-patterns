public class Moteur {
    public static void main(String args[])
    {
        Ajoueur joueur=null;
        Aadversaire adversaire=null;
        Ijeu jeu=null;
        int choix=1;
        if (choix==1)
        {
            jeu= new jeu1();
        }
        else {
            jeu=new jeu2();
        }
        adversaire=jeu.creerAdversaire();
        joueur=jeu.creerjoueur();
        System.out.println(  joueur.getName());
        System.out.println(   adversaire.getName());
    }
}
