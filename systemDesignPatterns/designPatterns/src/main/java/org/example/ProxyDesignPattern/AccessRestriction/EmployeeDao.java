package org.example.ProxyDesignPattern.AccessRestriction;

public interface EmployeeDao {
    void createEmployee(User user, Employee obj);

    void delete(User user, Employee obj);

    Employee get(User user, int employeeId);
}
