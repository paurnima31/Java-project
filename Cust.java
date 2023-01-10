import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Cust extends   JFrame implements ActionListener 
 {
        ImageIcon icon=new ImageIcon("a.jpg");
       JLabel ll=new JLabel(icon);
        Connection cn;
      PreparedStatement pst;
      ResultSet rs;
     
       //ImageIcon icon=new ImageIcon("a.jpg");
       //JLabel ll=new JLabel(icon);
         JButton b1;
        JButton b2;
        JButton b3;
        JButton b4;
        JButton b5;
        JButton b6;
        JLabel jLabel2;
        JLabel l1;
        JLabel l2;
        JLabel l3;
        JLabel l4;
        JLabel l5;
        JLabel l6;
        JTextField t1;
        JTextField t2;
        JTextField t3;
        JTextField t4;
        TextArea ta1;


   public Cust()
 {
    setVisible(true); 
setSize(450,600);
    add(ll);
    setLocation(300,100);
        l1 = new   JLabel();
        jLabel2 = new   JLabel();
        l4 = new   JLabel();
        l2 = new   JLabel();
        l3 = new   JLabel();
        l5 = new   JLabel();
        l6 = new   JLabel();
        t1 = new   JTextField();
        t2 = new   JTextField();
        ta1 = new   TextArea();
        t3 = new   JTextField();
        t4 = new   JTextField();
        b3 = new   JButton();
        b1 = new   JButton();
        b2 = new   JButton();
        b6 = new   JButton();
        b4 = new   JButton();
        b5 = new   JButton();

        setDefaultCloseOperation(  WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        l1.setFont(new java.awt.Font("Comic Sans MS", 0, 26)); // NOI18N
        l1.setForeground(new java.awt.Color(255, 0, 0));
        l1.setText("Customer Details");
        getContentPane().add(l1);
        l1.setBounds(100, 50, 230, 40);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(140, 70, 120, 0);

        l4.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        l4.setForeground(new java.awt.Color(0, 0, 255));
        l4.setText("Address");
        getContentPane().add(l4);
        l4.setBounds(60, 230, 110, 26);

        l2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        l2.setForeground(new java.awt.Color(0, 0, 255));
        l2.setText("Customer ID");
        getContentPane().add(l2);
        l2.setBounds(60, 140, 110, 26);

        l3.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        l3.setForeground(new java.awt.Color(0, 0, 255));
        l3.setText("Name");
        getContentPane().add(l3);
        l3.setBounds(60, 180, 110, 26);

        l5.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        l5.setForeground(new java.awt.Color(0, 0, 255));
        l5.setText("Phone No.");
        getContentPane().add(l5);
        l5.setBounds(60, 320, 80, 14);

        l6.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        l6.setForeground(new java.awt.Color(0, 0, 255));
        l6.setText("Date");
        getContentPane().add(l6);
        l6.setBounds(60, 360, 70, 26);
        getContentPane().add(t1);
        t1.setBounds(190, 140, 160, 20);
        getContentPane().add(t2);
        t2.setBounds(190, 180, 160, 20);

        
        getContentPane().add(ta1);
        ta1.setBounds(190, 230, 160, 70);
        getContentPane().add(t3);
        t3.setBounds(190, 320, 160, 20);
        getContentPane().add(t4);
        t4.setBounds(190, 360, 160, 20);

        b3.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        b3.setText("Search");
        getContentPane().add(b3);
        b3.setBounds(260, 420, 90, 30);

        b1.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        b1.setText("Save");
        getContentPane().add(b1);
        b1.setBounds(60, 420, 90, 30);

        b2.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        b2.setText("Edit");
        getContentPane().add(b2);
        b2.setBounds(160, 420, 90, 30);

        b6.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        b6.setText("Back");
        getContentPane().add(b6);
        b6.setBounds(260, 470, 90, 30);

        b4.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        b4.setText("Remove");
        getContentPane().add(b4);
        b4.setBounds(60, 470, 90, 30);

        b5.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        b5.setText("Clear");
        getContentPane().add(b5);
        b5.setBounds(160, 470, 90, 30);

 b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);

  try
  {
    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    cn=DriverManager.getConnection("Jdbc:Odbc:data1");
     }
   catch(Exception e)
  {
   JOptionPane.showMessageDialog(null,"Error = "+e);
  }


   }

    public static void main(String args[])
 {
                new Cust().setVisible(true);
    }//close of main

public void actionPerformed(ActionEvent ae)
{

       if(ae.getSource()==b1)
    {
       try
       {
          pst=cn.prepareStatement("insert into cust_info values(?,?,?,?,?)");
           int id=Integer.parseInt(t1.getText());
          pst.setInt(1,id);
           
          pst.setString(2,t2.getText());
             
          
            pst.setString(3,ta1.getText());
             pst.setString(4,t3.getText());
              pst.setString(5,t4.getText());
         pst.execute();
         JOptionPane.showMessageDialog(null,"customer Added.... ");
   
    t2.setText("");
    t3.setText("");
    ta1.setText("");
    
 
    }
     catch(Exception e)
     {
     JOptionPane.showMessageDialog(null,"Error = "+e);

     }     
  }
  
  if(ae.getSource()==b3) 
  {
   try
    {
    pst=cn.prepareStatement(" select * from cust_info where cid=? ");   
      int id=Integer.parseInt(t1.getText());
     pst.setInt(1,id);
     rs=pst.executeQuery();
       if(rs.next())
     {
         t2.setText(rs.getString(2));
         ta1.setText(rs.getString(3));
         t3.setText(rs.getString(4));
         t4.setText(rs.getString(5));
     
     } 
     else
    {
   JOptionPane.showMessageDialog(null,"Record not found... ");

    }
   }    
     catch(Exception e)
    {
   JOptionPane.showMessageDialog(null,"Error = "+e);

    }
  }

  if(ae.getSource()==b2)
  {
    try
   {
       pst=cn.prepareStatement("update cust_info set cname=?, cadd=?, cphno=?, cdate=? where cid=?");
        pst.setString(1,t2.getText());
        
        pst.setString(2,ta1.getText());
  pst.setString(3,t3.getText());
     pst.setString(4,t4.getText());

        
 int id=Integer.parseInt(t1.getText());
    pst.setInt(5,id); 
    int k= pst.executeUpdate();
   JOptionPane.showMessageDialog(null,"Recordd updatedd...") ;   
 
}

   catch(Exception e)
  {
   JOptionPane.showMessageDialog(null,"Error in edit = "+e);

  }
 
  }

  if(ae.getSource()==b4)
  {
    try
   {
       pst=cn.prepareStatement("delete * from cust_info where cid=?");
        
     int id=Integer.parseInt(t1.getText());
    pst.setInt(1,id); 
    int k=pst.executeUpdate();
   JOptionPane.showMessageDialog(null,"Record Deleted.....") ;
    t2.setText("");
    t3.setText("");
    ta1.setText("");

 
   }

   catch(Exception e)
  {
   JOptionPane.showMessageDialog(null,"Error in edit = "+e);

  }
 
  }

  if(ae.getSource()==b5)
  {
   t2.setText("");
   t3.setText("");
   ta1.setText("");

  }

  if(ae.getSource()==b6)
  {
     setVisible(false);
   }
}//close of method





}//close of class
