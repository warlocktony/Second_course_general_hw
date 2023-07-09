public class Slizerine extends Hogwarts {
    private int trick;
    private int determination;
    private int ambitions;
    private int resourcefulness;
    private int lustForPower;

    public Slizerine(String nameOfStudents, int powerOfMagick, int transgressionDistanceKm, String faculty, int trick, int determination, int ambitions, int resourcefulness, int lustForPower) {
        super(nameOfStudents, powerOfMagick, transgressionDistanceKm, faculty);
        this.trick = trick;
        this.determination = determination;
        this.ambitions = ambitions;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;

    }
    public  String toString(){
        return super.toString() + " trick = " + this.trick + " determination = " + this.determination + " ambitions = "
                + this.ambitions + " resourcefulness = " + this.resourcefulness + " lust for power = " + this.lustForPower;

    }
    public void compareTwoStudentsSlizerine(Slizerine other) {
        int firstStudent = this.trick + this.determination + this.ambitions + this.resourcefulness + this.lustForPower;
        int otherStudent = other.trick + other.determination + other.ambitions + other.resourcefulness + other.lustForPower;
        if (firstStudent > otherStudent) {
            System.out.println(this.getNameOfStudents() + " better student of Slizerins than " + other.getNameOfStudents());
        } else if (firstStudent < otherStudent) {
            System.out.println(other.getNameOfStudents() + " better student of Slizerins than " + this.getNameOfStudents());
        } else {
            System.out.println("This students are equals!");
        }
    }
}
