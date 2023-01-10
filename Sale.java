import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import java.util.Date;
 class Sale extends   JFrame implements ActionListener, KeyListener 
 {
 Connection cn=null;
 PreparedStatement pst=null;
 ResultSet rs=null;
Statement st=null;


         JButton btnBill;
         JButton btnSearch;
         JButton btnback;
         JButton btnclear;
         JButton btndelete;
         JButton btnedit;
         JButton btnsave;
         JComboBox cmbproid;
         JComboBox cmbcid;
         JLabel jLabel10;
         JLabel jLabel11;
         JLabel jLabel12;
         JLabel jLabel13;
         JLabel jLabel14;
         JLabel jLabel15;
         JLabel jLabel16;
         JLabel jLabel17;
         JLabel jLabel18;
         JLabel jLabel2;
         JLabel jLabel3;
         JLabel jLabel6;
         JLabel jLabel7;
         JLabel jLabel8;
         JLabel jLabel9;
         JSeparator jSeparator1;
         JSeparator jSeparator2;
         JSeparator jSeparator3;
         JTextField txtcid;
         JLabel l1;
       java.awt.List lstcsearch;
       java.awt.List lstpsearch;
         JLabel searchpro;
         JTextField txtbillno;
         JTextField txtcsearch;
         JTextField txtcadd;
         JTextField txtcdate;
         JTextField txtcname;
         JTextField txtcphno;
         JTextField txtdate;
         JTextField txtdesc;
         JLabel txtid;
         JTextField txtpaidamt;
         JTextField txtproid;
         JTextField txtproname;
         JTextField txtpsearch;
         JTextField txtquantity;
         JTextField txtrate;
         JTextField txtremamt;
         JTextField txttotamt;

    public Sale() 
    {
         
        l1 = new   JLabel();
        jLabel2 = new   JLabel();
        txtbillno = new   JTextField();
        jLabel3 = new   JLabel();
        txtdate = new   JTextField();
        txtid = new   JLabel();
        txtcid = new   JTextField();
        searchpro = new   JLabel();
        txtcsearch = new   JTextField();
        lstcsearch = new java.awt.List();
        jSeparator1 = new   JSeparator();
        jLabel6 = new   JLabel();
        txtcname = new   JTextField();
        jLabel7 = new   JLabel();
        txtcadd = new   JTextField();
        jLabel8 = new   JLabel();
        txtcphno = new   JTextField();
        jLabel9 = new   JLabel();
        txtcdate = new   JTextField();
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
        cmbproid = new   JComboBox();
        cmbcid = new   JComboBox();
        btnsave = new   JButton();
        btnedit = new   JButton();
        btndelete = new   JButton();
        btnclear = new   JButton();
        btnback = new   JButton();
        btnBill = new   JButton();
        btnSearch = new   JButton();
        jLabel18 = new   JLabel();
        txtpsearch = new   JTextField();
        lstpsearch = new java.awt.List();

        setDefaultCloseOperation(  WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        l1.setFont(new java.awt.Font("Comic Sans MS", 0, 24));
        l1.setForeground(new java.awt.Color(255, 0, 0));
        l1.setText("Sale Form");
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
        txtid.setText("Customer ID");
        getContentPane().add(txtid);
        txtid.setBounds(270, 120, 80, 20);
        getContentPane().add(txtcid);
        txtcid.setBounds(360, 120, 60, 20);

        searchpro.setBackground(new java.awt.Color(51, 51, 255));
        searchpro.setForeground(new java.awt.Color(51, 0, 255));
        searchpro.setText("Search Product ");
        getContentPane().add(searchpro);
        searchpro.setBounds(510, 250, 100, 20);
        getContentPane().add(txtcsearch);
        txtcsearch.setBounds(610, 120, 180, 20);
        getContentPane().add(lstcsearch);
        lstcsearch.setBounds(610, 140, 180, 80);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(230, 200, 190, 2);

        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setText("Customer Name");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(70, 230, 100, 20);
        getContentPane().add(txtcname);
        txtcname.setBounds(170, 230, 200, 20);

        jLabel7.setForeground(new java.awt.Color(51, 51, 255));
        jLabel7.setText("Address");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(70, 280, 60, 14);
        getContentPane().add(txtcadd);
        txtcadd.setBounds(130, 280, 150, 20);

        jLabel8.setForeground(new java.awt.Color(51, 51, 255));
        jLabel8.setText("Contact No.");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(300, 330, 70, 14);
        getContentPane().add(txtcphno);
        txtcphno.setBounds(380, 330, 130, 20);

        jLabel9.setForeground(new java.awt.Color(51, 51, 255));
        jLabel9.setText("Register Date");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(70, 330, 80, 20);
        getContentPane().add(txtcdate);
        txtcdate.setBounds(150, 330, 120, 20);
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
        jLabel16.setText("Received  Amt");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(70, 540, 100, 20);
        getContentPane().add(txtpaidamt);
        txtpaidamt.setBounds(170, 540, 110, 20);

        jLabel17.setForeground(new java.awt.Color(51, 51, 255));
        jLabel17.setText("Remaining Amt");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(360, 540, 90, 20);
        getContentPane().add(txtremamt);
        txtremamt.setBounds(460, 540, 120, 20);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(210, 590, 220, 10);

        cmbproid.setModel(new   DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cmbproid);
        cmbproid.setBounds(230, 420, 40, 22);

        cmbcid.setModel(new   DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cmbcid);
        cmbcid.setBounds(420, 120, 40, 20);

        btnsave.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnsave.setForeground(new java.awt.Color(51, 0, 102));
        btnsave.setText("Save");
        getContentPane().add(btnsave);
        btnsave.setBounds(70, 610, 80, 23);

        btnedit.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnedit.setForeground(new java.awt.Color(51, 0, 102));
        btnedit.setText("Edit");
        getContentPane().add(btnedit);
        btnedit.setBounds(160, 610, 80, 23);

        btndelete.setFont(new java.awt.Font("Tahoma", 1, 12));
        btndelete.setForeground(new java.awt.Color(51, 0, 102));
        btndelete.setText("Delete");
        getContentPane().add(btndelete);
        btndelete.setBounds(250, 610, 90, 23);

        btnclear.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnclear.setForeground(new java.awt.Color(51, 0, 102));
        btnclear.setText("Clear");
        getContentPane().add(btnclear);
        btnclear.setBounds(450, 610, 80, 23);

        btnback.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnback.setForeground(new java.awt.Color(51, 0, 102));
        btnback.setText("Back");
        getContentPane().add(btnback);
        btnback.setBounds(630, 610, 80, 23);

        btnBill.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnBill.setForeground(new java.awt.Color(51, 0, 102));
        btnBill.setText("bill");
        getContentPane().add(btnBill);
        btnBill.setBounds(540, 610, 80, 23);

        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnSearch.setForeground(new java.awt.Color(51, 0, 102));
        btnSearch.setText("Search");
        getContentPane().add(btnSearch);
        btnSearch.setBounds(350, 610, 90, 23);

        jLabel18.setBackground(new java.awt.Color(51, 51, 255));
        jLabel18.setForeground(new java.awt.Color(51, 0, 255));
        jLabel18.setText("Search Customer ");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(500, 120, 110, 20);
        getContentPane().add(txtpsearch);
        txtpsearch.setBounds(610, 250, 180, 20);
        getContentPane().add(lstpsearch);
        lstpsearch.setBounds(610, 270, 180, 80);
         setSize(900,900);
         setVisible(true);

       try
      {
         Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
         cn=DriverManager.getConnection("Jdbc:Odbc:data1");
            st=cn.createStatement();
                pst=cn.prepareStatement("select max(billno) from sale");
                 rs=pst.executeQuery();
               if(rs.next())
             {
                    int no=rs.getInt(1);
                     no++;                  
                    txtbillno.setText(""+no);                 
                }
                
                           pst=cn.prepareStatement("select cid from cust_info");

                 rs=pst.executeQuery();
               cmbcid.removeAllItems();
              
             while(rs.next())
          {

              cmbcid.addItem(rs.getString(1)); 
           }
                 
          
                            pst=cn.prepareStatement("select pid from product");
 
                 rs=pst.executeQuery();
                 cmbproid.removeAllItems();
             while(rs.next())
          {

              cmbproid.addItem(rs.getString(1)); 
           }

    txtcid.setText("");
    txtproid.setText("");
      
       txtcname.setText("");
       txtcadd.setText("");
       txtcphno.setText("");
       txtcdate.setText("");
   
       Date d=new Date();
           int y=d.getYear();
              y=y+1900;
           txtdate.setText(""+d.getDate()+" / "+d.getMonth()+" / "+y);
 
      } 
 
     catch(Exception e)
       {
        JOptionPane.showMessageDialog(null,"Error = "+e);
       }

          cmbcid.addActionListener(this);
          cmbproid.addActionListener(this);

     btnsave.addActionListener(this);
     btnedit.addActionListener(this);
     btndelete.addActionListener(this);
     btnSearch.addActionListener(this);
     btnclear.addActionListener(this);
     btnback.addActionListener(this);
     btnBill.addActionListener(this);



          lstcsearch.addActionListener(this);           
          lstpsearch.addActionListener(this);           
          
          txtquantity.addKeyListener(this);         
          txtpaidamt.addKeyListener(this);        
          txtcsearch.addKeyListener(this);           
          txtpsearch.addKeyListener(this);           

 
    }//close of constructor

 public static void main(String args[]) 
  {
                new Sale();
    }//close of main
 
 
 public void actionPerformed(ActionEvent ae)
 {

              if(ae.getSource()==btnsave)
              {
                   try
                   {
                       pst=cn.prepareStatement("insert into sale values(?,?,?,?,?,?,?,?,?,?)");
                       
                       pst.setInt(1,Integer.parseInt(txtbillno.getText()));
                       pst.setInt(2,Integer.parseInt(txtcid.getText()));
                       pst.setString(3,txtcname.getText());
                       pst.setInt(4,Integer.parseInt(txtproid.getText()));
                       pst.setString(5,txtproname.getText());
                       pst.setInt(6,Integer.parseInt(txtquantity.getText()));
                       pst.setInt(7,Integer.parseInt(txttotamt.getText()));
                       pst.setInt(8,Integer.parseInt(txtpaidamt.getText()));
                       pst.setInt(9,Integer.parseInt(txtremamt.getText()));
                       pst.setString(10,txtdate.getText());
                            
                       pst.execute();
                       JOptionPane.showMessageDialog(null,"Record Inserted..");                  
                        
                             txtcid.setText("");
                             txtcname.setText("");
                             txtcdate.setText("");
                             txtcadd.setText("");
                             txtcphno.setText("");
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
                       pst=cn.prepareStatement("update sale set cid=?, cname=?, pid=?, pname=?, quantity=?, totalamt=?, recamt=?, remamt=?,sdate=? where billno=? ");

                       pst.setInt(1,Integer.parseInt(txtcid.getText()));
                       pst.setString(2,txtcname.getText());
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
                        
                             txtcid.setText("");
                             txtcname.setText("");
                             txtcdate.setText("");
                             txtcadd.setText("");
                             txtcphno.setText("");
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
                pst=cn.prepareStatement("delete * from sale where billno=?");
               pst.setInt(1,Integer.parseInt(txtbillno.getText()));
               pst.executeUpdate();
              JOptionPane.showMessageDialog(null,"Record Deleted");
               } 
                catch(Exception e)
                {
                  JOptionPane.showMessageDialog(null,"Error ="+e);

                 }

            } 

               if(ae.getSource()==btnSearch)
              {
                   try
                   {
                         pst=cn.prepareStatement("select * from sale where billno=?");
                         pst.setInt(1,Integer.parseInt(txtbillno.getText()));
                          rs=pst.executeQuery();
                           if(rs.next())
                           {
                             txtcid.setText("");
                             txtcname.setText("");
                             txtcdate.setText("");
                             txtcadd.setText("");
                             txtcphno.setText("");
                             txtproid.setText("");
                             txtproname.setText("");
                             txtrate.setText("");
                             txtdesc.setText("");
                             txtquantity.setText("");
                             txttotamt.setText("");
                             txtpaidamt.setText("");
 	             txtremamt.setText("");
                             txtcsearch.setText("");
                

                               txtcid.setText(rs.getString(2));
                               txtcname.setText(rs.getString(3));
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

                if(ae.getSource()==btnBill)
              {
               new Bill();
               }
                if(ae.getSource()==btnclear)
              {
                             txtcid.setText("");
                             txtcname.setText("");
                             txtcdate.setText("");
                             txtcadd.setText("");
                             txtcphno.setText("");
                             txtproid.setText("");
                             txtproname.setText("");
                             txtrate.setText("");
                             txtdesc.setText("");
                             txtquantity.setText("");
                             txttotamt.setText("");
                             txtpaidamt.setText("");
 	             txtremamt.setText("");
                             txtcsearch.setText("");
                             txtpsearch.setText("");

 
              }
  
              if(ae.getSource()==btnback)
             {
               setVisible(false);
              }
            if(ae.getSource()==cmbcid)
            {

                 txtcid.setText(""+cmbcid.getSelectedItem());        

                 try
                 {
                         pst=cn.prepareStatement("select * from cust_info where cid=?");
                         int no=Integer.parseInt(txtcid.getText());
                         pst.setInt(1,no);
                         rs=pst.executeQuery();
                         if(rs.next())
                         {
                              txtcname.setText(rs.getString(2));
                              txtcadd.setText(rs.getString(3));
                              txtcphno.setText(rs.getString(4));
                              txtcdate.setText(rs.getString(5)); 
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

                 if(ae.getSource()==lstcsearch)
              {
                    txtcsearch.setText(lstcsearch.getSelectedItem());  
                    try
  	    {
                        pst=cn.prepareStatement("select * from cust_info where cname=?");
                        pst.setString(1,txtcsearch.getText());
                        rs=pst.executeQuery();
                        if(rs.next())
                           {
                              txtcid.setText(rs.getString(1));
                              txtcname.setText(rs.getString(2));
                              txtcadd.setText(rs.getString(3));
                              txtcphno.setText(rs.getString(4));
                              txtcdate.setText(rs.getString(5)); 
                            } 	
 	    }
                    catch(Exception e)
                    {
                          JOptionPane.showMessageDialog(null,"Error ="+e);
                     }                              

               }
                 if(ae.getSource()==lstpsearch)
              {
                    txtpsearch.setText(lstpsearch.getSelectedItem());  
                    try
  	    {
                        pst=cn.prepareStatement("select * from product where pname=?");
                        pst.setString(1,txtpsearch.getText());
                        rs=pst.executeQuery();
                        if(rs.next())
                           {
                              txtproid.setText(rs.getString(1));
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

 public void keyTyped(KeyEvent ke)
  {
        if(ke.getSource()==txtcsearch)
         {
              try
             {
                    lstcsearch.removeAll();      
                    rs=st.executeQuery("select cname from cust_info where cname like '"+txtcsearch.getText()+"%'");
               
                     
                    while(rs.next())
                {
 
                lstcsearch.add(rs.getString(1));                           
                 }
             }
               catch(Exception e)
             {
                JOptionPane.showMessageDialog(null,"Error ="+e);

             }                  
 
         }
        if(ke.getSource()==txtpsearch)
         {
              try
             {
                    lstpsearch.removeAll();      
                    rs=st.executeQuery("select pname from product where pname like '"+txtpsearch.getText()+"%'");
               
                     
                    while(rs.next())
                {
 
                lstpsearch.add(rs.getString(1));                           
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
      
}//close of method



 
}//close of class
