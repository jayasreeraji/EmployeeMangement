package com.java.empmanagement;

public interface EmployeeDaoIntrf {

    //Create employee
    public void createEmployee(Employee emp);

    //Show all employee
    public void showAllEmployee();

    //Show employee based on id
    public void showEmployeeBasedONID(int id);

    //Update employee
    public void updateEmployee(int id, String name);

    //Delete employee
    public void deleteEmployee(int id);
}
