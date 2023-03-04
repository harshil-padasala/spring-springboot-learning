package spring.jdbc.query;

import spring.jdbc.entity.Student;

import java.util.List;

public interface Query {
    public int insert(Student student);

    public int change(Student student);

    public int delete(int studentId);

    public Student getStudent(int studentId);

    public List<Student> getAllStudents();
}
