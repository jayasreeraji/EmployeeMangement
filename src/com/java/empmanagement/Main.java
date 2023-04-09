package com.java.empmanagement;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        EmployeeDaoIntrf dao = new EmployeeDaoImpl();
        System.out.println("Welcome to Employee Management Application");
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("1. Add Employee\n" +
                "2. Show all employee\n" +
                "3. Show employee based on ID\n" +
                "4. Update employee\n" +
                "5. Delete the employee");

            System.out.println("Enter your choice: ");
            int ch = scanner.nextInt();
            switch (ch){
                case 1:
                    Employee emp = new Employee();

                    System.out.println("Enter your ID: ");
                    int id = scanner.nextInt();
                    System.out.println("Enter your name: ");
                    String name = scanner.next();
                    System.out.println("Enter your salary: ");
                    double salary = scanner.nextDouble();
                    System.out.println("Enter you age: ");
                    int age = scanner.nextInt();

                    emp.setId(id);
                    emp.setName(name);
                    emp.setSalary(salary);
                    emp.setAge(age);

                    dao.createEmployee(emp);
                    break;
                case 2:
                    dao.showAllEmployee();
                    break;
                case 3:
                    System.out.println("Enter ID to show the details");
                    int empid = scanner.nextInt();
                    dao.showEmployeeBasedONID(empid);
                    break;
                case 4:
                    System.out.println("Enter ID to update the name of the employee");
                    int empid1 = scanner.nextInt();
                    System.out.println("Enter the new name");
                    String name1 = scanner.next();
                    dao.updateEmployee(empid1, name1);
                    break;
                case 5:
                    System.out.println("Enter ID to detele the details of the employee");
                    int empid2 = scanner.nextInt();
                    dao.deleteEmployee(empid2);
                    break;
                case 6:
                    System.out.println("Thank you using our applicaiton");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter valid choice!");
                    break;
            }

        }while (true);
    }
}
