package abstractPattern;

public class WebDev implements Employee{

    @Override
    public int getSalary() {
        return 2000;
    }

    @Override
    public String name() {
        return "WebDev";
    }
}
