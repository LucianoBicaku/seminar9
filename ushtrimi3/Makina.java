class Makina {
    int eficenca;
    double nivelNafte = 0;

    Makina(double n) {
        this.nivelNafte = n;
    }

    public void drive(double d) {
        this.nivelNafte -= 10.5 * d;
    }

    public double getGazInTank() {
        return this.nivelNafte;
    }

    public void addGaz(double sasi) {
        this.nivelNafte += sasi;
    }
}