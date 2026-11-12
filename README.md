# Calculating-Salary
This program calculate the salary for employee depinding on the type of work(Full time -Part Time)
``` java
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
```
as you can see her i used equalsIgnoreCase so i include the all forms of inputs
