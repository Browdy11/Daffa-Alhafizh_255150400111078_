public class Vehicle {
    Vehicle() {
        System.out.println("Vehicle is created");
    }

    // Menggunakan protected sesuai percobaan 8
    protected void drive() {
        System.out.println("Vehicle is driving");
    }

    public void stop() {
        System.out.println("Vehicle is stopping");
    }
}