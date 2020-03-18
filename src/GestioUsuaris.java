import java.util.Scanner;

public class GestioUsuaris {

    public static Integer opt;
    public static Scanner sc=new Scanner(System.in);

    public static void gestioUsuaris() {


        do {
            opt = null;
            System.out.println("Tria una opció");
            System.out.println("1. Alta Usuari");
            System.out.println("2. Modifica Usuari");
            System.out.println("3. Elimina Usuari");
            System.out.println("4. Llista Usuaris");
            System.out.println("5. Cerca Usuaris");
            System.out.println("6. Sortir");

            while (opt == null) {
                try {
                    opt = Integer.parseInt(sc.next());

                } catch (Exception e) {
                    System.out.println("Tria una opció vàlida");
                    opt = null;
                }
            }

            switch (opt) {
                case 1:
                    //    Utilitat.afegirAlumnes();
                    break;

                case 2:
                    //  Utilitat.veureAlumnes();
                    break;

                case 3:
                    //  Utilitat.triaAlumnes();
                    break;

                case 4:
                    //   Utilitat.triaAlumnesNota();
                    break;

                case 5:
                    //  Utilitat.navega();
                    break;

                case 6:
                    System.out.println("Fins aviat!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Tria una opció vàlida.");

            }

        } while (opt != 6);
    }
}
