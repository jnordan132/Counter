
// awt imports
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// swing imports
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// GUI class
public class Counter implements ActionListener {

    // private varibles
    private int count = 0;
    private JFrame frame;
    private JPanel panel;
    private JLabel label;

    // public GUI class
    public Counter() {
        // JFrame object
        frame = new JFrame();
        // JPanel object
        panel = new JPanel();
        // JLabel object
        label = new JLabel("count: 0");
        // JButton objects
        JButton buttonDown = new JButton("Count Down");
        JButton buttonUp = new JButton("Count Up");
        // adding event listeners to up and down buttons
        buttonDown.addActionListener(this);
        buttonUp.addActionListener(this);
        // Set up the panel
        panel.setBorder(BorderFactory.createEmptyBorder(150, 150, 150, 150));
        panel.setLayout(new GridLayout(0, 3));
        // add buttons/label to panel
        panel.add(buttonDown);
        panel.add(buttonUp);
        panel.add(label);
        // add panel to the frame
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // window options
        frame.setTitle("Counter");
        frame.pack();
        frame.setVisible(true);
    }

    // main method that will create new GUI object
    public static void main(String[] args) throws Exception {
        new Counter();
    };

    // method that will increment or decrement the counter based on button pressed
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Count Up")) {
            count++;
        } else if (e.getActionCommand().equals("Count Down")) {
            count--;
        }
        label.setText("count: " + count);
    };
};
