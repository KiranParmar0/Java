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
    BufferedReader br = null;
    BufferedReader brK = null;
    PrintStream ps = null;

    public MarvellousFrame(String name) throws Exception
    {
       System.out.println("Server Application is Running....");
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



       ServerSocket ss= new ServerSocket(1100);
       Socket s= ss.accept();
       System.out.println("Connection Successful");

     BufferedReader  br = new BufferedReader(new InputStreamReader(s.getInputStream()));
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
           BufferedReader brk= new BufferedReader(new InputStreamReader(System.in));
           while((s1=br.readLine())!=null)
          {
                System.out.println("Client says:"+s1);
                System.out.println("Enter message for client:");
                s2=brk.readLine();
                ps.println(s2);
          }
        }
        catch(Exception IOException )
        {}

    }
 }

class Server
{
    public static void main(String arr[]) throws Exception
    {
        System.out.println("print the data on Console");
        MarvellousFrame mobj=new MarvellousFrame("Hotel");
    }
}