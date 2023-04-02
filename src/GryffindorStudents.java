public class GryffindorStudents extends HogwartsStudents {
    private int nobility;
    private int honor;
    private int courage;

    public GryffindorStudents(String fullName, int powerOfMagic, int transgressionDistance, int nobility, int honor, int courage) {
        super(fullName, powerOfMagic, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getCourage() {
        return courage;
    }

    @Override
    public String toString() {
        return getFullName() + " GryffindorStudents{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", courage=" + courage +
                ", fullName='" + getFullName() + '\'' +
                ", powerOfMagic=" + getPowerOfMagic() +
                ", transgressionDistance=" + getTransgressionDistance() +
                '}';
    }

    private int getAbilitiesSum() {
        return nobility + honor + courage;
    }

    public static void compare(GryffindorStudents students1, GryffindorStudents students2) {
        int student1Sum = students1.getAbilitiesSum();
        int student2Sum = students2.getAbilitiesSum();
        if (student1Sum > student2Sum) {
            System.out.println("Студент " + students1.getFullName() + " лучше, чем студент " + students2.getFullName());

        } else if (student1Sum < student2Sum) {
            System.out.println("Студент " + students1.getFullName() + " лучше, чем студент " + students2.getFullName());
        } else {
            System.out.println("Студент " + students1.getFullName() + " и студент " + students2.getFullName()+ "Одинаково хорошит");
        }
    }
}
