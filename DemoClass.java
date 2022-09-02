// Java Database connectivity
/*
 * Steps to connect with database
 * 1.import the package
 * 2.load and register the driver --> com.mysql.jdbc.Driver
 * 3.create the connection
 * 4.create the statement
 * 5.execute the query
 * 6.process the results
 * 7.close the connection
 */
import java.sql.*;
public class DemoClass {
  public static void main(String []args) throws Exception
  {
	  String url = "jdbc:mysql://localhost:3306/my_demo";
	  String username = "root";
	  String password = "MyNewPass";
	  String query = "select * from tb";
	  Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection(url,username,password);
Statement st = con.createStatement();
ResultSet rs = st.executeQuery(query);
while(rs.next()) {
	System.out.println("pid: "+rs.getInt("pid")+" name: "+rs.getString("name")+" age: "+rs.getInt("age")+" weight:"+rs.getInt("weight"));
}
st.close();
con.close();
  }
}
