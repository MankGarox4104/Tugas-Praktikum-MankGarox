import java.util.Scanner;

public class DiskonPembelian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input total pembelian
        System.out.print("Total pembelian Rp.: ");
        double totalPembelian = input.nextDouble();

        // Variabel untuk menyimpan potongan dan total yang harus dibayar
        double potongan;
        double totalBayar;

        // Menentukan besarnya potongan
        if (totalPembelian < 50000) {
            potongan = totalPembelian * 0.05;
        } else {
            potongan = totalPembelian * 0.20;
        }

        // Menghitung jumlah yang harus dibayarkan
        totalBayar = totalPembelian - potongan;

        // Output hasil
        System.out.println("Besarnya potongan Rp.: " + potongan);
        System.out.println("Jumlah yang harus dibayarkan Rp.: " + totalBayar);

        input.close();
    }
}