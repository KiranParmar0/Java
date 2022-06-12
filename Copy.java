class Employee implements Cloneable
{
    public int EID;
    public int ESalary;
    public String Ename;

    public Employee(int id,String str,int no)
    {
        this.EID=id;
        this.Ename=str;
        this.ESalary=no;
    }
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
class Copy
{
    public static void main(String arr[]) throws CloneNotSupportedException
    {
        Employee eobj=new Employee(11,"Kiran",21000);
        System.out.println("EID: "+eobj.EID+ "Name: "+eobj.Ename+"Salary: "+eobj.ESalary);

        Employee eobjx=(Employee)eobj.clone();
        System.out.println("EID: " +eobjx.EID+ "Name: "+eobjx.Ename+ "Salary: "+eobjx.ESalary);

        eobj.Ename="Shubham";
        System.out.println("EID: "+eobjx.EID+ "Name: "+eobjx.Ename+"Salary: "+eobjx.ESalary);
    }
}
