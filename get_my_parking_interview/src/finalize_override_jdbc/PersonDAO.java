package finalize_override_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.format.DateTimeFormatter;


public class PersonDAO {
	
	private Connection con;
  //  private final Path SQLITE_FILE = Paths.get(System.getProperty("user.home"), "finalize.sqlite3");

	private final String SQLITE_URL = "jdbc:mysql://localhost:3306/DATA";

	//jdbc:mysql://192.100.0.000:3306/DBname", "root", "root"
    public PersonDAO() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver"); 
        con =  DriverManager.getConnection(SQLITE_URL, "root", "Sujit@1234");
        System.out.println("getConnection!!!!!!!!");
        String sql = "CREATE TABLE IF NOT EXISTS people ("
                + "id integer PRIMARY KEY,"
                + "first_name text,"
                + "last_name text,"
                + "dob text);";
        Statement stmt = con.createStatement();
       ResultSet myResultSet=stmt.executeQuery("Select * from MAJORS");
       
       while(myResultSet.next()) {
    	   
    	   int x = myResultSet.getInt("MAJOR_ID");    
    	 
    	   
    	   String y = myResultSet.getString("MAJOR_NAME");
    	   
    	   System.out.println(x + " | "+y );  
       }
    }
    
    void create(Person person) throws SQLException {
        String sql = "INSERT INTO people (first_name, last_name, dob) VALUES (?, ?, ?)";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, person.getFirstName());
        stmt.setString(2, person.getLastName());
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        stmt.setString(3, person.getDob().format(fmt));
        stmt.executeUpdate();
    }
    
    @Override
    public void finalize() {
        try {
            con.close();
        } catch(SQLException e) {
            System.out.println("Uh, oh ... could not close db connection");
        }
    }
}
