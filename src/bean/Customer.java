package bean;

import file.content.AbstractFile;

public class Customer implements AbstractFile {
    private String fullName;
    private String phone;
    private String address;

    public Customer() {
    }

    public Customer(String line) {
        String[] elements = line.split(", ");
        if (elements.length == 3) {
            this.fullName = elements[0];
            this.phone = elements[1];
            this.address = elements[2];
        }
    }

    public Customer(String fullName, String phone, String address) {
        this.fullName = fullName;
        this.phone = phone;
        this.address = address;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer [fullName=" + fullName + ", phone=" + phone + ", address=" + address + "]";
    }

    @Override
    public String toLine() {
        return String.join(", ", getFullName(), getPhone(), getAddress() + "\n");
    }
}
