public class Main {
    public static void main(String[] args) {

    Person[] pers = new Person[] {new Client("male", 27, "Ivan", 1000),
                               new Employee("female", 25, "Lily", "Manager")};

    for (var per : pers) {
        per.end();
        per.printable();
    }
        for (var season : Seasons.values()) {
            System.out.println(season.toString());
        }
    }
}