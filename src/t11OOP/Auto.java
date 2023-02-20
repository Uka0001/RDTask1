package t11OOP;

public class Auto {
    String type = "Auto";
    void getType(){
        System.out.println("Type of auto: " + type );
    }

    public static void main(String[] args) {
        Auto auto = new Auto();
        auto.getType();
        Car car = new Car();
        car.getType();
        Cargo cargo = new Cargo();
        cargo.getType();
    }
}
