// Java Database connectivity
// this is the insert operation using PreparedStatement
import java.sql.*;
public class DemoClass3 {
  public static void main(String []args) throws Exception 
  {
	  String url = "jdbc:mysql://localhost:3306/my_demo";
	  String username = "root";
	  String password = "MyNewPass";
      int pid = 8;
      String name = "Ford";
      int age = 34;
      int weight = 54;
      
// when we have this kind of predefined query we use a PREPAREDSTATEMENT
      
//String query = "insert into tb values("+pid+",'"+name+"',"+age+","+weight+")";
      
//instead of values here we will just write ? marks
      
String query = "insert into tb values(?,?,?,?)";      
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection(url,username,password);
// this is PreparedStatement
PreparedStatement st = con.prepareStatement(query);
st.setInt(1,pid);
st.setString(2,name);
st.setInt(3,age);
st.setInt(4,weight);


// here the ResultSet returns the number of affected rows so we store it in a count variable
// we do not need to write query inside the executeUpdate as we have already defined it in the prepareStatement(query)
int count = st.executeUpdate();
System.out.println(count+" row affected");
st.close();
con.close();
  }
}
