public class LoginView {
    private LoginService loginService;

    public LoginView(LoginService emailLoginService) {
        this.loginService = emailLoginService;
    }

    public void startLogin() {
        loginService.login();
    }
}
