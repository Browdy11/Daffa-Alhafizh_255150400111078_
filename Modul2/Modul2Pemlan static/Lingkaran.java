public class Lingkaran {
    public static float PI = 3.14f;
    public float r;

    public Lingkaran(float r) {
        this.r = r;
    }

    public float luas() {
        return Lingkaran.PI * r * r;
    }

    // Penambahan method static sesuai langkah 5
    public static float keliling(float nilaiR) {
        return 2 * Lingkaran.PI * nilaiR;
    }
}