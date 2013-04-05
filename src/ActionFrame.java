import javax.swing.*;
 
public class ActionFrame extends JFrame {
 
    public ActionFrame() {
        super("O! Programik taki £adniusi! by £ukasz Pycia ;)");

        JPanel buttonPanel = new ButtonPanel();
        add(buttonPanel);
 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
}
