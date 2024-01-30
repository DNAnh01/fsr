package bean;

public class Employee {
    private Integer id;
    private String name;
    private Integer salary;
    private Integer managerId;

    public Employee() {
    }

    public Employee(Integer id, String name, Integer salary, Integer managerId) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.managerId = managerId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", managerId=" + managerId + "]";
    }

    @Override
    public int hashCode() {
        return (this.getId() + "-" + this.getName() + "-" + this.getSalary() + "-" + this.getManagerId()).hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Employee)) {
            return false;
        }
        Employee other = (Employee) obj;

        return this.getId() == other.getId() &&
                this.getName() == other.getName() &&
                this.getSalary() == other.getSalary() &&
                this.getManagerId() == other.getManagerId();
    }
}
