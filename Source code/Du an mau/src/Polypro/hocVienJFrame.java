package Polypro;

import dao.hocVienDAO;
import dao.nguoiHocDAO;
import helper.dialogHelper;
import helper.jdbcHelper;
import helper.shareHelper;
import helper.utilityHelper;
import static java.awt.Color.white;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import model.hocVien;
import model.nguoiHoc;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Sieu Nhan Bay
 */
public class hocVienJFrame extends javax.swing.JFrame {

    /**
     * Creates new form hocVienJFrame
     *
     * @param MaKH
     */
    public hocVienJFrame(int MaKH) {
        initComponents();
        init();
        this.MaKH = MaKH;
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
        pnlHVKhac = new javax.swing.JPanel();
        cboNguoiHoc = new javax.swing.JComboBox<>();
        txtDiem = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        pnlHVKH = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGridView = new javax.swing.JTable();
        rdoTatCa = new javax.swing.JRadioButton();
        rdoDaNhap = new javax.swing.JRadioButton();
        rdoChuaNhap = new javax.swing.JRadioButton();
        btnCapNhat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("QUẢN LÝ HỌC VIÊN");
        setAlwaysOnTop(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pnlHVKhac.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "HỌC VIÊN KHÁC", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        cboNguoiHoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboNguoiHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboNguoiHocActionPerformed(evt);
            }
        });

        txtDiem.setText("-1");
        txtDiem.setName("Điểm"); // NOI18N

        btnThem.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Add.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlHVKhacLayout = new javax.swing.GroupLayout(pnlHVKhac);
        pnlHVKhac.setLayout(pnlHVKhacLayout);
        pnlHVKhacLayout.setHorizontalGroup(
            pnlHVKhacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHVKhacLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cboNguoiHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnThem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlHVKhacLayout.setVerticalGroup(
            pnlHVKhacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHVKhacLayout.createSequentialGroup()
                .addGroup(pnlHVKhacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboNguoiHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlHVKH.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "HỌC VIÊN CỦA KHÓA HỌC", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        tblGridView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "MÃ HV", "MÃ NH", "HỌ VÀ TÊN", "ĐIỂM (sửa đc)", "XÓA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblGridView.setRowHeight(25);
        jScrollPane1.setViewportView(tblGridView);

        buttonGroup1.add(rdoTatCa);
        rdoTatCa.setSelected(true);
        rdoTatCa.setText("Tất cả");
        rdoTatCa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdoTatCaMouseClicked(evt);
            }
        });
        rdoTatCa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoTatCaActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdoDaNhap);
        rdoDaNhap.setText("Đã nhập điểm");
        rdoDaNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdoDaNhapMouseClicked(evt);
            }
        });
        rdoDaNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoDaNhapActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdoChuaNhap);
        rdoChuaNhap.setText("Chưa nhập điểm");
        rdoChuaNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdoChuaNhapMouseClicked(evt);
            }
        });
        rdoChuaNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoChuaNhapActionPerformed(evt);
            }
        });

        btnCapNhat.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCapNhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Save as.png"))); // NOI18N
        btnCapNhat.setText("Cập nhật");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlHVKHLayout = new javax.swing.GroupLayout(pnlHVKH);
        pnlHVKH.setLayout(pnlHVKHLayout);
        pnlHVKHLayout.setHorizontalGroup(
            pnlHVKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHVKHLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlHVKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlHVKHLayout.createSequentialGroup()
                        .addComponent(rdoTatCa)
                        .addGap(18, 18, 18)
                        .addComponent(rdoDaNhap)
                        .addGap(18, 18, 18)
                        .addComponent(rdoChuaNhap)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHVKHLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCapNhat)))
                .addContainerGap())
        );
        pnlHVKHLayout.setVerticalGroup(
            pnlHVKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHVKHLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlHVKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoTatCa)
                    .addComponent(rdoDaNhap)
                    .addComponent(rdoChuaNhap))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCapNhat)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlHVKH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlHVKhac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlHVKhac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlHVKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public Integer MaKH;   //maKH được chọn nhập từ constructor
    hocVienDAO dao = new hocVienDAO();
    nguoiHocDAO nhdao = new nguoiHocDAO();

    void init() {
        setIconImage(shareHelper.APP_ICON);
        setLocationRelativeTo(null);
    }

    //lấy tất cả đối tượng nguoiHoc không thuộc khoaHoc từ CSDL (theo maKH)
    //rồi thêm vào combobox
    void fillComboBox() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboNguoiHoc.getModel(); //kết nối cbo với model
        model.removeAllElements(); //xóa toàn bộ item
        try {
            //lấy tất cả đối tượng nguoiHoc không thuộc khoaHoc từ CSDL
            //rồi thêm vào combobox
            List<nguoiHoc> list = nhdao.selectByCourse(MaKH);
            for (nguoiHoc nh : list) {
                model.addElement(nh);
            }
        } catch (Exception e) {
            dialogHelper.alert(this, "Lỗi truy vấn học viên!");
        }
    }

    //lấy về MaHV, MaKH, MaNH, Diem, HoTen từ các bảng trong CSDL của các học viên thuộc khóa học (theo maKH)
    //điền các bản ghi tương ứng vào bảng theo: tất cả, chưa nhập điểm, đã nhập điểm
    void fillGridView() {
        DefaultTableModel model = (DefaultTableModel) tblGridView.getModel();
        model.setRowCount(0);
        ResultSet rs = null;
        try {
            //lấy về MaHV, MaKH, MaNH, Diem, HoTen từ các bảng trong CSDL của các học viên thuộc 
            //khóa học (theo maKH)
            String sql = "SELECT hv.*, nh.HoTen FROM hocVien hv "
                    + " JOIN nguoiHoc nh ON nh.MaNH=hv.MaNH WHERE MaKH=?";
            rs = jdbcHelper.executeQuery(sql, MaKH);
            while (rs.next()) {
                double diem = rs.getDouble("Diem");
                Object[] row = {
                    rs.getInt("MaHV"), rs.getString("MaNH"),
                    rs.getString("HoTen"), diem, false
                };
                if (rdoTatCa.isSelected()) {  //tất cả thì add tất cả bản ghi vào 
                    model.addRow(row);
                } else if (rdoDaNhap.isSelected() && diem >= 0) {//đã nhập thì chỉ add bản ghi điểm 0-10
                    model.addRow(row);
                } else if (rdoChuaNhap.isSelected() && diem < 0) {//chưa nhập thì chỉ nhập bản ghi điểm -1
                    model.addRow(row);
                }
            }
        } catch (SQLException e) {
            dialogHelper.alert(this, "Lỗi truy vấn học viên!");
        } finally {
            try {
                rs.getStatement().getConnection().close();
            } catch (SQLException ex) {
                throw new RuntimeException();
            }
        }
    }

    /*
    thêm đt hocVien vào CSDL bảng hocVien
    load lại combobox, bảng
    MaHV là tự sinh từ 1 đến ... trong CSDL ko cần nhập
    mã tự sinh này là cố định không đổi kể cả khi bản ghi phía trước bị xóa làm stt thay đổi
     */
    void insert() {
        nguoiHoc nguoiHoc = (nguoiHoc) cboNguoiHoc.getSelectedItem(); //lấy đt nguoiHoc từ combobox
        hocVien model = new hocVien(); //tạo đt hocVien
        model.setMaKH(MaKH);
        model.setMaNH(nguoiHoc.getMaNH());
        model.setDiem(Double.valueOf(txtDiem.getText()));
        try {
            dao.insert(model);  //thêm đt hocVien vào CSDL bảng hocVien
            this.fillComboBox(); //load lại combobox
            this.fillGridView(); //load lại bảng
            txtDiem.setText("-1");
        } catch (Exception e) {
            dialogHelper.alert(this, "Lỗi thêm học viên vào khóa học!");
        }
    }

    //chỉ sửa điểm hocVien, xóa hocVien bị tích
    //cập nhật vào CSDL, load lại bảng, load lại cbo
    void update() {
        txtDiem.setBackground(white);
        int a = 0,b=0;
        for (int i = 0; i < tblGridView.getRowCount(); i++) {
            Integer mahv = (Integer) tblGridView.getValueAt(i, 0);  //lấy maHV từ bảng(ko sửa đc)
            String manh = (String) tblGridView.getValueAt(i, 1);  //lấy maNH từ bảng(ko sửa đc)
            Double diem = (Double) tblGridView.getValueAt(i, 3);   //lấy điểm (sửa đc)
            Boolean isDelete = (Boolean) tblGridView.getValueAt(i, 4);
            if (isDelete) {
                a++;
            }
            if (isDelete && shareHelper.USER.isVaiTro()) {     //nếu có tích thì xóa bản ghi đó đi
                dao.delete(mahv);
            } else {           //còn ko tích thì cập 
                if(shareHelper.USER.isVaiTro()==false)tblGridView.setValueAt(false, i, 3);
                if ((diem >= 0 && diem <= 10) || diem == -1) {
                    hocVien model = new hocVien();
                    model.setMaHV(mahv);
                    model.setMaKH(MaKH);
                    model.setMaNH(manh);
                    model.setDiem(diem);
                    dao.update(model);
                }else{
                    b++;
                }
            }
        }
        this.fillComboBox();
        this.fillGridView();
        if (a > 0 && shareHelper.USER.isVaiTro() == false) {
            dialogHelper.alert(this, "Chỉ trưởng phòng mới được xóa học viên\nbạn chỉ được thêm học viên và điểm");
            return;
        }
        if(b>0){
            dialogHelper.alert(this, "Điểm phải là số thực từ 0-10 hoặc chưa nhập (-1)");
            return;
        }
        dialogHelper.alert(this, "Cập nhật thành công!");
    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        this.fillComboBox();
        this.fillGridView();
    }//GEN-LAST:event_formWindowOpened

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        if (utilityHelper.checkDiem(txtDiem)) {
            insert();
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void rdoTatCaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdoTatCaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoTatCaMouseClicked

    private void rdoDaNhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdoDaNhapMouseClicked
        // TODO add your handling code here:    
    }//GEN-LAST:event_rdoDaNhapMouseClicked

    private void rdoChuaNhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdoChuaNhapMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoChuaNhapMouseClicked

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        // TODO add your handling code here:
            update();
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void rdoTatCaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoTatCaActionPerformed
        // TODO add your handling code here:
        this.fillGridView();                   //ActionPerformed
    }//GEN-LAST:event_rdoTatCaActionPerformed

    private void rdoDaNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoDaNhapActionPerformed
        // TODO add your handling code here:
        this.fillGridView();
    }//GEN-LAST:event_rdoDaNhapActionPerformed

    private void rdoChuaNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoChuaNhapActionPerformed
        // TODO add your handling code here:
        this.fillGridView();
    }//GEN-LAST:event_rdoChuaNhapActionPerformed

    private void cboNguoiHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboNguoiHocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboNguoiHocActionPerformed

    /**
     * @param args the command line arguments
     */
    //không cần đến cái này, nó sẽ gây lỗi khi sửa constructor của JFrame
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(hocVienJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(hocVienJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(hocVienJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(hocVienJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new hocVienJFrame().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnThem;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboNguoiHoc;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlHVKH;
    private javax.swing.JPanel pnlHVKhac;
    private javax.swing.JRadioButton rdoChuaNhap;
    private javax.swing.JRadioButton rdoDaNhap;
    private javax.swing.JRadioButton rdoTatCa;
    private javax.swing.JTable tblGridView;
    private javax.swing.JTextField txtDiem;
    // End of variables declaration//GEN-END:variables
}
