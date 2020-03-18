import java.util.ArrayList;

public class Utilitat {


    public static String comprovaUsuari(String usuari, String pass) {
        ArrayList<Usuari> llistaUsuaris = CarregaDades.getLlistaUsuaris();

        for (Usuari u : llistaUsuaris) {
            if (u.getNom().equals(usuari) && u.getPassword().equals(pass)) {
                return u.getClass().getName().toString();
            }
        }
        return "no";
    }
}
