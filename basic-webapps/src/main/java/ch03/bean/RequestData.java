package ch03.bean;

public class RequestData {
    private String userName;
    private String password;

    public String getUserName() {
        if (isValidUsername()) {
            return userName;
        } else {
            return "Username is taken";
        }
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    private boolean isValidUsername() {
        return (!userName.isEmpty() && userName.length() >= 3);
    }

    public String getPassword() {
        if (isValidPassword()) {
            return password;
        } else {
            return "Invalid Password";
        }
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private boolean isValidPassword() {
        return (!password.isEmpty() && password.length() >= 6);
    }
}
