/*
 * GanttDialogPerson.java
 *
 * Created on 5. September 2003, 14:05
 */

package net.sourceforge.ganttproject.gui;

import java.awt.Frame;

import net.sourceforge.ganttproject.language.GanttLanguage;
import net.sourceforge.ganttproject.roles.Role;
import net.sourceforge.ganttproject.roles.RoleManager;
import net.sourceforge.ganttproject.GanttProject;
import net.sourceforge.ganttproject.resource.HumanResource;

import javax.swing.border.TitledBorder;

/**
 *
 * @author  barmeier
 */
public class GanttDialogPerson extends javax.swing.JDialog {
    private boolean change;
    private HumanResource person;
  /** The language use */
  private GanttLanguage language = GanttLanguage.getInstance();
    
    
    /** Creates new form GanttDialogPerson */
    public GanttDialogPerson(Frame parent,GanttLanguage language, HumanResource person) {
        super(parent, GanttProject.correctLabel(language.getText("human")),true);
        this.person = person;
        initComponents();
        DialogAligner.center(this, parent);
        applyComponentOrientation(language.getComponentOrientation());
    }

    public boolean result() { return change; }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() {//GEN-BEGIN:initComponents
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        unitsPerDay = new javax.swing.JLabel();
        phoneField1 = new javax.swing.JTextField();
        efficency = new javax.swing.JLabel();
        emailInput1 = new javax.swing.JTextField();
        resourceData = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        //String []sCombo0 = RoleManager.Access.getInstance().getRoleNames();
        Role[] roles = RoleManager.Access.getInstance().getEnabledRoles();
        System.err.println("[GanttDialogPerson] initComponents(): roles="+java.util.Arrays.asList(roles)+" selected role="+person.getRole());

        functionList = new javax.swing.JComboBox(roles);
        functionList.setRenderer(new GanttCellListRenderer());
        functionList.setSelectedItem(person.getRole());
        name = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        nameField.setText(person.getName());
        phone = new javax.swing.JLabel();
        phoneField = new javax.swing.JTextField();
        phoneField.setText(person.getPhone());
        email = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        emailField.setText(person.getMail());
        function = new javax.swing.JLabel();
        persTitle = new javax.swing.JLabel();
        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();

        getContentPane().setLayout(new java.awt.GridBagLayout());

        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jPanel3.setLayout(new java.awt.GridBagLayout());

        jPanel3.setPreferredSize(new java.awt.Dimension(520, 160));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jPanel2.setBorder(new TitledBorder(new javax.swing.border.EtchedBorder(),language.getText("resourceData")));
        jPanel2.setPreferredSize(new java.awt.Dimension(237, 108));
        unitsPerDay.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        unitsPerDay.setText("Maximale Einheiten pro Tag:");
        unitsPerDay.setText(language.getText("unitsPerDay"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 60, 0, 0);
        jPanel2.add(unitsPerDay, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(phoneField1, gridBagConstraints);

        efficency.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        efficency.setText("Effizienz:");
        efficency.setText(language.getText("efficency"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 60, 10, 0);
        jPanel2.add(efficency, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.8;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 10, 5);
        jPanel2.add(emailInput1, gridBagConstraints);

        /*resourceData.setFont(new java.awt.Font("Dialog", 3, 18));
        resourceData.setText("Resourcedaten");
        resourceData.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        resourceData.setText(language.getText("resourceData"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        jPanel2.add(resourceData, gridBagConstraints);*/

        /*gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.9;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 5, 10);
        jPanel3.add(jPanel2, gridBagConstraints);*/

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel1.setBorder(new TitledBorder(new javax.swing.border.EtchedBorder(),language.getText("personData")));
        jPanel1.setPreferredSize(new java.awt.Dimension(208, 133));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 10, 0);
        jPanel1.add(functionList, gridBagConstraints);

        name.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        name.setText("Name: ");
        name.setText(language.getText("name"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 60, 0, 0);
        jPanel1.add(name, gridBagConstraints);

        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.weightx = 0.8;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        jPanel1.add(nameField, gridBagConstraints);

        phone.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        phone.setText("Phone:");
        phone.setText(language.getText("colPhone"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        jPanel1.add(phone, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(phoneField, gridBagConstraints);

        email.setText("EMail:");
        email.setText(language.getText("colMail"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        jPanel1.add(email, gridBagConstraints);

        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.8;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        jPanel1.add(emailField, gridBagConstraints);

        function.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        function.setText("Funktion: ");
        function.setText(language.getText("colRole"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 0);
        jPanel1.add(function, gridBagConstraints);

        /*persTitle.setFont(new java.awt.Font("Dialog", 3, 18));
        persTitle.setText("Personendaten");
        persTitle.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        persTitle.setText(language.getText("personData"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        jPanel1.add(persTitle, gridBagConstraints);*/

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 5, 10);
        jPanel3.add(jPanel1, gridBagConstraints);

        okButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        okButton.setPreferredSize(new java.awt.Dimension(96, 26));
        okButton.setText(language.getText("ok"));
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });
				getRootPane().setDefaultButton(okButton);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 10, 10);
        jPanel3.add(okButton, gridBagConstraints);

        cancelButton.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cancelButton.setText(language.getText("cancel"));
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 10);
        jPanel3.add(cancelButton, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        jPanel3.add(jPanel4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jPanel3, gridBagConstraints);

        pack();
    }//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        person.setName(nameField.getText());
	person.setMail(emailField.getText());
	person.setPhone(phoneField.getText());
	person.setRole((Role) functionList.getSelectedItem());
	change = true;
        closeDialog(null);
    }//GEN-LAST:event_okButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        closeDialog(null);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // Add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed
        // Add your handling code here:
    }//GEN-LAST:event_emailFieldActionPerformed
    
    /** Closes the dialog */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel efficency;
    private javax.swing.JLabel email;
    private javax.swing.JTextField emailField;
    private javax.swing.JTextField emailInput1;
    private javax.swing.JLabel function;
    private javax.swing.JComboBox functionList;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel name;
    private javax.swing.JTextField nameField;
    private javax.swing.JButton okButton;
    private javax.swing.JLabel persTitle;
    private javax.swing.JLabel phone;
    private javax.swing.JTextField phoneField;
    private javax.swing.JTextField phoneField1;
    private javax.swing.JLabel resourceData;
    private javax.swing.JLabel unitsPerDay;
    // End of variables declaration//GEN-END:variables
  
 
}