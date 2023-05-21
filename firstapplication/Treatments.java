/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package firstapplication;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author sayed
 */
public class Treatments extends javax.swing.JFrame {

    /**
     * Creates new form Treatments
     */
    public Treatments() {
        initComponents();
        DisplayTreat();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel51 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel66 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        PatientLB = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        PrescripLB = new javax.swing.JLabel();
        AppointLB = new javax.swing.JLabel();
        DashLB = new javax.swing.JLabel();
        LogoutLB = new javax.swing.JLabel();
        Logout = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        TNameTB = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        CostTB = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        MedicineTB = new javax.swing.JTextField();
        EditBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        jLabel67 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TreatmentTable = new javax.swing.JTable();
        SelectBtn = new javax.swing.JButton();
        ClearBTN = new javax.swing.JButton();

        jLabel51.setFont(new java.awt.Font("Cambria", 0, 22)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(0, 51, 102));
        jLabel51.setText("Appointments");

        jLabel64.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel64.setText("Medicines");

        jButton3.setBackground(new java.awt.Color(0, 204, 102));
        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Save");

        jLabel66.setFont(new java.awt.Font("Cambria", 0, 22)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(0, 51, 102));
        jLabel66.setText("Prescriptions List");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\sayed\\OneDrive\\Desktop\\FirstApplication\\auaf_logo (1).jpg")); // NOI18N
        jLabel10.setMaximumSize(new java.awt.Dimension(150, 150));
        jLabel10.setMinimumSize(new java.awt.Dimension(150, 150));

        PatientLB.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        PatientLB.setForeground(new java.awt.Color(255, 255, 255));
        PatientLB.setText("Patients");
        PatientLB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PatientLBMouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Cambria", 0, 22)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("AUAF Clinic");

        jLabel13.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Treatment");

        PrescripLB.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        PrescripLB.setForeground(new java.awt.Color(255, 255, 255));
        PrescripLB.setText("Prescription");
        PrescripLB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrescripLBMouseClicked(evt);
            }
        });

        AppointLB.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        AppointLB.setForeground(new java.awt.Color(255, 255, 255));
        AppointLB.setText("Appointment");
        AppointLB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AppointLBMouseClicked(evt);
            }
        });

        DashLB.setFont(new java.awt.Font("Cambria", 0, 22)); // NOI18N
        DashLB.setForeground(new java.awt.Color(255, 255, 255));
        DashLB.setText("Dashboard");
        DashLB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DashLBMouseClicked(evt);
            }
        });

        LogoutLB.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        LogoutLB.setForeground(new java.awt.Color(255, 255, 255));
        LogoutLB.setText("Logout");
        LogoutLB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutLBMouseClicked(evt);
            }
        });

        Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/firstapplication/logsingout.jpg"))); // NOI18N
        Logout.setMaximumSize(new java.awt.Dimension(150, 150));
        Logout.setMinimumSize(new java.awt.Dimension(150, 150));
        Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutMouseClicked(evt);
            }
        });

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/firstapplication/pres (1).jpg"))); // NOI18N
        jLabel24.setMaximumSize(new java.awt.Dimension(150, 150));
        jLabel24.setMinimumSize(new java.awt.Dimension(150, 150));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/firstapplication/treatment (1).png"))); // NOI18N
        jLabel25.setMaximumSize(new java.awt.Dimension(150, 150));
        jLabel25.setMinimumSize(new java.awt.Dimension(150, 150));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/firstapplication/appoint (1).png"))); // NOI18N
        jLabel26.setMaximumSize(new java.awt.Dimension(150, 150));
        jLabel26.setMinimumSize(new java.awt.Dimension(150, 150));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/firstapplication/dash1 (2).jpg"))); // NOI18N
        jLabel27.setMaximumSize(new java.awt.Dimension(150, 150));
        jLabel27.setMinimumSize(new java.awt.Dimension(150, 150));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/firstapplication/paitents (1).png"))); // NOI18N
        jLabel28.setMaximumSize(new java.awt.Dimension(150, 150));
        jLabel28.setMinimumSize(new java.awt.Dimension(150, 150));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LogoutLB))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DashLB)
                                    .addComponent(PatientLB)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AppointLB))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PrescripLB))))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel13))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel12))))
                .addGap(0, 24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel13)))
                        .addGap(51, 51, 51)
                        .addComponent(DashLB)
                        .addGap(21, 21, 21))
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(PatientLB)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(AppointLB)
                        .addGap(63, 63, 63)
                        .addComponent(PrescripLB)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(LogoutLB)
                        .addGap(35, 35, 35))))
        );

        jLabel18.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel18.setText("Name");

        jLabel52.setFont(new java.awt.Font("Cambria", 0, 22)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(0, 51, 102));
        jLabel52.setText("Treatments");

        TNameTB.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        jLabel63.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel63.setText("Cost");

        CostTB.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        jLabel65.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel65.setText("Medicines");

        MedicineTB.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        EditBtn.setBackground(new java.awt.Color(0, 0, 0));
        EditBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        EditBtn.setForeground(new java.awt.Color(255, 255, 255));
        EditBtn.setText("Edit");
        EditBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditBtnMouseClicked(evt);
            }
        });

        DeleteBtn.setBackground(new java.awt.Color(204, 51, 0));
        DeleteBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        DeleteBtn.setText("Delete");
        DeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseClicked(evt);
            }
        });

        jLabel67.setFont(new java.awt.Font("Cambria", 0, 22)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(0, 51, 102));
        jLabel67.setText("Treatments List");

        TreatmentTable.setBackground(new java.awt.Color(193, 224, 255));
        TreatmentTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TreatmentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Patient's Name", "Treatments", "Cost", "Medicines"
            }
        ));
        TreatmentTable.setRowHeight(30);
        TreatmentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TreatmentTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TreatmentTable);

        SelectBtn.setBackground(new java.awt.Color(0, 204, 102));
        SelectBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SelectBtn.setForeground(new java.awt.Color(255, 255, 255));
        SelectBtn.setText("Save");
        SelectBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SelectBtnMouseClicked(evt);
            }
        });

        ClearBTN.setBackground(new java.awt.Color(102, 255, 255));
        ClearBTN.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ClearBTN.setForeground(new java.awt.Color(255, 255, 255));
        ClearBTN.setText("Clear");
        ClearBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearBTNMouseClicked(evt);
            }
        });
        ClearBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TNameTB, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(212, 212, 212)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CostTB, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MedicineTB, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(SelectBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(ClearBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(354, 354, 354))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel52)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 902, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(jLabel63)
                            .addComponent(jLabel65))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TNameTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CostTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(MedicineTB, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(40, 84, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ClearBTN)
                            .addComponent(DeleteBtn)
                            .addComponent(EditBtn)
                            .addComponent(SelectBtn))
                        .addGap(27, 27, 27)))
                .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
