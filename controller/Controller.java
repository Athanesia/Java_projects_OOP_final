package controller;

import model.MathOperations;
import model.ComplexNumber;
import view.InputView;
import view.OutputView;
import utils.CustomLogger;

public class Controller {
    private final MathOperations mathOperations;
    private final InputView inputView;
    private final OutputView outputView;
    private final CustomLogger logger;

    public Controller(MathOperations mathOperations, InputView inputView, OutputView outputView, CustomLogger logger) {
        this.mathOperations = mathOperations;
        this.inputView = inputView;
        this.outputView = outputView;
        this.logger = logger;
    }

    public void start() {
        while (true) {
            try {
                String operation = inputView.getOperation();
                if (operation.equals("exit")) {
                    break;
                }

                double real1 = inputView.getReal();
                double imaginary1 = inputView.getImaginary();
                ComplexNumber[] number1 = { new ComplexNumber(real1, imaginary1) };

                double real2 = inputView.getReal();
                double imaginary2 = inputView.getImaginary();
                ComplexNumber[] number2 = { new ComplexNumber(real2, imaginary2) };

                ComplexNumber result = mathOperations.execute(operation, number1, number2);
                outputView.printResult(operation, result);

            } catch (Exception e) {
                logger.logError(e.getMessage());
            }
        }
    }
}