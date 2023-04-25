package view;

import java.util.Scanner;

public class InputView {
    private final Scanner scanner = new Scanner(System.in);

    public String getOperation() {
        System.out.println("Введите операцию (+, -, *, /) или 'exit' для выхода:");
        return scanner.nextLine();
    }

    public double getReal() {
        System.out.println("Введите действительную часть:");
        return Double.parseDouble(scanner.nextLine());
    }
    
    public double getImaginary() {
        System.out.println("Введите мнимую часть:");
        return Double.parseDouble(scanner.nextLine());
    }
}