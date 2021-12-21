package oldTasks.Lesson8;

public class Main {
    public static void main(String[] args) {

        SimpleCalculator simpleCalc = new SimpleCalculator();
        System.out.println(simpleCalc.getDifference(20.6, 10.9));

        EngineeringCalculator engineeringCalculator = new EngineeringCalculator("Engineering calculator result");
        System.out.println(engineeringCalculator.getSum(2, 4));
        System.out.println(engineeringCalculator.getSum(1.5, 2.8));
        System.out.println(engineeringCalculator.getSin(30.0));

        FinancialCalculator finalCalc = new FinancialCalculator("Financial calculator result");
        System.out.println(finalCalc.getSum(3, 5));
        System.out.println(finalCalc.getPercent(200, 5000));


    }
}
