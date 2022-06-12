import java.lang.*;
class Demo
{
    public String name;
    public int Salary;
    public Demo(String std, int no)
    {
        this.name=std;
        this.Salary=no;
    }
    public String toString()
    {
        return "Employe name is "+name+" having Salary "+Salary;
    }
}
class Cl
{
    public static void main(String a[])
    {
        Demo eobj=new Demo("Kiran",11000);
        System.out.println(eobj.toString());
    }
}