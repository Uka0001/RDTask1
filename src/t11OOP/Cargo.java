package t11OOP;

public class Cargo extends Auto {
    String type = "cargo";
    @Override
    void getType() {
        System.out.println("Type of auto: " + type);
    }
}
