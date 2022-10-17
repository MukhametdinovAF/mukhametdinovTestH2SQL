package ru.mukhametdinov.mukhametdinovtesth2sql.dao;

import org.springframework.stereotype.Repository;
import ru.mukhametdinov.mukhametdinovtesth2sql.entity.Student;

import java.util.List;
@Repository
public interface StudentDAO {
    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudent(int id);

    void deleteStudent(int id);
}
