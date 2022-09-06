package school_management_system;

import java.util.List;

/**
 * Many teachers, many students
 * Implements teachers and student
 * using an array list
*
 */

public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private int totalMoneyEarned;
    private int totalMoneySpent;

    /**
     * New object is created
     * @param teachers list of teachers in the school
     * @param students list of students in the school
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }
}
