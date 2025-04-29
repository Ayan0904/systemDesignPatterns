package org.example.ProxyDesignPattern.AccessRestriction;

public class EmployeeDaoProxy1 implements EmployeeDao{
    EmployeeDao employeeDao;

    public EmployeeDaoProxy1(EmployeeDao employeeDao){
        this.employeeDao = employeeDao;
    }
    @Override
    public Employee get(User user, int employeeId) {
        if(user.aceessLevel==AceessLevel.ADMIN || user.aceessLevel==AceessLevel.EMPLOYEE) {
            return employeeDao.get(user, employeeId);
        }
        else{
            System.out.println("User with access Level "+user.aceessLevel+" can not do shit");
        }
        return null;
    }

    @Override
    public void delete(User user, Employee obj) {
        if(user.aceessLevel==AceessLevel.ADMIN){
            employeeDao.delete(user, obj);
        }
        else{
            System.out.println("User with accessLevel "+user.aceessLevel+" can not delete");
        }
    }

    @Override
    public void createEmployee(User user, Employee obj) {
        if(user.aceessLevel==AceessLevel.ADMIN){
            employeeDao.delete(user, obj);
        }
        else{
            System.out.println("User with accessLevel "+user.aceessLevel+" can not create");
        }
    }
}
