public class TestSchool{
public static void main (String[] args){
School sc=new School("Fourth",3);
Teacher teach=new Teacher(11,"Sarah",9000,"Bachelor","English");
Teacher teach1=new Teacher(22,"Hind",11500,"Master","Math");
Teacher teach2=new Teacher(33,"Nora",8000,"Bachelor","Physics");
Employee e=teach;
Employee e1=teach1;
Employee e2=teach2;
boolean a=sc.addEmployee(e);
boolean a1=sc.addEmployee(e1);
boolean a2=sc.addEmployee(e2);

if (a&&a1&&a2)
System.out.println(sc);
String s="Master";

int master=sc.getTeacher(s);
System.out.println(master);
}}

