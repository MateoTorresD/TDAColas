import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmColaGUI {
    private JPanel pGeneral;             
    private JTextField txtElemento;      
    private JTextArea txtResultado;      
    private JButton encolarButton;       
    private JButton desencolarButton;    

    private Cola c = new Cola();         
    private JButton encolar;
    private JButton desencolar;

    public FrmColaGUI() {
       

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
        frame.pack();                 
        frame.setVisible(true);        
    }
}
