/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package budgetcontrolsystem.gui;


import budgetcontrolsystem.dao.incomeDao;
import budgetcontrolsystem.dao.spendingDao;
import budgetcontrolsystem.dao.spendingLimitDao;
import budgetcontrolsystem.pojo.userProfile;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;

/**
 *
 * @author aashi
 */
public class ChooseOptionFrame extends javax.swing.JFrame {

    /**
     * Creates new form ChooseOptionFrame
     */
    public ChooseOptionFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        lblUsername.setText("Hello "+userProfile.getUsername());
        setTitle("Choose Option Frame");
        try{
        double income = incomeDao.getTotalIncome();
        String aaa = Double.toString(income);
        txtIncome.setText(aaa);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        try{
        double spending = spendingDao.getTotalSpending();
        String sss = Double.toString(spending);
        txtExpenses.setText(sss);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        try{
        double spendinglimit = spendingLimitDao.getSpendingLimit();
        double spending = spendingDao.getTotalSpending();
        double result = (spendinglimit-spending);
        if(result<0){
           txtLeftSpend.setForeground(Color.RED); 
        }
        String s = Double.toString(result);
        txtLeftSpend.setText(s);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jrbSetSpendingLimit = new javax.swing.JRadioButton();
        jrbAddSpending = new javax.swing.JRadioButton();
        jrbAddIncome = new javax.swing.JRadioButton();
        jrbShowHistory = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        btnDoTask = new javax.swing.JButton();
        lblUsername = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtExpenses = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtIncome = new javax.swing.JTextField();
        txtLeftSpend = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jrbChangePassword = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jrbSetSpendingLimit.setBackground(new java.awt.Color(0, 153, 153));
        buttonGroup1.add(jrbSetSpendingLimit);
        jrbSetSpendingLimit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrbSetSpendingLimit.setForeground(new java.awt.Color(255, 255, 255));
        jrbSetSpendingLimit.setText("Set Spending Limit");
        jrbSetSpendingLimit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbSetSpendingLimitActionPerformed(evt);
            }
        });

        jrbAddSpending.setBackground(new java.awt.Color(0, 153, 153));
        buttonGroup1.add(jrbAddSpending);
        jrbAddSpending.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrbAddSpending.setForeground(new java.awt.Color(255, 255, 255));
        jrbAddSpending.setText("Add Spending");

        jrbAddIncome.setBackground(new java.awt.Color(0, 153, 153));
        buttonGroup1.add(jrbAddIncome);
        jrbAddIncome.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrbAddIncome.setForeground(new java.awt.Color(255, 255, 255));
        jrbAddIncome.setText("Add Income");

        jrbShowHistory.setBackground(new java.awt.Color(0, 153, 153));
        buttonGroup1.add(jrbShowHistory);
        jrbShowHistory.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrbShowHistory.setForeground(new java.awt.Color(255, 255, 255));
        jrbShowHistory.setText("Show History");

        jLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Choose an Option");

