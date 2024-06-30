package abstractPattern;

public class EmployeeFactory {

    public static Employee getEmployee(EmpAbsFactory factory) {
        return factory.getEmployee();

    }
    
}
