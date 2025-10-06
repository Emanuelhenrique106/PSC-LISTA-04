public class Main {
    public static void main(String[] args) {
        System.out.println("Números ímpares entre 1 e 50:\n");

        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) { // verifica se o numero que seja imprimido e par
                System.out.print(i + " ");
            }
        }
    }
}