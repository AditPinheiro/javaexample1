/**
 * Created by expert on 3/11/19.
 */
public class TestEmp {

    public static void main(String[] args)
    {

        Employee e1=new Employee();
        Employee e2=new Employee("A102", "Abdul", 6000,4000);
        Employee e3=new Employee("A103", "Aarathi");
        Employee e4=new Employee();
        Employee e5=new Employee();

        e1.empid="A101";
        e1.name="Adit";
        e1.basic=1000;
        e1.hra=5000;

        e1.display();
        System.out.println("----------------");
        e2.display();
        System.out.println("----------------");
        e3.display();
        System.out.println("----------------");
        e4.display();

    }


}
