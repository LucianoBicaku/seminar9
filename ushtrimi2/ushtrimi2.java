public class ushtrimi2 {
    public static void main(String[] args) {
        Student student = new Student("lucio", 100, 5);
        System.out.println(student.getname());
        System.out.println(student.getTotalScore());
        System.out.println(student.nrQuitz);
        System.out.printf("%.2f%n", student.getAverageScore());
        System.out.println("/----------------/");
        student.addQuiz(102);
        System.out.println(student.getTotalScore());
        System.out.println(student.nrQuitz);
        System.out.printf("%.2f%n", student.getAverageScore());
    }
}