/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Admin_Main.java
 *
 * Created on Dec 3, 2011, 12:49:03 AM
 */
package coursetimetable;

/**
 *
 * @author mahmoud
 */
public class Student extends javax.swing.JFrame {

    /** Creates new form Admin_Main */
    public Student() {
      
        this.setLocation(200, 100);
        this.setResizable(false);
        
        initComponents();
      
       
         //this.Professor_Tap_Button_Visble(true);
    }
  
    
    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jButton48 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton45 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel8 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));
        setName("Form"); // NOI18N

        jPanel1.setName("jPanel1"); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTabbedPane1.setName("jTabbedPane1"); // NOI18N
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.setName("jPanel3"); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(coursetimetable.CourseTimeTableApp.class).getContext().getResourceMap(Student.class);
        jLabel21.setText(resourceMap.getString("jLabel21.text")); // NOI18N
        jLabel21.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel21.setName("jLabel21"); // NOI18N
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 90, 30));

        jTextField9.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTextField9.setName("jTextField9"); // NOI18N
        jPanel3.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 150, 30));

        jButton48.setText(resourceMap.getString("jButton48.text")); // NOI18N
        jButton48.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton48.setName("jButton48"); // NOI18N
        jButton48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton48MouseClicked(evt);
            }
        });
        jPanel3.add(jButton48, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 180, 30));

        jLabel24.setText(resourceMap.getString("jLabel24.text")); // NOI18N
        jLabel24.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel24.setName("jLabel24"); // NOI18N
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 150, 30));

        jLabel25.setText(resourceMap.getString("jLabel25.text")); // NOI18N
        jLabel25.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel25.setName("jLabel25"); // NOI18N
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 70, 30));

        jLabel26.setText(resourceMap.getString("jLabel26.text")); // NOI18N
        jLabel26.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel26.setName("jLabel26"); // NOI18N
        jPanel3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 150, 30));

        jLabel27.setText(resourceMap.getString("jLabel27.text")); // NOI18N
        jLabel27.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel27.setName("jLabel27"); // NOI18N
        jPanel3.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 70, 30));

        jLabel28.setText(resourceMap.getString("jLabel28.text")); // NOI18N
        jLabel28.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel28.setName("jLabel28"); // NOI18N
        jPanel3.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, 30));

        jTextField11.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTextField11.setName("jTextField11"); // NOI18N
        jPanel3.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 150, 30));

        jLabel29.setText(resourceMap.getString("jLabel29.text")); // NOI18N
        jLabel29.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel29.setName("jLabel29"); // NOI18N
        jPanel3.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 70, 30));

        jLabel30.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel30.setName("jLabel30"); // NOI18N
        jPanel3.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 150, 30));

        jLabel23.setText(resourceMap.getString("jLabel23.text")); // NOI18N
        jLabel23.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel23.setName("jLabel23"); // NOI18N
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 70, 30));

        jTextField10.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTextField10.setName("jTextField10"); // NOI18N
        jPanel3.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 150, 30));

        jLabel10.setIcon(resourceMap.getIcon("jLabel10.icon")); // NOI18N
        jLabel10.setName("jLabel10"); // NOI18N
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 450));

        jTabbedPane1.addTab(resourceMap.getString("jPanel3.TabConstraints.tabTitle"), jPanel3); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setName("jPanel2"); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton45.setText(resourceMap.getString("jButton45.text")); // NOI18N
        jButton45.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton45.setName("jButton45"); // NOI18N
        jPanel2.add(jButton45, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 160, 70));

        jLabel4.setText("Finished Courses"); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel4.setName("jLabel4"); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 140, 40));

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jList1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList1.setName("jList1"); // NOI18N
        jScrollPane1.setViewportView(jList1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 220, 240));

        jLabel8.setIcon(resourceMap.getIcon("jLabel8.icon")); // NOI18N
        jLabel8.setText(resourceMap.getString("jLabel8.text")); // NOI18N
        jLabel8.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel8.setName("jLabel8"); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 450));

        jTabbedPane1.addTab(resourceMap.getString("jPanel2.TabConstraints.tabTitle"), jPanel2); // NOI18N

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 700, 480));

        jPanel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel7.setName("jPanel7"); // NOI18N
        jPanel7.setLayout(null);

        jLabel1.setFont(resourceMap.getFont("YearLabel.font")); // NOI18N
        jLabel1.setText(resourceMap.getString("YearLabel.text")); // NOI18N
        jLabel1.setName("YearLabel"); // NOI18N
        jPanel7.add(jLabel1);
        jLabel1.setBounds(10, 20, 140, 40);

        jLabel2.setFont(resourceMap.getFont("Yaer20_label.font")); // NOI18N
        jLabel2.setText(resourceMap.getString("Yaer20_label.text")); // NOI18N
        jLabel2.setName("Yaer20_label"); // NOI18N
        jPanel7.add(jLabel2);
        jLabel2.setBounds(150, 20, 90, 40);

        jLabel9.setIcon(resourceMap.getIcon("jLabel9.icon")); // NOI18N
        jLabel9.setText(resourceMap.getString("jLabel9.text")); // NOI18N
        jLabel9.setName("jLabel9"); // NOI18N
        jPanel7.add(jLabel9);
        jLabel9.setBounds(0, 0, 260, 70);

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 260, 70));

        jLabel3.setIcon(resourceMap.getIcon("jLabel3.icon")); // NOI18N
        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 0, 840, 590));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        
        
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void jButton48MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton48MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton48MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Student().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton48;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}