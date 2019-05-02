package Encapsulation;

public class EtsyAccount {
    private String email;
    private String firstName;
    private String password;

    public void setAccountInfo(String email, String firstName, String password) {
        this.email = email;
        this.firstName = firstName;
        setPassword(password);
    }

    public String getAccountInfo() {
        String ret = email + " | " + firstName + " | " + password;
        return ret;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String newEmail) {
        email = newEmail;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String newFirstName) {
        firstName = newFirstName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.length() < 6) {
            System.out.println("Password must be at least 6 characters");
        }

        this.password = password;

    }





}
