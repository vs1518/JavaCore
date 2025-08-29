package javacore.chapter01.variable.exercise;

public class SalaryForecast {
    public static void main (String[] args) {

        // The daily gross salary.
        double hourlyGrossAmount = 25;
        double hoursPerDay = 7.7;
        double hoursPerWeek = 38.5;
        short weeksInAMonth = 4;
        short monthsInAYear = 12;

        // Solution

        // The daily gross salary.
        double dailyGross = hoursPerDay * hourlyGrossAmount;

        // The weekly gross salary.
        double weeklyGross = hoursPerWeek * hourlyGrossAmount;

        // The monthly gross salary.
        double monthlyGross = weeklyGross * weeksInAMonth;

        // The annual gross salary.
        double annualGross = monthlyGross * monthsInAYear;

        // The monthly taxable net salary.  taxableMonthlyRate = taxableMonthlyRate - (taxableMonthlyRate * 25 / 100)
        double monthlyTaxableNetSalary = monthlyGross - (monthlyGross * 25 / 100);

        // The annual taxable net salary.
        double annualTaxableNetSalary = monthlyTaxableNetSalary * 12;

        // The monthly net salary after income tax.
        double monthlyNetSalaryAfterIncomeTax = monthlyTaxableNetSalary - (monthlyTaxableNetSalary * 10.5 / 100);

        // The annual net salary after income tax. annualRateAfterTax = annualTaxableRate * 10.5
        double annualNetSalaryAfterIncomeTax = annualTaxableNetSalary - (annualTaxableNetSalary * 10.5 / 100);

        System.out.println("Daily Gross Salary is equal to " + dailyGross);
        
        System.out.println("Weekly Gross Salary is equal to " + weeklyGross);
        
        System.out.println("Monthly Gross Salary is equal to " + monthlyGross);
        
        System.out.println("Annual Gross Salary is equal to " + annualGross);
        
        System.out.println("Monthly Taxable Net Salary is equal to " + monthlyTaxableNetSalary);
        
        System.out.println("Annual Taxable Net Salary is equal to " + annualTaxableNetSalary);
        
        System.out.println("Monthly Net Salary After Income Tax is equal to " + monthlyNetSalaryAfterIncomeTax);
        
        System.out.println("Annual Net Salary After Income Tax is equal to " + annualNetSalaryAfterIncomeTax);

    }
}
