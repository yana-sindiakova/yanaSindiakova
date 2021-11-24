package Lesson8;

public class FinancialCalculator extends EngineeringCalculator {

    private String message;

    public FinancialCalculator(String message) {
        super(message);
        this.message = message;
    }

    public double getPercent(double obtained, double total) {
        System.out.println(message);
        return ((obtained * 100) / total);
    }

    public int getPercent(int obtained, int total) {
        System.out.println(message);
        return ((obtained * 100) / total);
    }

    public double dollarToGrivna(double dollar, double exchangeRates) {
        System.out.println(message);
        return dollar * exchangeRates;
    }

    public int dollarToGrivna(int dollar, int exchangeRates) {
        System.out.println(message);
        return dollar * exchangeRates;
    }
}
