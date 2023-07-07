public class Main {
    private static Grifindor[] studentsGrifindor = new Grifindor[3];
    private static Puffindui[] studentsPuffindui = new Puffindui[3];
    private static Coktevran[] studentsCoktevran = new Coktevran[3];
    private static Slizerine[] studentsSlizerine = new Slizerine[3];

    public static void main(String[] args) {
        studentsGrifindor[0] = new Grifindor("Harry Potter", 85, 90, "Grifindor;", 95, 95, 100);
        studentsGrifindor[1] = new Grifindor("Germiona Graindger", 90, 100, "Grifindor;", 60, 85, 70);
        studentsGrifindor[2] = new Grifindor("Ron Weezley", 70, 60, "Grifindor;", 75, 90, 80);

        studentsPuffindui[0] = new Puffindui("Zahariya Smit", 60, 30, "Puffindui;", 80, 90, 95);
        studentsPuffindui[1] = new Puffindui("Sedrick Digory", 90, 95, "Puffindui;", 90, 80, 85);
        studentsPuffindui[2] = new Puffindui("Dgastin Fith-Flather", 75, 50, "Puffindui;", 75, 70, 80);

        studentsCoktevran[0] = new Coktevran("Chgou Chang", 75, 40, "Coktevran;", 70, 60, 50, 80);
        studentsCoktevran[1] = new Coktevran("Padma Patil", 70, 35, "Coktevran;", 75, 65, 70, 75);
        studentsCoktevran[2] = new Coktevran("Markus Belby", 65, 35, "Coktevran;", 60, 50, 50, 60);

        studentsSlizerine[0] = new Slizerine("Dracko Malfoy", 80, 70, "Slizerine;", 60, 70, 95, 80, 90);
        studentsSlizerine[1] = new Slizerine("Grackham Montegruy", 60, 40, "Slizerine;", 70, 75, 80, 50, 60);
        studentsSlizerine[2] = new Slizerine("Gregory Goeyl", 65, 30, "Slizerine;", 40, 60, 50, 50, 55);

        infoStudentOfHogwarts();
        studentsGrifindor[0].allPointsGrifindor();
        studentsGrifindor[1].allPointsGrifindor();
        studentsPuffindui[0].allPointsPuffindui();
        studentsPuffindui[1].allPointsPuffindui();
        studentsCoktevran[0].allPointsCoktevran();
        studentsCoktevran[1].allPointsCoktevran();
        studentsSlizerine[0].allPointsSlizerine();
        studentsSlizerine[1].allPointsSlizerine();
        studentsGrifindor[0].allPointBase();
        studentsSlizerine[0].allPointBase();
        compareTwoStudentsOfGrifindor();
        compareTwoStudentsOfPuffindui();
        compareTwoStudentsOfCoktevran();
        compareTwoStudentsOfSlizerine();
        compareStudentsOfHogwarts();

    }

    private static void infoStudentOfHogwarts() {
        System.out.println(studentsGrifindor[0].toStringHogwarts() + studentsGrifindor[0].toStringGrifindor());

    }

    private static void compareTwoStudentsOfGrifindor() {
        if (studentsGrifindor[0].allPointsGrifindor() > studentsGrifindor[1].allPointsGrifindor()) {
            System.out.println(studentsGrifindor[0].getNameOfStudents() + " better Grifindors than " + studentsGrifindor[1].getNameOfStudents());
        } else if (studentsGrifindor[0].allPointsGrifindor() < studentsGrifindor[1].allPointsGrifindor()) {
            System.out.println(studentsGrifindor[1].getNameOfStudents() + " better Grifindors than " + studentsGrifindor[0].getNameOfStudents());
        } else if (studentsGrifindor[0].allPointsGrifindor() == studentsGrifindor[1].allPointsGrifindor()) {
            System.out.println("They are equals!");
        }

    }

    private static void compareTwoStudentsOfPuffindui() {
        if (studentsPuffindui[0].allPointsPuffindui() > studentsPuffindui[1].allPointsPuffindui()) {
            System.out.println(studentsPuffindui[0].getNameOfStudents() + " better Puffinduis than " + studentsPuffindui[1].getNameOfStudents());
        } else if (studentsPuffindui[0].allPointsPuffindui() < studentsPuffindui[1].allPointsPuffindui()) {
            System.out.println(studentsPuffindui[1].getNameOfStudents() + " better Puffinduis than " + studentsPuffindui[0].getNameOfStudents());
        } else if (studentsPuffindui[0].allPointsPuffindui() == studentsPuffindui[1].allPointsPuffindui()) {
            System.out.println("They are equals!");
        }
    }

    private static void compareTwoStudentsOfCoktevran() {
        if (studentsCoktevran[0].allPointsCoktevran() > studentsCoktevran[1].allPointsCoktevran()) {
            System.out.println(studentsCoktevran[0].getNameOfStudents() + " better Coktevrans than " + studentsCoktevran[1].getNameOfStudents());
        } else if (studentsCoktevran[0].allPointsCoktevran() < studentsCoktevran[1].allPointsCoktevran()) {
            System.out.println(studentsCoktevran[1].getNameOfStudents() + " better Coktevrans than " + studentsCoktevran[0].getNameOfStudents());
        } else if (studentsCoktevran[0].allPointsCoktevran() == studentsCoktevran[1].allPointsCoktevran()) {
            System.out.println("They are equals!");
        }
    }

    private static void compareTwoStudentsOfSlizerine() {
        if (studentsSlizerine[0].allPointsSlizerine() > studentsSlizerine[1].allPointsSlizerine()) {
            System.out.println(studentsSlizerine[0].getNameOfStudents() + " better Slizerines than " + studentsSlizerine[1].getNameOfStudents());
        } else if (studentsSlizerine[0].allPointsSlizerine() < studentsSlizerine[1].allPointsSlizerine()) {
            System.out.println(studentsSlizerine[1].getNameOfStudents() + " better Slizerines than " + studentsSlizerine[0].getNameOfStudents());
        } else if (studentsSlizerine[0].allPointsSlizerine() == studentsSlizerine[1].allPointsSlizerine()) {
            System.out.println("They are equals!");
        }
    }

    private static void compareStudentsOfHogwarts() {
        if (studentsGrifindor[0].allPointBase() > studentsSlizerine[0].allPointBase()) {
            System.out.println(studentsGrifindor[0].getNameOfStudents() + " have big power of magick than " + studentsSlizerine[0].getNameOfStudents());
        } else if (studentsGrifindor[0].allPointBase() < studentsSlizerine[0].allPointBase()) {
            System.out.println(studentsSlizerine[0].getNameOfStudents() + " have big power of magick than " + studentsGrifindor[0].getNameOfStudents());
        } else if (studentsGrifindor[0].allPointBase() == studentsSlizerine[0].allPointBase()) {
            System.out.println("They are equals!");
        }

    }

}