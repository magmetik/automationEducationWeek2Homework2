package week1;

import java.util.Scanner;

public class WeeklySalaryCalculator2 {

    public double SalaryCalculator() {
        Scanner scanner = new Scanner(System.in);
        int baseSalary = scanner.nextInt();
        double weekdayOvertimeSalary = 0;
        double weekendOvertimeSalary = 0;
        double salary = 0;
        int bonusSalary = 500;

        if (baseSalary < 1000) {
            System.out.println("Plase enter at least 1000 euros for base salary");

        } else if (baseSalary >= 1000) {
            System.out.println("Please enter total working hours on weekday");
            int totalWorkingHoursOnWeekday = scanner.nextInt();
            System.out.println("Please enter total working hours on weekend");
            int totalWorkingHoursOnWeekend = scanner.nextInt();
            //scanner.close();
            int workingHours = totalWorkingHoursOnWeekday + totalWorkingHoursOnWeekend;
            int priceForOneHour = baseSalary / 40;

            if (workingHours > 40) {
                if (totalWorkingHoursOnWeekday > 40) {
                    weekdayOvertimeSalary = (totalWorkingHoursOnWeekday - 40) * priceForOneHour * 1.5;
                }
                if (totalWorkingHoursOnWeekday >= 40) {
                    weekendOvertimeSalary = (totalWorkingHoursOnWeekend) * priceForOneHour * 2;
                }
                if ((totalWorkingHoursOnWeekday >= 40) && (totalWorkingHoursOnWeekend >= 10)) {
                    salary = salary + bonusSalary;
                }
                if (totalWorkingHoursOnWeekday < 40) {
                    salary = salary + (totalWorkingHoursOnWeekend - (40 - totalWorkingHoursOnWeekday)) * priceForOneHour * 2;
                }
                salary = salary + weekdayOvertimeSalary + weekendOvertimeSalary + baseSalary;
                System.out.println("Your salary is " + salary + " euros");
            } else if (workingHours == 40) {
                if (totalWorkingHoursOnWeekday < 40) {
                    salary = salary + totalWorkingHoursOnWeekend * priceForOneHour;
                }
                salary = baseSalary;
                System.out.println("Your salary is " + salary + " euros");
            } else if (workingHours < 40) {
                salary = baseSalary - (40 - workingHours) * priceForOneHour;
                System.out.println("Your salary is " + salary + " euros");
            }
        }
        return salary;
    }

    public static void main(String[] args) {
        System.out.println("Please enter base salary:");
        WeeklySalaryCalculator2 weeklySalaryCalculator2 = new WeeklySalaryCalculator2();
        double salary = weeklySalaryCalculator2.SalaryCalculator();

        System.out.println("Please enter your working hour:");
        RaiseCalculator raiseCalculator = new RaiseCalculator();
        Scanner scanner = new Scanner(System.in);
        int workingYear = scanner.nextInt();
        System.out.println("Salary is " + raiseCalculator.raise(salary,workingYear));
        if(raiseCalculator.finalSalary != salary) {
            System.out.println("Your salary with raise is : " + raiseCalculator.finalSalary);
        }
    }
}
