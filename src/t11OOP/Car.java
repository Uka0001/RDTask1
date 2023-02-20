package t11OOP;

public class Car extends Auto {
    String type = "car";

    @Override
    void getType() {
        System.out.println("Type of auto: " + type);
    }
}
