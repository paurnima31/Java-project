import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
 class Demo extends Frame implements ActionListener
{
  Connection cn;
   PreparedStatement pst;
   ResultSet rs;
    TextField t1;
   Button b1;
   Demo()
   {
      setVisible(true);
     setSize(500,500); 
    setLayout(new FlowLayout());  
  t1=new TextField(20);
   b1=new Button("Ok");
  add(t1);
  add(b1);
  b1.addActionListener(this);    
try
 {
   Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
   cn=DriverManager.getConnection("Jdbc:Odbc:Demo");
   
 }
catch(Exception e)
{
JOptionPane.showMessageDialog(null,"Error ="+e);
 } 
    
  }

    public static void main(String arg[])
  {
     new Demo();
   } 
  
  public void actionPerformed(ActionEvent ae)
  {

  if(ae.getSource()==b1)
   {
   try
{
    pst=cn.prepareStatement("update demo set id=? where id=?");
    int no=20;
    int id=Integer.parseInt(t1.getText());   
   pst.setInt(1,no);  
    pst.setInt(2,id);  

 pst.executeUpdate();
   JOptionPane.showMessageDialog(null,"Record Updated.. ");
}
catch(Exception e)
 {
JOptionPane.showMessageDialog(null,"Error ="+e);

}   
  }
}
 }