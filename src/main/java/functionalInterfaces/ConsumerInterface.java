package functionalInterfaces;

import basics.dto.Student;
import basics.repository.StudentDataRepository;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface {

    static Consumer<Student> studentNameConsumer = (student) -> { System.out.println(student.getName()); };
    static Consumer<Student> studentActivityConsumer = (student) -> { System.out.println("Student Enrolled in Activities: "+ student.getActivities()); };


    public static void printStudentInformation() {
        List<Student> students = StudentDataRepository.getAllStudents();
//        for (Student student : students) {
//            System.out.println("Student Information: " + student);
//        }

        Consumer<Student> consumer = new Consumer<Student>() {
            @Override
            public void accept(Student student) {
                System.out.println(student);
            }
        };

        Consumer<Student> studentConsumer = (student) -> { System.out.println(student); };
        Consumer<Student> studentConsumerMethodReference = System.out::println;
        System.out.println("------------------Using Lambda Expression------------------");
        students.forEach(studentConsumer);
        System.out.println("------------------Using Method Reference------------------");
        students.forEach(studentConsumerMethodReference);
    }

    public static void printStudentInformationUsingCondition() {
        List<Student> students = StudentDataRepository.getAllStudents();
        System.out.println("------------------Students with GPA >= 3.5------------------");
        students.forEach( (student) -> {
            if(student.getGpa() >= 3.5) {
                studentNameConsumer.andThen(studentActivityConsumer).accept(student);
            }
        });
    }

    public static void main(String[] args) {
        printStudentInformation();
        printStudentInformationUsingCondition();
    }
}
