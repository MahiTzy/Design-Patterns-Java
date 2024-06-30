package abstractPattern;

public class AndDevFactory extends EmpAbsFactory{

    @Override
    public Employee getEmployee() {
        return new AndDev();
    }
    
}
