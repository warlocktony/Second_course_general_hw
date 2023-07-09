public class Puffindui extends Hogwarts {
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Puffindui(String nameOfStudents, int powerOfMagick, int transgressionDistanceKm, String faculty, int industriousness, int loyalty, int honesty) {
        super(nameOfStudents, powerOfMagick, transgressionDistanceKm, faculty);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;

    }
    public String toString(){
        return super.toString() + " industriousness = " + this.industriousness  + " loyalty = " + this.loyalty
                + " honesty = " + this.honesty;
    }
    public void compareTwoStudentsPuffindui(Puffindui other) {
        int firstStudent = this.industriousness + this.loyalty + this.honesty;
        int otherStudent = other.industriousness + other.loyalty + other.honesty;
        if (firstStudent > otherStudent) {
            System.out.println(this.getNameOfStudents() + " better student of Puffinduis than " + other.getNameOfStudents());
        } else if (firstStudent < otherStudent) {
            System.out.println(other.getNameOfStudents() + " better student of Puffinduis than " + this.getNameOfStudents());
        } else {
            System.out.println("This students are equals!");
        }
    }

}
