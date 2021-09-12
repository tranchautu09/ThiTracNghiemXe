/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlthisathach;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MSI
 */
public class x extends javax.swing.JPanel {

    /**
     * Creates new form x
     */
    public x() {
        initComponents();
        table_update();
    }
    PreparedStatement query;
    private void table_update(){
            int c;
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_javaproject", "root", "Code09022000");
                    query = conn.prepareStatement("select sinhvien.cmnd, sinhvien.fullname, loaibanglai.ten_loai_bang_lai, sinhvien.ngay_sinh, sinhvien.gioi_tinh, sinhvien.email, sinhvien.sdt, sinhvien.dia_chi, sinhvien.que_quan, sinhvien.diem from sinhvien left join loaibanglai on sinhvien.lbl_id = loaibanglai.lbl_id;");
                    ResultSet rs = query.executeQuery();
                    ResultSetMetaData rss = rs.getMetaData();
                    c = rss.getColumnCount();

                    DefaultTableModel df = (DefaultTableModel)jTable1.getModel();
                    
                    df.setRowCount(0);
                        while(rs.next()){
                            Vector v2 = new Vector();
                            for (int a = 1; a <=c; a++) {
                                v2.add(rs.getString("cmnd")); //0
                                v2.add(rs.getString("fullname")); //1
                                v2.add(rs.getString("ten_loai_bang_lai"));//2
                                v2.add(rs.getString("ngay_sinh"));//3
                                v2.add(rs.getString("gioi_tinh"));//4
                                v2.add(rs.getString("email"));//5         
                                v2.add(rs.getString("sdt"));//6
                                v2.add(rs.getString("dia_chi"));//7
                                v2.add(rs.getString("que_quan"));//8
                                v2.add(rs.getString("diem"));
                            }
                            df.addRow(v2);
                        }
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlthisathach/icons/10207-man-student-light-skin-tone-icon-64.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel2.setText("Kết quả thi sinh viên");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setText("Tìm kiếm theo điểm:");

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setText("Tìm kiếm theo CMND:");

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Chứng minh nhân dân", "Họ và tên", "Loại bằng lái", "Ngày sinh", "Giới tính", "Email", "Số điện thoại", "Địa chỉ", "Quê quán", "Điểm"
            }
        )
        {
            public boolean isCellEditable(int row, int column){
                return false;
            }
        }
    );
    jScrollPane4.setViewportView(jTable1);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(6, 6, 6)
                            .addComponent(jLabel2))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(4, 4, 4)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(3, 3, 3)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 86, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jSeparator1))
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane4)))
            .addContainerGap())
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(11, 11, 11)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel1)
                .addGroup(layout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addComponent(jLabel2)))
            .addGap(25, 25, 25)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel3)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(19, 19, 19)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel4)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(13, 13, 13)
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
            .addContainerGap())
    );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        int diem;
        if(jTextField1.getText().equals("")){
            diem = 0;
        }
        else{
            diem=Integer.parseInt(jTextField1.getText());
            int c;
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_javaproject", "root", "Code09022000");
                    query = conn.prepareStatement("select sinhvien.cmnd, sinhvien.fullname, loaibanglai.ten_loai_bang_lai, sinhvien.ngay_sinh, sinhvien.gioi_tinh, sinhvien.email, sinhvien.sdt, sinhvien.dia_chi, sinhvien.que_quan, sinhvien.diem from sinhvien left join loaibanglai on sinhvien.lbl_id = loaibanglai.lbl_id where sinhvien.diem >='"+diem+"';");                
                    ResultSet rs = query.executeQuery();
                    ResultSetMetaData rss = rs.getMetaData();
                    c = rss.getColumnCount();
                    DefaultTableModel df = (DefaultTableModel)jTable1.getModel();
                    df.setRowCount(0);
                        while(rs.next()){
                            Vector v2 = new Vector();
                            for (int a = 1; a <=c; a++) {
                                v2.add(rs.getString("cmnd")); //0
                                v2.add(rs.getString("fullname")); //1
                                v2.add(rs.getString("ten_loai_bang_lai"));//2
                                v2.add(rs.getString("ngay_sinh"));//3
                                v2.add(rs.getString("gioi_tinh"));//4
                                v2.add(rs.getString("email"));//5         
                                v2.add(rs.getString("sdt"));//6
                                v2.add(rs.getString("dia_chi"));//7
                                v2.add(rs.getString("que_quan"));//8
                                v2.add(rs.getString("diem"));
                            }
                            df.addRow(v2);
                        }
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
        }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
            int cmnd;
            if(jTextField2.getText().equals("")){
                table_update();
            }else{
            cmnd=Integer.parseInt(jTextField2.getText());
            int c;
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_javaproject", "root", "Code09022000");
                    query = conn.prepareStatement("select sinhvien.cmnd, sinhvien.fullname, loaibanglai.ten_loai_bang_lai, sinhvien.ngay_sinh, sinhvien.gioi_tinh, sinhvien.email, sinhvien.sdt, sinhvien.dia_chi, sinhvien.que_quan, sinhvien.diem from sinhvien left join loaibanglai on sinhvien.lbl_id = loaibanglai.lbl_id where sinhvien.cmnd="+cmnd+"");       
                    ResultSet rs = query.executeQuery();
                    ResultSetMetaData rss = rs.getMetaData();
                    c = rss.getColumnCount();
                    DefaultTableModel df = (DefaultTableModel)jTable1.getModel();
                    df.setRowCount(0);
                        while(rs.next()){
                            Vector v2 = new Vector();
                            for (int a = 1; a <=c; a++) {
                                v2.add(rs.getString("cmnd")); //0
                                v2.add(rs.getString("fullname")); //1
                                v2.add(rs.getString("ten_loai_bang_lai"));//2
                                v2.add(rs.getString("ngay_sinh"));//3
                                v2.add(rs.getString("gioi_tinh"));//4
                                v2.add(rs.getString("email"));//5         
                                v2.add(rs.getString("sdt"));//6
                                v2.add(rs.getString("dia_chi"));//7
                                v2.add(rs.getString("que_quan"));//8
                                v2.add(rs.getString("diem"));
                            }
                            df.addRow(v2);
                        }
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
            }
    }//GEN-LAST:event_jTextField2KeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
