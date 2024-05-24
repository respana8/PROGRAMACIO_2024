import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ROBOTS");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Robots robots = new Robots();
        frame.add(robots);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
