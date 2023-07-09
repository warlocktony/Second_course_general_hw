public class Coktevran extends Hogwarts {
    private int smart;
    private int wise;
    private int wit;
    private int creativity;

    public Coktevran(String nameOfStudents, int powerOfMagick, int transgressionDistanceKm, String faculty, int smart, int wise, int wit, int creativity) {
        super(nameOfStudents, powerOfMagick, transgressionDistanceKm, faculty);
        this.smart = smart;
        this.wise = wise;
        this.wit = wit;
        this.creativity = creativity;

    }
    public String toString(){
        return super.toString() + " smart = " + this.smart + " wise = " + this.wise + " wit = " + this.wit
                + " creativity = " + this.creativity;
    }
    public void compareTwoStudentsCoktevran(Coktevran other) {
        int firstStudent = this.smart + this.wise + this.wit + this.creativity;
        int otherStudent = other.smart + other.wise + other.wit + this.creativity;
        if (firstStudent > otherStudent) {
            System.out.println(this.getNameOfStudents() + " better student of Coktevrans than " + other.getNameOfStudents());
        } else if (firstStudent < otherStudent) {
            System.out.println(other.getNameOfStudents() + " better student of Coktevrans than " + this.getNameOfStudents());
        } else {
            System.out.println("This students are equals!");
        }
    }
}
