package iteratorPattern;

import java.util.List;

public class UserIterator implements MyIterator{

    public UserIterator(List<User> users) {
        this.users = users;
        this.length = users.size();

    }

    private List<User> users;
    private int length;
    private int index = 0;

    @Override
    public boolean hasNext() {
        if(index < length){
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        if(this.hasNext()){
            return users.get(index++);
        }
        return null;
    }
}
