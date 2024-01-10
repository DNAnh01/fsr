package encapsulation.external;

import encapsulation.internal.Father;

public class ExternalSon extends Father {
    public static void main(String[] args) {
        ExternalSon externalSon = new ExternalSon();
        System.out.println("ADN: " + externalSon.adn());
        // System.out.println("Account: " + externalSon.account()); error
    }
}
