public enum Seasons {

    WINTER("white"),
    SPRING("blue"),
    SUMMER("green"),
    AUTUMN("yellow");

    private String color;

    Seasons (String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Seasons " + this.name() +
                " (color - " + color + ")";
    }
}
