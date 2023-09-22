public class ContBancar {
    private double sold;

    public ContBancar() {
        this.sold = 5.0;
    }

    public void depozitareSuma(double suma) {
        if (suma > 0) {
            this.sold += suma;
            System.out.println("Depozitul a fost efectuat cu succes.");
        } else {
            System.out.println("Suma introdusă nu este validă pentru depozit.");
        }
    }

    public double getSold() {
        return sold;
    }
}
