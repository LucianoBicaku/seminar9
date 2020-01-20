public class Adresa {
    private int numri;
    private String rruga;
    private int nr_rrug;
    private String qyteti;
    private String shteti;
    private int kodi_postar;

    Adresa(int n, String rr, int nr, String q, String s, int k) {
        this.numri = n;
        this.rruga = rr;
        this.nr_rrug = nr;
        this.qyteti = q;
        this.shteti = s;
        this.kodi_postar = k;
    }

    public void print() {
        System.out.println(this.numri);
        System.out.println(this.kodi_postar);
        System.out.println(this.nr_rrug);
        System.out.println(this.qyteti);
        System.out.println(this.rruga);
        System.out.println(this.shteti);
    }

    public int ktheKod() {
        return this.kodi_postar;
    }

    public boolean comesBefore(int kod) {
        if (kod > this.kodi_postar)
            return true;
        return false;
    }
}