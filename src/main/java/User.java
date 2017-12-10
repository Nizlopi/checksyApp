import java.util.Objects;

public class User {

    private String userFirstName;
    private String userLastName;
    private String userCity;
    private String userMailAddress;
    private String userPhone;

    public User(String userFirstName, String userLastName, String userCity, String userMailAddress, String userPhone) {
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.userCity = userCity;
        this.userMailAddress = userMailAddress;
        this.userPhone = userPhone;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public String getUserCity() {
        return userCity;
    }

    public String getUserMailAddress() {
        return userMailAddress;
    }

    public String getUserPhone() {
        return userPhone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userFirstName, user.userFirstName) &&
                Objects.equals(userLastName, user.userLastName) &&
                Objects.equals(userCity, user.userCity) &&
                Objects.equals(userMailAddress, user.userMailAddress) &&
                Objects.equals(userPhone, user.userPhone);
    }

    @Override
    public int hashCode() {

        return Objects.hash(userFirstName, userLastName, userCity, userMailAddress, userPhone);
    }
}


