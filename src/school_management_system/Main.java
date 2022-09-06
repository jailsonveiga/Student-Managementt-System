package school_management_system;

public class Main {
    public static void main(String[] args) {

        // Create new Object instance of teachers
        Teacher lizzy = new Teacher(1, "Lizzy", 500);
        Teacher mellisa = new Teacher(2, "Mellisa", 700);
        Teacher vanderhorn = new Teacher(3, "Vanderhorn", 600);

        // Create new Object instance of Students
        Student tamasha = new Student(1, "Tamasha", 4);
        Student rakshith = new Student(2, "Rakshith", 12);
        Student rabbi = new Student(3, "Rabbi", 5);
    }
}
