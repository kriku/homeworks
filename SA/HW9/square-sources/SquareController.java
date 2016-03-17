import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.*;

public class SquareController {
    private SquareView view;
    private SquareModel model;

    class SubmitListener implements ActionListener {
        private void performCalculation() {
            int square = model.square();
            view.updateOutput(Integer.toString(square));
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            performCalculation();
        }
    }

    class InputListener implements DocumentListener {
        private void syncModel() {
            String input = view.getInput();
            try {
                model.setValue(Integer.parseInt(input));
            } catch (Exception e) {
                model.reset();
            }
            // clear output
            view.updateOutput("");
        }
        @Override
        public void insertUpdate(DocumentEvent e) {
            syncModel();
        }
        @Override
        public void removeUpdate(DocumentEvent e) {
            syncModel();
        }
        @Override
        public void changedUpdate(DocumentEvent e) {
            syncModel();
        }
    }

    public SquareController(SquareModel model, SquareView view) {
        this.model = model;
        this.view = view;
        // delegate perform computation class for doing model interaction job
        view.subscribeSubmit(new SubmitListener());
        view.subscribeInput(new InputListener());
    }
}
