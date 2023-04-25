import model.MathOperations;
import view.InputView;
import view.OutputView;
import utils.CustomLogger;
import controller.Controller;

public class Main {
    public static void main(String[] args) {
        MathOperations mathOperations = new MathOperations();
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        CustomLogger logger = new CustomLogger();

        Controller controller = new Controller(mathOperations, inputView, outputView, logger);
        controller.start();
    }
}