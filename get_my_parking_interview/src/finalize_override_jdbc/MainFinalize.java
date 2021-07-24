package finalize_override_jdbc;

import java.sql.SQLException;
import java.time.LocalDate;

public class MainFinalize {
	public static void main(String[] args) throws Exception {
        try {
            PersonDAO dao = new PersonDAO();
            Person me = new Person("Adam", "McQuistan", LocalDate.parse("1987-09-23"));
            dao.create(me);
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }

}
