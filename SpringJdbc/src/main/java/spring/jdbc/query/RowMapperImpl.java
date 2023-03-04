package spring.jdbc.query;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import spring.jdbc.entity.Student;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class RowMapperImpl implements RowMapper<Student> {
    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {

        Student student = new Student();
        student.setId(rs.getInt(1));
        student.setName(rs.getString(2));
        student.setCity(rs.getString(3));
        return student;
    }
}
