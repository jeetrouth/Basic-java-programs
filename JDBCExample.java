// JDBCExample.java
import java.sql.*;

public class JDBCExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";  //  DB name
        String user = "root";                               //  username
        String pass = "1234";                               //  password

        try {
            // Load JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to database
            Connection con = DriverManager.getConnection(url, user, pass);
            System.out.println("✅ Connected to Database");

            // Insert data
            String insert = "INSERT INTO student (id, name) VALUES (?, ?)";
            PreparedStatement ps = con.prepareStatement(insert);
            ps.setInt(1, 1);
            ps.setString(2, "Sayanti");
            ps.executeUpdate();
            System.out.println("✅ Data inserted successfully");

            // Read data
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM student");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " - " + rs.getString("name"));
            }

            // Close connection
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
