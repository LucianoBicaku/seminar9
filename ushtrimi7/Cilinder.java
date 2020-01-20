public class Cilinder {
    double r;
    double h;

    Cilinder(double r, double h) {
        this.r = r;
        this.h = h;
    }

    public double getSipBaz() {
        return (Math.PI * Math.pow(r, 2));
    }

    public double getPerBaz() {
        return (Math.PI * 2 * r);
    }

    public double getSipAns() {
        return (this.getPerBaz() * h);
    }

    public double getSipPer() {
        return (this.getSipBaz() * 2 + this.getSipAns());
    }

    public double getVolume() {
        return (this.getPerBaz() * this.h);
    }

}