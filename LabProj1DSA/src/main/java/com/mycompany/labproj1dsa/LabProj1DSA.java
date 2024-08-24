package com.mycompany.labproj1dsa;

import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class LabProj1DSA extends javax.swing.JFrame {
    public LabProj1DSA() {
        initComponents();
    }
    private static ArrayList Bookinfo = new ArrayList();
    Dictionary<String, Integer> dict= new Hashtable<>();
    int totals;
    
abstract class BookModification{
    abstract void get();

    abstract void add();

    abstract void remove();

    abstract void update();

    abstract void total();
}

class BookMod extends BookModification{
   void get(){
    int index = parseInt(index_field.getText());
    if (Bookinfo.isEmpty()){
        JOptionPane.showMessageDialog(null,"Library System is Empty");
    }
    else if(index >= Bookinfo.size() || index < 0){
    JOptionPane.showMessageDialog(null,"Book index does not exist");
    }
    else{
        JOptionPane.showMessageDialog(null,"The Book in index ["+ index +"] is " +Bookinfo.get(index));
    }
    }
    void add(){
     int index = parseInt(index_field.getText());
     int quantity = parseInt(quantity_field.getText());
     boolean duplicate = false;
     DefaultTableModel dt = (DefaultTableModel)jTable1.getModel();
     for(int x = 0 ; x < dt.getRowCount(); x++){
        if (((String)jTable1.getValueAt(x, 0)).equalsIgnoreCase(title_field.getText())) {
        JOptionPane.showMessageDialog(null,"Book Already Exists in System");
        duplicate = true;
        break;
        }
}
        if(!duplicate){
        
        Bookinfo.add(index,title_field.getText());
        dict.put(Bookinfo.get(index), quantity);
        
        Vector v = new Vector();
        
        for(int i = 0; i < Bookinfo.size(); i++){
 
        v.add(title_field.getText());
        v.add(quantity_field.getText());
        }
        dt.addRow(v);
    }

    }
    
    void remove(){
    int index1 = parseInt(index_field.getText());
        DefaultTableModel dt = (DefaultTableModel)jTable1.getModel();
        for(int x = 0 ; x < dt.getRowCount(); x++){
        if (((String)jTable1.getValueAt(x, 0)).equals(title_field.getText())) {
                dt.removeRow(x);
         Bookinfo.remove(index1);
         dict.remove(Bookinfo.get(index1));
        }
        }
    } 
    void update(){
     int index1 = parseInt(index_field.getText());
                Bookinfo.set(index1,title_field.getText());
        DefaultTableModel dt = (DefaultTableModel)jTable1.getModel();
        
        for(int x = 0 ; x < dt.getRowCount(); x++){
        if (x == index1) {
                dt.removeRow(x);
                Vector v = new Vector();
        
        for(int i = 0; i < Bookinfo.size(); i++){
 
        v.add(title_field.getText());
        v.add(quantity_field.getText());
        }
        dt.addRow(v);
        }
        }
    }
     void total(){
        totals = 0;
        for(int i = 0; i < Bookinfo.size(); i++){
        totals += dict.get(Bookinfo.get(i));
        }
    JOptionPane.showMessageDialog(null,"Total Number of books in system is: " + Bookinfo.size()+"\n Total Quantity of Books on Storage is: "+ totals );
    
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        index_field = new javax.swing.JTextField();
        title_field = new javax.swing.JTextField();
        quantity_field = new javax.swing.JTextField();
        add_btn = new javax.swing.JButton();
        update_btn = new javax.swing.JButton();
        remove_btn = new javax.swing.JButton();
        search_btn = new javax.swing.JButton();
        total_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title", "Quantity"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("INDEX");

        jLabel2.setText("TITLE");

        jLabel3.setText("QUANTITY");

        add_btn.setText(" ADD  ");
        add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btnActionPerformed(evt);
            }
        });

        update_btn.setText("UPDATE");
        update_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_btnActionPerformed(evt);
            }
        });

        remove_btn.setText("REMOVE");
        remove_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove_btnActionPerformed(evt);
            }
        });

        search_btn.setText("SEARCH");
        search_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_btnActionPerformed(evt);
            }
        });

        total_btn.setText(" TOTAL");
        total_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                total_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(quantity_field))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(49, 49, 49)
                                    .addComponent(title_field))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(43, 43, 43)
                                    .addComponent(index_field, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(add_btn)
                            .addComponent(remove_btn))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(update_btn)
                            .addComponent(search_btn)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(total_btn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(index_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(title_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(quantity_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_btn)
                    .addComponent(update_btn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(remove_btn)
                    .addComponent(search_btn))
                .addGap(18, 18, 18)
                .addComponent(total_btn)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btnActionPerformed
        BookModification book = new BookMod (); 
        book.add();
    }//GEN-LAST:event_add_btnActionPerformed

    private void update_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_btnActionPerformed
        BookModification book=new BookMod(); 
        book.update();
    }//GEN-LAST:event_update_btnActionPerformed

    private void remove_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove_btnActionPerformed
        BookModification book = new BookMod(); 
        book.remove();
    }//GEN-LAST:event_remove_btnActionPerformed

    private void search_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_btnActionPerformed
        BookModification book = new BookMod();
        book.get();
    }//GEN-LAST:event_search_btnActionPerformed

    private void total_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_total_btnActionPerformed
        BookModification book = new BookMod(); 
        book.total();
    }//GEN-LAST:event_total_btnActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LabProj1DSA().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_btn;
    private javax.swing.JTextField index_field;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField quantity_field;
    private javax.swing.JButton remove_btn;
    private javax.swing.JButton search_btn;
    private javax.swing.JTextField title_field;
    private javax.swing.JButton total_btn;
    private javax.swing.JButton update_btn;
    // End of variables declaration//GEN-END:variables
}
