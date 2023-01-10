import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

 class Products extends  JFrame implements ActionListener
 {
       Connection cn;
      PreparedStatement pst;
      ResultSet rs;
 
          Button b1;
         Button b2;
         Button b3;
         Button b4;
         Button b5;
         Button b6;
          JLabel l1;
          JLabel l2;
          JLabel l3;
          JLabel l4;
          JLabel l5;
          JLabel lbl1;
          JTextField t1;
          JTextField t2;
          JTextField t3;
          JTextField t4;
          JTextField t5;


    public Products()
    {
     setVisible(true); 
       setSize(450,500);
    setLocation(300,150);
        lbl1 = new     JLabel();
        l1 = new     JLabel();
        l2 = new     JLabel();
        l3 = new     JLabel();
        l4 = new     JLabel();
        b1 = new    Button();
        b2 = new    Button();
        l5 = new     JLabel();
        t5 = new     JTextField();
        t1 = new     JTextField();
        t2 = new     JTextField();
        t3 = new     JTextField();
        t4 = new     JTextField();
        b3 = new    Button();
        b4 = new    Button();
        b5 = new    Button();
        b6 = new    Button();

        setDefaultCloseOperation(    WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lbl1.setBackground(new    Color(153, 153, 255));
        lbl1.setFont(new    Font("Comic Sans MS", 0, 26)); // NOI18N
        lbl1.setForeground(new    Color(153, 0, 153));
        lbl1.setHorizontalAlignment(    SwingConstants.CENTER);
        lbl1.setText("PRODUCT DETAILS");
        getContentPane().add(lbl1);
        lbl1.setBounds(80, 30, 270, 30);

        l1.setBackground(new    Color(102, 204, 255));
        l1.setFont(new    Font("Comic Sans MS", 0, 18)); // NOI18N
        l1.setForeground(new    Color(255, 0, 51));
        l1.setHorizontalAlignment(    SwingConstants.CENTER);
        l1.setText("Product ID");
        getContentPane().add(l1);
        l1.setBounds(60, 100, 110, 30);

        l2.setBackground(new    Color(102, 204, 255));
        l2.setFont(new    Font("Comic Sans MS", 0, 18)); // NOI18N
        l2.setForeground(new    Color(255, 0, 51));
        l2.setHorizontalAlignment(    SwingConstants.CENTER);
        l2.setText("Product Name");
        getContentPane().add(l2);
        l2.setBounds(60, 140, 130, 20);

        l3.setBackground(new    Color(102, 204, 255));
        l3.setFont(new    Font("Comic Sans MS", 0, 18)); // NOI18N
        l3.setForeground(new    Color(255, 0, 51));
        l3.setHorizontalAlignment(    SwingConstants.CENTER);
        l3.setText("Rate");
        getContentPane().add(l3);
        l3.setBounds(50, 170, 70, 30);

        l4.setBackground(new    Color(102, 204, 255));
        l4.setFont(new    Font("Comic Sans MS", 0, 18)); // NOI18N
        l4.setForeground(new    Color(255, 0, 51));
        l4.setHorizontalAlignment(    SwingConstants.CENTER);
        l4.setText("Description");
        getContentPane().add(l4);
        l4.setBounds(40, 210, 140, 30);

        b1.setBackground(new    Color(153, 204, 255));
        b1.setFont(new    Font("Comic Sans MS", 0, 18)); // NOI18N
        b1.setForeground(new    Color(153, 0, 51));
        b1.setLabel("Save");
        getContentPane().add(b1);
        b1.setBounds(70, 310, 80, 30);

        b2.setBackground(new    Color(153, 204, 255));
        b2.setFont(new    Font("Comic Sans MS", 0, 18)); // NOI18N
        b2.setForeground(new    Color(153, 0, 51));
        b2.setLabel("Edit");
        getContentPane().add(b2);
        b2.setBounds(170, 310, 80, 30);

        l5.setFont(new    Font("Comic Sans MS", 0, 18)); // NOI18N
        l5.setForeground(new    Color(255, 0, 51));
        l5.setText("Date");
        getContentPane().add(l5);
        l5.setBounds(60, 250, 80, 30);
        getContentPane().add(t5);
        t5.setBounds(210, 260, 160, 20);
        getContentPane().add(t1);
        t1.setBounds(210, 100, 160, 20);
        getContentPane().add(t2);
        t2.setBounds(210, 140, 160, 20);
        getContentPane().add(t3);
        t3.setBounds(210, 180, 160, 20);
        getContentPane().add(t4);
        t4.setBounds(210, 220, 160, 20);

        b3.setBackground(new    Color(153, 204, 255));
        b3.setFont(new    Font("Comic Sans MS", 0, 18)); // NOI18N
        b3.setForeground(new    Color(153, 0, 51));
        b3.setLabel("Search");
        getContentPane().add(b3);
        b3.setBounds(270, 310, 80, 30);

        b4.setBackground(new    Color(153, 204, 255));
        b4.setFont(new    Font("Comic Sans MS", 0, 18)); // NOI18N
        b4.setForeground(new    Color(153, 0, 51));
        b4.setLabel("Remove");
        getContentPane().add(b4);
        b4.setBounds(70, 350, 80, 30);

        b5.setBackground(new    Color(153, 204, 255));
        b5.setFont(new    Font("Comic Sans MS", 0, 18)); // NOI18N
        b5.setForeground(new    Color(153, 0, 51));
        b5.setLabel("Clear");
        getContentPane().add(b5);
        b5.setBounds(170, 350, 80, 30);

        b6.setBackground(new    Color(153, 204, 255));
        b6.setFont(new    Font("Comic Sans MS", 0, 18)); // NOI18N
        b6.setForeground(new    Color(153, 0, 51));
        b6.setLabel("Back");
        getContentPane().add(b6);
        b6.setBounds(270, 350, 80, 30);
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

   }//close of constructor


  public static void main(String args[])
 {
     new Products();
 }  //close of main

 


public void actionPerformed(ActionEvent ae)
{

       if(ae.getSource()==b1)
    {
       try
       {
          pst=cn.prepareStatement("insert into product values(?,?,?,?,?)");
           int id=Integer.parseInt(t1.getText());
          pst.setInt(1,id);
           
          pst.setString(2,t2.getText());
             
          int rate=Integer.parseInt(t3.getText());
          
            pst.setInt(3,rate);
             pst.setString(4,t4.getText());
              pst.setString(5,t5.getText());
         pst.execute();
         JOptionPane.showMessageDialog(null,"Product Added.... ");
   
    t2.setText("");
    t3.setText("");
    t4.setText("");
    
 
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
    pst=cn.prepareStatement(" select * from product where pid=? ");   
      int id=Integer.parseInt(t1.getText());
     pst.setInt(1,id);
     rs=pst.executeQuery();
       if(rs.next())
     {
         t2.setText(rs.getString(2));
         t3.setText(rs.getString(3));
         t4.setText(rs.getString(4));
         t5.setText(rs.getString(5));
     
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
       pst=cn.prepareStatement("update product set pname=?, rate=?, descr=?, pdate=? where pid=?");
        pst.setString(1,t2.getText());
        
  int rate =Integer.parseInt(t3.getText());
        pst.setInt(2,rate);
  pst.setString(3,t4.getText());
     pst.setString(4,t5.getText());

        
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
       pst=cn.prepareStatement("delete * from product where pid=?");
        
     int id=Integer.parseInt(t1.getText());
    pst.setInt(1,id); 
    int k=pst.executeUpdate();
   JOptionPane.showMessageDialog(null,"Record Deleted.....") ;
   t2.setText("");
   t3.setText("");
   t4.setText("");
 
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
   t4.setText("");

  }

  if(ae.getSource()==b6)
  {
     setVisible(false);
   }
}//close of method


}//close of class
