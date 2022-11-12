package Interfaces;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginWindow extends JDialog {
    private JPanel contentPane;
    private JTextField usuarioTextField;
    private JTextField contraseñaTextField;
    private JButton loginButton;

    public LoginWindow() {
        setContentPane(contentPane);
        setModal(true);
        setResizable(false);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });
    }




    /*public static void main(String[] args) {
        LoginWindow dialog = new LoginWindow();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
     */
}
