public class Main {
    public static void main(String[] args) {

        GryffindorStudents harryPotter = new GryffindorStudents(
                "Harry Potter", 80, 70, 80, 80, 70
        );
        GryffindorStudents hermioneGranger = new GryffindorStudents(
                "Hermione Granger", 90, 90, 80, 80, 80
        );
        GryffindorStudents ronWeasley = new GryffindorStudents(
                "Ron Weasley",70,70,70,70,70
        );

        System.out.println(harryPotter);
        System.out.println(hermioneGranger);
        System.out.println(ronWeasley);

        GryffindorStudents.compare(hermioneGranger, harryPotter);

        SlytherinStudents dracoMalfoy = new SlytherinStudents(
                "Draco Malfoy", 90, 80, 60, 50, 100,70, 100
        );
        SlytherinStudents grahamMontagu = new SlytherinStudents(
          "Graham Montagu" , 50,40,60,50,60,70,60
        );
        SlytherinStudents gregoryGoyle = new SlytherinStudents(
          "Gregory Goyle" , 40,30,50,44,54,48,68
        );
        System.out.println(dracoMalfoy);
        System.out.println(grahamMontagu);
        System.out.println(gregoryGoyle);

        SlytherinStudents.compare(dracoMalfoy, gregoryGoyle);

        HufflepuffStudents zachariasSmith = new HufflepuffStudents(
          "Zacharias Smith",67,56,78,67,89
        );
        HufflepuffStudents cedricDiggory = new HufflepuffStudents(
           "Cedric Diggory",90,89,90,90,88
        ) ;
        HufflepuffStudents justinFinch = new HufflepuffStudents(
          "Justin Finch",68,57,66,69,56
        );

        System.out.println(zachariasSmith);
        System.out.println(cedricDiggory);
        System.out.println(justinFinch);
        HufflepuffStudents.compare(cedricDiggory, zachariasSmith);

        RavenclawStudents zhouChang = new RavenclawStudents(
          "Zhou Chang",89,79,67,89,67
        );
        RavenclawStudents padmaPatil = new RavenclawStudents(
          "Padma Patil",98,67,57,76,88
        );
        RavenclawStudents marcusBelby = new RavenclawStudents(
          "Marcus Belby",76,67,85,76,56
        );
        System.out.println(zhouChang);
        System.out.println(padmaPatil);
        System.out.println(marcusBelby);
        RavenclawStudents.compare(marcusBelby,padmaPatil);

        HogwartsStudents.compare(harryPotter, dracoMalfoy);


    }
}