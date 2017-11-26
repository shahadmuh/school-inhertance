public class School{
private String name;
private int numOfEmployees;

private Employee[] Employees;
public School(String name, int sizee){
this.name=name;
Employees=new Employee[sizee];
numOfEmployees=0;}

public boolean addEmployee(Employee e){
if (numOfEmployees<=Employees.length){
Employees[numOfEmployees++]=e;
return true;}
return false;
}

public int getTeacher(String qual){
int count=0;
for (int i=0;i<numOfEmployees;i++)
if (Employees[i] instanceof Teacher)
if (Employees[i].getQual().equals(qual))
count++;
return count;}

public String toString(){
String s="";
for (int i=0;i<numOfEmployees;i++)
s+=Employees[i].toString();
String a="Name=" +name+ "\nNumber Of Embloyees: "+numOfEmployees;
return s+a;
}}