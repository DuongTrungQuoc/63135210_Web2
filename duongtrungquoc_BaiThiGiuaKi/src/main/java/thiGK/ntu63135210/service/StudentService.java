package thiGK.ntu63135210.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import thiGK.ntu63135210.models.Student;

@Service
public class StudentService {

    
    private final List<Student> students = new ArrayList<>();

   
    public StudentService() {
        students.add(new Student(1, "Nguyen Van A", "K61A", "CNTT", "NTU"));
        students.add(new Student(2, "Tran Thi B", "K62B", "Kinh Te", "NTU"));
        students.add(new Student(3, "Le Van C", "K63C", "Ngoai Thuong", "NTU"));
    }

    public List<Student> getAllStudents() {
        return students;
    }

    public Student findByCode(int code) {
        for (Student student : students) {
            if (student.getCode() == code) {
                return student;
            }
        }
        return null;
    }

    public void addStudent(Student student) {
        students.add(student);
    }
}