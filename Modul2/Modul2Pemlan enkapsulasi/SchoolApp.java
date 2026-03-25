public class SchoolApp {
    public static void main(String[] args) {
        Student miki = new Student("Miki");
        Student mini = new Student("Mini");

        // Pemanggilan variabel diubah menggunakan method getter
        System.out.println("Grade " + miki.getNama() + " " + miki.getSkor());
        System.out.println("Grade " + mini.getNama() + " " + mini.getSkor());

        // Mengubah nama menggunakan method public static sesuai instruksi langkah 5b
        Student.setNama(mini, "Mono");

        System.out.println("Grade " + miki.getNama() + " " + miki.getSkor());
        System.out.println("Grade " + mini.getNama() + " " + mini.getSkor());
    }
}
