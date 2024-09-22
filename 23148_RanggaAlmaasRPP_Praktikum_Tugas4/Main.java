public class Main {
    public static void main(String[] args) {
        // Membuat objek Balok
        Balok balok = new Balok(5, 3, 4);
        // Membuat objek Kubus
        Kubus kubus = new Kubus(4);

        // Menggunakan polimorfisme
        BangunRuang bangun1 = balok;
        BangunRuang bangun2 = kubus;

        // Menghitung dan menampilkan hasil
        System.out.println("Volume Balok: " + bangun1.hitungVolume());
        System.out.println("Luas Permukaan Balok: " + bangun1.hitungLuasPermukaan());
        
        System.out.println("Volume Kubus: " + bangun2.hitungVolume());
        System.out.println("Luas Permukaan Kubus: " + bangun2.hitungLuasPermukaan());
    }
}
