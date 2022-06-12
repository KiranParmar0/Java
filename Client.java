import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;

class MarvellousFrame extends WindowAdapter  implements ActionListener
{
    public Frame fobj;
    public Button bobj;
    public TextField tobj;

    String s1 = null, s2 = null;
    Socket s = null;
    BufferedReader br = null, brK = null;
    PrintStream ps = null;

    public MarvellousFrame(String name) throws Exception
    {
       System.out.println("Client application is running...");
       fobj=new Frame(name);
       bobj=new Button("Send");
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
        s = new Socket("localhost",1100);


       brK = new BufferedReader(new InputStreamReader(System.in));
       br = new BufferedReader(new InputStreamReader(s.getInputStream()));
       ps = new PrintStream(s.getOutputStream());
    }
    public void  windowClosing(WindowEvent obj)
    {
        System.exit(0);
    }
    public void actionPerformed(ActionEvent obj)
    {
        try
        {
        while(!(s1 = brK.readLine()).equals("gn"))
           {
               ps.println(s1);
               s2 = br.readLine();
               System.out.println("Server says : "+s2);
              System.out.println("Enter message for server : ");
          }
        }
        catch(Exception IOException )
        {}
    }
}
class Client
{
    public static void main(String arr[]) throws Exception
    {
        System.out.println("print the data on Console");
        MarvellousFrame mobj=new MarvellousFrame("My self");

    }
}