package WEEK1.FinancialForecast;

public class FinancialForecast {

    // Recursive method to calculate future value
    public static double forecast(double presentValue, double growthRate, int years) {
        // Base case: no more growth
        if (years == 0) {
            return presentValue;
        }

        // Recursive case: apply growth for one year and recurse
        return forecast(presentValue, growthRate, years - 1) * (1 + growthRate);
    }

    public static void main(String[] args) {
        double presentValue = 10000.0; // Starting value in currency
        double growthRate = 0.08;      // 8% annual growth
        int years = 5;

        double futureValue = forecast(presentValue, growthRate, years);
        System.out.printf("Future value after %d years: ₹%.2f%n", years, futureValue);
    }
}
