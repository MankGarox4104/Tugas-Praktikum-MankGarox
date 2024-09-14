public class MTKInherit {
    public static void main(String[] args) {
        Matematika math = new Matematika();
        System.out.println("Hasil tambah: " + math.tambah(10, 5));
        System.out.println("Hasil kurang: " + math.kurang(10, 5));

        MTK2 math2 = new MTK2();
        System.out.println("Hasil modulus: " + math2.modulus(10, 3));
        System.out.println("Hasil kali: " + math2.kali(10, 3));
        System.out.println("Hasil bagi: " + math2.bagi(10, 2));
    }
}
