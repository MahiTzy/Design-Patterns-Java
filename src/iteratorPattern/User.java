package iteratorPattern;

public class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void printUser() {
        System.out.println("Name: " + name + ", Email: " + email);
    }
}
