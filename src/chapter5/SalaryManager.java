package chapter5;

import java.math.BigDecimal;

public class SalaryManager {

    public SalaryManager() {}

    public double getMonthSalary(int yearSalary) {
        return yearSalary / 12;
    }

    public double calculateTax(double monthSalary) {
        // 근로소득세 12.5%
        return monthSalary * 0.125;
    }

    public double calculateNationalPerson(double monthSalary) {
        // 국민 연금 8.1%
        return monthSalary * 0.081;
    }

    public double calculateHealthInsurance(double monthSalary) {
        // 건보료 13.5%
        return monthSalary * 0.135;
    }

    public static void main(String[] args) {
        SalaryManager salaryManager = new SalaryManager();
        BigDecimal monthSalary = new BigDecimal(salaryManager.getMonthSalary(20000000));
        System.out.println("monthSalary = " + monthSalary);
        BigDecimal tax = new BigDecimal(salaryManager.calculateTax(monthSalary.doubleValue()));
        BigDecimal nationalPerson = new BigDecimal(salaryManager.calculateNationalPerson(monthSalary.doubleValue()));
        BigDecimal healthInsurance = new BigDecimal(salaryManager.calculateHealthInsurance(monthSalary.doubleValue()));
        BigDecimal totalTax = tax.add(nationalPerson).add(healthInsurance);
        BigDecimal result = monthSalary.subtract(totalTax);
        System.out.println("result = " + result);
    }
}
