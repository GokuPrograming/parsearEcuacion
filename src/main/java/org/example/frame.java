package org.example;
import javax.swing.*;
import org.jdesktop.swingx.prompt.PromptSupport;


public class frame extends JFrame {
    private JTextField textField;
    private JButton button;
    private JButton exitButton;

    public frame() {
        // Configurar la ventana
        setTitle("Ingresar datos");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar la ventana en la pantalla

        // Crear los componentes
        JLabel label = new JLabel("Ingrese una ecuacion:");
        textField = new JTextField(20);
        //textField.setSize(40,50);
        button = new JButton("Aceptar");
        exitButton = new JButton("Salir");

        // Configurar los componentes
        /*JPanel panel = new JPanel(new BorderLayout());
        panel.add(label, BorderLayout.NORTH);
        panel.add(textField, BorderLayout.CENTER);
        JPanel buttonPanel = new JPanel(new GridLayout(1, 2));
        buttonPanel.add(button);
        buttonPanel.add(exitButton);
        panel.add(buttonPanel, BorderLayout.SOUTH);
        add(panel);*/
        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(textField);
        panel.add(button);
        panel.add(exitButton);
        add(panel);

        // Agregar ActionListener para manejar el evento de clic del botón "Aceptar"
        button.addActionListener(e -> {
            String nombre = textField.getText();
            JOptionPane.showMessageDialog(this, "Hola " + nombre);
        });

        // Agregar ActionListener para manejar el evento de clic del botón "Salir"
        exitButton.addActionListener(e -> {
            System.exit(0);
        });
    }

    public static void main(String[] args) {
        frame frame = new frame();
        frame.setVisible(true);
    }
}

