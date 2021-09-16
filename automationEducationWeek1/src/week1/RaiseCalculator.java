package week1;

public class RaiseCalculator {

    double finalSalary = 0;

    public double raise(double salary, int workingYear) {
        if (workingYear == 1) {
            finalSalary = salary + salary * 0.05;
            return finalSalary;
        } else if (workingYear == 2) {
            finalSalary = salary + salary * 0.10;
            return finalSalary;
        } else if (workingYear == 3) {
            finalSalary = salary + salary * 0.15;
            return finalSalary;
        } else if (workingYear == 4) {
            finalSalary = salary + salary * 0.20;
            return finalSalary;
        } else if (workingYear >= 5) {
            finalSalary = salary + salary * 0.25;
            return finalSalary;
        } else {
            finalSalary = salary;
            return finalSalary;
        }
    }
}



