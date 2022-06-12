import java.lang.*;

abstract class RBI
{
    public int Balance;
    public RBI() //constructor
    {
        System.out.println("Inside the constructor");
        this.Balance = 0;
    }
    public void Credit(int Amount)  //concrete
    {
        System.out.println("Inside the Credit");
        this.Balance = this.Balance + Amount;
    }
    public void Debit(int Amount)   //concrete
    {
        System.out.println("Inside the Debit");
        this.Balance = this.Balance - Amount;
    }
    public abstract int CalculateInterest(); //abstract
}
class SBI extends RBI
{
    public int AcountNumber;
    public int IFSC;
    public int CalculateInterest()   //abstract
    {
        System.out.println("Inside the CalculateInterest of SBI");
        return 6;
    }
}

class PNB extends RBI
{
    public int AcountNumber;
    public int IFSC;
    public int CalculateInterest()  //abstract
    {
        System.out.println("Inside the CalculateInterest of PNB");
        return 7;
    }
}
class Abstract
{
    public static void main(String arr[])
    {
        System.out.println("Inside the Abstract");
        PNB pobj = new PNB();
        SBI sobj = new SBI();

        pobj.Credit(1000);
        pobj.Debit(200);
        System.out.println(pobj.Balance); //800
    }
}