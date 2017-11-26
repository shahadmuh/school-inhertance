public class Employee{
protected int Empid;
protected String name;
protected double salary;
protected String qualification;
public Employee(int Empid,String name, double salary, String qualification){
this.Empid=Empid;
this.name=name;
this.salary=salary;
this.qualification=qualification;}

public void setQual(String q){
qualification=q;}

public String getQual(){
return qualification;}

public String toString(){
return "Empid: "+Empid+"\nName: "+name+"\nSalary: "+salary+"\nQualification: "+qualification;}}