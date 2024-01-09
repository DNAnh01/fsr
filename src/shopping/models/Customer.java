package shopping.models;

public class Customer {
    private String name;
    private String phone;
    private boolean gender;
    private String address;

    public Customer() {
    }

    public Customer(String name, String phone, boolean gender, String address) {
        this.name = name;
        this.phone = phone;
        this.gender = gender;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer [name=" + name + ", phone=" + phone + ", gender=" + gender + ", address=" + address + "]";
    }
}
