import java.util.List;

public class UserService {

    private UserDAO userDAO;

    public void addUser(String userFirstName, String userLastName, String userCity, String userMailAddress, String userPhone){
        userDAO.addUser(new User(userFirstName, userLastName, userCity, userMailAddress, userPhone));
    }

    public List<User> getAllUsers(){
        return userDAO.getAllUsers();
    }
}
