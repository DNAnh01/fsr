package inheritance.abstractclass;

public class StandardEmailServiceImpl extends EmailService implements Transfer, SecurityConfigurer {

    @Override
    void login() {
        System.out.println("StandardEmailServiceImpl ===> login ....");
    }

    @Override
    public void send() {
        System.out.println("Sending email to abc@gmail.com");
    }

    @Override
    public void encrypt(String content) {
        System.out.println("Using Bcrypt algorithm");
    }

}