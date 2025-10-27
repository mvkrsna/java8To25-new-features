package functionalInterfaces;

import basics.dto.Student;
import basics.repository.StudentDataRepository;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface {

    public static void printStudentInformation() {
        List<Student> students = StudentDataRepository.getAllStudents();
//        for (Student student : students) {
//            System.out.println("Student Information: " + student);
//        }
        Consumer<Student> studentConsumer = (student) -> { System.out.println(student); };
        Consumer<Student> studentConsumerMethodReference = System.out::println;
        System.out.println("------------------Using Lambda Expression------------------");
        students.forEach(studentConsumer);
        System.out.println("------------------Using Method Reference------------------");
        students.forEach(studentConsumerMethodReference);

    }

    public static void main(String[] args) {
        printStudentInformation();
    }
}
