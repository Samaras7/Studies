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


    @Override
    public double average() {
        return grades.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .getAsDouble();
    }
}
