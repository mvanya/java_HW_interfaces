public class Client extends Person {
    private String name;
    private int money;

    public Client(String sex, int age, String name, int money) {
        super(sex, age);
        this.name = name;
        this.money = money;
    }

    @Override
    public void end() {
        super.end();
        System.out.println("\nCLIENT INFO");
        System.out.println("Name: " + name + "\nMoney: " + money + "$");
    }

    @Override
    public void printable() {
        System.out.println("I'm here");
    }


}
