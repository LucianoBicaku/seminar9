public class Student {
    String emri;
    int pikTotal;
    int nrQuitz;

    Student(String e, int p, int n) {
        this.emri = e;
        this.pikTotal = p;
        this.nrQuitz = n;
    }

    public String getname() {
        return this.emri;
    }

    public void addQuiz(int score) {
        this.pikTotal += score;
        this.nrQuitz++;
    }

    public int getTotalScore() {
        return this.pikTotal;
    }

    public double getAverageScore() {
        return this.pikTotal / this.nrQuitz;
    }
}