public class AutomotiveApp {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        Sedan sedan = new Sedan();

        vehicle.drive();
        car.drive();
        sedan.drive();

        System.out.println("\n");

        car.drift();
        sedan.drift();

        System.out.println("\n");

        car.honk();
        sedan.honk();

        System.out.println("\n");
        sedan.getNumWheels();
    }
}