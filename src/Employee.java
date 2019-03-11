/**
 * Created by expert on 3/11/19.
 */
public class Employee {

    String empid;
    String name;
    double basic;
    double hra;

    Employee(String e,String n)
    {
        empid=e;
        name=n;
    }
    Employee(String empid,String name,double basic,double hra) //local variables
    {
        this.empid=empid; // this used because names are same
        this.name=name;  // if words on LHS(properties) different from RHS and arg being passed into constructor, 'this' not needed
        this.basic=basic; //check e3 to understand above lines
        this.hra=hra;
    }
    Employee(String empid,String name,double basic)
    {
        this(empid,name,basic,1000);
    }
    void display()
    {
        System.out.println("id="+empid);
        System.out.println("Name="+name);
        System.out.println("basic="+basic);
        System.out.println("hra="+hra);

    }
}
