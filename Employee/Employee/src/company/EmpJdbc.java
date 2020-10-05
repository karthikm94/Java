package company;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.PreparedStatement;

import java.sql.ResultSet;

import java.sql.Statement;

public class EmpJdbc

{

	static String url = "jdbc:mysql://localhost:3306/db";
	static String username = "root";
	static String password = "Watsapprock123#" ;

public int createEmp(EmpPojo e) throws Exception



{
	

//Establishes the connections with the SQL server

Connection con = null;

Statement stmt = null;
ResultSet rs=null;
try

{

Class.forName("com.mysql.jdbc.Driver");

con = DriverManager.getConnection(url,username,password);

stmt= con.createStatement();

}

catch (ClassNotFoundException ex)

{

ex.printStackTrace();

}
//For inserting the data into table
String sql="insert into employee"
		+ "(Employee_Name, Employee_Address, Date_of_Joining, Experience, Date_of_Birth) values" + "(?,?,?,?,?)";
PreparedStatement pt = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
pt.setString(1,e.getEmployee_Name());

pt.setString(2,e.getEmployee_Address());

pt.setString(3,e.getDate_of_Joining());

pt.setInt(4,e.getExperience());

pt.setString(5,e.getDate_of_Birth());

int r = pt.executeUpdate();

//Result set is used to fetch the data from the Data base

rs = pt.getGeneratedKeys();


if (rs != null && rs.next()) {
	System.out.println("Your Generated Employee ID is " + rs.getInt(1));
	System.out.println();
}

//	To close the statements and connections

stmt.close();

con.close();

return r;

}

//To display the user's data based on the Employee ID

void readEmp(EmpPojo x) throws Exception

{

Connection con = null;

Statement stmt = null;

try

{

// Used to load the Driver exception
	
Class.forName("com.mysql.jdbc.Driver");

con = DriverManager.getConnection(url,username,password);

stmt= con.createStatement();

}

// catching the exception if class is not found

catch (ClassNotFoundException e)

{

e.printStackTrace();

}

//selecting the employee ID from the query

ResultSet rs= stmt.executeQuery("select * from employee where Employee_Id="+ x.getEmployee_Id());

if(rs.first())

{

rs= stmt.executeQuery("select * from employee where Employee_Id="+x.getEmployee_Id());

while(rs.next()) {

//to display the value

System.out.println("Employee_Id : "+rs.getInt("Employee_Id")+

"\nEmployee_Name : "+rs.getString("Employee_Name")+

"\nEmployee_Address : "+rs.getString("Employee_Address")+

"\nDate_of_Joining : "+rs.getString("Date_of_Joining")+

"\nExperience : "+rs.getInt("Experience")+

"\nDate_of_Birth : "+rs.getString("Date_of_Birth")

);

}

}

else

{

System.out.println("Employee with given Id not found");

}

stmt.close();

con.close();

}

//To update the employees details based on employee ID 

int updateEmp(EmpPojo x) throws Exception

{

Connection con = null;

Statement stmt = null;

try

{

Class.forName("com.mysql.jdbc.Driver");

con = DriverManager.getConnection(url,username,password);

stmt= con.createStatement();

}

catch (ClassNotFoundException e)

{

e.printStackTrace();

}

PreparedStatement pt = con.prepareStatement(" update employee SET Employee_Name = ?, Employee_Address = ?, Date_of_Joining=?, Experience =?,Date_of_Birth=?\r\n" + " where Employee_Id = ?");

pt.setInt(6, x.getEmployee_Id());

pt.setString(1,x.getEmployee_Name());

pt.setString(2,x.getEmployee_Address());

pt.setString(3,x.getDate_of_Joining());

pt.setInt(4,x.getExperience());

pt.setString(5,x.getDate_of_Birth());

int r = pt.executeUpdate();

stmt.close();

con.close();

return r;

}

int deleteEmp(EmpPojo x) throws Exception

{

Connection con = null;

Statement stmt = null;

try

{

Class.forName("com.mysql.jdbc.Driver");

con = DriverManager.getConnection(url,username,password);

stmt= con.createStatement();

}

catch (ClassNotFoundException e)

{

e.printStackTrace();

}

PreparedStatement pt = con.prepareStatement("delete from employee where Employee_Id = ?");

pt.setInt(1, x.getEmployee_Id());

int r = pt.executeUpdate();

stmt.close();

//to close the connections

con.close();

return r;

}

}
