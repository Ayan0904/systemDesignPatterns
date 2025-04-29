package org.example.ProxyDesignPattern.AccessRestriction;

public class Access {
    public static void main(String[] args) {
        User user1 = new User(AceessLevel.ADMIN, State.NOT_BLCKED);
        User user2 = new User(AceessLevel.ADMIN, State.BLOCKED);
        User user3 = new User(AceessLevel.EMPLOYEE, State.NOT_BLCKED);
        User user4 = new User(AceessLevel.FUCKUP, State.NOT_BLCKED);
        User user5 = new User(AceessLevel.EMPLOYEE, State.SHIT);

        Employee employee1 = new Employee("Sasuke", 1);
        Employee employee2 = new Employee("Madara", 2);
        Employee employee3 = new Employee("Sakura", 3);

        EmployeeDao employeeDao = new EmployeeDaoImpl();
        EmployeeDaoProxy1 employeeDaoProxy1 = new EmployeeDaoProxy1(employeeDao);
        EmployeeDaoProxy2 employeeDaoProxy2 = new EmployeeDaoProxy2(employeeDaoProxy1);

        employeeDaoProxy2.createEmployee(user1, employee1);
        employeeDaoProxy2.createEmployee(user2, employee2);
        employeeDaoProxy2.createEmployee(user3, employee3);
        employeeDaoProxy2.delete(user1, employee1);
        employeeDaoProxy2.get(user2, employee2.empId);

    }
}
