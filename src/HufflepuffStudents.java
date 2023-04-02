public class HufflepuffStudents extends HogwartsStudents {
    private int hardworking;
    private int loyalty;
    private int honesty;

    public HufflepuffStudents(String fullName, int powerOfMagic, int transgressionDistance, int hardworking, int loyalty, int honesty) {
        super(fullName, powerOfMagic, transgressionDistance);
        this.hardworking = hardworking;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    @Override
    public String toString() {
        return getFullName() + " HufflepuffStudents{" +
                "hardworking=" + hardworking +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                ", fullName='" + getFullName() + '\'' +
                ", powerOfMagic=" + getPowerOfMagic() +
                ", transgressionDistance=" + getTransgressionDistance() +
                '}';
    }
    private int getAbilitiesSum() {
        return hardworking + loyalty + honesty;
    }

    public static void compare(HufflepuffStudents students1, HufflepuffStudents students2) {
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
