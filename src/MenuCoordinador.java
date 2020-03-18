import java.util.Scanner;

public class MenuCoordinador {
    public static Integer opt;
    public static Scanner sc=new Scanner(System.in);

    public void menuCoordinador() {
        do {
            opt = null;
            System.out.println("Tria una opció");
            System.out.println("1. Gestió Usuaris");
            System.out.println("2. Gestió Espais");
            System.out.println("3. Gestió");
            System.out.println("4. Historial");
            System.out.println("5. Capacitat");
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
