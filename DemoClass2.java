// Java Database connectivity
// this is the insert operation in JDBC
import java.sql.*;
public class DemoClass2 {
  public static void main(String []args) throws Exception 
  {
	  String url = "jdbc:mysql://localhost:3306/my_demo";
	  String username = "root";
	  String password = "MyNewPass";
	  // here we must only use single quotes and not double quotes
	  String query = "insert into tb values(6,'Shane',45,94)";
	  Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection(url,username,password);
Statement st = con.createStatement();
// here the ResultSet returns the number of affected rows so we store it in a count variable
int count = st.executeUpdate(query);
System.out.println(count+" row affected");
st.close();
con.close();
  }
}
