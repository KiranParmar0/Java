import java.lang.*;
import java.awt.*;
import java.awt.event.*;

class MarvellousFrame extends WindowAdapter  implements ActionListener
{
    public Frame fobj;
    public Button bobj;
    public TextField tobj;


    public MarvellousFrame(String name)
    {
       fobj=new Frame(name);
       bobj=new Button("Kiran");
       tobj=new TextField();
                   //  x   y  w  h
        tobj.setBounds(60,60,170,20);
        bobj.setBounds(300,190,90,20);

        fobj.add(bobj);
        fobj.add(tobj);

        fobj.setSize(600,600);
        fobj.setVisible(true);
        fobj.setLayout(null);

        bobj.addActionListener(this);
        fobj.addWindowListener(this);
    }
    public void  windowClosing(WindowEvent obj)
    {
        System.exit(0);
    }
    public void actionPerformed(ActionEvent obj)
    {
        tobj.setText("Jay Ganesh.......");
    }
}
class FrameDemo5
{
    public static void main(String arr[])
    {
        System.out.println("print the data on Console");
        MarvellousFrame mobj=new MarvellousFrame("PPA");
    }
}