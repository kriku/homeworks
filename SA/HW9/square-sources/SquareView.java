import javax.swing.*;
import javax.swing.event.DocumentListener;
import java.awt.event.*;

public class SquareView extends JFrame {
    private JTextField input = new JTextField(5);
    private JTextField output = new JTextField(10);
    private JButton submit = new JButton("Square");

    public SquareView() {
        // Layout
        JPanel content = new JPanel();
        content.add(input);
        content.add(submit);
        content.add(output);
        this.setContentPane(content);
        this.pack();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public String getInput() {
        return input.getText();
    }

    public void updateOutput(String value) {
        this.output.setText(value);
    }

    public void subscribeSubmit(ActionListener listener) {
        submit.addActionListener(listener);
    }

    public void subscribeInput(DocumentListener listener) {
        input.getDocument().addDocumentListener(listener);
    }
}
