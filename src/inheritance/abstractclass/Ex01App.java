package inheritance.abstractclass;

public class Ex01App {
    public static void main(String[] args) {
        EmailService standard = new StandardEmailServiceImpl();

        standard.login();
        standard.loginWith2Steps();

        System.out.println("=========================");
        EmailService business = new BusinessEmailServiceImpl();
        business.login();
        business.loginWith2Steps();
    }
}
