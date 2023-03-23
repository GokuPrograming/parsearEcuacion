package org.example;
import javax.swing.*;


public class frame extends JFrame {
    EcuacionPrimerGrado ecuacion = new EcuacionPrimerGrado();
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
        JLabel resultado = new JLabel();
        button = new JButton("Calular");
        exitButton = new JButton("Salir");

        // Configurar los componentes
        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(textField);
        panel.add(button);
        panel.add(resultado);
        panel.add(exitButton);
        add(panel);

        // Agregar ActionListener para manejar el evento de clic del botón "Aceptar"
        button.addActionListener(e -> {
            String nombre = textField.getText();
            JOptionPane.showMessageDialog(this, "El resultado es" +
                    ": "+ecuacion.obtenerResultado(nombre));
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

