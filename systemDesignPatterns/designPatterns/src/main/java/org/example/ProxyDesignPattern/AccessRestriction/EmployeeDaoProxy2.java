package org.example.ProxyDesignPattern.AccessRestriction;

public class EmployeeDaoProxy2 implements EmployeeDao{
    EmployeeDao employeeDao;

    public EmployeeDaoProxy2(EmployeeDao employeeDao){
        this.employeeDao = employeeDao;
    }
    @Override
    public Employee get(User user, int employeeId) {
        if(user.state==State.NOT_BLCKED || user.state==State.SHIT) {
            return employeeDao.get(user, employeeId);
        }
        else{
            System.out.println("User with state "+user.state+" can not do shit");
        }
        return null;
    }

    @Override
    public void delete(User user, Employee obj) {
        if(user.state==State.NOT_BLCKED){
            employeeDao.delete(user, obj);
        }
        else{
            System.out.println("User with state "+user.state+" can not delete");
        }
    }

    @Override
    public void createEmployee(User user, Employee obj) {
        if(user.state == State.NOT_BLCKED){
            employeeDao.delete(user, obj);
        }
        else{
            System.out.println("User with state "+user.state+" can not create");
        }
    }
}
