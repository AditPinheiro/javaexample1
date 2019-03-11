/**
 * Created by expert on 3/11/19.
 */
public class Math {

    int a;   // these arent static and hence are properties of class Math
    int b;   // properties of every
    int c=30;
    static int max_mark=100;  //common to all students(objects) of Math. Not a property of class Math
    int sum()
    {
        return a+b;
    }
    int diff()
    {
        if(a>b)
            return a-b;
        else
            return b-a;
    }

    public static void main(String[] args) {

        Math m1=new Math(); //Creates an object m1 that can access variables a and b
        m1.a=10;
        m1.b=20;
        System.out.println("Sum of student1:"+m1.sum());
        System.out.println("Difference of student1:"+m1.diff());
        System.out.println("Maximum mark:"+max_mark);

    }

}
