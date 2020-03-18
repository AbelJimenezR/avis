import java.util.ArrayList;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);
    public static boolean b = true;
    public static void main(String[] args) {

        CarregaDades.carregaUsuaris();

        do {
            System.out.println("Introdueix el nom d'usuari:");
            String usuari = sc.next();
            System.out.println("Introdueix el password:");
            String pass = sc.next();

            if (Utilitat.comprovaUsuari(usuari, pass).equals("UsuariCoordinador")) {
                MenuCoordinador mc = new MenuCoordinador();
                mc.menuCoordinador();
            } else if (Utilitat.comprovaUsuari(usuari, pass).equals("UsuariGestor")) {
                MenuGestor mg = new MenuGestor();
                mg.menuGestor();
            } else if (Utilitat.comprovaUsuari(usuari, pass).equals("Usuari")) {
                MenuUsuari mu = new MenuUsuari();
                mu.menuUsuari();
            }else if (Utilitat.comprovaUsuari(usuari, pass).equals("no")){
                System.out.println("Usuari o contrasenya incorrecte");
            }

        }while(b);

    }

}


