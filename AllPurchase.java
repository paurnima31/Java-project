import java.io.*;
import java.sql.*;
import javax.swing.*;
  class AllPurchase
   {

   Connection cn=null;
   PreparedStatement pst=null;
   ResultSet rs=null;
   ResultSetMetaData rsm=null;
   BufferedWriter bw;
  
        AllPurchase()
        {
             try
             {
                 Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                 cn=DriverManager.getConnection("Jdbc:Odbc:data1");
                 pst=cn.prepareStatement("select * from purchase");  
                 rs=pst.executeQuery();
                 rsm=rs.getMetaData();
                 int col=rsm.getColumnCount();
                  
                 bw=new BufferedWriter(new FileWriter("AllPurchase.html"));
                 bw.write("<h1 align=center><font color=Red face=Comic Sans MS>GURUKRUPA GROCESARY+</font></h1>");
                 bw.write("<br>"); 
                 bw.write("<h2 align=center><font color=blue>All Purchase Report</h2>"); 
                 bw.write("<hr color=green>");                                
                 

                 bw.write("<br>"); 
                 bw.write("<table border=1 align=center>");
                 bw.write("<tr>"); 

                   for(int i=1;i<=col;i++)
                {
                    bw.write("<th >"+rsm.getColumnName(i));   
                  }
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
                 r.exec(" explorer AllPurchase.html");  
              }
              catch(Exception e)
             {
              JOptionPane.showMessageDialog(null,"Error = "+e);
               }
          
        } 
       public static void main(String arg[])
       {
  
 new AllPurchase();
        } 

  }