import javax.swing.*;

public class SGame extends JFrame {
    SGame() {
        super("SnakeGame");
        add(new Board());
        pack();
       
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public static void main(String[] args) throws Exception {
        new SGame().setVisible(true);
        
    }
}
