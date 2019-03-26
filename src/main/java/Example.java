public class Example {
    public static void main(String[] args) {

        LoginService emailLoginService = new EmailLoginService("test@gmail.com", "passwd");
        LoginView loginView = new LoginView(emailLoginService);
        loginView.startLogin();

        LoginService phoneNumberLoginService = new PhoneNumberLoginService("+886910111222", "passwd");
        loginView = new LoginView(phoneNumberLoginService);
        loginView.startLogin();
    }

}
