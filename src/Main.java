import Interfaces.LoginWindow;
import Logica.Conexion;
import Logica.Mocion;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Mocion mocion = new Mocion();
        Conexion.initConn();
        mocion.getMociones();
        //star();
    }

    public static void star(){
        LoginWindow dialog = new LoginWindow();
        dialog.pack();
        dialog.setVisible(true);
        //System.exit(0);
    }
}