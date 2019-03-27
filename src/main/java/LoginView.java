public class LoginView {
    private LoginService loginService;

    public LoginView(LoginService loginService) {
        this.loginService = loginService;
    }

    public void startLogin() {
        loginService.login();
    }
}
