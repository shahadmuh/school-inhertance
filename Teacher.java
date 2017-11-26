public class Teacher extends Employee{
private String major;
public Teacher(int Empid, String name,double salary, String qualification, String major){
super(Empid,name,salary,qualification);
this.major=major;}

public String toString(){
return  "Empid: "+Empid+"\nName: "+name+"\nSalary: "+salary+"\nQualification: "+qualification+"\nMajor: "+major;}}