import java.lang.*
class Demo extends Thread
{
    public void run()
    {
        System.out.println("Inside thread:"+Thread.currentThread().getName());
        for(int i=0;i<=1000;i++)
        {
            System.out.println("Thread:"+i);
            try
            {
                Thread.sleep(1000)
            }
            catch(Exception obj)
            {}
        }
    }
}
class mytherd5
{
    publilc static void main(String a[]) throws Exception
    {
        Demo obj1= new Demo();
        Thread t1=new Thread(obj1);
        Demo obj2= new Demo();
        Thread t2=new Thread(obj2);
        t1.start();
        t1.join();
        t2.start();
    }
}