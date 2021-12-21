package oldTasks.Lesson8;

public class EngineeringCalculator extends SimpleCalculator {

    private String message;

    public EngineeringCalculator() {
    }

    public EngineeringCalculator(String message) {
        this.message = message;
    }

    public double getSin(double radian) {
        System.out.println(message);
        return Math.sin(radian);
    }

    public double getCos(double radian) {
        System.out.println(message);
        return Math.cos(radian);
    }

    public double getRoot(double exponent) {
        System.out.println(message);
        return Math.sqrt(exponent);
    }

    public double getDegree(double base, double exponent) {
        System.out.println(message);
        return Math.pow(base, exponent);
    }

    @Override
    public double getSum(double a, double b) {
        System.out.println(message);
        return (a + b);
    }

    @Override
    public double getDifference(double a, double b) {
        System.out.println(message);
        return (a - b);
    }

    @Override
    public double getProduct(double a, double b) {
        System.out.println(message);
        return (a * b);
    }

    @Override
    public double getQuotient(double a, double b) {
        System.out.println(message);
        return (a / b);
    }

    @Override
    public int getSum(int a, int b) {
        System.out.println(message);
        return (a + b);
    }

    @Override
    public int getDifference(int a, int b) {
        System.out.println(message);
        return (a - b);
    }

    @Override
    public int getProduct(int a, int b) {
        System.out.println(message);
        return (a * b);
    }

    @Override
    public int getQuotient(int a, int b) {
        System.out.println(message);
        return (a / b);
    }
}
