import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Log extends JFrame implements ActionListener 
{
       ImageIcon icon=new ImageIcon("women2.jpeg");
       JLabel ll=new JLabel(icon);
        JButton b1;
        JButton b2;
        JPasswordField jPasswordField1;
         Label l1;
         Label l2;
         Label l3;
         TextField t1;

    public Log() 
   {

     setVisible(true);

     setSize(1500,1500); 
add(ll); 
     setTitle("PLEASE LOG IN TO PROCEED");

     setLocation(60,80);

     setBackground(Color.red);     

        l1 = new   Label();
        l2 = new   Label();
        l3 = new   Label();
        t1 = new   TextField();
        
        jPasswordField1 = new  JPasswordField();
        b1 = new  JButton();
        b2 = new  JButton();

        setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE);
        setBackground(new   Color(255, 51, 0));
        getContentPane().setLayout(null);

        l1.setFont(new   Font("Comic Sans MS", 1, 24)); 
        l1.setForeground(new   Color(204, 0, 0));
        l1.setText("Login Window");
        getContentPane().add(l1);
        l1.setBounds(150, 50, 180, 38);

        l2.setFont(new   Font("Comic Sans MS", 0, 18)); 
        l2.setForeground(new   Color(0, 0, 204));
        l2.setText("UserName");
        getContentPane().add(l2);
        l2.setBounds(100, 100, 100, 30);

        l3.setFont(new   Font("Comic Sans MS", 0, 18)); 
        l3.setForeground(new   Color(0, 0, 204));
        l3.setText("Password");
        getContentPane().add(l3);
        l3.setBounds(100, 140, 90, 30);
        getContentPane().add(t1);
        t1.setBounds(210, 110, 150, 20);
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(210, 150, 150, 20);

        b1.setFont(new   Font("Comic Sans MS", 0, 14)); 
        b1.setForeground(new   Color(153, 0, 153));
        b1.setText("Login");
        getContentPane().add(b1);
        b1.setBounds(100, 200, 90, 27);

        b2.setFont(new   Font("Comic Sans MS", 0, 14)); 
        b2.setForeground(new   Color(153, 0, 153));
        b2.setText("Reset");
        getContentPane().add(b2);
        b2.setBounds(220, 200, 100, 27);

  b1.addActionListener(this);
  b2.addActionListener(this);

    }

     public static void main(String args[]) 
     {
                new Log();
    }//close of main
  public void actionPerformed(ActionEvent ae)
{
  if(ae.getSource()==b1)
 {
   if(t1.getText().equals("paurnima"))
      {
          if(jPasswordField1.getText().equals("paurnima@31"))
        {
           setVisible(false);
             new Mdi(); 
        }
      else
        {
         JOptionPane.showMessageDialog(null,"Invalid User Name or Password");

        }
      }

    else
        {
         JOptionPane.showMessageDialog(null,"Invalid User Name or Password");

        }
  }

  if(ae.getSource()==b2)
    {
   	t1.setText("");
   	jPasswordField1.setText("");
    }
}//close of method

}//close of class
