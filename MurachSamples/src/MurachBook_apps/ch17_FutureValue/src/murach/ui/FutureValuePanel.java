package murach.ui;

import java.text.NumberFormat;
import murach.business.FinancialCalculations;

public class FutureValuePanel extends javax.swing.JPanel {

    /** Creates new form FutureValuePanel */
    public FutureValuePanel() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        monthlyPaymentTextField = new javax.swing.JTextField();
        yearlyRateTextField = new javax.swing.JTextField();
        yearsTextField = new javax.swing.JTextField();
        futureValueTextField = new javax.swing.JTextField();
        calculateButton = new javax.swing.JButton();

        jLabel1.setText("Monthly Payment:");

        jLabel2.setText("Yearly Interest Rate:");

        jLabel3.setText("Number of Years:");

        jLabel4.setText("Future Value:");

        futureValueTextField.setEditable(false);
        futureValueTextField.setFocusable(false);

        calculateButton.setMnemonic('c');
        calculateButton.setText("Calculate");
        calculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(calculateButton)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(yearlyRateTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(monthlyPaymentTextField)
                            .addComponent(yearsTextField)
                            .addComponent(futureValueTextField))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(monthlyPaymentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(yearlyRateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(yearsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(futureValueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(calculateButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void calculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateButtonActionPerformed
        if (isValidData())
        {
            double p = Double.parseDouble(monthlyPaymentTextField.getText());
            double r = Double.parseDouble(yearlyRateTextField.getText());
            int y = Integer.parseInt(yearsTextField.getText());
            
            double fv = FinancialCalculations.calculateFutureValue(p, r, y);
            
            NumberFormat currency = NumberFormat.getCurrencyInstance();
            futureValueTextField.setText(currency.format(fv));
        }
    }//GEN-LAST:event_calculateButtonActionPerformed

    private boolean isValidData()
    {
        SwingValidator sv = new SwingValidator();
        return
            sv.isPresent(monthlyPaymentTextField, "Monthly Investment") &&
            sv.isDouble(monthlyPaymentTextField, "Monthly Investment") &&
            sv.isPresent(yearlyRateTextField, "Interest Rate") &&
            sv.isDouble(yearlyRateTextField, "Interest Rate") &&
            sv.isPresent(yearsTextField, "Number of Years") &&
            sv.isInteger(yearsTextField, "Number of Years");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculateButton;
    private javax.swing.JTextField futureValueTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField monthlyPaymentTextField;
    private javax.swing.JTextField yearlyRateTextField;
    private javax.swing.JTextField yearsTextField;
    // End of variables declaration//GEN-END:variables
}