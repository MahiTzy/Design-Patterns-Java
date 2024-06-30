package abstractPattern;

public class WebDevFactory extends EmpAbsFactory{

    @Override
    public Employee getEmployee() {
        return new WebDev();
    }
    
}
