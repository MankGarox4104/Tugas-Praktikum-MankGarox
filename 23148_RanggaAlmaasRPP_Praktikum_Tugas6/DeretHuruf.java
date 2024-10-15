public class DeretHuruf {

    public static void main(String[] args) {
        System.out.println("Menggunakan for:");
        for (char letter = 'Z'; letter >= 'A'; letter--) {
            System.out.print(letter + " ");
        }

        System.out.println("\n\nMenggunakan while:");
        char letterWhile = 'Z';
        while (letterWhile >= 'A') {
            System.out.print(letterWhile + " ");
            letterWhile--;
        }

        System.out.println("\n\nMenggunakan do-while:");
        char letterDoWhile = 'Z';
        do {
            System.out.print(letterDoWhile + " ");
            letterDoWhile--;
        } while (letterDoWhile >= 'A');
    }
}
