import java.sql.*;

public class ExecuteQuery01 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//1. Step: Registration to the driver
        Class.forName("org.postgresql.Driver");
        //2. Step: Create connection with database
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","Kangal1905!@");
        //3. Step: Create statement
        Statement st = con.createStatement();

        //1.Example: Select the country names whose region id's are 1

String sqi1 = "SELECT country_name FROM countries WHERE region_id= 1; ";
boolean result1 = st.execute(sqi1);
        System.out.println("result1:" + result1);
       ResultSet resultSet1 =  st.executeQuery(sqi1);
    while(resultSet1.next()){

        System.out.println(resultSet1.getString("country_name"));
//2.Example: Select the country_id and country_name whose region_id's are greater than 2

    }
    }
}