Connection Con = null;
Statement St = null, St1 = null;
ResultSet Rs = null, Rs1 = null;
    private void DisplayTreat(){
        try{
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/auafdb", "APP","Auaf12345");
            St = Con.createStatement();
            Rs = St.executeQuery("Select * from APP.TREATMENTTBL");
            TreatmentTable.setModel(DbUtils.resultSetToTableModel(Rs));
        }catch(Exception Ex){
            
        }
    }
int TreatID = 0;
private void CountID(){
    try{
        St1 = Con.createStatement();
        Rs1 = St1.executeQuery("Select Max(TREAT_ID) from APP.TREATMENTTBL");
        Rs1.next();
        TreatID = Rs1.getInt(1)+1;
    }catch(Exception Ex){
        Ex.printStackTrace();
    }
}

    private void SelectBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SelectBtnMouseClicked
        if (TNameTB.getText().isEmpty() || CostTB.getText().isEmpty() || MedicineTB.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Missing Information!");
        }else{
            try{
                
                CountID();
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/auafdb", "APP","Auaf12345");
                PreparedStatement add = Con.prepareStatement("insert into TREATMENTTBL values(?,?,?,?)");
                add.setInt(1,TreatID);
                add.setString(2, TNameTB.getText());
                add.setInt(3, Integer.parseInt(CostTB.getText()));
                add.setString(4, MedicineTB.getText());

                int row = add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Details Added Sucessfully :)");
                Con.close();
                DisplayTreat();
                Clear();

            }catch(Exception Ex){
                Ex.printStackTrace();

            }
        }
    }//GEN-LAST:event_SelectBtnMouseClicked
