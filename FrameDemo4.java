import java.lang.*;
import java.awt.*;
import java.awt.event.*;

class MarvellousFrame
{
    public Frame fobj;

    public MarvellousFrame(String name)
    {
       fobj=new Frame(name);
        fobj.setSize(600,600);
        fobj.setVisible(true);

        fobj.addWindowListener(new MarvellousListener());
        //fobj.addActionListener(new MarvellousListener());
    }
}
class MarvellousListener extends WindowAdapter //implements WindowListener
{

    public void  windowClosing(WindowEvent obj)
    {
        System.exit(0);
   }

}
class FrameDemo4
{
    public static void main(String arr[])
    {
        System.out.println("print the data on Console");
        MarvellousFrame mobj=new MarvellousFrame("PPA");

    }
}