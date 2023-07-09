public abstract class Hogwarts  {
    private String nameOfStudents;
    private int powerOfMagick;
    private int transgressionDistanceKm;
    private String faculty;

    public Hogwarts(String nameOfStudents, int powerOfMagick, int transgressionDistanceKm, String faculty) {
        this.nameOfStudents = nameOfStudents;
        this.powerOfMagick = powerOfMagick;
        this.transgressionDistanceKm = transgressionDistanceKm;
        this.faculty = faculty;
    }

    public String toString(){
        return "name - " + this.nameOfStudents + " facelty - " +  this.faculty + " magick = " + this.powerOfMagick
                + " transgression = " + this.transgressionDistanceKm + ";";
    }
    public String getNameOfStudents(){
        return nameOfStudents;
    }
    public void compareTwoStudentsHogwarts(Hogwarts other){
        int allPointsOne = this.powerOfMagick + this.transgressionDistanceKm;
        int allPointsTwo = other.powerOfMagick + other.transgressionDistanceKm;
        if (allPointsOne>allPointsTwo){
            System.out.println(this.nameOfStudents + " have big power of magick than " + other.nameOfStudents);
        } else if (allPointsOne<allPointsTwo) {
            System.out.println(other.nameOfStudents + " have big power of magick than " + this.nameOfStudents);
        }else {
            System.out.println("They are equals!");
        }
    }
}


