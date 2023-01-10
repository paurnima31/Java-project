import java.io.*;
import java.sql.*;
import javax.swing.*;
import java.util.*;  
class Stock
   {
   Connection cn=null;
   PreparedStatement pst=null;
   ResultSet rs=null;
   ResultSetMetaData rsm=null;
   BufferedWriter bw;  
        Stock()
        {
             try
             {
                 Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                 cn=DriverManager.getConnection("Jdbc:Odbc:data1");

//                 rsm=rs.getMetaData();
 //                int col=rsm.getColumnCount();
                  
                 bw=new BufferedWriter(new FileWriter("stock.html"));
                 bw.write("<h1 align=center><font color=Red face=Comic Sans MS>GURUKRUPA GROCESSARY</font></h1>");
                 bw.write("<br>"); 
                 bw.write("<h2 align=center><font color=blue>Stock  Report</h2>"); 
                 bw.write("<hr color=green>");                                
                
                 bw.write("<br>"); 
                 bw.write("<table border=1 align=center>");
                 bw.write("<tr>"); 
                 bw.write("<th >Product Name");   
                 bw.write("<th>Purchase Quantity");   
                 bw.write("<th>Sale Quantity");   
                 bw.write("<th>Available Quantity");   
                     pst=cn.prepareStatement("select *  from  purchase,sale  where purchase.pname=sale.pname");
                     rs=pst.executeQuery();
                     while(rs.next())
                      { 
                        bw.write("<tr>");
                        bw.write("<td>"+rs.getString(5));
         int  a=Integer.parseInt(rs.getString(6));
                        bw.write("<td>"+a);
int  b=Integer.parseInt(rs.getString(16));
	     bw.write("<td>"+b);
int ans=a-b;
	     bw.write("<td>"+ans);
                      }                                  

                 bw.close();
                 Runtime r=Runtime.getRuntime();
                 r.exec(" explorer   stock.html");  
              }
              catch(Exception e)
             {
              JOptionPane.showMessageDialog(null,"Error = "+e);
               }
          
        } 
       public static void main(String arg[])
       {
  
        new Stock();
        } 

  }