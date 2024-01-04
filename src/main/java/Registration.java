public class Registration {
    /*
    Create Registration Class in which you would have variables such as email,
userName and password that have an access scope only within its own class.
After creating an object of the class, the user should be able to call methods
and in each method separately pass values to set users email, username and
password.
Requirements:
● Valid email consider to be only yahoo
● Valid userName and password cannot be empty and should be of
length larger than 6 characters. Also valid passwords cannot contain
userName.
     */

    private String email;
    private String userName;
    private String password;

    public void setEmail(String email) {
        this.email = email;

        if (email.endsWith("@yaho.com")) {
            System.out.println("Email is working.");
        } else {
            System.out.println("Please use only @yahoo.com to make a new password.");
        }
    }
        public void setUserName (String userName) {
            this.userName = userName;
            if (userName.length() > 6) {
                System.out.println("The user name is good to use.");
            } else {
                System.out.println("Please choose another user name.");
            }
        }
        public void setPassword (String password){
                this.password = password;
            if (password.length()>6 &&!password.contains(userName)) {
                System.out.println("Strong password.");
            } else {
                System.out.println("The password is week.");
            }
            }


    public static void main(String[] args) {
        Registration r=new Registration();
        r.setEmail("Beautifull@yahoo.com");
        r.setUserName("Princess");
        r.setPassword("Sevendwarfs");

    }
}