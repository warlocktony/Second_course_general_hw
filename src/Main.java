public class Main {
    public static void main(String[] args) {
        Grifindor harryPotter = new Grifindor("Harry Potter", 85, 90,
                "Grifindor", 95, 95, 100);
        Grifindor germionaGraindger = new Grifindor("Germiona Graindger", 90, 100,
                "Grifindor", 60, 85, 70);
        Grifindor ronWeezley = new Grifindor("Ron Weezley", 70, 60,
                "Grifindor", 75, 90, 80);

        Puffindui zahariyaSmit = new Puffindui("Zahariya Smit", 60, 30,
                "Puffindui", 80, 90, 95);
        Puffindui sedrickDigory = new Puffindui("Sedrick Digory", 90, 95,
                "Puffindui", 90, 80, 85);
        Puffindui dgastinFithFlather = new Puffindui("Dgastin Fith-Flather", 75, 50,
                "Puffindui", 75, 70, 80);

        Coktevran chgouChang = new Coktevran("Chgou Chang", 75, 40,
                "Coktevran", 70, 60, 50, 80);
        Coktevran padmaPatil = new Coktevran("Padma Patil", 70, 35,
                "Coktevran", 75, 65, 70, 75);
        Coktevran markusBelby = new Coktevran("Markus Belby", 65, 35,
                "Coktevran", 60, 50, 50, 60);

        Slizerine drackoMalfoy = new Slizerine("Dracko Malfoy", 80, 70,
                "Slizerine", 60, 70, 95, 80, 90);
        Slizerine grackhamMontegruy = new Slizerine("Grackham Montegruy", 60, 40,
                "Slizerine", 70, 75, 80, 50, 60);
        Slizerine gregoryGoeyl = new Slizerine("Gregory Goeyl", 65, 30,
                "Slizerine", 40, 60, 50, 50, 55);

        System.out.println(harryPotter);
        System.out.println(sedrickDigory);
        System.out.println(chgouChang);
        System.out.println(drackoMalfoy);
        harryPotter.compareTwoStudentsGriffindor(ronWeezley);
        zahariyaSmit.compareTwoStudentsPuffindui(sedrickDigory);
        chgouChang.compareTwoStudentsCoktevran(padmaPatil);
        drackoMalfoy.compareTwoStudentsSlizerine(grackhamMontegruy);
        harryPotter.compareTwoStudentsHogwarts(drackoMalfoy);

    }
}

