import java.util.Scanner;

class Employee{

    double calculateSalary(){
        double salary=0.0;
        return salary;
    }
}

class fullTimeEmployee extends Employee {
    double basePay;
    double bonus;
    @Override
    double calculateSalary(){
        double salary= basePay+bonus;
        return salary;
    }
    void pritnSalary(){
        System.out.println("Monthly Salary: $"+calculateSalary());
    }
}
class partTimeEmployee extends Employee{
    double hourlyRate;
    double hoursWorked;
    @Override
    double calculateSalary(){
        double salary= hourlyRate*hoursWorked;
        return salary;
    }
    void pritnSalary(){
        System.out.println("Monthly Salary: $"+calculateSalary());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        fullTimeEmployee F = new fullTimeEmployee();
        partTimeEmployee P = new partTimeEmployee();
        System.out.println("Enter employee type:(full time/ part time)");
        String type = input.nextLine();

        String option1 = "Full time";
        String option2 = "part time";

        if (type.equalsIgnoreCase(option1)) {
            System.out.println("Enter base pay: $");
            F.basePay = input.nextDouble();
            System.out.println("Enter bonus: $");
            F.bonus = input.nextDouble();
            F.calculateSalary();
            F.pritnSalary();
        }

        if (type.equalsIgnoreCase(option2)) {
            System.out.println("Enter Hourly Rate:$  ");
            P.hourlyRate = input.nextDouble();
            System.out.println("Enter Hours Worked: ");
            P.hoursWorked = input.nextDouble();
            P.calculateSalary();
            P.pritnSalary();
        }
    }
}