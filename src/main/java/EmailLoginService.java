public class EmailLoginService implements LoginService {

    private final String email;
    private final String passwd;

    public EmailLoginService(String email, String passwd) {
        this.email = email;
        this.passwd = passwd;
    }

    @Override
    public void login() {
        System.out.println("LoginService by email:" + email);
    }
}
