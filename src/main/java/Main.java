public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Vasiliy Pupkin", "Worker", "vasia@gmail.com", "0542366987", 3000, 25);
        employees[1] = new Employee("Stanislov Drozdov", "Journalist", "drozdov@gmail.com", "0542369847", 4000, 45);
        employees[2] = new Employee("Aleksey Erohovets", "Programmer", "aleksey@gmail.com", "0542876987", 6000, 35);
        employees[3] = new Employee("Tor", "Avenger", "tor@gmail.com", "0545236987", 5000, 555);
        employees[4] = new Employee("Batman", "Guardian", "batman@gmail.com", "0542369867", 7000, 42);

        for (Employee employee : employees) {
            if(employee.getAge() > 40){
                System.out.println(employee);
            }
        }
    }
}
