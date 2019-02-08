/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework_cos2103;

import com.placeholder.PlaceHolder;
import javax.swing.JOptionPane;

/**
 *
 * @author Noojar
 */
public class Stack extends javax.swing.JFrame {

    final int size = 10;
    int TOP = -1;
    int MAXSTK = size - 1;
    String ITEM_ID;
    String ITEM_FNAME;
    String ITEM_LNAME;
    String ITEM_ADDRESS;
    //---------push--------------
    String id[] = new String[size];
    String fname[] = new String[size];
    String lname[] = new String[size];
    String address[] = new String[size];
    //---------pop----------------
    String id_p[] = new String[size];
    String fname_p[] = new String[size];
    String lname_p[] = new String[size];
    String address_p[] = new String[size];

    PlaceHolder holder;

    public void PUSH(String data, String data2, String data3, String data4) {
        if (TOP == MAXSTK) {
            //System.out.println("STACK OVERFLOW");
            JOptionPane.showMessageDialog(null, "Stack Overflow", "Inane warning",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            TOP++;
            id[TOP] = ITEM_ID;
            fname[TOP] = ITEM_FNAME;
            lname[TOP] = ITEM_LNAME;
            address[TOP] = ITEM_ADDRESS;
        JOptionPane.showMessageDialog(null, "บันทึกข้อมูลลง Stack สำเร็จ ", "Inane warning",
                    JOptionPane.WARNING_MESSAGE);
        }

    }

    public void Revese() {
        jTextArea2.setText("");
        for (int i = TOP; i > -1; i--) {
            POP();

        }

//        for (int i = size - 1; i > -1; i--) {
//            id_p[i] = id[size - i - 1];
//            fname_p[i] = fname[size - i - 1];
//            lname_p[i] = lname[size - i - 1];
//            address_p[i] = address[size - i - 1];
//        }
//        for (int i = size - 1; i > -1; i--) {
//            id[i] = id_p[size - i - 1];
//            fname[i] = fname_p[size - i - 1];
//            lname[i] = lname_p[size - i - 1];
//            address[i] = address_p[size - i - 1];
//        }
    }

    public void POP() {
        if (TOP == -1) {
            JOptionPane.showMessageDialog(null, " UNDERFLOW ", "Inane warning",
                    JOptionPane.WARNING_MESSAGE);
            jTextArea2.setText("UNDERFLOW");
        } else {
            //System.out.print(id[TOP]);
            id_p[TOP] = id[TOP];
            fname_p[TOP] = fname[TOP];
            lname_p[TOP] = lname[TOP];
            address_p[TOP] = address[TOP];
            //jTextArea2.setText("");
            jTextArea2.setText(jTextArea2.getText() + "สำเร็จ " + "\n"
                    + " ID        : " + id_p[TOP] + "\n"
                    + " FIRSTNAME : " + fname_p[TOP] + "\n"
                    + " LASTNAME  : " + lname_p[TOP] + "\n"
                    + " ADDRESS   : " + address_p[TOP] + "\n"
                    + "----------------------------------------------------------" + "\n");
            JOptionPane.showMessageDialog(null, "POP ข้อมูลสำเร็จ ", "Inane warning",
                    JOptionPane.WARNING_MESSAGE);
            TOP--;

        }
    }

    public void showDatainStack() {

        jTextArea1.setText("");
        for (int i = 0; i <= TOP; i++) {
            //System.out.print(STACK[i] + ",");
            if (id[i] != null) {
                jTextArea1.setText(jTextArea1.getText() + "นำข้อมูลเข้า STACK สำเร็จ " + "\n"
                        + " ID        : " + id[i] + "\n"
                        + " FIRSTNAME : " + fname[i] + "\n"
                        + " LASTNAME  : " + lname[i] + "\n"
                        + " ADDRESS   : " + address[i] + "\n"
                        + "----------------------------------------------------------" + "\n");
                 
            }

        }
    }

    public void showRevese() {
        // jTextArea2.setText("");
        for (int i = TOP; i > -1; i--) {
            if (id_p[i] != null) {
                jTextArea2.setText(jTextArea2.getText() + "นำข้อมูลเข้า STACK สำเร็จ " + "\n"
                        + " ID        : " + id_p[i] + "\n"
                        + " FIRSTNAME : " + fname_p[i] + "\n"
                        + " LASTNAME  : " + lname_p[i] + "\n"
                        + " ADDRESS   : " + address_p[i] + "\n"
                        + "----------------------------------------------------------" + "\n");
            }
        }

    }

    /**
     * Creates new form Stack
     */
    public Stack() {
        initComponents();
        //this.holder = new PlaceHolder(jTextField5, "Insert Item pop");
        this.holder = new PlaceHolder(jTextField1, "Insert ID");
        this.holder = new PlaceHolder(jTextField2, "Insert Name");
        this.holder = new PlaceHolder(jTextField3, "Insert LastName");
        this.holder = new PlaceHolder(jTextField4, "Insert Address");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(223, 230, 233));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homework_cos2103/Image/button.png"))); // NOI18N
        jButton1.setText("  Push");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 100, 30));

        jButton2.setBackground(new java.awt.Color(223, 230, 233));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homework_cos2103/Image/overflowing.png"))); // NOI18N
        jButton2.setText("  Pop");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 90, 30));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 310, 130));

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 310, 130));

        jButton3.setBackground(new java.awt.Color(223, 230, 233));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homework_cos2103/Image/reverse.png"))); // NOI18N
        jButton3.setText(" Reverse");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 110, 30));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homework_cos2103/image/home-icon-silhouette.png"))); // NOI18N
        jButton4.setText("หน้าหลัก");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 370, 120, 34));

        jPanel2.setBackground(new java.awt.Color(209, 209, 209));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel6.setText("รหัสพนักงาน :");

        jLabel7.setText("ชื่อ :");

        jLabel8.setText("นามสกุล :");
        jLabel8.setToolTipText("");

        jLabel9.setText("เงินเดือน : ");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homework_cos2103/image/manager.png"))); // NOI18N
        jLabel11.setText("ข้อมูลพนักงาน");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 87, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 290, 220));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homework_cos2103/image/Page3.jpg"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "     STACK", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(153, 153, 153))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 430));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ITEM_ID = jTextField1.getText();
        ITEM_FNAME = jTextField2.getText();
        ITEM_LNAME = jTextField3.getText();
        ITEM_ADDRESS = jTextField4.getText();
        PUSH(ITEM_ID, ITEM_FNAME, ITEM_LNAME, ITEM_ADDRESS);
        clearT();
        showDatainStack();
        //PUSH(ITEM_FNAME );
        //PUSH(ITEM_LNAME);
        //PUSH(ITEM_ADDRESS);

// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        POP();
        showDatainStack();
        clearT();

        //showDatainStack_push();
        //clearT();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Revese();
        showRevese();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new Home().setVisible(true);
        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Stack().setVisible(true);

            }
        });
    }

    private void clearT() {
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
