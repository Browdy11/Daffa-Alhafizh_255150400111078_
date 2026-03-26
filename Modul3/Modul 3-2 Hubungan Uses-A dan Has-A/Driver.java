public class Driver {
    // Mendeklarasikan class Car sebagai atribut di luar method (Hubungan Has-A)
    private Car coupe; 

    public Driver() {
        System.out.println("Driver is created.");
    }

    public void driving() {
        System.out.println("Driver is driving.");
        // Inisialisasi dilakukan saat method dipanggil agar urutan output tetap sama
        this.coupe = new Car(); 
        System.out.println("Using a car that has " + coupe.numWheel + " wheels.");
    }
}