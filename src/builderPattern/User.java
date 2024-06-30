package builderPattern;

public class User {
    private String userID;
    private String name;

    private User(UserBuilder builder) {
        this.userID = builder.userID;
        this.name = builder.name;
    }

    public String getUserID() {
        return userID;
    }

    public String getName() {
        return name;
    }

    public static class UserBuilder {
        private String userID;
        private String name;

        private UserBuilder() {
        }

        public static UserBuilder create() {
            return new UserBuilder();
        }

        // public UserBuilder(String setUserID, String setName) {
        //     this.userID = setUserID;
        //     this.name = setName;
        // }

        public UserBuilder setUserID(String userID) {
            this.userID = userID;
            return this;
        }

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public User build() {
            User user = new User(this);
            return user;
        }
    }

    @Override
    public String toString() {
        return "User [userID=" + userID + ", name=" + name + "]";
    }
    
}
