import javax.swing.*;
import java.util.LinkedList;
import java.util.Queue;

public class Cola {
    private Queue<Integer> queue = new LinkedList<>();

    
    public void encolar(int valor, JTextArea area) {
        queue.add(valor);
        area.append("Encolado: " + valor + "\n");
        area.append("Contenido cola: " + queue + "\n\n");
    }

    
    public void desencolar(JTextArea area) {
        if (queue.isEmpty()) {
            area.append("La cola está vacía.\n\n");
        } else {
            int v = queue.remove();
            area.append("Desencolado: " + v + "\n");
            area.append("Contenido cola: " + queue + "\n\n");
        }
    }
}
