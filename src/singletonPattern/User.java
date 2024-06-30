package singletonPattern;
class User {

    private static User user;

    private User() {
    }

    public static User createUser() {
        synchronized (User.class) {
            if (user == null)
                user = new User();
        }
        return user;
    }

    // public void printUser() {
    // System.out.println("Name: " + name + ", Email: " + email);
    // }
}
