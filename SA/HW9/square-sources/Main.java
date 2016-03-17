public class Main {
    public static void main(String[] args) {
        SquareModel model = new SquareModel();
        SquareView view = new SquareView();
        SquareController controller = new SquareController(model, view);
        view.setVisible(true);
    }
}
