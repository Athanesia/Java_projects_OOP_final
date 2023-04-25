package model;

public class MathOperations {

    public ComplexNumber add(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = new ComplexNumber();
        result.setReal(a.getReal() + b.getReal());
        result.setImaginary(a.getImaginary() + b.getImaginary());
        return result;
    }

    public ComplexNumber subtract(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = new ComplexNumber();
        result.setReal(a.getReal() - b.getReal());
        result.setImaginary(a.getImaginary() - b.getImaginary());
        return result;
    }

    public ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = new ComplexNumber();
        result.setReal(a.getReal() * b.getReal() - a.getImaginary() * b.getImaginary());
        result.setImaginary(a.getReal() * b.getImaginary() + a.getImaginary() * b.getReal());
        return result;
    }

    public ComplexNumber divide(ComplexNumber a, ComplexNumber b) {
        double real = (a.getReal() * b.getReal() + a.getImaginary() * b.getImaginary()) / (Math.pow(b.getReal(), 2) + Math.pow(b.getImaginary(), 2));
        double imaginary = (b.getReal() * a.getImaginary() - a.getReal() * b.getImaginary()) / (Math.pow(b.getReal(), 2) + Math.pow(b.getImaginary(), 2));
        return new ComplexNumber(real, imaginary);
    }

    public double getMagnitude(ComplexNumber a) {
        return Math.sqrt(Math.pow(a.getReal(), 2) + Math.pow(a.getImaginary(), 2));
    }

    public double getAngle(ComplexNumber a) {
        return Math.atan2(a.getImaginary(), a.getReal());
    }

    public ComplexNumber getConjugate(ComplexNumber a) {
        return new ComplexNumber(a.getReal(), -a.getImaginary());
    }

    public ComplexNumber execute(String operation, ComplexNumber[] a, ComplexNumber[] b) {
        ComplexNumber result = new ComplexNumber();
        switch (operation) {
            case "+":
                result = add(a[0], b[0]);
                break;
            case "-":
                result = subtract(a[0], b[0]);
                break;
            case "*":
                result = multiply(a[0], b[0]);
                break;
            case "/":
                result = divide(a[0], b[0]);
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }
        return result;
    }
}