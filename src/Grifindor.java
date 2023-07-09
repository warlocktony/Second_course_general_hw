public class Grifindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;


    public Grifindor(String nameOfStudents, int powerOfMagick, int transgressionDistanceKm, String faculty, int nobility, int honor, int bravery) {
        super(nameOfStudents, powerOfMagick, transgressionDistanceKm, faculty);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public String toString(){
        return super.toString() + " nobility = " + this.nobility + " honor = " + this.honor + " bravery = " + this.bravery;
    }
    public void compareTwoStudentsGriffindor(Grifindor other){
        int firstStudent = this.nobility + this.honor + this.nobility;
        int otherStudent = other.nobility + other.honor + other.bravery;
        if(firstStudent>otherStudent){
            System.out.println(this.getNameOfStudents() + " better student of Grifindors than " + other.getNameOfStudents());
        }else if(firstStudent<otherStudent){
            System.out.println(other.getNameOfStudents() + " better student of Grifindors than " + this.getNameOfStudents());
        }else{
            System.out.println("This students are equals!");
        }

    }
}
