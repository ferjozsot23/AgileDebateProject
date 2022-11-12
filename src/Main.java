import Interfaces.LoginWindow;
import Logica.Conexion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    Conexion connection;
    public static void main(String[] args) throws SQLException {
    connec
        Conexion.initConn();

        //star();
    }

    public static void star(){
        LoginWindow dialog = new LoginWindow();
        dialog.pack();
        dialog.setVisible(true);
        //System.exit(0);
    }

    public static void getMociones(){
        PreparedStatement stm = connection.connection.prepareStatement("SELECT * FROM MOCION");
        ResultSet result stm.executeQuery();
    }
}