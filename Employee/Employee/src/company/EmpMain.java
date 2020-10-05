package company;


import java.util.Scanner;

public class EmpMain {

public static void main(String[] args) throws Exception

{
//  creating an object of class EmpJdbc
	
EmpJdbc empjdbc = new EmpJdbc();

//creating an object of class EmpPojo

EmpPojo e = new EmpPojo();

int ch=0;

// selecting the operation that needs to be done using switch statement

while(ch==0)

{

System.out.println("select the option");

System.out.println("1 -> Create an Employee");

System.out.println("2 -> Read Employee details");

System.out.println("3 -> Update Employee details");

System.out.println("4 -> Delete Employee");

//Scanner is used to fetch the inputs from the user

@SuppressWarnings("resource")
Scanner sc =new Scanner(System.in);

int option = sc.nextInt();

switch(option)

{

case 1 :{
	try {
		
//Using setters to set the values into the employees Pojo class

System.out.println("Enter Employee Name");

e.setEmployee_Name(sc.next());

System.out.println("Enter Employee Address");

e.setEmployee_Address(sc.next());

System.out.println("Enter Date of joining : (yyyy-mm-dd)");

e.setDate_of_Joining(sc.next());

System.out.println("Enter Experience");

e.setExperience(sc.nextInt());

System.out.println("Enter Date of Birth : (yyyy-mm-dd)");


e.setDate_of_Birth(sc.next());
	}
	catch(Exception e1) {
		System.out.println("Invalid inputs");
	}
int val = empjdbc.createEmp(e);

if(val==0)

System.out.println("Employee not Created");

else

System.out.println("Employee Created");

break;

}

case 2:{

System.out.println("Enter Emp_Id");

e.setEmployee_Id(sc.nextInt());

empjdbc.readEmp(e);

break;

}

case 3:{
	try {

System.out.println("Enter Emp_Id to update its details");

e.setEmployee_Id(sc.nextInt());

System.out.println("Enter Employee Name");

e.setEmployee_Name(sc.next());

System.out.println("Enter Employee Address");

e.setEmployee_Address(sc.next());

System.out.println("Enter Date of joining");

e.setDate_of_Joining(sc.next());

System.out.println("Enter Experience");

e.setExperience(sc.nextInt());

System.out.println("Enter Date of Birth");

e.setDate_of_Birth(sc.next());
	}catch(Exception e1) {
		System.out.println("Invalid inputs");
	}
	
int val = empjdbc.updateEmp(e);

if(val==0)

System.out.println("Employee details not Updated");

else

System.out.println("Employee details Updated");

break;

}

case 4:{

System.out.println("Enter Emp_Id to Delete employee");

e.setEmployee_Id(sc.nextInt());

int val = empjdbc.deleteEmp(e);

if(val==0)

System.out.println("Employee not Deleted");

else

System.out.println("Employee Deleted");

break;

}

}

System.out.println("Press 0 to continue");
ch = sc.nextInt();

}

}

}