import java.io.*;
import java.sql.*;
import javax.swing.*;
  class AllProduct
   {

   Connection cn=null;
   PreparedStatement pst=null;
   ResultSet rs=null;
   ResultSetMetaData rsm=null;
   BufferedWriter bw;
  
        AllProduct()
        {
             try
             {
                 Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                 cn=DriverManager.getConnection("Jdbc:Odbc:data1");
                 pst=cn.prepareStatement("select * from Product");  
                 rs=pst.executeQuery();
                 rsm=rs.getMetaData();
                 int col=rsm.getColumnCount();
                  
                 bw=new BufferedWriter(new FileWriter("AllProduct.html"));
                 bw.write("<h1 align=center><font color=Red face=Comic Sans MS>GURUKRUPA GROCESARY SHOP </font></h1>");
                 bw.write("<br>"); 
                 bw.write("<h2 align=center><font color=blue>All Product Report</h2>"); 
                 bw.write("<hr color=green>");                                
                 

                 bw.write("<br>"); 
                 bw.write("<table border=1 align=center>");
                 bw.write("<tr>"); 
                    bw.write("<th >Product ID");   
                  bw.write("<th>Product Name");   
                  bw.write("<th>Product Rate");   
                  bw.write("<th>Product Description");   
                  bw.write("<th>Registration Date");   
               
                   while(rs.next())
                   {
                     bw.write("<tr>");
                     for(int i=1;i<=col;i++) 
                     {
                     bw.write("<td>"+rs.getString(i));
                     }
                    }
 
                  bw.close();
                 Runtime r=Runtime.getRuntime();
                 r.exec(" explorer AllProduct.html");  
              }
              catch(Exception e)
             {
              JOptionPane.showMessageDialog(null,"Error = "+e);
               }
          
        } 
       public static void main(String arg[])
       {
  
        new AllProduct();
        } 

  }