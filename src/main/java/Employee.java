public class Employee {
    private String post;
    private String fullName;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String fullName, String post, String email, String phone, int salary, int age) {
        this.post = post;
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%s должность: %s, электронная почта %s, телефон %s, зарплата %d, возраст %d ", fullName, post, email, phone, salary, age);
    }
}
