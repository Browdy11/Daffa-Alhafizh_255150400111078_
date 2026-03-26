public class Car extends Vehicle {
    // Tetap public (atau bisa juga protected) agar tidak error di class Sedan
    public int numWheel = 4;

    Car() {
        System.out.println("Car is created");
    }

    public void drift() {
        System.out.println("Car is drifting");
    }

    public void honk() {
        System.out.println("Car is honking");
    }
}