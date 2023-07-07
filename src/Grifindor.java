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

    public int allPointsGrifindor() {
        return nobility + honor + bravery;
    }

    public int getNobility() {
        return this.nobility;
    }

    public int getHonor() {
        return this.honor;
    }

    public int getBravery() {
        return this.bravery;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public String toStringGrifindor() {
        return "Nobility=" + this.nobility + " Honor=" + this.honor + " Bravery=" + this.bravery;
    }
}
