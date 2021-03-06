package company;

//EmpPojo is used to set and get the values  using setter and getter - to enable code reusablitiy

public class EmpPojo {
int Employee_Id, Experience;
String Employee_Name, Employee_Address, Date_of_Joining, Date_of_Birth ;
public int getEmployee_Id() {
return Employee_Id;
}

public EmpPojo( String employee_Name, String employee_Address, String date_of_Joining,int experience,String date_of_Birth) {
super();
Experience = experience;
Employee_Name = employee_Name;
Employee_Address = employee_Address;
Date_of_Joining = date_of_Joining;
Date_of_Birth = date_of_Birth;
}

public EmpPojo() {
super();
}

// setter method for Employee ID

public void setEmployee_Id(int employee_Id) {
Employee_Id = employee_Id;
}

//getter method for experience

public int getExperience() {
return Experience;
}

//setter method for experience

public void setExperience(int experience) {
Experience = experience;
}

//setter method for Employee

public String getEmployee_Name() {
return Employee_Name;
}

//setter method for Employee Name

public void setEmployee_Name(String employee_Name) {
Employee_Name = employee_Name;
}

public String getEmployee_Address() {
return Employee_Address;
}

//setter method for address

public void setEmployee_Address(String employee_Address) {
Employee_Address = employee_Address;
}

//getter method for date of joining

public String getDate_of_Joining() {
return Date_of_Joining;
}

//setter method for date of joinining

public void setDate_of_Joining(String date_of_Joining) {
Date_of_Joining = date_of_Joining;
}

// get method for DOB

public String getDate_of_Birth() {
return Date_of_Birth;
}

// Setter method for DOB

public void setDate_of_Birth(String date_of_Birth) {
Date_of_Birth = date_of_Birth;
}
}