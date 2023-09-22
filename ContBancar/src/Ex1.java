import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ContBancar cont = new ContBancar();

        System.out.print("Introduceți suma pentru prima depunere: ");
        double suma1 = scanner.nextDouble();
        cont.depozitareSuma(suma1);

        System.out.print("Introduceți suma pentru a doua depunere: ");
        double suma2 = scanner.nextDouble();
        cont.depozitareSuma(suma2);


        System.out.println("Soldul total al contului bancar este: " + cont.getSold());

        scanner.close();
    }
}
