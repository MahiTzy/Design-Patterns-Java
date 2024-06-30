package factoryPattern;
public class Factory {
    public static Employee getEmployee(String type) {
        if (type.equals("Engineer")) {
            return new Engineer();
        } else if (type.equals("WebDev")) {
            return new WebDev();
        }
        return null;
    }
}
