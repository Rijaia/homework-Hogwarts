public class RavenclawStudents extends HogwartsStudents{
    private int wise;
    private int witty;
    private int creativity;

    public RavenclawStudents(String fullName, int powerOfMagic, int transgressionDistance, int wise, int witty, int creativity) {
        super(fullName, powerOfMagic, transgressionDistance);
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreativity() {
        return creativity;
    }

    @Override
    public String toString() {
        return getFullName() + " RavenclawStudents{" +
                "wise=" + wise +
                ", witty=" + witty +
                ", creativity=" + creativity +
                ", fullName='" + getFullName() + '\'' +
                ", powerOfMagic=" + getPowerOfMagic() +
                ", transgressionDistance=" + getTransgressionDistance() +
                '}';
    }

    private int getAbilitiesSum() {
        return wise + witty + creativity;
    }

    public static void compare(RavenclawStudents students1, RavenclawStudents students2) {
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
