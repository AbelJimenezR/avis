import java.util.ArrayList;

public class Usuari {

    private String nom;
    private String password;

    public Usuari(String nom, String password){
        this.nom=nom;
        this.password=password;


    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
