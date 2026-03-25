public class Student {
    private String nama;
    private int skor;

    public Student(String nama) {
        this.nama = nama;
    }

    // Method getter untuk membaca nilai atribut private (Langkah 3 & 5a)
    public String getNama() {
        return this.nama;
    }

    public int getSkor() {
        return this.skor;
    }

    // Modifier diubah menjadi private (Langkah 4)
    private void setNama(String nama) {
        this.nama = nama;
    }

    // Method public static sesuai blueprint di soal Langkah 5b
    public static void setNama(Student std, String nama) {
        std.setNama(nama);
    }

    // Tambahan logis untuk mengeset skor (karena di soal langkah 5b tertulis "mengeset nilai skor" tapi blueprint-nya setNama)
    public static void setSkor(Student std, int skorBaru) {
        std.skor = skorBaru;
    }
}