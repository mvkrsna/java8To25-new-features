package basics.dto;

import java.util.List;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {

    public String name;
    public int gradeLevel;
    public double gpa;
    public String gender;
    public List<String> activities;

}
