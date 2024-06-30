import adapterPattern.AdapterCharger;
import adapterPattern.AnotherChargerXYZ;
import adapterPattern.Phone;

public class App {
    public static void main(String[] args) throws Exception , CloneNotSupportedException {
        // System.out.println("Hello, World!");
        // User user = new User("John", "john@gmail.com");
        // user.printUser();
        // User user = User.createUser();
        // user.printUser();
        // User user2 = User.createUser();
        // user2.printUser();
        // System.out.println(user == user2);
        // System.out.println(user.hashCode());
        // System.out.println(user2.hashCode());
        // Student student = Student.createStudent();
        // Student student = Student.INSTANCE;
        // Student student2 = Student.createStudent();
        // System.out.println(student == student2);
        // System.out.println(student.hashCode());
        // System.out.println(student2.hashCode());
        // Constructor<Student> constructor = Student.class.getDeclaredConstructor();
        // constructor.setAccessible(true);
        // Student student2 = constructor.newInstance();
        // System.out.println(student == student2);
        // ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.ser"));
        // oos.writeObject(student);
        // oos.close();
        // ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.ser"));
        // Student student2 = (Student) ois.readObject();
        // ois.close();
        // Student student2 = (Student) student.clone();
        // System.out.println(student2.hashCode());
        // Employee employee = Factory.getEmployee("Engineer");
        // System.out.println(employee.getSalary());
        // Employee employee = EmployeeFactory.getEmployee(new AndDevFactory());
        // System.out.println(employee.getSalary());
        // System.out.println(employee.name());
        // Employee employee2 = EmployeeFactory.getEmployee(new WebDevFactory());
        // System.out.println(employee2.getSalary());
        // System.out.println(employee2.name());
        // User user = User.UserBuilder.create().setUserID("1001").setName("Mohit").build();
        // System.out.println(user.getUserID());
        // System.out.println(user.getName());
        // System.out.println(user);
        // NetworkConnection networkConnection = new NetworkConnection();
        // networkConnection.setConnectionIP("198.165.2.4");
        // networkConnection.setConnectionPort("8080");
        // networkConnection.getData();
        // System.out.println(networkConnection);
        // NetworkConnection networkConnection2 = (NetworkConnection) networkConnection.clone();
        // networkConnection.getConnectionPorts().remove(0);
        // System.out.println(networkConnection);
        // System.out.println(networkConnection2);
        // Channel channel = new Channel();
        // channel.register(new Subscriber("Mohit"));
        // channel.register(new Subscriber("Rohit"));
        // channel.notifyObservers("New Video Uploaded!");
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // while (true) {
        //     System.out.println("Enter your choice: ");
        //     System.out.println("1. Add Subscriber");
        //     System.out.println("2. Remove Subscriber");
        //     System.out.println("3. Notify Subscribers");
        //     System.out.println("4. Exit");
        //     int choice = Integer.parseInt(br.readLine());
        //     if (choice == 1) {
        //         System.out.println("Enter subscriber name: ");
        //         String name = br.readLine();
        //         channel.register(new Subscriber(name));
        //     } else if (choice == 2) {
        //         System.out.println("Enter subscriber name: ");
        //         String name = br.readLine();
        //         channel.unregister(channel.subscribers.stream().filter(x -> ((Subscriber)x).name.equals(name)).findFirst().get());
        //     } else if (choice == 3) {
        //         System.out.println("Enter video title: ");
        //         String title = br.readLine();
        //         channel.notifyObservers(title);
        //     } else {
        //         break;
        //     }
        // }
        // UserManagement userManagement = new UserManagement();
        // userManagement.addUser(new User("Mohit", "ms@gmail.com"));
        // userManagement.addUser(new User("Rohit", "rs@gmail.com"));
        // MyIterator iterator = userManagement.getIterator();
        // while (iterator.hasNext()) {
        //     User user = (User) iterator.next();
        //     user.printUser();
        // }
        // Phone phone = new Phone(new ChargerXYZ());
        Phone phone = new Phone(new AdapterCharger(new AnotherChargerXYZ()));
        phone.charge();
    }
}