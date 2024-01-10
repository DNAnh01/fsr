package inheritance.abstractclass;

public abstract class EmailService {
    // override required: abstract method
    abstract void login();

    // override optional
    void loginWith2Steps() {
        System.out.println("login with 2 steps");
    }
}
