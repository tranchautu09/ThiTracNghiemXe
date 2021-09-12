/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thisathach;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author MSI
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm1
     */
    public MainForm() {
        initComponents();
        
    }

    public void changecolor(JPanel hover, Color rand){
        hover.setBackground(rand);
    }
    
    public class KTTS{
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        PreparedStatement query;
        public ResultSet find(String s){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_javaproject", "root", "09022000");
                query = con.prepareStatement("select loaibanglai.ten_loai_bang_lai, sinhvien.fullname, sinhvien.ngay_sinh, sinhvien.cmnd, sinhvien.dia_chi\n" +
                                                "	from sinhvien\n" +
                                                "	left join loaibanglai on sinhvien.lbl_id = loaibanglai.lbl_id\n" +
                                                "	where sinh_vien_id=?");
                query.setString(1,s);
                rs=query.executeQuery();
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,ex);
            }
            return rs;
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
        lblDonVi = new javax.swing.JLabel();
        lblKhoa = new javax.swing.JLabel();
        lblSBD = new javax.swing.JLabel();
        cbDonVi = new javax.swing.JComboBox<>();
        cbKhoa = new javax.swing.JComboBox<>();
        txtSBD = new javax.swing.JTextField();
        lblSoCMT = new javax.swing.JLabel();
        lblDiaChi = new javax.swing.JLabel();
        lblLoaiGPLX_SV = new javax.swing.JLabel();
        lblHoVaTen_SV = new javax.swing.JLabel();
        lblNgaySinh_SV = new javax.swing.JLabel();
        lblSoCMT_SV = new javax.swing.JLabel();
        lblDiaChi_SV = new javax.swing.JLabel();
        lblLoaiGPLX = new javax.swing.JLabel();
        lblHoVaTen = new javax.swing.JLabel();
        lblNgaySinh = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(985, 731));
        setMinimumSize(new java.awt.Dimension(985, 731));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(985, 731));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel1.setText("SÁT HẠCH LÝ THUYẾT");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, -1, 50));

        lblDonVi.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblDonVi.setText("Đơn vị:");
        getContentPane().add(lblDonVi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        lblKhoa.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblKhoa.setText("Khóa:");
        getContentPane().add(lblKhoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        lblSBD.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblSBD.setText("Số báo danh:");
        getContentPane().add(lblSBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        cbDonVi.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        getContentPane().add(cbDonVi, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 790, -1));

        cbKhoa.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        getContentPane().add(cbKhoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 790, -1));

        txtSBD.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        getContentPane().add(txtSBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 790, 30));

        lblSoCMT.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblSoCMT.setText("Số CMT:");
        getContentPane().add(lblSoCMT, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 540, -1, -1));

        lblDiaChi.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblDiaChi.setText("Địa chỉ:");
        getContentPane().add(lblDiaChi, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 580, -1, -1));

        lblLoaiGPLX_SV.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblLoaiGPLX_SV.setText("-");
        getContentPane().add(lblLoaiGPLX_SV, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, -1, -1));

        lblHoVaTen_SV.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblHoVaTen_SV.setText("-");
        getContentPane().add(lblHoVaTen_SV, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 460, -1, -1));

        lblNgaySinh_SV.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblNgaySinh_SV.setText("-");
        getContentPane().add(lblNgaySinh_SV, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 500, -1, -1));

        lblSoCMT_SV.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblSoCMT_SV.setText("-");
        getContentPane().add(lblSoCMT_SV, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 540, -1, -1));

        lblDiaChi_SV.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblDiaChi_SV.setText("-");
        getContentPane().add(lblDiaChi_SV, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 580, -1, -1));

        lblLoaiGPLX.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblLoaiGPLX.setText("Loại GPLX:");
        getContentPane().add(lblLoaiGPLX, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, -1, -1));

        lblHoVaTen.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblHoVaTen.setText("Họ và tên:");
        getContentPane().add(lblHoVaTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, -1, -1));

        lblNgaySinh.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblNgaySinh.setText("Ngày sinh:");
        getContentPane().add(lblNgaySinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 500, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton1.setText("Kiểm tra thông tin thí sinh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, -1, 66));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton3.setText("Hủy bỏ");
        jButton3.setPreferredSize(new java.awt.Dimension(253, 31));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 650, -1, 66));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton2.setText("Vào thi");
        jButton2.setPreferredSize(new java.awt.Dimension(253, 31));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(546, 650, -1, 66));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/images.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Button-Close-icon-48.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/rainbow_colorful_gradient_161845_to.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-310, 0, -1, -1));

        setSize(new java.awt.Dimension(985, 731));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        lblLoaiGPLX_SV.setText("-");
        lblHoVaTen_SV.setText("-");
        lblNgaySinh_SV.setText("-");
        lblSoCMT_SV.setText("-");
        lblDiaChi_SV.setText("-");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String kiemtrasbd = lblLoaiGPLX_SV.getText();
        if(kiemtrasbd.equals("-")){
            JOptionPane.showMessageDialog(null,"Vui lòng kiểm tra số báo danh");
        }
        else{
            dispose();
            String a = lblLoaiGPLX_SV.getText();
            String b = txtSBD.getText();
            String c = lblHoVaTen_SV.getText();
            ThiSH thi = new ThiSH(a, b, c);
            thi.setVisible(true);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        KTTS f = new KTTS();
        ResultSet rs;
        rs = f.find(txtSBD.getText());
        try{
            if (rs.next()) {
                lblLoaiGPLX_SV.setText(rs.getString("ten_loai_bang_lai"));
                lblHoVaTen_SV.setText(rs.getString("fullname"));
                lblNgaySinh_SV.setText(rs.getString("ngay_sinh"));
                lblSoCMT_SV.setText(rs.getString("cmnd"));
                lblDiaChi_SV.setText(rs.getString("dia_chi"));
            }else{
                JOptionPane.showMessageDialog(null,"Không có ID này trong hệ thống mời nhập lại!");
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbDonVi;
    private javax.swing.JComboBox<String> cbKhoa;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblDiaChi;
    private javax.swing.JLabel lblDiaChi_SV;
    private javax.swing.JLabel lblDonVi;
    private javax.swing.JLabel lblHoVaTen;
    private javax.swing.JLabel lblHoVaTen_SV;
    private javax.swing.JLabel lblKhoa;
    private javax.swing.JLabel lblLoaiGPLX;
    private javax.swing.JLabel lblLoaiGPLX_SV;
    private javax.swing.JLabel lblNgaySinh;
    private javax.swing.JLabel lblNgaySinh_SV;
    private javax.swing.JLabel lblSBD;
    private javax.swing.JLabel lblSoCMT;
    private javax.swing.JLabel lblSoCMT_SV;
    private javax.swing.JTextField txtSBD;
    // End of variables declaration//GEN-END:variables
}
