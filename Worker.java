import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
 class Worker extends javax.swing.JFrame
 {

    public Worker()
    {
        initComponents();
        setVisible(true);
        setSize(800,700);
    }
   
    private void initComponents()
    {
	
	
	jScrollPane2 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        wtbl = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        ld = new java.awt.Label();
        lid = new java.awt.Label();
        lnm = new java.awt.Label();
        ladd = new java.awt.Label();
        lmob = new java.awt.Label();
        lei = new java.awt.Label();
        t1 = new java.awt.TextField();
        t2 = new java.awt.TextField();
        t3 = new java.awt.TextField();
        t4 = new java.awt.TextField();
        t5 = new java.awt.TextField();
        lbd = new java.awt.Label();
        lacc = new java.awt.Label();
        lqua = new java.awt.Label();
        lsal = new java.awt.Label();
        t6 = new java.awt.TextField();
        t7 = new java.awt.TextField();
        t8 = new java.awt.TextField();
        t9 = new java.awt.TextField();
        lgen = new java.awt.Label();
        ch1 = new java.awt.Choice();
	ch1.addItem("Male");
           
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        badd1 = new java.awt.Button();
        bsave = new java.awt.Button();
        bsearch = new java.awt.Button();
        bexit = new java.awt.Button();
        bedit = new java.awt.Button();

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tbl);

        wtbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(wtbl);

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        ld.setFont(new java.awt.Font("Arial", 0, 24));
        ld.setForeground(new java.awt.Color(255, 0, 204));
        ld.setText("Worker Form");
        getContentPane().add(ld);
        ld.setBounds(140, 70, 150, 30);

        lid.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lid.setForeground(new java.awt.Color(0, 0, 255));
        lid.setText("Worker ID");
        getContentPane().add(lid);
        lid.setBounds(90, 130, 100, 21);

        lnm.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lnm.setForeground(new java.awt.Color(0, 0, 255));
        lnm.setText("Worker Name");
        getContentPane().add(lnm);
        lnm.setBounds(90, 170, 90, 21);

        ladd.setFont(new java.awt.Font("Arial", 0, 14));
        ladd.setForeground(new java.awt.Color(0, 0, 255));
        ladd.setText("Address");
        getContentPane().add(ladd);
        ladd.setBounds(90, 210, 90, 21);

        lmob.setFont(new java.awt.Font("Arial", 0, 14));
        lmob.setForeground(new java.awt.Color(0, 0, 255));
        lmob.setText("Mobile number");
        getContentPane().add(lmob);
        lmob.setBounds(90, 250, 100, 21);

        lei.setFont(new java.awt.Font("Arial", 0, 14));
        lei.setForeground(new java.awt.Color(0, 0, 255));
        lei.setText("Email ID");
        getContentPane().add(lei);
        lei.setBounds(90, 290, 90, 21);
        getContentPane().add(t1);
        t1.setBounds(190, 130, 140, 20);
        getContentPane().add(t2);
        t2.setBounds(190, 170, 140, 20);
        getContentPane().add(t3);
        t3.setBounds(190, 210, 140, 20);
        getContentPane().add(t4);
        t4.setBounds(190, 250, 140, 20);

        getContentPane().add(t5);
        t5.setBounds(190, 290, 140, 20);

        lbd.setFont(new java.awt.Font("Arial", 0, 14));
        lbd.setForeground(new java.awt.Color(0, 0, 255));
        lbd.setText("Birth Date");
        getContentPane().add(lbd);
        lbd.setBounds(90, 330, 80, 21);

        lacc.setFont(new java.awt.Font("Arial", 0, 14));
        lacc.setForeground(new java.awt.Color(0, 0, 255));
        lacc.setText("Account no.");
        getContentPane().add(lacc);
        lacc.setBounds(90, 370, 79, 21);

        lqua.setFont(new java.awt.Font("Arial", 0, 14));
        lqua.setForeground(new java.awt.Color(0, 0, 255));
        lqua.setText("Qualification");
        getContentPane().add(lqua);
        lqua.setBounds(90, 410, 80, 21);

        lsal.setFont(new java.awt.Font("Arial", 0, 14));
        lsal.setForeground(new java.awt.Color(0, 0, 255));
        lsal.setText("Salary");
        getContentPane().add(lsal);
        lsal.setBounds(90, 450, 100, 21);
        getContentPane().add(t6);
        t6.setBounds(190, 330, 140, 20);
        getContentPane().add(t7);
        t7.setBounds(190, 370, 140, 20);
        getContentPane().add(t8);
        t8.setBounds(190, 410, 140, 20);
        getContentPane().add(t9);
        t9.setBounds(190, 450, 140, 20);

        lgen.setFont(new java.awt.Font("Arial", 0, 14));
        lgen.setForeground(new java.awt.Color(0, 0, 255));
        lgen.setText("Gender");
        getContentPane().add(lgen);
        lgen.setBounds(90, 490, 60, 21);
        getContentPane().add(ch1);
        ch1.setBounds(190, 490, 140, 20);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

//        getContentPane().add(jScrollPane3);
//        jScrollPane3.setBounds(460, 130, 452, 90);

        badd1.setFont(new java.awt.Font("Arial", 1, 14));
        badd1.setForeground(new java.awt.Color(255, 51, 51));
        badd1.setLabel("Add");
        badd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                badd1ActionPerformed(evt);
            }
        });
        getContentPane().add(badd1);
        badd1.setBounds(350, 130, 60, 25);

        bsave.setBackground(new java.awt.Color(236, 233, 216));
        bsave.setFont(new java.awt.Font("Arial", 1, 14));
        bsave.setForeground(new java.awt.Color(255, 51, 51));
        bsave.setLabel("Save");
        getContentPane().add(bsave);
        bsave.setBounds(350, 170, 60, 25);
	        bsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsaveActionPerformed(evt);
            }
        });



        bsearch.setFont(new java.awt.Font("Arial", 1, 14));
        bsearch.setForeground(new java.awt.Color(255, 51, 51));
        bsearch.setLabel("Search");
        getContentPane().add(bsearch);
        bsearch.setBounds(350, 250, 60, 25);
	        bsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsearchActionPerformed(evt);
            }
        });
	       




        bexit.setFont(new java.awt.Font("Arial", 1, 14));
        bexit.setForeground(new java.awt.Color(255, 51, 51));
        bexit.setLabel("Exit");
        bexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bexitActionPerformed(evt);
            }
        });
        getContentPane().add(bexit);
        bexit.setBounds(350, 290, 60, 25);

        bedit.setFont(new java.awt.Font("Arial", 1, 14));
        bedit.setForeground(new java.awt.Color(255, 51, 51));
        bedit.setLabel("Edit");
        bedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beditActionPerformed(evt);
            }
        });
        getContentPane().add(bedit);
        bedit.setBounds(350, 210, 60, 25);
	        bedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beditActionPerformed(evt);
            }
        });

        pack();
    }// </editor-fold>                        
	    private void bexitActionPerformed(java.awt.event.ActionEvent evt) 
    {
	setVisible(false);
     }

    private void badd1ActionPerformed(java.awt.event.ActionEvent evt) 
    {
	t1.setText("");                                      
        t2.setText("");                                      
        t3.setText("");                                      
        t4.setText("");                                      
        t5.setText("");                                      
        t6.setText("");                                      
        t7.setText("");                                      
        t8.setText("");                                      
        t9.setText("");                                      
        
    }                                     

    private void bsaveActionPerformed(java.awt.event.ActionEvent evt)
    {
	try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				Connection cn=DriverManager.getConnection("Jdbc:Odbc:data1");
				PreparedStatement st=cn.prepareStatement("insert into worker values(?,?,?,?,?,?,?,?,?,?)");
				st.setInt(1,Integer.parseInt(t1.getText()));
				st.setString(2,t2.getText());
				st.setString(3,t3.getText());
				st.setString(4,t4.getText());
				st.setString(5,t5.getText());
				st.setString(6,t6.getText());
				st.setString(7,t7.getText());
				st.setString(8,t8.getText());
				st.setInt(9,Integer.parseInt(t9.getText()));
				st.setString(10,ch1.getSelectedItem().toString());
				st.executeUpdate();
				JOptionPane.showMessageDialog(null,"Record inserted successfully");	
			}
			catch(Exception ae)
			{
				JOptionPane.showMessageDialog(null,"Error1="+ae);
			}
                                      
    }                                     

    private void beditActionPerformed(java.awt.event.ActionEvent evt)
    {                                      
    	int num=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the Worker id to edit"));
	try
	{	
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	Connection cn=DriverManager.getConnection("Jdbc:Odbc:data1");
	Statement st=null;
	ResultSet rs=null;

	rs=st.executeQuery("select * from worker where WID="+num);
	while(rs.next())
	{
		t1.setText(""+rs.getInt(1));
		t2.setText(rs.getString(2));
		t3.setText(rs.getString(3));
		t4.setText(rs.getString(4));
		t5.setText(rs.getString(5));
		t6.setText(rs.getString(6));
		t7.setText(rs.getString(7));
		t8.setText(rs.getString(8));
		t9.setText(""+rs.getInt(9));
		ch1.addItem(rs.getString(10));

		
	}
	}
	catch(Exception ae)
	{
		JOptionPane.showMessageDialog(null,"Error2="+ae);
	}
     }                                     

    private void bsearchActionPerformed(java.awt.event.ActionEvent evt) {                                   
    	int num=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the Worker id to search"));
	try
	{	
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	Connection cn=DriverManager.getConnection("Jdbc:Odbc:data1");
	Statement st=null;
	ResultSet rs=null;

	rs=st.executeQuery("select * from worker where WID="+num);
	if(rs.next())
	{
		t1.setText(""+rs.getInt(1));
		t2.setText(rs.getString(2));
		t3.setText(rs.getString(3));
		t4.setText(rs.getString(4));
		t5.setText(rs.getString(5));
		t6.setText(rs.getString(6));
		t7.setText(rs.getString(7));
		t8.setText(rs.getString(8));
		t9.setText(""+rs.getInt(9));
		ch1.addItem(rs.getString(10));

		
	}
               else
           JOptionPane.showMessageDialog(null,"not found");
	}
	catch(Exception ae)
	{
		JOptionPane.showMessageDialog(null,"Error2="+ae);
	}
    }                                  

    public static void main(String args[])
    {
      new Worker();
    }

    // Variables declaration - do not modify                     
    private java.awt.Button badd1;
    private java.awt.Button bedit;
    private java.awt.Button bexit;
    private java.awt.Button bsave;
    private java.awt.Button bsearch;
    private java.awt.Choice ch1;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private java.awt.Label lacc;
    private java.awt.Label ladd;
    private java.awt.Label lbd;
    private java.awt.Label ld;
    private java.awt.Label lei;
    private java.awt.Label lgen;
    private java.awt.Label lid;
    private java.awt.Label lmob;
    private java.awt.Label lnm;
    private java.awt.Label lqua;
    private java.awt.Label lsal;
    private java.awt.TextField t1;
    private java.awt.TextField t2;
    private java.awt.TextField t3;
    private java.awt.TextField t4;
    private java.awt.TextField t5;
    private java.awt.TextField t6;
    private java.awt.TextField t7;
    private java.awt.TextField t8;
    private java.awt.TextField t9;
    private javax.swing.JTable tbl;
    private javax.swing.JTable wtbl;
    // End of variables declaration                   

}
