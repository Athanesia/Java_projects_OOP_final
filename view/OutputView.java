package view;

import model.ComplexNumber;

public class OutputView {
    public void printWelcomeMessage() {
        System.out.println("Добро пожаловать в программу для работы с комплексными числами!");
    }

    public void printResult(String operation, ComplexNumber result) {
        System.out.println("Результат " + operation + ": " + result);
    }

    public void printInvalidOperationMessage() {
        System.out.println("Некорректная операция!");
    }

    public void printErrorMessage(String message) {
        System.out.println("Ошибка: " + message);
    }
}