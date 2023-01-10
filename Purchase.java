import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import java.util.Date;
 class Purchase extends   JFrame implements ActionListener,  ItemListener, KeyListener
{

 Connection cn=null;
 PreparedStatement pst=null;
 ResultSet rs=null;
Statement st=null;
            JButton btnback;
         JButton btnclear;
         JButton btndelete;
         JButton btnedit;
         JButton btnsave;
         JButton btnsearch;
         JComboBox cmbproid;
         JComboBox cmbsupid;
         JLabel jLabel10;
         JLabel jLabel11;
         JLabel jLabel12;
         JLabel jLabel13;
         JLabel jLabel14;
         JLabel jLabel15;
         JLabel jLabel16;
         JLabel jLabel17;
        JLabel psearch;
           JLabel jLabel2;
         JLabel jLabel3;
         JLabel jLabel5;
         JLabel jLabel6;
         JLabel jLabel7;
         JLabel jLabel8;
         JLabel jLabel9;
         JSeparator jSeparator1;
         JSeparator jSeparator2;
         JSeparator jSeparator3;
         JTextField txtsid;
         JLabel l1;
       java.awt.List lstsearch;
       java.awt.List lstpsearch;
       
     JTextField txtbillno;
         JTextField txtdate;
         JTextField txtdesc;
         JLabel txtid;
         JTextField txtpaidamt;
         JTextField txtproid;
         JTextField txtproname;
         JTextField txtquantity;
         JTextField txtrate;
         JTextField txtremamt;
         JTextField txtsearch;
         JTextField txtpsearch;
       
          JTextField txtsupadd;
         JTextField txtsupdate;
         JTextField txtsupname;
         JTextField txtsupphno;
         JTextField txttotamt;

