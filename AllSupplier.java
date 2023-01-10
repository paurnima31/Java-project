import java.io.*;
import java.sql.*;
import javax.swing.*;
  class AllSupplier
   {

   Connection cn=null;
   PreparedStatement pst=null;
   ResultSet rs=null;
   ResultSetMetaData rsm=null;
   BufferedWriter bw;
  
        AllSupplier()
        {
             try
             {
                 Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                 cn=DriverManager.getConnection("Jdbc:Odbc:data1");
                 pst=cn.prepareStatement("select * from supplier_info");  
                 rs=pst.executeQuery();
                 rsm=rs.getMetaData();
                 int col=rsm.getColumnCount();
                  
                 bw=new BufferedWriter(new FileWriter("AllSupplier.html"));
                 bw.write("<h1 align=center><font color=Red face=Comic Sans MS> GURUKRUPA GROCEARY SHOP </font></h1>");
                 bw.write("<br>"); 
                 bw.write("<h2 align=center><font color=blue>All Supplier Report</h2>"); 
                 bw.write("<hr color=green>");                                
                 

                 bw.write("<br>"); 
                 bw.write("<table border=1 align=center>");
                 bw.write("<tr>"); 
                    bw.write("<th >Supplier ID");   
                  bw.write("<th>Supplier Name");   
                  bw.write("<th>Supplier Addres");   
                  bw.write("<th>Supplier Phno");   
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
                 r.exec(" explorer AllSupplier.html");  
              }
              catch(Exception e)
             {
              JOptionPane.showMessageDialog(null,"Error = "+e);
               }
          
        } 
       public static void main(String arg[])
       {
  
        new AllSupplier();
        } 

  }