import java.util.ArrayList;
import java.util.List;

public class UserDAO {

    private List<User> users = new ArrayList<>();

    public List<User> getAllUsers(){
        return users;
    }

    public void addUser(User user){
        users.add(user);
    }
}