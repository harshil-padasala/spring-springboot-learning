package spring.jdbc.query;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import spring.jdbc.entity.Student;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class QueryImpl implements Query {

    private JdbcTemplate jdbcTemplate;


    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insert(Student student) {

        //insert query
        String query = "insert into student(id, name, city) values(?, ?, ?) ";
        return jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
    }

    @Override
    public int change(Student student) {

        //Update query
        String query = "update student set name=?, city=? where id=?";
        return this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
    }

    @Override
    public int delete(int studentId) {

        // Delete query
        String query = "delete from student where id=?";
        return this.jdbcTemplate.update(query, studentId);
    }

    @Override
    public Student getStudent(int studentId) {
        // Selecting single student object data
        String query = "select * from student where id=?";
//        RowMapper<Student> rowMapper = new RowMapperImpl();
//        return this.jdbcTemplate.queryForObject(query, rowMapper, studentId);
        return (Student) this.jdbcTemplate.queryForObject(query, new RowMapper(){
            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                Student student = new Student();
                student.setId(rs.getInt(1));
                student.setName(rs.getString(2));
                student.setCity(rs.getString(3));
                return student;
            }
        }, studentId);
    }

    @Override
    public List<Student> getAllStudents() {
        // Selecting all students data
        String query ="select * from student";
        return jdbcTemplate.query(query, new RowMapperImpl());
    }
}