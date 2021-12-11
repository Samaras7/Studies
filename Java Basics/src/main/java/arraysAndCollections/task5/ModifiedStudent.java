package arraysAndCollections.task5;

import utils.Student;

import java.util.ArrayList;
import java.util.List;

public class ModifiedStudent extends Student {

    protected List<Integer> grades;

    public ModifiedStudent(String surname) {
        super(surname);
        grades = new ArrayList<>();
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    @Override
    public double average() {
        return grades.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .getAsDouble();
    }
}
