public class MTK2 extends Matematika {
    public int modulus(int a, int b) {
        if (b != 0) {
            return a % b;
        } else {
            System.out.println("Modulus dgn nol tdk diperbolehkan.");
            return 0;
        }
    }
}
