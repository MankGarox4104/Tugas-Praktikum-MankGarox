public class LoopModified {

    public void printHeader() {
        for (int col = 1; col <= 4; col++) {
            System.out.print("\t" + col);
        }
    }

    public void printBody() {
        System.out.println();
        for (int row = 1; row <= 4; row++) {
            System.out.print(row + "\t");
            for (int col = 1; col <= 4; col++) {
                int product = row * col;
                System.out.print(product + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        LoopModified loop = new LoopModified();

        loop.printHeader();
        loop.printBody();
    }
}
