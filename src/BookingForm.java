
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class BookingForm extends javax.swing.JFrame {

       private DefaultTableModel scheduleModel;
     
    String userspath = "C:\\Users\\Admin\\Documents\\fd\\house-cleaning\\House_Cleaning_Service\\AccountsBook.txt";

    private void storeDataToFile(String[] data) {
    try (FileWriter writer = new FileWriter("booking_data.txt", true)) {
        for (String value : data) {
            writer.write(value + ",");
        }
        writer.write("\n");
    } catch (IOException e) {
        e.printStackTrace();
    }
    }
 
    public void setTimeDisplay() {
        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("hh:mm a");
        LocalDateTime now = LocalDateTime.now();
        timeDisplay.setText(timeFormat.format(now));
        scheduleModel = (DefaultTableModel) schedule.getModel();
    }

    public void setDateDisplay() {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime now = LocalDateTime.now();
        dateDisplay.setText(dateFormat.format(now));
    }
    
        private void updateSelectedDateLabel() {
        String selectedMonth = (String) MONTH.getSelectedItem();
        String selectedDate = (String) DATE.getSelectedItem();
        String selectedYear = (String) YEAR.getSelectedItem();

        date.setText( selectedYear + "-" +  selectedMonth + "-" +  selectedDate );
    }

        private void updateSelectedTimeLabel() {
         String selectedHour = (String) HOUR1.getSelectedItem();
         String selectedMinute = (String) MINUTE1.getSelectedItem();
         String selectedAmOrPm = (String) amORpm1.getSelectedItem();

         time.setText(selectedHour + ":" + selectedMinute + " " + selectedAmOrPm);
    }
     
    private void clearForm() {
        ca_fullname.setText("");
        ca_address.setText("");
        ca_email.setText("");
        ca_phonenumber.setText("");
        service.setSelectedIndex(0);
        payment.setSelectedIndex(0);
        duration.setText("");
        pricing.setText("");
        date.setText("");
        time.setText("");
    }
    
    public BookingForm() {
        initComponents();
        setTimeDisplay();
        setDateDisplay();

        scheduleModel = (DefaultTableModel) schedule.getModel();
      
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        service = new javax.swing.JComboBox<>();
        servicetxt = new javax.swing.JLabel();
        paymenttxt = new javax.swing.JLabel();
        delete = new javax.swing.JButton();
        payment = new javax.swing.JComboBox<>();
        datetxt = new javax.swing.JLabel();
        duration = new javax.swing.JTextField();
        PRICINGTXT1 = new javax.swing.JLabel();
        pricing = new javax.swing.JTextField();
        date = new javax.swing.JTextField();
        time = new javax.swing.JTextField();
        ca_txtfullname = new javax.swing.JLabel();
        ca_address = new javax.swing.JTextField();
        ca_txtaddress = new javax.swing.JLabel();
        ca_txtemail = new javax.swing.JLabel();
        ca_email = new javax.swing.JTextField();
        ca_phonenumber = new javax.swing.JTextField();
        ca_txtemail1 = new javax.swing.JLabel();
        durationtxt = new javax.swing.JLabel();
        ca_fullname = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        schedule = new javax.swing.JTable();
        Confirmbutton1 = new javax.swing.JButton();
        Receipt = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        tinetxt = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        fftxt = new javax.swing.JLabel();
        dateDisplay = new javax.swing.JTextField();
        timeDisplay = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        ca_txtfullname1 = new javax.swing.JLabel();
        MONTH = new javax.swing.JComboBox<>();
        HOUR1 = new javax.swing.JComboBox<>();
        YEAR = new javax.swing.JComboBox<>();
        amORpm1 = new javax.swing.JComboBox<>();
        DATE = new javax.swing.JComboBox<>();
        MINUTE1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 82, 162));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        service.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        service.setForeground(new java.awt.Color(51, 51, 51));
        service.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BASIC HOUSE CLEANING", "DEEP CLEANING", "LAUNDRY SERVICE", "GREEN CLEANING", "MOVE IN & MOVE OUT", "POST CONSTRUCTION CLEANING" }));
        service.setToolTipText("TYPES OF SERVICE"); // NOI18N
        service.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        service.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        service.setOpaque(false);
        service.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serviceActionPerformed(evt);
            }
        });
        jPanel1.add(service, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 210, 30));

        servicetxt.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        servicetxt.setForeground(new java.awt.Color(255, 255, 255));
        servicetxt.setText("SELECT SERVICE:");
        servicetxt.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(servicetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 150, 20));

        paymenttxt.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        paymenttxt.setForeground(new java.awt.Color(255, 255, 255));
        paymenttxt.setText("SELECT PAYMENT METHOD:");
        paymenttxt.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(paymenttxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 220, 20));

        delete.setBackground(new java.awt.Color(255, 255, 255));
        delete.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        delete.setForeground(new java.awt.Color(51, 51, 51));
        delete.setText("cancel service");
        delete.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 730, 140, 30));

        payment.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        payment.setForeground(new java.awt.Color(51, 51, 51));
        payment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bank Transfer", "Gcash", "In Counter Payment", "Door to Door Payment" }));
        payment.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(payment, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 210, 30));

        datetxt.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        datetxt.setForeground(new java.awt.Color(255, 255, 255));
        datetxt.setText("SELECT DATE : yyyy-MM-dd");
        datetxt.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(datetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 160, 240, 20));

        duration.setEditable(false);
        duration.setBackground(new java.awt.Color(255, 255, 255));
        duration.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        duration.setForeground(new java.awt.Color(51, 51, 51));
        duration.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.gray, null, new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0)));
        jPanel1.add(duration, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 120, 30));

        PRICINGTXT1.setBackground(new java.awt.Color(51, 51, 51));
        PRICINGTXT1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        PRICINGTXT1.setForeground(new java.awt.Color(255, 255, 255));
        PRICINGTXT1.setText("PRICING:");
        PRICINGTXT1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(PRICINGTXT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 80, 20));

        pricing.setEditable(false);
        pricing.setBackground(new java.awt.Color(255, 255, 255));
        pricing.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        pricing.setForeground(new java.awt.Color(51, 51, 51));
        pricing.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.gray, new java.awt.Color(0, 0, 0), new java.awt.Color(51, 51, 51), java.awt.Color.black));
        jPanel1.add(pricing, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 120, 30));

        date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateActionPerformed(evt);
            }
        });
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 180, 240, 30));
        jPanel1.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 100, 240, 30));

        ca_txtfullname.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        ca_txtfullname.setForeground(new java.awt.Color(255, 255, 255));
        ca_txtfullname.setText("fill in the following info:");
        jPanel1.add(ca_txtfullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        ca_address.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        ca_address.setForeground(new java.awt.Color(51, 51, 51));
        ca_address.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(ca_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 260, 30));

        ca_txtaddress.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        ca_txtaddress.setForeground(new java.awt.Color(255, 255, 255));
        ca_txtaddress.setText("ADDRESS:");
        jPanel1.add(ca_txtaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        ca_txtemail.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        ca_txtemail.setForeground(new java.awt.Color(255, 255, 255));
        ca_txtemail.setText("EMAIL:");
        jPanel1.add(ca_txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 73, -1));

        ca_email.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        ca_email.setForeground(new java.awt.Color(51, 51, 51));
        ca_email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(ca_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 260, 30));

        ca_phonenumber.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        ca_phonenumber.setForeground(new java.awt.Color(51, 51, 51));
        ca_phonenumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(ca_phonenumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 260, 30));

        ca_txtemail1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        ca_txtemail1.setForeground(new java.awt.Color(255, 255, 255));
        ca_txtemail1.setText("PHONE NO:");
        jPanel1.add(ca_txtemail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 90, -1));

        durationtxt.setBackground(new java.awt.Color(51, 51, 51));
        durationtxt.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        durationtxt.setForeground(new java.awt.Color(255, 255, 255));
        durationtxt.setText("DURATION:");
        durationtxt.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(durationtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 100, 20));

        ca_fullname.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        ca_fullname.setForeground(new java.awt.Color(51, 51, 51));
        ca_fullname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(ca_fullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 260, 30));

        schedule.setAutoCreateRowSorter(true);
        schedule.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        schedule.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DATE BOOKED:", "TIME BOOKED:", "NAME:", "ADDRESS:", "PHONE NO:", "EMAIL:", "SERVICE:", "PAYMENT", "DURATION:", "DATE:", "TIME:", "AMOUNT:"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Long.class
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
        schedule.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        schedule.setSurrendersFocusOnKeystroke(true);
        schedule.getTableHeader().setResizingAllowed(false);
        schedule.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(schedule);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 900, 340));

        Confirmbutton1.setBackground(new java.awt.Color(255, 255, 255));
        Confirmbutton1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        Confirmbutton1.setForeground(new java.awt.Color(51, 51, 51));
        Confirmbutton1.setText("CONFIRM");
        Confirmbutton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Confirmbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Confirmbutton1ActionPerformed(evt);
            }
        });
        jPanel1.add(Confirmbutton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 260, 240, 30));

        Receipt.setBackground(new java.awt.Color(255, 255, 255));
        Receipt.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        Receipt.setForeground(new java.awt.Color(51, 51, 51));
        Receipt.setText("show receipt");
        Receipt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Receipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReceiptActionPerformed(evt);
            }
        });
        jPanel1.add(Receipt, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 730, 130, 30));

        backButton.setBackground(new java.awt.Color(255, 255, 255));
        backButton.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        backButton.setForeground(new java.awt.Color(51, 51, 51));
        backButton.setText("BACK");
        backButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 730, 110, 30));

        tinetxt.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        tinetxt.setForeground(new java.awt.Color(255, 255, 255));
        tinetxt.setText("Select time between (8:00 am - 5:00 pm)");
        tinetxt.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(tinetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 80, 290, 20));

        jLabel20.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("------------------------------------------------------------------------ --------------------------------");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 950, 30));

        fftxt.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        fftxt.setForeground(new java.awt.Color(255, 255, 255));
        fftxt.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3), "* * *  MY BOOKINGS * * * ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Serif", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.add(fftxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 960, 460));

        dateDisplay.setEditable(false);
        dateDisplay.setBackground(new java.awt.Color(255, 255, 255));
        dateDisplay.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        dateDisplay.setForeground(new java.awt.Color(51, 51, 51));
        dateDisplay.setText("11/12/2024");
        dateDisplay.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(dateDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 30, -1, 20));

        timeDisplay.setEditable(false);
        timeDisplay.setBackground(new java.awt.Color(255, 255, 255));
        timeDisplay.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        timeDisplay.setForeground(new java.awt.Color(51, 51, 51));
        timeDisplay.setText("10: 30 am");
        timeDisplay.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(timeDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 30, 90, 20));

        jLabel4.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText(" * * * * * PERSONAL INFORMATION * * * * *");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 400, 40));

        jLabel25.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("-----------------------------------------------------------------------------------------------------------");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 970, -1));

        ca_txtfullname1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        ca_txtfullname1.setForeground(new java.awt.Color(255, 255, 255));
        ca_txtfullname1.setText("FULLNAME:");
        jPanel1.add(ca_txtfullname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        MONTH.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        MONTH.setForeground(new java.awt.Color(51, 51, 51));
        MONTH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        MONTH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MONTHActionPerformed(evt);
            }
        });
        jPanel1.add(MONTH, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 220, 90, 20));

        HOUR1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        HOUR1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", " " }));
        HOUR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HOUR1ActionPerformed(evt);
            }
        });
        jPanel1.add(HOUR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 140, 70, 20));

        YEAR.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        YEAR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "2024", "2025" }));
        YEAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YEARActionPerformed(evt);
            }
        });
        jPanel1.add(YEAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 220, 80, 20));

        amORpm1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        amORpm1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Am", "Pm", " " }));
        amORpm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amORpm1ActionPerformed(evt);
            }
        });
        jPanel1.add(amORpm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 140, 90, 20));

        DATE.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        DATE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " " }));
        DATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DATEActionPerformed(evt);
            }
        });
        jPanel1.add(DATE, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 220, 60, 20));

        MINUTE1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        MINUTE1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        MINUTE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MINUTE1ActionPerformed(evt);
            }
        });
        jPanel1.add(MINUTE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 140, 60, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 800));

        setSize(new java.awt.Dimension(1016, 839));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void serviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serviceActionPerformed

        String selectedService = service.getSelectedItem().toString();
        switch (selectedService) {
            case "BASIC HOUSE CLEANING":
            duration.setText("4 hours");
            pricing.setText("3500");
            break;
            case "DEEP CLEANING":
            duration.setText("6 hours");
            pricing.setText("5500");
            break;
            case "LAUNDRY SERVICE":
            duration.setText("3 hours");
            pricing.setText("750");
            break;
            case "GREEN CLEANING":
            duration.setText("5 hours");
            pricing.setText("5000");
            break;
            case "MOVE IN & MOVE OUT":
            duration.setText("3 hours");
            pricing.setText("3200");
            break;
            case "POST CONSTRUCTION CLEANING":
            duration.setText("4 hours");
            pricing.setText("2200");
            break;
            default:
            pricing.setText("");
            break;
        }
    }//GEN-LAST:event_serviceActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed

        int selectedRow = schedule.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Please select a row to delete.", "Error", JOptionPane.ERROR_MESSAGE);
        return; // You should return if there's no row selected
    }

    int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to cancel your service?", "Confirmation", JOptionPane.YES_NO_OPTION);

    if (confirm == JOptionPane.YES_OPTION) {
        scheduleModel.removeRow(selectedRow);
        JOptionPane.showMessageDialog(this, "You have successfully cancelled your order.");
    } else {
        JOptionPane.showMessageDialog(null, "Your cancellation has been cancelled.");
    }
    }//GEN-LAST:event_deleteActionPerformed

    private void Confirmbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Confirmbutton1ActionPerformed
        String fullname = ca_fullname.getText();
        String address = ca_address.getText();
        String number = ca_phonenumber.getText();
        String email = ca_email.getText();
        String services = service.getSelectedItem().toString();
        String payments = payment.getSelectedItem().toString();
        String durationSelect = duration.getText();
        String pricingSelect = pricing.getText();
        String inputDate = date.getText();
        String inputTime = time.getText();
        
        
            String currentTime = timeDisplay.getText();
            String Date = dateDisplay.getText();

        // Validation
        if (!fullname.matches("[a-zA-Z ]+")) {
            JOptionPane.showMessageDialog(this, "Please enter a valid name (only alphabetic characters and spaces)", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!address.matches("[a-zA-Z0-9 ]+")) {
            JOptionPane.showMessageDialog(this, "Please enter a valid address (only alphabetic characters, spaces, and numbers)", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!number.matches("[0-9]{11}")) {
            JOptionPane.showMessageDialog(this, "Please enter a valid 11-digit phone number", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (fullname.isEmpty() || address.isEmpty() || number.isEmpty() || email.isEmpty() || services.isEmpty() || payments.isEmpty() || inputDate.isEmpty() || inputTime.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill up the form properly", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

       // Parsing Time
          DateFormat timeFormat = new SimpleDateFormat("hh:mm a");
          Date parsedTime;
          try {
          parsedTime = timeFormat.parse(inputTime);
          Calendar calendar = Calendar.getInstance();
          calendar.setTime(parsedTime);
          int hour = calendar.get(Calendar.HOUR_OF_DAY);
          if (hour < 8 || hour >= 17) {
          throw new ParseException("Time must be between 8:00 AM and 5:00 PM", 0);
           }
          } catch (ParseException e) {
          JOptionPane.showMessageDialog(null, "Invalid time format or time must be between 8:00 AM and 5:00 PM (hh:mm a)", "Error", JOptionPane.ERROR_MESSAGE);
           return;
           }


          /*DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
          LocalDate currentDate = LocalDate.now();
          LocalDate parsedDate;

          try {
          parsedDate = LocalDate.parse(inputDate, dateFormatter);

    // Calculate the end date for the two-week period
          LocalDate endDate = currentDate.plusWeeks(2);

    // Check if the parsed date is within the valid range (current date to two weeks from now)
         if (parsedDate.isBefore(currentDate) || parsedDate.isAfter(endDate)) {
        throw new DateTimeParseException("Date must be between current date and two weeks from now", inputDate, 0);
        }
        } catch (DateTimeParseException e) {
        JOptionPane.showMessageDialog(null, "Invalid date format or date must be between current date and two weeks from now (yyyy-MM-dd)", "Error", JOptionPane.ERROR_MESSAGE);
        return;
         }  */
        // Confirmation dialog
        int option = JOptionPane.showConfirmDialog(this,
            "Please confirm the following details:\n\n"
            + "Full Name: " + fullname + "\n"
            + "Address: " + address + "\n"
            + "Phone Number: " + number + "\n"
            + "Email: " + email + "\n"
            + "Selected Service: " + services + "\n"
            + "Payment Method: " + payments + "\n"
            + "Duration: " + durationSelect + "\n"
            + "Date: " + inputDate + "\n"
            + "Time: " + inputTime + "\n"
            + "Pricing: " + pricingSelect + "\n\n"
            + "Is everything correct?",
            "Confirmation",
            JOptionPane.YES_NO_OPTION);

        String[] data = {Date, currentTime, fullname, address,number,email,services,payments, durationSelect,inputDate,inputTime,pricingSelect  };
        storeDataToFile(data);

        if (option == JOptionPane.YES_OPTION) {

            String selectedPaymentMethod = payment.getSelectedItem().toString();
            String totalAmount = pricing.getText();

            switch (selectedPaymentMethod) {
                case "Bank Transfer":
                // Display a dialog for bank transfer payment
                String bankTransferMessage = "Please transfer the payment for the service:\n\n"
                + "Amount: " + totalAmount;

                String bankAccount = JOptionPane.showInputDialog("Please enter your bank account number ");
                String bankAmountString = JOptionPane.showInputDialog(
                    "Total Amount:  " +  totalAmount
                    + "\nEnter the total amount:");

                if (bankAmountString != null && !bankAmountString.isEmpty()) {
                    // Here, you need to parse the bankAmountString to a double for comparison
                    double enteredAmount = Double.parseDouble(bankAmountString);
                    double actualAmount = Double.parseDouble(totalAmount);

                    // Compare the entered amount with the total amount
                    if (enteredAmount == actualAmount) {
                        JOptionPane.showMessageDialog(null, "Your payment has been successfully confirmed.", "CONFIRMED", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Entered amount does not match the total amount. Please enter the correct amount.", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Amount is required.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                break;

                case "Gcash":
                // Display a dialog for Gcash payment
                String gcashMessage = "Please transfer the total amount of " + totalAmount + " to the following Gcash account:\n\n"
                + "Gcash Number: [0956 786 0754]\n"
                + "Amount: " + totalAmount;
                String gcashAccount = JOptionPane.showInputDialog("Please enter your Gcash account number ");
                String gcashAmountString = JOptionPane.showInputDialog(
                    "Total Amount:  " +  totalAmount
                    + "\nEnter the total amount:");

                if (gcashAmountString != null && !gcashAmountString.isEmpty()) {
                    try {
                        double gcashAmount = Double.parseDouble(gcashAmountString);
                        // Compare the entered amount with the total amount
                        if (gcashAmount == Double.parseDouble(totalAmount)) {
                            JOptionPane.showMessageDialog(null, "Your payment of " + gcashAmount + " has been successfully confirmed.", "CONFIRMED", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "Entered amount does not match the total amount. Please enter the correct amount.", "Error", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Invalid amount. Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Amount is required.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                break;

                case "In Counter Payment":
                // Display a dialog for in counter payment
                String inCounterMessage = "Please proceed to our office to make the payment in cash.\n\n"
                        + "Present this receipt in the counter."
                        +  "------------------------------\n"
                        + "***Receipt Details***:\n"
                        + "------------------------------\n"
                        + " \n "
                        //+ "Date Booked: " + date + "\n"
                       // + "Date Booked: " + timeDisplay + "\n"
                        + "Full Name: " + fullname + "\n"
                        + "Address: " + address + "\n"
                        + "Phone Number: " + number + "\n"
                        + "Email: " + email + "\n"
                        + "Selected Service: " + services + "\n"
                        + "Payment Method: " + payments + "\n"
            //+ "Account number: " + bankAccount + "\n"
                        + "Duration: " + durationSelect + "\n"
                        + "Date: " + inputDate + "\n"
                        + "Time: " + inputTime + "\n"
                        + "Pricing: " + pricingSelect + "\n"
                        + "\n"
                        + "Our office is located at San Miguel, Near at Meralco , Manolo Fortich Bukidnon." + "\n"
                        + "For other information, Please contact:"+ "\n"
                        + "fb: nekochii@fb" + "\n"
                        + "contact no: 090955435435 " + "\n"
                        +"\n\n"
                        + "Thank you for using House Cleaning Booking System!." + "\n"
                        + "SERVING YOU WITH A QUALITY OF "  + "\n"
                        + "SERVICE AND EXPERIENCE." + "\n"
                        + "------------------------------\n"
                        + "------------------------------\n"
                        + " \n ";
                        
                JOptionPane.showMessageDialog(this, inCounterMessage, "In Counter Payment", JOptionPane.INFORMATION_MESSAGE);
                break;
                case "Door to Door Payment":
                // Display a dialog for door to door payment
                String doorToDoorMessage = "Our representative will collect the payment in cash upon service delivery.\n\n"
                        + "------------------------------\n"
                        + "***Receipt Details***:\n"
                        + "------------------------------\n"
                        + " \n "
                        //+ "Date Booked: " + date + "\n"
                       // + "Date Booked: " + timeDisplay + "\n"
                        + "Full Name: " + fullname + "\n"
                        + "Address: " + address + "\n"
                        + "Phone Number: " + number + "\n"
                        + "Email: " + email + "\n"
                        + "Selected Service: " + services + "\n"
                        + "Payment Method: " + payments + "\n"
            //+ "Account number: " + bankAccount + "\n"
                        + "Duration: " + durationSelect + "\n"
                        + "Date: " + inputDate + "\n"
                        + "Time: " + inputTime + "\n"
                        + "Pricing: " + pricingSelect + "\n"
                        + "\n"
                        + "Office located at San Miguel, Near at Meralco , Manolo Fortich Bukidnon.8703" + "\n"
                        + "For other information, Please contact:"+ "\n"
                        + "fb: nekochii@fb" + "\n"
                        + "contact no: 090955435435 " + "\n"
                        +"\n\n"
                        + "Thank you for using House Cleaning Booking System!." + "\n"
                        + "SERVING YOU WITH A QUALITY "
                        + "OF SERVICE AND EXPERIENCE." + "\n"
                        + "------------------------------\n"
                        + "------------------------------\n"
                        + " \n ";
              
                JOptionPane.showMessageDialog(this, doorToDoorMessage, "Door to Door Payment", JOptionPane.INFORMATION_MESSAGE);
                break;
                                       
                default:
                // Handle unexpected input
                JOptionPane.showMessageDialog(this, "Invalid payment method", "Error", JOptionPane.ERROR_MESSAGE);
                break;

            }

            JOptionPane.showMessageDialog(this, "Booking Confirmed!");


            scheduleModel.addRow(new Object[]{
                Date,currentTime,  fullname, address, number, email, services, payments, durationSelect, inputDate, inputTime, pricingSelect
            });
            clearForm();
            
            /*BookingHistory history = new BookingHistory();
            history.setVisible(true);
            this.dispose*/

        } else if (option == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Try again later");
        }
    }//GEN-LAST:event_Confirmbutton1ActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        UserDashboard menu = new UserDashboard();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void MONTHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MONTHActionPerformed

        updateSelectedDateLabel();
    }//GEN-LAST:event_MONTHActionPerformed

    private void YEARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YEARActionPerformed

        updateSelectedDateLabel();
    }//GEN-LAST:event_YEARActionPerformed

    private void HOURActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DATEActionPerformed

        updateSelectedTimeLabel();
    }//GEN-LAST:event_DATEActionPerformed

    private void amORpmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmOrPmActionPerformed
      updateSelectedTimeLabel();
    }//GEN-LAST:event_AmOrPmActionPerformed

    private void DATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DATE2ActionPerformed
       
    }//GEN-LAST:event_DATE2ActionPerformed

    private void MINUTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DATE3ActionPerformed
       updateSelectedTimeLabel();
    }//GEN-LAST:event_DATE3ActionPerformed

    private void HOUR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HOUR1ActionPerformed
       updateSelectedTimeLabel();
    }//GEN-LAST:event_HOUR1ActionPerformed

    private void MINUTE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MINUTE1ActionPerformed
        updateSelectedTimeLabel();
    }//GEN-LAST:event_MINUTE1ActionPerformed

    private void amORpm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amORpm1ActionPerformed
        updateSelectedTimeLabel();
    }//GEN-LAST:event_amORpm1ActionPerformed

    private void ReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReceiptActionPerformed
       int selectedRow = schedule.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Please select a row to see the receipt.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    String fullname = (String) schedule.getValueAt(selectedRow, 0);
    String address = (String) schedule.getValueAt(selectedRow, 1);
    String number = (String) schedule.getValueAt(selectedRow, 2);
    String email = (String) schedule.getValueAt(selectedRow, 3);
    String services = (String) schedule.getValueAt(selectedRow, 4);
    String payments = (String) schedule.getValueAt(selectedRow, 5);
    String durationSelect = (String) schedule.getValueAt(selectedRow, 6);
    String inputDate = (String) schedule.getValueAt(selectedRow, 7);
    String inputTime = (String) schedule.getValueAt(selectedRow, 8);
    String pricingSelect = (String) schedule.getValueAt(selectedRow, 9);

    // Generate and print the receipt
    String receipt = generateReceipt(fullname, address, number, email, services, payments, durationSelect, inputDate, inputTime, pricingSelect);
    JOptionPane.showMessageDialog(null, receipt);
    }

    private String generateReceipt(String fullname, String address, String number, String email, String services, String payments, String durationSelect, String inputDate, String inputTime, String pricingSelect) {
   
    String receipt 
            = "------------------------------\n"
            + "***Receipt Details***:\n"
            + "------------------------------\n"
            + " \n "
            //+ "Date Booked: " + date + "\n"
            //+ "Date Booked: " + timeDisplay + "\n"
            + "Full Name: " + fullname + "\n"
            + "Address: " + address + "\n"
            + "Phone Number: " + number + "\n"
            + "Email: " + email + "\n"
            + "Selected Service: " + services + "\n"
            + "Payment Method: " + payments + "\n"
            //+ "Account number: " + bankAccount + "\n"
            + "Duration: " + durationSelect + "\n"
            + "Date: " + inputDate + "\n"
            + "Time: " + inputTime + "\n"
            + "Pricing: " + pricingSelect + "\n"
             
            + "Thank you for using House Cleaning Booking System!." + "\n"
            + "SERVING YOU WITH A QUALITY OF " + "\n"
            + "SERVICE AND EXPERIENCE." + "\n"
            + "------------------------------\n"
            + "***Receipt Details***:\n"
            + "------------------------------\n"
            + " \n ";
    return receipt;

    }//GEN-LAST:event_ReceiptActionPerformed

    private void dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateActionPerformed

       
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookingForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Confirmbutton1;
    private javax.swing.JComboBox<String> DATE;
    private javax.swing.JComboBox<String> HOUR1;
    private javax.swing.JComboBox<String> MINUTE1;
    private javax.swing.JComboBox<String> MONTH;
    private javax.swing.JLabel PRICINGTXT1;
    private javax.swing.JButton Receipt;
    private javax.swing.JComboBox<String> YEAR;
    private javax.swing.JComboBox<String> amORpm1;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField ca_address;
    private javax.swing.JTextField ca_email;
    private javax.swing.JTextField ca_fullname;
    private javax.swing.JTextField ca_phonenumber;
    private javax.swing.JLabel ca_txtaddress;
    private javax.swing.JLabel ca_txtemail;
    private javax.swing.JLabel ca_txtemail1;
    private javax.swing.JLabel ca_txtfullname;
    private javax.swing.JLabel ca_txtfullname1;
    private javax.swing.JTextField date;
    private javax.swing.JTextField dateDisplay;
    private javax.swing.JLabel datetxt;
    private javax.swing.JButton delete;
    private javax.swing.JTextField duration;
    private javax.swing.JLabel durationtxt;
    private javax.swing.JLabel fftxt;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> payment;
    private javax.swing.JLabel paymenttxt;
    public javax.swing.JTextField pricing;
    public javax.swing.JTable schedule;
    private javax.swing.JComboBox<String> service;
    private javax.swing.JLabel servicetxt;
    private javax.swing.JTextField time;
    public javax.swing.JTextField timeDisplay;
    private javax.swing.JLabel tinetxt;
    // End of variables declaration//GEN-END:variables
}
