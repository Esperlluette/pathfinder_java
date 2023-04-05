import javax.swing.*;

public class labyrinthe extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;

    public labyrinthe() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
    }

    public static void main(String[] args) {
        labyrinthe dialog = new labyrinthe();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
