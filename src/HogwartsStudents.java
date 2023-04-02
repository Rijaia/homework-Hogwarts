abstract public class HogwartsStudents {
    private String fullName;
    private int powerOfMagic;
    private int transgressionDistance;
    public HogwartsStudents(String fullName, int powerOfMagic, int transgressionDistance) {
        this.fullName = fullName;
        this.powerOfMagic = powerOfMagic;
        this.transgressionDistance = transgressionDistance;
    }
    public String getFullName() {
        return fullName;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    private int getAbilitiesSum() {
        return transgressionDistance + powerOfMagic;
    }

    public static void compare(HogwartsStudents students1, HogwartsStudents students2) {
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