    public Purchase() 
  {
  
          setVisible(true);
         setSize(900,900);
           l1 = new   JLabel();
        jLabel2 = new   JLabel();
        txtbillno = new   JTextField();
        jLabel3 = new   JLabel();
        txtdate = new   JTextField();
        txtid = new   JLabel();
        txtsid = new   JTextField();
        jLabel5 = new   JLabel();
        txtsearch = new   JTextField();
        lstsearch = new java.awt.List();
        jSeparator1 = new   JSeparator();
        jLabel6 = new   JLabel();
        txtsupname = new   JTextField();
        jLabel7 = new   JLabel();
        txtsupadd = new   JTextField();
        jLabel8 = new   JLabel();
        txtsupphno = new   JTextField();
        jLabel9 = new   JLabel();
        txtsupdate = new   JTextField();
        jSeparator2 = new   JSeparator();
        jLabel10 = new   JLabel();
        txtproid = new   JTextField();
        jLabel11 = new   JLabel();
        txtproname = new   JTextField();
        jLabel12 = new   JLabel();
        txtrate = new   JTextField();
        jLabel13 = new   JLabel();
        txtdesc = new   JTextField();
        jLabel14 = new   JLabel();
        txtquantity = new   JTextField();
        jLabel15 = new   JLabel();
        txttotamt = new   JTextField();
        jLabel16 = new   JLabel();
        txtpaidamt = new   JTextField();
        jLabel17 = new   JLabel();
        txtremamt = new   JTextField();
        jSeparator3 = new   JSeparator();
        btnsave = new   JButton();
        btnedit = new   JButton();
        btndelete = new   JButton();
        btnsearch = new   JButton();
        btnclear = new   JButton();
        cmbproid = new   JComboBox();
        cmbsupid = new   JComboBox();
        btnback = new   JButton();

        setDefaultCloseOperation(  WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().setLayout(null);

        l1.setFont(new java.awt.Font("Comic Sans MS", 0, 24));
        l1.setForeground(new java.awt.Color(255, 0, 0));
        l1.setText("Purchase Form");
        getContentPane().add(l1);
        l1.setBounds(340, 30, 170, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Bill No.");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 150, 50, 20);
        getContentPane().add(txtbillno);
        txtbillno.setBounds(120, 150, 80, 20);

        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Date");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 120, 50, 20);
        getContentPane().add(txtdate);
        txtdate.setBounds(120, 120, 90, 20);

        txtid.setForeground(new java.awt.Color(51, 51, 255));
        txtid.setText("Supplier ID");
        getContentPane().add(txtid);
        txtid.setBounds(290, 120, 80, 20);
        getContentPane().add(txtsid);
        txtsid.setBounds(360, 120, 60, 20);

        jLabel5.setBackground(new java.awt.Color(51, 51, 255));
        jLabel5.setForeground(new java.awt.Color(51, 0, 255));
        jLabel5.setText("Search Supplier");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(510, 120, 100, 20);
        getContentPane().add(txtsearch);
        txtsearch.setBounds(620, 120, 180, 20);
        getContentPane().add(lstsearch);
        lstsearch.setBounds(620, 140, 180, 80);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(230, 200, 190, 2);



        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setText("Supplier Name");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(70, 230, 90, 14);
        getContentPane().add(txtsupname);
        txtsupname.setBounds(160, 230, 200, 20);


        jLabel7.setForeground(new java.awt.Color(51, 51, 255));
        jLabel7.setText("Address");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(70, 280, 60, 14);
        getContentPane().add(txtsupadd);
        txtsupadd.setBounds(130, 280, 150, 20);

        jLabel8.setForeground(new java.awt.Color(51, 51, 255));
        jLabel8.setText("Contact No.");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(310, 280, 70, 14);
        getContentPane().add(txtsupphno);
        txtsupphno.setBounds(380, 280, 130, 20);


        jLabel9.setForeground(new java.awt.Color(51, 51, 255));
        jLabel9.setText("Register Date");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(70, 330, 80, 20);
        getContentPane().add(txtsupdate);
        txtsupdate.setBounds(150, 330, 120, 20);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(220, 390, 210, 2);

        jLabel10.setForeground(new java.awt.Color(51, 51, 255));
        jLabel10.setText("Product ID");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(70, 420, 70, 14);
        getContentPane().add(txtproid);
        txtproid.setBounds(140, 420, 90, 20);

        jLabel11.setForeground(new java.awt.Color(51, 51, 255));
        jLabel11.setText("Product Name");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(350, 420, 90, 20);
        getContentPane().add(txtproname);
        txtproname.setBounds(440, 420, 140, 20);

        jLabel12.setForeground(new java.awt.Color(51, 51, 255));
        jLabel12.setText("Rate");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(70, 460, 50, 14);
        getContentPane().add(txtrate);
        txtrate.setBounds(140, 460, 110, 20);

        jLabel13.setForeground(new java.awt.Color(51, 51, 255));
        jLabel13.setText("Description");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(360, 460, 70, 14);
        getContentPane().add(txtdesc);
        txtdesc.setBounds(440, 460, 140, 20);

        jLabel14.setForeground(new java.awt.Color(51, 51, 255));
        jLabel14.setText("Quantity");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(70, 500, 70, 14);
        getContentPane().add(txtquantity);
        txtquantity.setBounds(130, 500, 90, 20);

        jLabel15.setForeground(new java.awt.Color(51, 51, 255));
        jLabel15.setText("Total Amt");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(310, 500, 70, 20);
        getContentPane().add(txttotamt);
        txttotamt.setBounds(380, 500, 100, 20);

        jLabel16.setForeground(new java.awt.Color(51, 51, 255));
        jLabel16.setText("Paid Amt");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(70, 540, 80, 20);
        getContentPane().add(txtpaidamt);
        txtpaidamt.setBounds(140, 540, 110, 20);

        jLabel17.setForeground(new java.awt.Color(51, 51, 255));
        jLabel17.setText("Remaining Amt");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(360, 540, 90, 20);
        getContentPane().add(txtremamt);
        txtremamt.setBounds(460, 540, 120, 20);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(210, 590, 220, 10);

        btnsave.setForeground(new java.awt.Color(51, 0, 102));
        btnsave.setText("Save");
        getContentPane().add(btnsave);
        btnsave.setBounds(70, 610, 80, 23);

        btnedit.setForeground(new java.awt.Color(51, 0, 102));
        btnedit.setText("Edit");
        getContentPane().add(btnedit);
        btnedit.setBounds(160, 610, 80, 23);

        btndelete.setForeground(new java.awt.Color(51, 0, 102));
        btndelete.setText("Delete");
        getContentPane().add(btndelete);
        btndelete.setBounds(250, 610, 90, 23);

        btnsearch.setForeground(new java.awt.Color(51, 0, 102));
        btnsearch.setText("Search");
        getContentPane().add(btnsearch);
        btnsearch.setBounds(350, 610, 80, 23);

        btnclear.setForeground(new java.awt.Color(51, 0, 102));
        btnclear.setText("Clear");
        getContentPane().add(btnclear);
        btnclear.setBounds(440, 610, 80, 23);

        cmbproid.setModel(new   DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cmbproid);
        cmbproid.setBounds(230, 420, 40, 22);

        cmbsupid.setModel(new   DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cmbsupid);
        cmbsupid.setBounds(420, 120, 40, 20);

        btnback.setForeground(new java.awt.Color(51, 0, 102));
        btnback.setText("Back");
        getContentPane().add(btnback);
        btnback.setBounds(530, 610, 80, 23);

        

       try
      {
         Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
         cn=DriverManager.getConnection("Jdbc:Odbc:data1");
            st=cn.createStatement();
                pst=cn.prepareStatement("select max(billno) from purchase");
                 rs=pst.executeQuery();
               if(rs.next())
             {
                    int no=rs.getInt(1);
                     no++;                  
                    txtbillno.setText(""+no);                 
                }
                
                           pst=cn.prepareStatement("select sid from supplier_info");

                 rs=pst.executeQuery();
           cmbsupid.removeAllItems();
              
             while(rs.next())
          {

              cmbsupid.addItem(rs.getString(1)); 
           }
                 
          
                            pst=cn.prepareStatement("select pid from product");
 
                 rs=pst.executeQuery();
                 cmbproid.removeAllItems();
             while(rs.next())
          {

              cmbproid.addItem(rs.getString(1)); 
           }

    txtsid.setText("");
  txtproid.setText("");
      
       txtsupname.setText("");
       txtsupadd.setText("");
       txtsupphno.setText("");
       txtsupdate.setText("");
   
       Date d=new Date();
           int y=d.getYear();
              y=y+1900;
           txtdate.setText(""+d.getDate()+" / "+d.getMonth()+" / "+y);
 
      } 
 
     catch(Exception e)
       {
        JOptionPane.showMessageDialog(null,"Error = "+e);
       }

          lstsearch.addActionListener(this);           

         cmbsupid.addActionListener(this);
         cmbproid.addActionListener(this);


          btnsave.addActionListener(this);
     btnedit.addActionListener(this);
     btndelete.addActionListener(this);
     btnsearch.addActionListener(this);
     btnclear.addActionListener(this);
     btnback.addActionListener(this);


         txtquantity.addKeyListener(this);         
          txtpaidamt.addKeyListener(this);
           
        txtsearch.addKeyListener(this);           


    }//close of constructor

public static void main(String args[]) 
{
               new Purchase();
}//close of main


public void actionPerformed(ActionEvent ae)
   { 

              if(ae.getSource()==btnsave)
              {
                   try
                   {
                       pst=cn.prepareStatement("insert into purchase values(?,?,?,?,?,?,?,?,?,?)");
                       
                       pst.setInt(1,Integer.parseInt(txtbillno.getText()));
                       pst.setInt(2,Integer.parseInt(txtsid.getText()));
                       pst.setString(3,txtsupname.getText());
                       pst.setInt(4,Integer.parseInt(txtproid.getText()));
                       pst.setString(5,txtproname.getText());
                       pst.setInt(6,Integer.parseInt(txtquantity.getText()));
                       pst.setInt(7,Integer.parseInt(txttotamt.getText()));
                       pst.setInt(8,Integer.parseInt(txtpaidamt.getText()));
                       pst.setInt(9,Integer.parseInt(txtremamt.getText()));
                       pst.setString(10,txtdate.getText());
                            
                       pst.execute();
                       JOptionPane.showMessageDialog(null,"Record Inserted..");                  
                        
                             txtsid.setText("");
                             txtsupname.setText("");
                             txtsupdate.setText("");
                             txtsupadd.setText("");
                             txtsupphno.setText("");
                             txtproid.setText("");
                             txtproname.setText("");
                             txtrate.setText("");
                             txtdesc.setText("");
                             txtquantity.setText("");
                             txttotamt.setText("");
                             txtpaidamt.setText("");
 	             txtremamt.setText("");
 		 
                                                
                            
      	}
               catch(Exception e)
               {
                  JOptionPane.showMessageDialog(null,"Error ="+e);

               }
          }

if(ae.getSource()==btnedit)
              {
                   try
                   {
                       pst=cn.prepareStatement("update purchase set sid=?,sname=?,pid=?,pname=?,quantity=?,totalamt=?,paidamt=?,remamt=?,pdate=? where billno=? ");

                       pst.setInt(1,Integer.parseInt(txtsid.getText()));
                       pst.setString(2,txtsupname.getText());
                       pst.setInt(3,Integer.parseInt(txtproid.getText()));
                       pst.setString(4,txtproname.getText());
                       pst.setInt(5,Integer.parseInt(txtquantity.getText()));
                       pst.setInt(6,Integer.parseInt(txttotamt.getText()));
                       pst.setInt(7,Integer.parseInt(txtpaidamt.getText()));
                       pst.setInt(8,Integer.parseInt(txtremamt.getText()));
                       pst.setString(9,txtdate.getText());
                       pst.setInt(10,Integer.parseInt(txtbillno.getText()));
                            
                       pst.executeUpdate();
                       JOptionPane.showMessageDialog(null,"Record Updated...");                  
                        
                             txtsid.setText("");
                             txtsupname.setText("");
                             txtsupdate.setText("");
                             txtsupadd.setText("");
                             txtsupphno.setText("");
                             txtproid.setText("");
                             txtproname.setText("");
                             txtrate.setText("");
                             txtdesc.setText("");
                             txtquantity.setText("");
                             txttotamt.setText("");
                             txtpaidamt.setText("");
 	             txtremamt.setText("");
 		 
                                                
                            
      	}
               catch(Exception e)
               {
                  JOptionPane.showMessageDialog(null,"Error ="+e);

               }
          }

           if(ae.getSource()==btndelete)
            {
                try 
                {
                pst=cn.prepareStatement("delete * from purchase where billno=?");
               pst.setInt(1,Integer.parseInt(txtbillno.getText()));
               pst.executeUpdate();
              JOptionPane.showMessageDialog(null,"Record Deleted");
               } 
                catch(Exception e)
                {
                  JOptionPane.showMessageDialog(null,"Error ="+e);

                 }

            } 

                 if(ae.getSource()==lstsearch)
              {
                    txtsearch.setText(lstsearch.getSelectedItem());  
                    try
  	    {
                        pst=cn.prepareStatement("select * from supplier_info where sname=?");
                        pst.setString(1,txtsearch.getText());
                        rs=pst.executeQuery();
                        if(rs.next())
                           {
                              txtsid.setText(rs.getString(1));
                              txtsupname.setText(rs.getString(2));
                              txtsupadd.setText(rs.getString(3));
                              txtsupphno.setText(rs.getString(4));
                              txtsupdate.setText(rs.getString(5)); 
                            } 	
 	    }
                    catch(Exception e)
                    {
                          JOptionPane.showMessageDialog(null,"Error ="+e);
                     }                              

               }
 
             if(ae.getSource()==btnsearch)
              {
                   try
                   {
                         pst=cn.prepareStatement("select * from purchase where billno=?");
                         pst.setInt(1,Integer.parseInt(txtbillno.getText()));
                          rs=pst.executeQuery();
                           if(rs.next())
                           {

     txtsid.setText("");
                             txtsupname.setText("");
                             txtsupdate.setText("");
                             txtsupadd.setText("");
                             txtsupphno.setText("");
                             txtproid.setText("");
                             txtproname.setText("");
                             txtrate.setText("");
                             txtdesc.setText("");
                             txtquantity.setText("");
                             txttotamt.setText("");
                             txtpaidamt.setText("");
 	             txtremamt.setText("");
                             txtsearch.setText("");
                

                               txtsid.setText(rs.getString(2));
                               txtsupname.setText(rs.getString(3));
                               txtproid.setText(rs.getString(4));
                               txtproname.setText(rs.getString(5));
                               txtquantity.setText(rs.getString(6));
                               txttotamt.setText(rs.getString(7));
                               txtpaidamt.setText(rs.getString(8));
                               txtremamt.setText(rs.getString(9));
                               txtdate.setText(rs.getString(10));
                             
                           }
                          else
                          {

                          JOptionPane.showMessageDialog(null,"No Record Found");
                    
                           }
                   }
                    catch(Exception e)
                    {
                          JOptionPane.showMessageDialog(null,"Error ="+e);
                     }                              
             

              }

               if(ae.getSource()==btnclear)
               {
                             txtsid.setText("");
                             txtsupname.setText("");
                             txtsupdate.setText("");
                             txtsupadd.setText("");
                             txtsupphno.setText("");
                             txtproid.setText("");
                             txtproname.setText("");
                             txtrate.setText("");
                             txtdesc.setText("");
                             txtquantity.setText("");
                             txttotamt.setText("");
                             txtpaidamt.setText("");
 	             txtremamt.setText("");
                             txtsearch.setText("");
                }
               if(ae.getSource()==btnback)
               {
                    setVisible(false);
                }
              if(ae.getSource()==cmbsupid)
              {
                      txtsid.setText(""+cmbsupid.getSelectedItem());        

                     try
  	    {
                         pst=cn.prepareStatement("select * from supplier_info where sid=?");
                         int no=Integer.parseInt(txtsid.getText());
                         pst.setInt(1,no);
                         rs=pst.executeQuery();
                         if(rs.next())
                         {
                              txtsupname.setText(rs.getString(2));
                              txtsupadd.setText(rs.getString(3));
                              txtsupphno.setText(rs.getString(4));
                              txtsupdate.setText(rs.getString(5)); 
                          } 	
 	    }
                   catch(Exception e)
                   {
                       JOptionPane.showMessageDialog(null,"Error ="+e);
                   }                              

           }

          if(ae.getSource()==cmbproid)
          {
              txtproid.setText(""+cmbproid.getSelectedItem());
             
        try
  	{
                   pst=cn.prepareStatement("select * from product where pid=?");
                    int id=Integer.parseInt(txtproid.getText());
                   pst.setInt(1,id);
                       rs=pst.executeQuery();
                     if(rs.next())
                    {
                     txtproname.setText(rs.getString(2));
                     txtrate.setText(rs.getString(3));
                      txtdesc.setText(rs.getString(4));
 
                     } 	
 	}
        catch(Exception e)
       {
 JOptionPane.showMessageDialog(null,"Error ="+e);
       }                              

      }


   }//close of method


 public void itemStateChanged(ItemEvent ie)
  {
          if(ie.getSource()==cmbproid)
    {
        
    }

          if(ie.getSource()==cmbsupid)
    {
    }



  }//close of method

 public void keyTyped(KeyEvent ke)
  {
        if(ke.getSource()==txtsearch)
         {
              try
             {
                    lstsearch.removeAll();      
           rs=st.executeQuery("select sname from supplier_info where sname like '"+txtsearch.getText()+"%'");
              
                     
              while(rs.next())
                {
 
                lstsearch.add(rs.getString(1));                           
                 }
             }
               catch(Exception e)
             {
 JOptionPane.showMessageDialog(null,"Error ="+e);

             }                  
 
         }
           
  }

 public void keyPressed(KeyEvent ke)
 {
     
 }
 public void keyReleased(KeyEvent ke)
 {
if(ke.getSource()==txtquantity)
         {
           int r=Integer.parseInt(txtrate.getText());
           int quan=Integer.parseInt(txtquantity.getText());
             int ans=r*quan;
            txttotamt.setText(""+ans);
    
          }
          if(ke.getSource()==txtpaidamt)
         {
           int pa=Integer.parseInt(txtpaidamt.getText());
           int tot=Integer.parseInt(txttotamt.getText());
             int ans=tot-pa;
            txtremamt.setText(""+ans);
          }     
}
}//close of class
