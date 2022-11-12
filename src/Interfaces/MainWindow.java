package Interfaces;

import javax.swing.*;
import java.awt.event.*;

public class MainWindow extends JDialog {
    private JPanel contentPane;

    public MainWindow() {
        setContentPane(contentPane);
        setModal(true);
    }
}
