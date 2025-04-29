package org.example.ProxyDesignPattern.AccessRestriction;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeDaoImpl implements EmployeeDao{
    Map<Integer, Employee> empMap = new HashMap<>();
    @Override
    public void createEmployee(User user, Employee obj) {
        empMap.put(obj.empId, obj);
    }

    @Override
    public void delete(User user, Employee obj) {
        empMap.remove(obj.empId);
    }

    @Override
    public Employee get(User user, int employeeId) {
        return empMap.get(employeeId);
    }
}
