/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.ProfessorPanel;

import Business.Business;
import Courses.Course;
import Courses.CourseSchedule;
import Professor.Professor;
import UI.MainJFrame;
import UI.StudentPanel.TranscriptPanel;
import UserAccount.UserAccount;
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ankithreddy
 */
public class ProfessorJFrame extends javax.swing.JFrame {

    private Business business;
    private UserAccount useraccount;
    
    /**
     * Creates new form ProfJFrame
     */
    public ProfessorJFrame() {
        initComponents();
    }
    
    
      public ProfessorJFrame(Business business, UserAccount useraccount) {
        initComponents();
        this.setVisible(true);
        this.business = business;
        this.useraccount = useraccount;
        if(this.useraccount.getProfessor().getProfCourseList().size()!=0){
           populateCourseTbl();
         }
        System.out.println("size of courselist is "+ this.business.getCourseCatalogue().getCourseList().size());
        welcomeNameTxt.setText(this.useraccount.getUsername());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        welcomeNameTxt = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        manageAccountBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        courseNametxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Idtxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        creditsTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        costperCredittxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        totalCoursePriceTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        DescriptionTxt = new javax.swing.JTextField();
        addCourseBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        coursesTbl = new javax.swing.JTable();
        updateBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ScheduleCbox = new javax.swing.JComboBox<>();
        langCBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Welcome Professor");

        welcomeNameTxt.setFont(new java.awt.Font("Helvetica Neue", 3, 13)); // NOI18N
        welcomeNameTxt.setForeground(new java.awt.Color(255, 255, 255));

        backBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("LOGOUT");
        backBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        backBtn.setContentAreaFilled(false);
        backBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        manageAccountBtn.setText("Manage Account");
        manageAccountBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageAccountBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel5)
                .addGap(36, 36, 36)
                .addComponent(welcomeNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 423, Short.MAX_VALUE)
                .addComponent(manageAccountBtn)
                .addGap(44, 44, 44)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(manageAccountBtn)
                            .addComponent(backBtn)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(welcomeNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jSplitPane1.setTopComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Course Name");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Course Code");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Credits");

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cost Per Credit");

        costperCredittxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                costperCredittxtKeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Total Course Price");

        totalCoursePriceTxt.setEditable(false);

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Description");

        addCourseBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        addCourseBtn.setText("Add course");
        addCourseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCourseBtnActionPerformed(evt);
            }
        });

        coursesTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Course Name", "Course Code", "Credits", "Description", "Cost per Credit", "Total Cost", "Language"
            }
        ));
        coursesTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                coursesTblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(coursesTbl);

        updateBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        updateBtn.setText("Update course");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        DeleteBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        DeleteBtn.setText("Delete course");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Medium of Instruction");

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Schedule");

        ScheduleCbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Summer", "Spring", "Fall" }));

        langCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "English", "Mandarin", "Japanese", "Korean", "Hindi" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ScheduleCbox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(langCBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(48, 48, 48)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DescriptionTxt)
                            .addComponent(creditsTxt)
                            .addComponent(Idtxt)
                            .addComponent(addCourseBtn)
                            .addComponent(costperCredittxt)
                            .addComponent(totalCoursePriceTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(courseNametxt, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addComponent(updateBtn)
                        .addGap(309, 309, 309)
                        .addComponent(DeleteBtn)
                        .addGap(40, 40, 40))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel1))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(courseNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(Idtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(creditsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(costperCredittxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(totalCoursePriceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(langCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(ScheduleCbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(DescriptionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(updateBtn)
                            .addComponent(DeleteBtn))))
                .addGap(30, 30, 30)
                .addComponent(addCourseBtn)
                .addGap(41, 41, 41))
        );

        jSplitPane1.setRightComponent(jPanel2);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

     public  void populateCourseTbl (){
        DefaultTableModel model=(DefaultTableModel)coursesTbl.getModel();
        model.setRowCount(0);
        for( Course c : this.useraccount.getProfessor().getProfCourseList()){
            Object[] row=new Object[7];
            row[0]=c;
            row[1]=c.getId();
            row[2]=c.getCredits();
            row[3]=c.getDescription();
            row[4]=c.getCostPerCredit();
            row[5]=c.getTotalCoursePrice();
            row[6]=c.getLanguage();
            
            model.addRow(row);
        }
    }
    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new MainJFrame(business,useraccount);
    }//GEN-LAST:event_backBtnActionPerformed

    private void costperCredittxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_costperCredittxtKeyPressed
    // TODO add your handling code here:
    String creditsStr = creditsTxt.getText().trim();
    String costpercreditStr = costperCredittxt.getText().trim();

    if (!creditsStr.isEmpty() && !costpercreditStr.isEmpty()) {
        try {
            double credits = Double.parseDouble(creditsStr);
            double costpercredit = Double.parseDouble(costpercreditStr);
            double totalCoursePrice = credits * costpercredit*10;
            totalCoursePriceTxt.setText(String.format("%.1f", totalCoursePrice));
        } catch (NumberFormatException e) {
            // handle the exception as needed
        }
    } else {
        // handle empty inputs as needed
    }

    }//GEN-LAST:event_costperCredittxtKeyPressed

    private void addCourseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCourseBtnActionPerformed
        // TODO add your handling code here:
        
       String cname=  courseNametxt.getText();
       String code= Idtxt.getText();
       String credits= creditsTxt.getText();
       String des=  DescriptionTxt.getText();
       String costperc= costperCredittxt.getText();
       String totalprice= totalCoursePriceTxt.getText();
      // String lang= languageTxt.getText();
       String language = (String) langCBox.getSelectedItem();
       String schedule = (String) ScheduleCbox.getSelectedItem();
       
       if (cname.equals("")||code.equals("")||credits.equals("")||des.equals("")||totalprice.equals("")){
           JOptionPane.showMessageDialog(null, "please fill all details to add a course");
       } else {
        
        Professor p = this.business.getProfessorDirectory().searchProfessor(welcomeNameTxt.getText());
        Course c = new Course(courseNametxt.getText(), Integer.parseInt(Idtxt.getText()),Integer.parseInt( creditsTxt.getText()), DescriptionTxt.getText(),Integer.parseInt(costperCredittxt.getText()), language);
        c.setProfessor(p);
        //setting the course schedule to course
        CourseSchedule cs = new CourseSchedule(schedule);
        c.setCourseSchedule(cs);
        //adding in professor list
        useraccount.getProfessor().getProfCourseList().add(c);
        System.out.println("this is professor course list "+useraccount.getProfessor().getProfCourseList().get(0).getName());
       //adding in business 
        this.business.addcourseinbusiness(c);
        System.out.println("this is business course list "+this.business.getCourseCatalogue().getCourseList().get(0).getName());

        populateCourseTbl();

        JOptionPane.showMessageDialog(null,  "Course has been added");
        courseNametxt.setText("");
        Idtxt.setText("");
        creditsTxt.setText("");
        DescriptionTxt.setText("");
        costperCredittxt.setText("");
        totalCoursePriceTxt.setText("");
    //    languageTxt.setText("");
    
       }
    }//GEN-LAST:event_addCourseBtnActionPerformed

    private void coursesTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_coursesTblMouseClicked
        // TODO add your handling code here:
        if(coursesTbl.getSelectedRowCount()==1){
            int selectedRowIndex=coursesTbl.getSelectedRow();
            DefaultTableModel model= (DefaultTableModel )coursesTbl.getModel();
            courseNametxt.setText(model.getValueAt(selectedRowIndex, 0).toString());
            Idtxt.setText(model.getValueAt(selectedRowIndex, 1).toString());
            creditsTxt.setText(model.getValueAt(selectedRowIndex, 2).toString());
            DescriptionTxt.setText(model.getValueAt(selectedRowIndex, 3).toString());
            costperCredittxt.setText(model.getValueAt(selectedRowIndex, 4).toString());
        }
    }//GEN-LAST:event_coursesTblMouseClicked

    private void manageAccountBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageAccountBtnActionPerformed
        // TODO add your handling code here:
               jSplitPane1.setRightComponent(new ManageAccountPanel(this.business,this.useraccount));  

    }//GEN-LAST:event_manageAccountBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
       int selectedRow=coursesTbl.getSelectedRow();
       String cname=  courseNametxt.getText();
       String code= Idtxt.getText();
       String credits= creditsTxt.getText();
       String des=  DescriptionTxt.getText();
       String costperc= costperCredittxt.getText();
       String totalprice= totalCoursePriceTxt.getText();
       String language = (String) langCBox.getSelectedItem();
       String schedule = (String) ScheduleCbox.getSelectedItem();
       
        if (cname.equals("")||code.equals("")||credits.equals("")||des.equals("")||totalprice.equals("")){
           JOptionPane.showMessageDialog(null, "please fill all details to update a course");
       } else {
          

        String coursename = (coursesTbl.getValueAt(selectedRow, 0)).toString();
         Course c = this.business.getCourseCatalogue().searchcourse(coursename);
        Course pc = this.useraccount.getProfessor().searchCourseinProCList(coursename);
         c.setName(courseNametxt.getText());
         c.setId(parseInt(Idtxt.getText()));
         c.setCredits(parseInt(creditsTxt.getText()));
         c.setDescription(DescriptionTxt.getText());
         c.setCostPerCredit(parseInt(costperCredittxt.getText()));
         c.setLanguage(language);
         c.getCourseSchedule().setSemester(schedule);
         
         pc.setName(courseNametxt.getText());
         pc.setId(parseInt(Idtxt.getText()));
         pc.setCredits(parseInt(creditsTxt.getText()));
         pc.setDescription(DescriptionTxt.getText());
         pc.setCostPerCredit(parseInt(costperCredittxt.getText()));
         pc.setLanguage(language);
         pc.getCourseSchedule().setSemester(schedule);
         System.out.println(pc.getName()+"is scheduled in "+pc.getCourseSchedule().getSemester());
         
         JOptionPane.showMessageDialog(null, "course has been updated");
         
        populateCourseTbl();
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        // TODO add your handling code here:
         int selectedRow=coursesTbl.getSelectedRow();

        String coursename = (coursesTbl.getValueAt(selectedRow, 0)).toString();
         Course c = this.business.getCourseCatalogue().searchcourse(coursename);
         this.business.getCourseCatalogue().deleteCourse(c);
         this.useraccount.getProfessor().deleteCourseProf(c);
      //   this.useraccount.getProfessor().getProfCourseList().
      populateCourseTbl();

      JOptionPane.showMessageDialog(null, "course has been removed");
        
        
    }//GEN-LAST:event_DeleteBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ProfessorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfessorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfessorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfessorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProfessorJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JTextField DescriptionTxt;
    private javax.swing.JTextField Idtxt;
    private javax.swing.JComboBox<String> ScheduleCbox;
    private javax.swing.JButton addCourseBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField costperCredittxt;
    private javax.swing.JTextField courseNametxt;
    private javax.swing.JTable coursesTbl;
    private javax.swing.JTextField creditsTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JComboBox<String> langCBox;
    private javax.swing.JButton manageAccountBtn;
    private javax.swing.JTextField totalCoursePriceTxt;
    private javax.swing.JButton updateBtn;
    private javax.swing.JLabel welcomeNameTxt;
    // End of variables declaration//GEN-END:variables
}
