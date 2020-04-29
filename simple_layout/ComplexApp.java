import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Dimension;

public class ComplexApp {
    private static final String[] FACES = new String[]{"1","2","3","4","5","6","7","8","9","*","0","#"};
    public static void main(String[] args) {
        JFrame frame = new JFrame("My App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel facePanel = new JPanel();
        GridLayout layout = new GridLayout(0,3);
        layout.setHgap(5);
        layout.setVgap(2);

        facePanel.setLayout(layout);

        for(String face : FACES){
            facePanel.add(new JButton(face));
        }

        frame.getContentPane().setLayout(new BorderLayout());
        
        JTextField textField = new JTextField();
        textField.setFont(textField.getFont().deriveFont(24.0f));
        frame.add(textField,BorderLayout.PAGE_START);

        frame.add(facePanel,BorderLayout.CENTER);

        JButton button = new JButton("Done");
        button.setPreferredSize(new Dimension(100, 50));
        frame.add(button,BorderLayout.PAGE_END);

        frame.setVisible(true);


        
    }

}