        btnDoTask.setBackground(new java.awt.Color(0, 153, 153));
        btnDoTask.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnDoTask.setForeground(new java.awt.Color(255, 255, 255));
        btnDoTask.setText("Do Task");
        btnDoTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoTaskActionPerformed(evt);
            }
        });

        lblUsername.setBackground(new java.awt.Color(0, 153, 153));
        lblUsername.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 255, 255));
        lblUsername.setText("jLabel2");

        lblLogout.setBackground(new java.awt.Color(0, 153, 153));
        lblLogout.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblLogout.setForeground(new java.awt.Color(255, 255, 255));
        lblLogout.setText("Logout");
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLogoutMouseExited(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 153, 153));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Expenses");

        txtExpenses.setEditable(false);
        txtExpenses.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtExpenses.setForeground(new java.awt.Color(0, 153, 153));
        txtExpenses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExpensesActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 153, 153));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Income");

        txtIncome.setEditable(false);
        txtIncome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtIncome.setForeground(new java.awt.Color(0, 153, 153));
        txtIncome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIncomeActionPerformed(evt);
            }
        });

        txtLeftSpend.setEditable(false);
        txtLeftSpend.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtLeftSpend.setForeground(new java.awt.Color(0, 153, 153));

        jLabel4.setBackground(new java.awt.Color(0, 153, 153));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Left To Spend");

        jrbChangePassword.setBackground(new java.awt.Color(0, 153, 153));
        buttonGroup1.add(jrbChangePassword);
        jrbChangePassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrbChangePassword.setForeground(new java.awt.Color(255, 255, 255));
        jrbChangePassword.setText("Change Password");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtExpenses, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(126, 126, 126))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtLeftSpend)
                        .addGap(33, 33, 33))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogout)
                .addGap(33, 33, 33))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbChangePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDoTask, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jrbAddSpending, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jrbSetSpendingLimit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jrbAddIncome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jrbShowHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGap(168, 168, 168))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblLogout, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(lblUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(6, 6, 6)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtExpenses)
                    .addComponent(txtLeftSpend)
                    .addComponent(txtIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(jrbSetSpendingLimit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrbAddSpending, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrbAddIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrbShowHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrbChangePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnDoTask, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnDoTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoTaskActionPerformed
        // TODO add your handling code here:
      if(validateInputs()==false){
            JOptionPane.showMessageDialog(null,"please choose An Option","Error!",JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(jrbSetSpendingLimit.isSelected()){
            SetSpendingLimitFrame setSpendingLimit = new SetSpendingLimitFrame();
            setSpendingLimit.setVisible(true);
            this.dispose();
        }
        else if(jrbAddSpending.isSelected()){
            AddSpendingFrame addSpending = new AddSpendingFrame();
            addSpending.setVisible(true);
            this.dispose();
            
        }
        else if(jrbAddIncome.isSelected()){
            AddIncomeFrame addIncome = new AddIncomeFrame();
            addIncome.setVisible(true);
            this.dispose();
        }
        else if(jrbShowHistory.isSelected()){
            ShowHistoryFrame showHistory = new ShowHistoryFrame();
            showHistory.setVisible(true);
            this.dispose();
        }
        else if(jrbChangePassword.isSelected()){
            ChangePasswordFrame changePassword = new ChangePasswordFrame();
            changePassword.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnDoTaskActionPerformed

    private void jrbSetSpendingLimitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbSetSpendingLimitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbSetSpendingLimitActionPerformed

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        // TODO add your handling code here:
        this.dispose();
        LoginFrame loginFrame = new LoginFrame();
        loginFrame.setVisible(true);
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void lblLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseEntered
        // TODO add your handling code here:
        lblLogout.setForeground(Color.WHITE);
        Font f = new Font("Tahama",Font.ITALIC,14);
        lblLogout.setFont(f);
    }//GEN-LAST:event_lblLogoutMouseEntered

    private void lblLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseExited
        // TODO add your handling code here:
        lblLogout.setForeground(Color.WHITE);
        Font f = new Font("tanoma",Font.BOLD,18);
        lblLogout.setFont(f);
    }//GEN-LAST:event_lblLogoutMouseExited

    private void txtExpensesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExpensesActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtExpensesActionPerformed

    private void txtIncomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIncomeActionPerformed
        // TODO add your handling code here:
        //amountPojo in = new amountPojo(userProfile.getUsername());
//        try{
//        double income = incomeDao.getTotalIncome();
//        String aaa = Double.toString(income);
//        txtIncome.setText(aaa);
//        }
//        catch(Exception e){
//            e.printStackTrace();
//        }
    }//GEN-LAST:event_txtIncomeActionPerformed
   
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
            java.util.logging.Logger.getLogger(ChooseOptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChooseOptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChooseOptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChooseOptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChooseOptionFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoTask;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jrbAddIncome;
    private javax.swing.JRadioButton jrbAddSpending;
    private javax.swing.JRadioButton jrbChangePassword;
    private javax.swing.JRadioButton jrbSetSpendingLimit;
    private javax.swing.JRadioButton jrbShowHistory;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtExpenses;
    private javax.swing.JTextField txtIncome;
    private javax.swing.JTextField txtLeftSpend;
    // End of variables declaration//GEN-END:variables
private boolean validateInputs(){
    if(jrbSetSpendingLimit.isSelected()== false && jrbAddSpending.isSelected()== false && jrbShowHistory.isSelected()==false 
            && jrbAddIncome.isSelected()==false && jrbChangePassword.isSelected()== false)
        return false;
    return true;
}
}
