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

    public int allPointsCoktevran() {
        return smart + wise + wit + creativity;
    }

    public int getSmart() {
        return this.smart;
    }

    public int getWise() {
        return this.wise;
    }

    public int getWit() {
        return this.wit;
    }

    public int getCreativity() {
        return this.creativity;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public String toStringCoktevran() {
        return "Smart=" + this.smart + " Wise=" + this.wise + " Wit=" + this.wit + " Creativity=" + this.creativity;
    }

}
