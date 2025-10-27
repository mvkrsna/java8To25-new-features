package basics.repository;

import basics.dto.Student;

import java.util.Arrays;
import java.util.List;

public class StudentDataRepository {
    public static List<Student> getAllStudents() {
        return Arrays.asList(
                new Student("Adam",1, 3.6, "male", Arrays.asList("swimming", "basketball", "volleyball") ),
                new Student("Jenny",2, 3.8, "female", Arrays.asList("swimming", "gymnastics", "soccer") ),
                new Student("Emily",3, 4.0, "female", Arrays.asList("swimming", "gymnastics", "aerobics") ),
                new Student("Dave",4, 3.9, "male", Arrays.asList("swimming", "basketball", "baseball", "football") ),
                new Student("Sophia",2, 3.5, "female", Arrays.asList("volleyball", "soccer") ),
                new Student("James",3, 3.2, "male", Arrays.asList("basketball", "baseball"))
        );

    }

}
