
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import static java.util.Arrays.sort;
import static java.util.Arrays.sort;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ITLAB2-PC01-STUDENT
 */
public class AdminDashboard extends javax.swing.JFrame {

     String userspath = "C:\\Users\\Kristine L. Lopez\\Documents\\Github\\House-Cleaning-Booking-System\\HouseCleaningBookingSystem\\fd\\house-cleaning\\House_Cleaning_Service\\booking_data.txt";
    
     public void setTimeDisplay() {
        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("hh:mm a");
        LocalDateTime now = LocalDateTime.now();
        adminTime.setText(timeFormat.format(now));
        
    }

    public void setDateDisplay() {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        LocalDateTime now = LocalDateTime.now();
        adminDate.setText(dateFormat.format(now));
    }
   
   
    
   
   
    public AdminDashboard() {
        initComponents();
        setTimeDisplay();
        setDateDisplay();
        String[] timeRanges = {"Today", "This Week", "Next Week"};
       

        
    }

            public void actionPerformed(java.awt.event.ActionEvent evt) {
               
            }
      

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        headerPanel = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        adminInfo = new javax.swing.JButton();
        log_out = new javax.swing.JButton();
        designline = new javax.swing.JLabel();
        designline1 = new javax.swing.JLabel();
        boardertxt = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        admiNinfo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        INCOME = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        adminTime = new javax.swing.JLabel();
        adminDate = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        NumbersBooks = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        BSAdmin = new javax.swing.JTable();
        displayAdminschedule1 = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerPanel.setBackground(new java.awt.Color(2, 56, 110));
        headerPanel.setForeground(new java.awt.Color(255, 255, 255));
        headerPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("------------------------------------------------------------------------------------------------------------");
        headerPanel.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 980, 20));

        jLabel34.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("-----------------------------------------------------------------------------------------------------------");
        headerPanel.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 970, 20));

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HOUSE CLEANING BOOKING SYSYTEM");
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), " WELCOME TO ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Serif", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        headerPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 980, 130));

        getContentPane().add(headerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 160));

        jPanel1.setBackground(new java.awt.Color(0, 73, 141));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        adminInfo.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        adminInfo.setText("ADMIN INFO");
        adminInfo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        adminInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminInfoActionPerformed(evt);
            }
        });
        jPanel1.add(adminInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 210, 40));

        log_out.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        log_out.setText("LOG - OUT");
        log_out.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        log_out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log_outActionPerformed(evt);
            }
        });
        jPanel1.add(log_out, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 210, 40));

        designline.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        designline.setForeground(new java.awt.Color(255, 255, 255));
        designline.setText("--------- * * * ----------");
        jPanel1.add(designline, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 240, -1));

        designline1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        designline1.setForeground(new java.awt.Color(255, 255, 255));
        designline1.setText("------------------------");
        jPanel1.add(designline1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 220, -1));

        boardertxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        boardertxt.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true), "MY ACCOUNT", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Serif", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.add(boardertxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 250, 620));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 270, 640));

        admiNinfo.setBackground(new java.awt.Color(0, 82, 162));
        admiNinfo.setForeground(new java.awt.Color(51, 51, 51));
        admiNinfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("***ADMIN INFORMATION***");
        admiNinfo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 270, 30));

        jLabel4.setBackground(new java.awt.Color(204, 204, 255));
        jLabel4.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("OWNER'S NAME:");
        admiNinfo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 51, -1, -1));

        jLabel6.setBackground(new java.awt.Color(204, 204, 255));
        jLabel6.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ADDRESS:");
        admiNinfo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 77, -1, -1));

        jLabel7.setBackground(new java.awt.Color(204, 204, 255));
        jLabel7.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("PHONE NUMBER:");
        admiNinfo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 105, -1, -1));

        jLabel8.setBackground(new java.awt.Color(204, 204, 255));
        jLabel8.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("EMAIL:");
        admiNinfo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 133, -1, -1));

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("KRISTINE LOPEZ");
        jLabel9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        admiNinfo.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 48, 321, -1));

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("PUROK 4 , San Miguel, Manolo Fortich Bukidnon");
        jLabel10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        admiNinfo.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 76, -1, -1));

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("090507884444");
        jLabel11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        admiNinfo.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 104, 321, -1));

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("nekochii@gmail.com");
        jLabel12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        admiNinfo.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 132, 321, -1));

        jLabel14.setBackground(new java.awt.Color(204, 204, 255));
        jLabel14.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("INCOME:");
        admiNinfo.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabel15.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3), "BOOKING SCHEDULE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_BOTTOM, new java.awt.Font("Serif", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        admiNinfo.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 680, 37));

        INCOME.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        INCOME.setForeground(new java.awt.Color(255, 255, 255));
        INCOME.setText("00.00");
        INCOME.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        admiNinfo.add(INCOME, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 114, -1));

        jLabel24.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("------------------------------------------------------------------------");
        admiNinfo.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 670, 20));

        jLabel28.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("------------------------------------------------------------------------");
        admiNinfo.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, 670, 11));

        adminTime.setBackground(new java.awt.Color(204, 204, 255));
        adminTime.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        adminTime.setForeground(new java.awt.Color(255, 255, 255));
        adminTime.setText("10:20 am");
        adminTime.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        admiNinfo.add(adminTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(591, 10, -1, -1));

        adminDate.setBackground(new java.awt.Color(204, 204, 255));
        adminDate.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        adminDate.setForeground(new java.awt.Color(255, 255, 255));
        adminDate.setText("10-12-2024");
        adminDate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        admiNinfo.add(adminDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 10, -1, -1));

        jLabel16.setBackground(new java.awt.Color(204, 204, 255));
        jLabel16.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Number of bookings: ");
        admiNinfo.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        NumbersBooks.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        NumbersBooks.setForeground(new java.awt.Color(255, 255, 255));
        NumbersBooks.setText("0");
        NumbersBooks.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        admiNinfo.add(NumbersBooks, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 114, -1));

        BSAdmin.setAutoCreateRowSorter(true);
        BSAdmin.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        BSAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DATE BOOKED:", "TIME BOOKED:", "NAME:", "ADDRESS:", "PHONE NO:", "EMAIL:", "SERVICE:", "PAYMENT:", "DURATION:", "DATE:", "TIME:", "AMOUNT:"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Long.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        BSAdmin.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        BSAdmin.setOpaque(false);
        jScrollPane5.setViewportView(BSAdmin);

        admiNinfo.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 700, 270));

        displayAdminschedule1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        displayAdminschedule1.setText("Display Schedule");
        displayAdminschedule1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        displayAdminschedule1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayAdminschedule1ActionPerformed(evt);
            }
        });
        admiNinfo.add(displayAdminschedule1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 610, 140, 30));

        jTabbedPane1.addTab("tab3", admiNinfo);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 730, 680));

        setSize(new java.awt.Dimension(1016, 839));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void adminInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminInfoActionPerformed

        jTabbedPane1.setSelectedIndex(0);
        
    
    }//GEN-LAST:event_adminInfoActionPerformed

    private void log_outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_outActionPerformed
        LoginForm login = new LoginForm();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_log_outActionPerformed

    private void displayAdminschedule1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayAdminschedule1ActionPerformed
      AdminDashboard d = new AdminDashboard(); // Assuming this line creates a new instance of AdminDashboard

          File file = new File(userspath);
          DefaultTableModel tbm = (DefaultTableModel) BSAdmin.getModel();

          try {
          FileReader fr = new FileReader(file);
          BufferedReader br = new BufferedReader(fr);

          Object[] lines = br.lines().toArray();

        for(Object line1: lines) {
        String line = line1.toString().trim();
        String[] datas = line.split(",");
        tbm.addRow(datas);
        }
        } catch (IOException e) {
        e.printStackTrace();
         }

           double income = 0.0;
           for (int i = 0; i < tbm.getRowCount(); i++) {
           income += Double.parseDouble(tbm.getValueAt(i, 11).toString());
         }
         INCOME.setText(Double.toString(income));

          int numberOfBookings = tbm.getRowCount();
          NumbersBooks.setText(Integer.toString(numberOfBookings));
          
         

    }//GEN-LAST:event_displayAdminschedule1ActionPerformed
 
    
        
  
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable BSAdmin;
    private javax.swing.JLabel INCOME;
    private javax.swing.JLabel NumbersBooks;
    private javax.swing.JPanel admiNinfo;
    private javax.swing.JLabel adminDate;
    private javax.swing.JButton adminInfo;
    private javax.swing.JLabel adminTime;
    private javax.swing.JLabel boardertxt;
    private javax.swing.JLabel designline;
    private javax.swing.JLabel designline1;
    private javax.swing.JButton displayAdminschedule1;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton log_out;
    // End of variables declaration//GEN-END:variables
}
