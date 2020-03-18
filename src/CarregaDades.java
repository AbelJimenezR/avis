import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class CarregaDades {
    private static ArrayList<Usuari> llistaUsuaris = new ArrayList<Usuari>();

    public static void carregaUsuaris(){
        try
        {

            Connection conn = Conexion.conectar();
            String query = "SELECT * FROM usuari";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next())
            {

                String nom = rs.getString("nom");
                String password = rs.getString("password");
                int rol = rs.getInt("rol");

                if(rol==1){

                    llistaUsuaris.add(new UsuariCoordinador(nom,password));

                }else if(rol==2){
                    llistaUsuaris.add(new UsuariGestor(nom,password));
                }else if(rol==3){
                    llistaUsuaris.add(new Usuari(nom,password));
                }

            }
            rs.close();
            st.close();
            conn.close();
        }
        catch (Exception e)
        {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }

    public static ArrayList<Usuari> getLlistaUsuaris() {
        return llistaUsuaris;
    }

    public static void setLlistaUsuaris(ArrayList<Usuari> llistaUsuaris) {
        CarregaDades.llistaUsuaris = llistaUsuaris;
    }
}
