import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mahasigma mhs = new Mahasigma();

        // Input data mahasiswa
        System.out.print("NPM Mahasiswa: ");
        mhs.npm = input.nextLine();
        
        System.out.print("Nama Mahasiswa: ");
        mhs.namaMahasiswa = input.nextLine();
        
        System.out.print("Nilai Kehadiran: ");
        mhs.nilaiKehadiran = input.nextDouble();
        
        System.out.print("Nilai Tugas: ");
        mhs.nilaiTugas = input.nextDouble();
        
        System.out.print("Nilai UTS: ");
        mhs.nilaiUTS = input.nextDouble();
        
        System.out.print("Nilai UAS: ");
        mhs.nilaiUAS = input.nextDouble();

        mhs.hitungNilaiAkhir();
        mhs.tentukanGrade();

        System.out.println("\n=== HASIL PERHITUNGAN ===");
        mhs.tampilkanData();

        input.close();
    }
}