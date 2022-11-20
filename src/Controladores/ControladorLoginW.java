package Controladores;

import Logica.Participante;

public interface ControladorLoginW {


    public default void verificarUsuario(String usuario, String contraseña) {

    }

    public default boolean verficarIngresoValido(String usuario, String contraseña) {
        boolean ingresoCorrecto = false;

        //No JTextField vacios
        //No caracteres extraños

        //Usuario o contraseña valida
        verificarUsuario(usuario, contraseña);
        return  ingresoCorrecto;
    }
}
