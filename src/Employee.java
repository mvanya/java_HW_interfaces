public class Employee extends Person {

    private String name;
    private String employee;

    public Employee(String sex, int age, String name, String employee) {
        super(sex, age);
        this.name = name;
        this.employee = employee;
    }

    @Override
    public void end() {
        super.end();
        System.out.println("\nEMPLOYEE INFO");
        System.out.println("Name: " + name + "\nEmployee: " + employee);
    }

    @Override
    public void printable() {
        System.out.println("I'm here");
    }

}
