public class Population {
    int nr_pop;

    Population(int n) {
        this.nr_pop = n;
    }

    public void shtoPop() {
        this.nr_pop *= 2;
    }

    public void reducePop() {
        this.nr_pop -= (this.nr_pop * 0.1);
    }

    public int getPop() {
        return this.nr_pop;
    }
}