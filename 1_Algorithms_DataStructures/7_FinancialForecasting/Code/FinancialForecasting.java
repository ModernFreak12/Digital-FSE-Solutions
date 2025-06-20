public class FinancialForecasting {
    public static double futureValue(double principal, double growthRate, int years){
        if(years == 0){
            return principal;
        }
        return futureValue(principal, growthRate, years - 1) * (1 + growthRate);
    }


    public static void main(String args[]){
        double principal = 5000;
        double growthRate = 0.1;
        int years = 5;

        double prediction = futureValue(principal, growthRate, years);

        System.out.printf("Future Value after %d years: %.2f%n", years, prediction);

    }
}





/* ANALYSIS ----
 * Time Complexity = O(n) since this recursive function calls itself 'n' number of times for 'n' number of years
 * Space Complexity = O(n) since it uses recursive stack calls
 * 
 * 
 * This recursive approach will run into problem for large data sets since the memory will reach the maximum stack limit.
 * Therefore, to optimize it, it is more beneficial to use an iterative approach.
 * 
 * 
 */