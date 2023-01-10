import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

 class Mdi extends  JFrame implements ActionListener
 {
      ImageIcon icon=new ImageIcon("p3.jpg");
       JLabel lt=new JLabel(icon); 
      JMenuItem All_credit_cust;
       JMenuItem All_credit_supplier;
       JMenuItem All_cust;
       JMenuItem All_product;       JMenuItem  worker;
       JMenuItem All_purchase;
       JMenuItem All_sale;
       JMenuItem All_supplier;
       JMenuItem Calculator;
       JMenuItem Calender;
       JMenu Master;
       JMenuItem Product;
       JMenu Report;
       JMenuItem customer;
       JDesktopPane desktopPane;
       JMenu exit;
       JMenuBar menuBar;
       JMenuItem purchase;
       JMenuItem sale;
       JMenuItem stock;
       JMenuItem supplier;
       JMenu transaction;
       JMenu utilities;


    public Mdi() 
{
        add(lt); 
        desktopPane = new  JDesktopPane();
        menuBar = new  JMenuBar();
        Master = new  JMenu();
        Product = new  JMenuItem();
        supplier = new  JMenuItem();        worker = new  JMenuItem();
        transaction = new  JMenu();
        customer = new  JMenuItem();
        sale = new  JMenuItem();
        purchase = new  JMenuItem();
        Report = new  JMenu();
        stock = new  JMenuItem();
        All_cust = new  JMenuItem();
        All_supplier = new  JMenuItem();
        All_product = new  JMenuItem();
        All_purchase = new  JMenuItem();
        All_sale = new  JMenuItem();
        All_credit_cust = new  JMenuItem();
        All_credit_supplier = new  JMenuItem();
        utilities = new  JMenu();
        Calculator = new  JMenuItem();
        Calender = new  JMenuItem();
        exit = new  JMenu();

        setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE);
        add(lt); 
        Master.setText("Master");

        Product.setAccelerator( KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));

        Product.setText("Product from");
        Master.add(Product);

        worker.setText("Worker from");
        Master.add(worker);

        supplier.setAccelerator( KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        supplier.setText("supplier Reg.");
        Master.add(supplier);

        menuBar.add(Master);

        transaction.setText("Transaction");

        customer.setAccelerator( KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        customer.setText("Customer Reg.");
        transaction.add(customer);

        sale.setAccelerator( KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        sale.setText("Sale");
        transaction.add(sale);

        purchase.setAccelerator( KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        purchase.setText("Purchase");
        transaction.add(purchase);

        menuBar.add(transaction);

        Report.setText("Report");

        stock.setText("Stock");
        Report.add(stock);

        All_cust.setText("All Customer");
        Report.add(All_cust);

        All_supplier.setText("All Supplier");
        Report.add(All_supplier);

        All_product.setText("All Product ");
        Report.add(All_product);

        All_purchase.setText("All Purchase");
        Report.add(All_purchase);

        All_sale.setText("All Sale");
        Report.add(All_sale);

        All_credit_cust.setText("All Credit customer");
        Report.add(All_credit_cust);

        All_credit_supplier.setText("All credit Supplier");
        Report.add(All_credit_supplier);

        menuBar.add(Report);

        utilities.setText("Utilities");

        Calculator.setText("Calculator");
        utilities.add(Calculator);

        Calender.setText("Calender");
        utilities.add(Calender);

    //    menuBar.add(utilities);

       // exit.setText("Exit");
       // menuBar.add(exit);

        setJMenuBar(menuBar);

         GroupLayout layout = new  GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup( GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane,  GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup( GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane,  GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

All_credit_cust.addActionListener(this);
All_credit_supplier.addActionListener(this);
All_cust.addActionListener(this);
All_product.addActionListener(this);
All_purchase.addActionListener(this);
All_sale.addActionListener(this);
All_supplier.addActionListener(this);
Calculator.addActionListener(this);
Calender.addActionListener(this);
Product.addActionListener(this);
customer.addActionListener(this);
purchase.addActionListener(this); 
sale.addActionListener(this);
stock.addActionListener(this);
supplier.addActionListener(this);
exit.addActionListener(this);
worker.addActionListener(this);

         setVisible(true);
         setSize(1000,900);
        add(lt); 
     
      

    }//close of constructor

    public static void main(String args[])
 {
                new Mdi();
    }//close of main

  public void actionPerformed(ActionEvent ae) 
 {
    if(ae.getSource()==Product)
    {
       new Products();
      }
    if(ae.getSource()==worker)
    {
       new Worker();
      }
    if(ae.getSource()==supplier)
    {
       new Supplier();
      }
    if(ae.getSource()==customer)
    {
       new Cust();
      }
    if(ae.getSource()==sale)
    {
       new Sale();
      }
    if(ae.getSource()==purchase)
    {
       new Purchase();
      }

    if(ae.getSource()==All_credit_cust)
    {
       new AllCreditCust();
      }

  if(ae.getSource()==All_credit_supplier)
    {
       new AllCreditSupplier();
      }

  if(ae.getSource()==All_cust)
     {
       new AllCust();
      }

  if(ae.getSource()==All_product)
     {
       new AllProduct();
      }
  if(ae.getSource()==All_purchase)
     {
       new AllPurchase();
      }
  if(ae.getSource()==All_sale)
     {
       new AllSale();
      }

if(ae.getSource()==All_supplier)
     {
       new AllSupplier();
      }
if(ae.getSource()==stock)
     {
       new Stock();
      }

if(ae.getSource()==Calculator)
     {
       //new Calculator();
      }
if(ae.getSource()==Calender)
     {
      // new Calender();
      }
if(ae.getSource()==exit)
     {
       setVisible(false);
      }



  }//close of method

}
