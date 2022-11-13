package Logica;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Mocion {
    private int id;
    private String tipo;
    private String descripcion;

    public Mocion() {
    }

    public Mocion(int id, String tipo, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
        this.tipo = tipo;
    }


    public void getMociones() {
        try {
            PreparedStatement stm = Conexion.connection.prepareStatement("SELECT * FROM MOCION");
            ResultSet result = stm.executeQuery();
            while (result.next()) {
                this.id=result.getInt("idmocion");
                this.tipo=result.getString("tipomocion");
                this.descripcion=result.getString("descripcion");
            }
            System.out.println(id+"  "+ tipo + "   "+ descripcion);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    @Override
    public String toString() {
        return "Moción --> " +
                "\tID:" + id +
                "\tDescripción:" + descripcion  +
                "\tTipo=" + tipo;
    }
}
