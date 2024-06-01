package com.students.database;
import com.students.database.models.Student;
import java.sql.*;
public class DatabaseManager {
    private Connection connexio;
    public void connect() {
        try {
            connexio = DriverManager.getConnection("jdbc:postgresql://192.168.1.72:5432/biblioteca", "postgres", "olakase");
            System.out.println("OK");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void addStudent(Student student) {
        String query = "INSERT INTO Estudiant (id, nom, cognom) VALUES (?, ?, ?)";
        try {
            PreparedStatement stmt = connexio.prepareStatement(query);
            stmt.setInt(1, student.getId());
            stmt.setString(2, student.getFirstName());
            stmt.setString(3, student.getLastName());
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public Student getStudent(int id) {
        String query = "SELECT * FROM Estudiant WHERE id = ?";
        try {
            PreparedStatement stmt = connexio.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                int studentId = rs.getInt("id");
                String firstName = rs.getString("nom");
                String lastName = rs.getString("cognom");
                return new Student(studentId, firstName, lastName);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public void updateStudent(Student student) {
        String query = "UPDATE Estudiant SET nom = ?, cognom = ? WHERE id = ?";
        try {
            PreparedStatement stmt = connexio.prepareStatement(query);
            stmt.setString(1, student.getFirstName());
            stmt.setString(2, student.getLastName());
            stmt.setInt(3, student.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void deleteStudent(int id) {
        String query = "DELETE FROM Estudiant WHERE id = ?";
        try {
            PreparedStatement stmt = connexio.prepareStatement(query);
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void disconnect() {
        try {
            if (connexio != null) {
                connexio.close();
                System.out.println("OUT");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
