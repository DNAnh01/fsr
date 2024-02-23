package com.dnanh01.persistence;

public class Employee {
    public static String PROP_ID = "id";
    public static String PROP_NAME = "name";
    public static String PROP_EMAIL = "email";
    public static String PROP_PHONE = "phone";
    public static String PROP_ADDRESS = "address";
    public static String PROP_PASSWORD = "password";
    public static String PROP_TITLE_ID = "titleId";

    private Integer id;
    private String name;
    private String email;
    private String phone;
    private String address;
    private String password;
    private Title title;

    public Employee() {
    }

    public static class Builder {
        private Integer id;
        private String name;
        private String email;
        private String phone;
        private String address;
        private String password;
        private Title title;

        private Builder() {

        }

        public Builder Id(Integer id) {
            this.id = id;
            return this;
        }

        public Builder Name(String name) {
            this.name = name;
            return this;
        }

        public Builder Email(String email) {
            this.email = email;
            return this;
        }

        public Builder Phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder Address(String address) {
            this.address = address;
            return this;
        }

        public Builder Password(String password) {
            this.password = password;
            return this;
        }

        public Builder Title(Title title) {
            this.title = title;
            return this;
        }

        public Employee build() {
            return new Employee(this); // *
        }

    }

    public Builder builder() {
        return new Builder();
    }

    // *
    public Employee(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.email = builder.email;
        this.phone = builder.phone;
        this.address = builder.address;
        this.password = builder.password;
        this.title = builder.title;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getPassword() {
        return password;
    }

    public Title getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", address="
                + address + ", password=" + password + ", title=" + title + "]";
    }

}
