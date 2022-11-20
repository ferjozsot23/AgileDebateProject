package Interfaces;

import Controladores.ControladorMainW;

import javax.swing.*;

public class MainWindow extends JDialog implements ControladorMainW {
    private final int idUsuraio;
    private JPanel contentPane;
    private JTabbedPane tabbedPane1;

    public MainWindow(int idUsuario) {
        setContentPane(contentPane);
        setModal(true);
        setResizable(false);
        this.idUsuraio = idUsuario;
        cargarUsuario(idUsuario);
    }


    //Acciones de botones

    //Métodos de interacción


    //Métodos rederigidos a controladores
    public void cargarUsuario(int idUsuario) {
        cargarDatosUsuario(idUsuario);
    }
}
