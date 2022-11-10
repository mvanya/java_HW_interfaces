public abstract class Person implements Printable {

    private String sex;
    private int age;

    public Person(String sex, int age) {
        this.sex = sex;
        this.age = age;
    }

    public void end() {
        System.out.println("\nPERSON INFO");
        System.out.println("Sex: " + sex + "\nAge: " + age);
    }

    public abstract void printable();
}
