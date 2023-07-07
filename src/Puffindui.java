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

    public int allPointsPuffindui() {
        return industriousness + loyalty + honesty;
    }

    public int getIndustriousness() {
        return this.industriousness;
    }

    public int getLoyalty() {
        return this.loyalty;
    }

    public int getHonesty() {
        return this.honesty;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public String toStringPuffindui() {
        return "Industriousness=" + this.industriousness + " Loyalty=" + this.loyalty + " Honesty=" + this.honesty;
    }

}
