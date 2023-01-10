import java.io.*;
import java.sql.*;
import javax.swing.*;
  class Bill
{
   Connection cn=null;
   PreparedStatement pst=null;
   ResultSet rs=null;
   ResultSetMetaData rsm=null;
   BufferedWriter bw;
  
        Bill()
        {
             try
             {
                 Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                 cn=DriverManager.getConnection("Jdbc:Odbc:data1");
                 pst=cn.prepareStatement("select * from sale where billno=(select max(billno) from sale)");  
                 rs=pst.executeQuery();
                 rsm=rs.getMetaData();
                 int col=rsm.getColumnCount();
                  
                 bw=new BufferedWriter(new FileWriter("bill.html"));
                 bw.write("<h1 align=center><font color=Red face=Comic Sans MS>GURUKRUPA GROCESARY</font></h1>");
                 bw.write("<br>"); 
                 bw.write("<h2 align=center><font color=blue>Bill</h2>");
                 bw.write("<h3 align=center><font color=blue>Taklibhan tale-shrirampur bk|| Mo.no-9623919509</h3>");
      
                 bw.write("<hr color=green>");                                
                    if(rs.next())
                   {
                       
                       bw.write("<table border =0> ");                   
                    bw.write("<tr>");
                    bw.write("<td>Bill no :- "+rs.getString(1)+ "<td><h4>Customer ID="+rs.getString(2));
                    
                    bw.write("<tr>");
                          
                      bw.write("<td><h5>Customer Name :- "+rs.getString(3));
                    bw.write("<tr>");
  
                       bw.write("<td><hr color=red width=100%><td><hr color=red width=100%><td><hr color=red width=100%>");                   
          
                            bw.write("<tr>");
                            bw.write("<td> Product Name :- "+rs.getString(5));
                            bw.write("<td> Qauntity :- "+rs.getString(6));
                            bw.write("<tr>");
                       bw.write("<td><hr color=red width=100%><td><hr color=red width=100%><td><hr color=red width=100%>");                   
                            
                          bw.write("<tr>");
      
                            bw.write("<td> <td>Total amt :- "+rs.getString(7));
         
                     bw.write("</table>");

                     }
                 
 
                  bw.close();
                 Runtime r=Runtime.getRuntime();
                 r.exec(" explorer Bill.html");  
              }
              catch(Exception e)
             {
              JOptionPane.showMessageDialog(null,"Error = "+e);
               }
          
        } 
       public static void main(String arg[])
       {
  
        new Bill();
        } 

  }