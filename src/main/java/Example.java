public class Example {
    public static void main(String[] args) {
        LoginView loginView = new LoginView();
        loginView.login("test@gmailcom", "passwd");

        loginView.loginByPhoneNumber("+886910111222", "passwd");
    }

}