private void Clear(){
    TNameTB.setText("");
    CostTB.setText("");
    MedicineTB.setText("");
}
    private void ClearBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearBTNMouseClicked
        // TODO add your handling code here:
        Clear();
        DisplayTreat();
    }//GEN-LAST:event_ClearBTNMouseClicked
int key = 0;
    private void EditBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBtnMouseClicked
        // TODO add your handling code here:
                if (key == 0){
                    JOptionPane.showMessageDialog(this, "Select the Treatment!");

                }else{
            try{
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/auafdb", "APP","Auaf12345");
                String Query = "Update APP.TREATMENTTBL set TREAT_NAME='"+TNameTB.getText()+"'"+",TREAT_COST=" + CostTB.getText()+""+",TREAT_MEDICINE='"+MedicineTB.getText()+"'"+" where TREAT_ID="+key;
                Statement ADD = Con.createStatement();
                ADD.executeUpdate(Query);
                JOptionPane.showMessageDialog(this, "Treatment Updated Successfully!");
                DisplayTreat();
                Clear();

                }catch(Exception Ex){
                    Ex.printStackTrace();
                }

    }//GEN-LAST:event_EditBtnMouseClicked
    }    
    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
        // TODO add your handling code here:
        if (key == 0){
            JOptionPane.showMessageDialog(this, "Select the Treatment!");
        }
        else{
            try{
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/auafdb", "APP","Auaf12345");
                String Query = "Delete from APP.TREATMENTTBL where TREAT_ID="+key;
                Statement ADD = Con.createStatement();
                ADD.executeUpdate(Query);
                JOptionPane.showMessageDialog(this, "Treatment Delected Successfully!");
                DisplayTreat();
                Clear();
            }catch(Exception Ex){
                Ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void TreatmentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TreatmentTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) TreatmentTable.getModel();
        int Myindex = TreatmentTable.getSelectedRow();
        key = Integer.valueOf(model.getValueAt(Myindex, 0).toString());
        TNameTB.setText(model.getValueAt(Myindex, 1).toString());
        CostTB.setText(model.getValueAt(Myindex, 2).toString());
        MedicineTB.setText(model.getValueAt(Myindex, 3).toString());


    }//GEN-LAST:event_TreatmentTableMouseClicked

    private void ClearBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClearBTNActionPerformed

    private void PatientLBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PatientLBMouseClicked
        // TODO add your handling code here:
        new Patients().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_PatientLBMouseClicked

    private void DashLBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DashLBMouseClicked
        // TODO add your handling code here:
        new Dashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DashLBMouseClicked

    private void AppointLBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AppointLBMouseClicked
        // TODO add your handling code here:
        new Appointment().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AppointLBMouseClicked

    private void PrescripLBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrescripLBMouseClicked
        // TODO add your handling code here:
        new Prescription().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_PrescripLBMouseClicked

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
        // TODO add your handling code here:
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogoutMouseClicked

    private void LogoutLBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutLBMouseClicked
        // TODO add your handling code here:
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogoutLBMouseClicked
    
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
            java.util.logging.Logger.getLogger(Treatments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Treatments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Treatments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Treatments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Treatments().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AppointLB;
    private javax.swing.JButton ClearBTN;
    private javax.swing.JTextField CostTB;
    private javax.swing.JLabel DashLB;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JLabel Logout;
    private javax.swing.JLabel LogoutLB;
    private javax.swing.JTextField MedicineTB;
    private javax.swing.JLabel PatientLB;
    private javax.swing.JLabel PrescripLB;
    private javax.swing.JButton SelectBtn;
    private javax.swing.JTextField TNameTB;
    private javax.swing.JTable TreatmentTable;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
