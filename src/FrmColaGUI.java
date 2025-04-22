import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmColaGUI {
    private JPanel pGeneral;             // Panel contenedor principal
    private JTextField txtElemento;      // Campo donde el usuario ingresa el número
    private JTextArea txtResultado;      // Área de texto para mostrar resultados
    private JButton encolarButton;       // Botón para encolar
    private JButton desencolarButton;    // Botón para desencolar

    private Cola c = new Cola();         // Instancia de la clase Cola
    private JButton encolar;
    private JButton desencolar;

    public FrmColaGUI() {
        // Listener para el botón "Encolar"
        /*encolarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = txtElemento.getText();
                try {
                    int valor = Integer.parseInt(input);
                    c.encolar(valor, txtResultado);
                    txtElemento.setText("");           // Limpiar el campo
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Introduce un número válido.");
                }
            }
        });*/

        // Listener para el botón "Desencolar"
        /*desencolarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.desencolar(txtResultado);
            }
        });*/

        encolar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = txtElemento.getText();
                try {
                    int valor = Integer.parseInt(input);
                    c.encolar(valor, txtResultado);
                    txtElemento.setText("");           // Limpiar el campo
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Introduce un número válido.");
                }
            }
        });


        desencolar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.desencolar(txtResultado);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("FrmColaGUI");
        frame.setContentPane(new FrmColaGUI().pGeneral);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();                  // Ajusta el tamaño al contenido
        frame.setVisible(true);        // Hace visible la ventana
    }
}