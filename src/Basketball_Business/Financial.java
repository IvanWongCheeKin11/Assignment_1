package Basketball_Business;

import java.util.Scanner;
public class Financial {
    private double sales, costofgoods, operatingExpense, tax, grossProfit, operatingIncome, netIncome;

    Scanner scan = new Scanner(System.in);

    Financial(){
        System.out.print("Please enter this month's sales: RM");
        sales = scan.nextDouble();
        System.out.print("Please enter this month's cost of goods: RM");
        costofgoods = scan.nextDouble();
        System.out.print("Please enter this month's operating expenses: RM");
        operatingExpense = scan.nextDouble();
        System.out.print("Please enter this month's tax expenses: RM");
        tax = scan.nextDouble();
        grossProfit = calculateGrossProfit(sales, costofgoods);
        operatingIncome = calculateOperatingIncome(grossProfit, operatingExpense);
        netIncome = calculateNetIncome(operatingIncome, tax);
        printDetails(sales, costofgoods, operatingExpense, tax, grossProfit, operatingIncome, netIncome);
    }

    Financial(double sales){
        System.out.printf("This month's sales: RM%.2f%n",sales);
        System.out.print("Please enter this month's cost of goods: RM");
        costofgoods = scan.nextDouble();
        System.out.print("Please enter this month's operating expenses: RM");
        operatingExpense = scan.nextDouble();
        System.out.print("Please enter this month's tax expenses: RM");
        tax = scan.nextDouble();
        grossProfit = calculateGrossProfit(sales, costofgoods);
        operatingIncome = calculateOperatingIncome(grossProfit, operatingExpense);
        netIncome = calculateNetIncome(operatingIncome, tax);
        printDetails(sales, costofgoods, operatingExpense, tax, grossProfit, operatingIncome, netIncome);
    }

    Financial(double sales, double costofgoods){
        System.out.printf("This month's sales: RM%.2f%n",sales);
        System.out.printf("This month's cost of goods: RM%.2f%n",costofgoods);
        System.out.print("Please enter this month's operating expenses: RM");
        operatingExpense = scan.nextDouble();
        System.out.print("Please enter this month's tax expenses: RM");
        tax = scan.nextDouble();
        grossProfit = calculateGrossProfit(sales, costofgoods);
        operatingIncome = calculateOperatingIncome(grossProfit, operatingExpense);
        netIncome = calculateNetIncome(operatingIncome, tax);
        printDetails(sales, costofgoods, operatingExpense, tax, grossProfit, operatingIncome, netIncome);
    }

    double calculateGrossProfit(double sales, double costofgoods) {
        return sales - costofgoods;
    }

    double calculateOperatingIncome(double grossprofit, double operatingexpense) {
        return grossprofit - operatingexpense;
    }

    double calculateNetIncome(double operatingincome, double tax) {
        return operatingincome - tax;
    }

    void printDetails(double sales, double costofgoods, double operatingexpense, double tax, double grossprofit, double operatingincome, double netincome) {	//Part 1.3 Method for user-defined class to print out the details of finance
        System.out.println();
        System.out.println("Financial Statement");
        System.out.printf("Sales: RM%.2f%n",sales);
        System.out.printf("Cost of goods: RM%.2f%n",costofgoods);
        System.out.printf("Gross Profit: RM%.2f%n",grossprofit);
        System.out.printf("Operating Expense: RM%.2f%n",operatingexpense);
        System.out.printf("Operating Income: RM%.2f%n",operatingincome);
        System.out.printf("Taxes expense: RM%.2f%n",tax);
        System.out.printf("Net Income: RM%.2f%n",netincome);
    }
}
