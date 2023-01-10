 class Main extends javax.swing.JFrame 
{

    public Main() 
     {

setVisible(true);
setSize(900,700);
 
        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        Mastermenu = new javax.swing.JMenu();
        ProductMenuItem = new javax.swing.JMenuItem();
        SupplierMenuItem = new javax.swing.JMenuItem();
        CustomerMenuItem = new javax.swing.JMenuItem();
        Transactionmenu = new javax.swing.JMenu();
        SaleMenuItem = new javax.swing.JMenuItem();
        PurchaseMenuItem = new javax.swing.JMenuItem();
        Reportmenu = new javax.swing.JMenu();
        BillMenuItem = new javax.swing.JMenuItem();
        AllCustMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Mastermenu.setText("Master");

        ProductMenuItem.setText("Product form");
        Mastermenu.add(ProductMenuItem);

        SupplierMenuItem.setText("Supplier Registration");
        Mastermenu.add(SupplierMenuItem);

        CustomerMenuItem.setText("Customer Registration");
        Mastermenu.add(CustomerMenuItem);

        menuBar.add(Mastermenu);

        Transactionmenu.setText("Transaction");

        SaleMenuItem.setText("Sales ");
        Transactionmenu.add(SaleMenuItem);

        PurchaseMenuItem.setText("Purchase");
        Transactionmenu.add(PurchaseMenuItem);

        menuBar.add(Transactionmenu);

        Reportmenu.setText("Report");

        BillMenuItem.setText("Bill");
        Reportmenu.add(BillMenuItem);

        AllCustMenuItem.setText("All Customer");
        Reportmenu.add(AllCustMenuItem);

        menuBar.add(Reportmenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );


    }

    private void initComponents() {


        pack();
    }// </editor-fold>

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main();           }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JMenuItem AllCustMenuItem;
    private javax.swing.JMenuItem BillMenuItem;
    private javax.swing.JMenuItem CustomerMenuItem;
    private javax.swing.JMenu Mastermenu;
    private javax.swing.JMenuItem ProductMenuItem;
    private javax.swing.JMenuItem PurchaseMenuItem;
    private javax.swing.JMenu Reportmenu;
    private javax.swing.JMenuItem SaleMenuItem;
    private javax.swing.JMenuItem SupplierMenuItem;
    private javax.swing.JMenu Transactionmenu;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration

}
