public class PhoneNumberLoginService implements LoginService {
    private String phonenumber;
    private String passwd;

    public PhoneNumberLoginService(String phoneNumber, String passwd) {
        this.phonenumber = phoneNumber;
        this.passwd = passwd;
    }

    @Override
    public void login() {
        System.out.println("Login by phone number:" + this.phonenumber);
    }
}
