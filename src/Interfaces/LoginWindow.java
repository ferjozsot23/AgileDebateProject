package Interfaces;

import Controladores.ControladorLoginW;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginWindow extends JDialog implements ControladorLoginW {
    private JPanel contentPane;
    private JTextField usuarioTextField;
    private JTextField contraseñaTextField;
    private JButton loginButton;

    public LoginWindow() {
        setContentPane(contentPane);
        setModal(true);
        setResizable(false);
        loginButton.addActionListener(accionBotonLogin);
    }

    //Acciones de botones
    ActionListener accionBotonLogin = new ActionListener(){
        public void actionPerformed(ActionEvent actionEvent) {
            verificarLogin();
            abrirMainWindow(1);
        }
    };

    //Métodos de interacción
    private void abrirMainWindow(int idUsuario){
        MainWindow mainWindow = new MainWindow(idUsuario);
        mainWindow.pack();
        this.setVisible(false);
        mainWindow.setVisible(true);
        System.exit(0);
    }

    //Métodos rederigidos a controladores
    private void verificarLogin() {
        String usuario = usuarioTextField.getText();
        String contraseña = contraseñaTextField.getText();
        verficarIngresoValido(usuario, contraseña);
    }

}
