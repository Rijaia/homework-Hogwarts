public class SlytherinStudents extends HogwartsStudents {
    private int cunning;
    private int determination;
    private int ambition;
    private int inventiveness;
    private int lustForPower;

    public SlytherinStudents(String fullName, int powerOfMagic, int transgressionDistance, int cunning, int determination, int ambition, int inventiveness, int lustForPower) {
        super(fullName, powerOfMagic, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.inventiveness = inventiveness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getInventiveness() {
        return inventiveness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    @Override
    public String toString() {
        return getFullName() + " SlytherinStudents{" +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", inventiveness=" + inventiveness +
                ", lustForPower=" + lustForPower +
                ", fullName='" + getFullName() + '\'' +
                ", powerOfMagic=" + getPowerOfMagic() +
                ", transgressionDistance=" + getTransgressionDistance() +
                '}';
    }

    private int getAbilitiesSum() {
        return cunning + determination + ambition + inventiveness + lustForPower;
    }

    public static void compare(SlytherinStudents students1, SlytherinStudents students2) {
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
