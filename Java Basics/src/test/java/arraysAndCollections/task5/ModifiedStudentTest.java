package arraysAndCollections.task5;

import arraysAndCollections.task5.utils.FillGrades;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ModifiedStudentTest {

    protected static ModifiedStudent student;
    protected static List<Integer> gradesList = Arrays.asList(5, 5, 4, 2, 4, 1, 1, 2);

    @BeforeAll
    static void initialize() {
        student = new ModifiedStudent("Kowalski");

        FillGrades fillGrades = grades -> grades.forEach(student::addGrade);
        fillGrades.fill(gradesList);
    }

    @Test
    void checkAvarage() {
        assertEquals(3.0, student.average());
    }


}