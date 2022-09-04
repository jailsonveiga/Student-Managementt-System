package school_management_system;

/**
 * This class is responsable for keeping the track of teacher's name, id, salary
 */
public class Teacher {
    private int id;
    private String name;
    private int salary;

    /**
     * Create a new teacher object
     * @param id id for the teacher
     * @param name name of the teacher
     * @param salary salary of the teacher
     */
    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}
