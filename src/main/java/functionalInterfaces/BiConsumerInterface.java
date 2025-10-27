package functionalInterfaces;

import basics.dto.Student;
import basics.repository.StudentDataRepository;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerInterface {

    public static void printStudentInformation() {

        BiConsumer<String, List<String>> studentInfoBiConsumer = (name, activities) -> {
            System.out.println("Student Name: [" + name + "], student activities: [" + activities + "]");
        };
        // Implementation goes here
        List<Student> studentList = StudentDataRepository.getAllStudents();
        studentList.forEach((student -> {
            studentInfoBiConsumer.accept(student.getName(), student.getActivities());
        }));
    }

    public static void main(String[] args) {
        printStudentInformation();
    }
}
