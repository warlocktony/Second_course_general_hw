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

    public int allPointsSlizerine() {
        return trick + determination + ambitions + resourcefulness + lustForPower;
    }

    public int getTrick() {
        return this.trick;
    }

    public int getDetermination() {
        return this.determination;
    }

    public int getAmbitions() {
        return this.ambitions;
    }

    public int getResourcefulness() {
        return this.resourcefulness;
    }

    public int getLustForPower() {
        return this.lustForPower;
    }

    public void setTrick(int trick) {
        this.trick = trick;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public void setAmbitions(int ambitions) {
        this.ambitions = ambitions;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    public String toStringSlizerine() {
        return "Trick=" + this.trick + " Determination=" + this.determination + " Ambitions=" + this.ambitions + " Resourcefulness=" + this.resourcefulness + " Lust for Power=" + this.lustForPower;
    }
}
