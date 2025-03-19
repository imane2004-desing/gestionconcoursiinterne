package ma.projet.test;

import ma.projet.bean.Profile;
import ma.projet.bean.Utilisateur;
import ma.projet.impl.ProfileImpl;
import ma.projet.impl.UtilisateurImpl;

public class Test {
    public static void main(String[] args) {
        ProfileImpl profileImpl = new ProfileImpl();
        UtilisateurImpl utilisateurImpl = new UtilisateurImpl();

        Profile cp = new Profile(1, "CP", "Chef de projet");
        Profile mn = new Profile(2, "MN", "Manager");
        profileImpl.create(cp);
        profileImpl.create(mn);

        Utilisateur u1 = new Utilisateur(1, "Ali", "Bader", "ali.bader@mail.com", "123456789", 5000, "jdoe", "pass123", "IT", mn);
        utilisateurImpl.create(u1);

        System.out.println("Liste des managers :");
        for (Utilisateur u : utilisateurImpl.getManagers()) {
            u.afficher();
        }
    }
}
