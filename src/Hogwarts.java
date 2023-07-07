public class Hogwarts {
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

    public int allPointBase() {
        return powerOfMagick + transgressionDistanceKm;
    }

    public String getNameOfStudents() {
        return this.nameOfStudents;
    }

    public int getPowerOfMagick() {
        return this.powerOfMagick;
    }

    public int getTransgressionDistanceKm() {
        return this.transgressionDistanceKm;
    }

    public void setPowerOfMagick(int powerOfMagick) {
        this.powerOfMagick = powerOfMagick;
    }

    public void setTransgressionDistanceKm(int transgressionDistanceKm) {
        this.transgressionDistanceKm = transgressionDistanceKm;
    }

    public String getFaculty() {
        return this.faculty;
    }

    public String toStringHogwarts() {
        return "Name- " + this.nameOfStudents + " Magick power=" + this.powerOfMagick + " Transgression KM=" + this.transgressionDistanceKm + " Faculty- " + this.faculty;
    }

}
