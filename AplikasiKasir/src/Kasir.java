/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.StringTokenizer;
import java.util.Locale;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
/**
 *
 * @author lenovo
 */
public class Kasir extends javax.swing.JFrame {
    
    public ArrayList nama = new ArrayList();
    public ArrayList harga = new ArrayList();
    public ArrayList jumlah = new ArrayList();
    public ArrayList total = new ArrayList();
    public ArrayList totalHarga = new ArrayList();
    
    String pilihan = "";
    int harga_makanan;
    int jml_harga;
    int bayar, beli, Harga;
    private int all;
    /**
     * Creates new form Kasir
     */
    public Kasir() {
        initComponents();
        setTitle("KELOMPOK 4");
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtHarga = new javax.swing.JTextField();
        txtJumlah = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtBayar = new javax.swing.JTextField();
        txtKembalian = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jComboPilihan = new javax.swing.JComboBox<>();
        btnBayar = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        txtBeli = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonPesanan = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButtonCash = new javax.swing.JButton();
        jButtonDebit = new javax.swing.JButton();
        cmbMetode = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaStruk = new javax.swing.JTextArea();
        jButtonCetakStruk = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 1, 32)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("APLIKASI E-CASHIER");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(52, 73, 94));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("THE FOODHALL");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(533, 533, 533))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 15)); // NOI18N
        jLabel2.setText("Nama Barang");

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 15)); // NOI18N
        jLabel3.setText("Harga Barang (Rp)");

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 15)); // NOI18N
        jLabel4.setText("Quantity");

        txtHarga.setEditable(false);
        txtHarga.setFont(new java.awt.Font("Tw Cen MT", 0, 15)); // NOI18N

        txtJumlah.setEditable(false);
        txtJumlah.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        txtJumlah.setForeground(new java.awt.Color(204, 0, 0));
        txtJumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJumlahActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 1, 15)); // NOI18N
        jLabel6.setText("Total (Rp)");

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 1, 15)); // NOI18N
        jLabel7.setText("Bayar (Rp)");

        txtBayar.setFont(new java.awt.Font("Tw Cen MT", 0, 15)); // NOI18N
        txtBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBayarActionPerformed(evt);
            }
        });

        txtKembalian.setEditable(false);
        txtKembalian.setFont(new java.awt.Font("Tw Cen MT", 0, 15)); // NOI18N
        txtKembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKembalianActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 1, 15)); // NOI18N
        jLabel8.setText("Kembalian (Rp)");

        jComboPilihan.setFont(new java.awt.Font("Tw Cen MT", 0, 15)); // NOI18N
        jComboPilihan.setMaximumRowCount(15);
        jComboPilihan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Pilih Barang-", "Chitato", "Sosis Kanzler", "Le Mineral", "Tanggo", "Ultra Milk", "Biskuat Chocolate" }));
        jComboPilihan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboPilihanActionPerformed(evt);
            }
        });

        btnBayar.setBackground(new java.awt.Color(34, 167, 240));
        btnBayar.setFont(new java.awt.Font("Tw Cen MT", 1, 15)); // NOI18N
        btnBayar.setForeground(new java.awt.Color(255, 255, 255));
        btnBayar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buy (1).png"))); // NOI18N
        btnBayar.setText("BAYAR");
        btnBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBayarActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(192, 57, 43));
        btnReset.setFont(new java.awt.Font("Tw Cen MT", 1, 15)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/redo (1).png"))); // NOI18N
        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnKeluar.setBackground(new java.awt.Color(192, 57, 43));
        btnKeluar.setFont(new java.awt.Font("Tw Cen MT", 1, 15)); // NOI18N
        btnKeluar.setForeground(new java.awt.Color(255, 255, 255));
        btnKeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emergency-exit (1).png"))); // NOI18N
        btnKeluar.setText("EXIT");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        txtBeli.setFont(new java.awt.Font("Tw Cen MT", 0, 15)); // NOI18N

        jTable1.setFont(new java.awt.Font("Tw Cen MT", 0, 15)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama Barang", "Harga Barang", "Quantity", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButtonPesanan.setBackground(new java.awt.Color(34, 167, 240));
        jButtonPesanan.setFont(new java.awt.Font("Tw Cen MT", 1, 15)); // NOI18N
        jButtonPesanan.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPesanan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas12/add (1).png"))); // NOI18N
        jButtonPesanan.setText("INPUT ");
        jButtonPesanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonPesananMouseClicked(evt);
            }
        });
        jButtonPesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesananActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 1, 15)); // NOI18N
        jLabel9.setText("  Metode Pembayaran");

        jButtonCash.setFont(new java.awt.Font("Tw Cen MT", 0, 15)); // NOI18N
        jButtonCash.setText("Cash");
        jButtonCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCashActionPerformed(evt);
            }
        });

        jButtonDebit.setFont(new java.awt.Font("Tw Cen MT", 0, 15)); // NOI18N
        jButtonDebit.setText("Debit");
        jButtonDebit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDebitActionPerformed(evt);
            }
        });

        cmbMetode.setFont(new java.awt.Font("Tw Cen MT", 0, 15)); // NOI18N
        cmbMetode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Verifikasi Metode-", "Cash", "Debit" }));

        jTextAreaStruk.setColumns(20);
        jTextAreaStruk.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTextAreaStruk.setRows(5);
        jScrollPane2.setViewportView(jTextAreaStruk);

        jButtonCetakStruk.setBackground(new java.awt.Color(0, 102, 51));
        jButtonCetakStruk.setFont(new java.awt.Font("Tw Cen MT", 1, 15)); // NOI18N
        jButtonCetakStruk.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCetakStruk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/invoice (1).png"))); // NOI18N
        jButtonCetakStruk.setText("STRUK");
        jButtonCetakStruk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCetakStrukActionPerformed(evt);
            }
        });

        btnPrint.setBackground(new java.awt.Color(0, 102, 51));
        btnPrint.setFont(new java.awt.Font("Tw Cen MT", 1, 15)); // NOI18N
        btnPrint.setForeground(new java.awt.Color(255, 255, 255));
        btnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/printer (1).png"))); // NOI18N
        btnPrint.setText("PRINT");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonPesanan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtHarga)
                            .addComponent(jComboPilihan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtBeli, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtJumlah, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBayar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(29, 29, 29)
                                .addComponent(txtKembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 77, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnKeluar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBayar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButtonCetakStruk)
                                .addGap(41, 41, 41)
                                .addComponent(btnPrint))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jButtonCash)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButtonDebit, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(cmbMetode, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(30, 30, 30)))
                        .addGap(141, 141, 141))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jComboPilihan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtBeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(11, 11, 11)
                                .addComponent(jButtonPesanan, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel8)
                                            .addComponent(txtKembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnReset)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonCash)
                            .addComponent(jButtonDebit))
                        .addGap(18, 18, 18)
                        .addComponent(cmbMetode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonCetakStruk)
                            .addComponent(btnPrint))))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboPilihanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboPilihanActionPerformed
        pilihan = (String) jComboPilihan.getSelectedItem();
        switch (pilihan) {
            case "Chitato":
                harga_makanan = 18000;
                break;
            case "Sosis Kanzler":
                harga_makanan = 8000;
                break;
            case "Le Mineral":
                harga_makanan = 5000;
                break;
            case "Tanggo":
                harga_makanan = 12000;
                break;
            case "Ultra Milk":
                harga_makanan = 6000;
                break;
            case "Biskuat Chocolate":
                harga_makanan = 7000;
                break;
        }       
        txtHarga.setText(""+Integer.toString (harga_makanan));
    }//GEN-LAST:event_jComboPilihanActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed

        txtBeli.setText("");
        txtJumlah.setText("");
        txtBayar.setText("");
        txtKembalian.setText("");
        jComboPilihan.setSelectedIndex(0);
        txtHarga.setText("");
        
        DefaultTableModel tb = (DefaultTableModel) jTable1.getModel();
        for(int i=0; i <= jTable1.getRowCount(); i++){
        tb.removeRow(all);
        }
    }//GEN-LAST:event_btnResetActionPerformed
    
    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        int answer = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin keluar dari pesanan?", "Selesai", JOptionPane.OK_OPTION);
        if (answer == JOptionPane.OK_OPTION){
            dispose();
        }
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void txtBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBayarActionPerformed
        
    }//GEN-LAST:event_txtBayarActionPerformed

    private void btnBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBayarActionPerformed
        int totalHarga = Integer.parseInt(txtJumlah.getText());
        int bayar = Integer.parseInt(txtBayar.getText());
        int kembalian = bayar - totalHarga;
        
        DecimalFormat angka = new DecimalFormat ("###,###");
        txtKembalian.setText("" + (kembalian));
    }//GEN-LAST:event_btnBayarActionPerformed

    private void jButtonPesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesananActionPerformed
        String nama = (String) jComboPilihan.getSelectedItem();
        int harga = Integer.parseInt(txtHarga.getText());
        int jumlah = Integer.parseInt(txtBeli.getText());
        int total = harga * jumlah;

        
        //panggil tabel
        DefaultTableModel tb = (DefaultTableModel) jTable1.getModel();
        
        tb.addRow(new Object[]{
            nama,
            "Rp. "+harga,
            jumlah,
            "Rp. "+total
        });
        
        int totalHarga = 0;
        for(int i=0; i<jTable1.getRowCount(); i++){
            totalHarga += Integer.parseInt(jTable1.getValueAt(i, 3).toString().substring(4));
        }
        txtJumlah.setText("" + totalHarga);
        jComboPilihan.setSelectedIndex(0);
        txtBeli.setText("");
        txtHarga.setText("");
    }//GEN-LAST:event_jButtonPesananActionPerformed

    private void jButtonPesananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonPesananMouseClicked
        
    }//GEN-LAST:event_jButtonPesananMouseClicked

    private void jButtonCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCashActionPerformed
       JOptionPane.showMessageDialog(this, "Cash Sukses, Lanjutkan Pembayaran Melalui Kasir dan Masukkan Nominal Bayar");
    }//GEN-LAST:event_jButtonCashActionPerformed

    private void jButtonDebitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDebitActionPerformed
        DebitMetode dbt = new DebitMetode();
        dbt.setVisible(true);
        dbt.pack();
        dbt.setLocationRelativeTo(null);
        dbt.setDefaultCloseOperation(DebitMetode.EXIT_ON_CLOSE);
        
    }//GEN-LAST:event_jButtonDebitActionPerformed

    private void jButtonCetakStrukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCetakStrukActionPerformed
        
        DefaultTableModel tb = new DefaultTableModel();
        tb = (DefaultTableModel)jTable1.getModel();
        
        jTextAreaStruk.setText(jTextAreaStruk.getText() + "********************************************************************************************\n");
        jTextAreaStruk.setText(jTextAreaStruk.getText() + "                                           THE FOODHALL                                     \n");
        jTextAreaStruk.setText(jTextAreaStruk.getText() + "                                         Sistem Informasi                                   \n");
        jTextAreaStruk.setText(jTextAreaStruk.getText() + "                                      Universitas Esa Unggul                                \n");
        jTextAreaStruk.setText(jTextAreaStruk.getText() + "********************************************************************************************\n\n");
        
        jTextAreaStruk.setText(jTextAreaStruk.getText() + "Pelanggan: jeny\n");
        
        jTextAreaStruk.setText(jTextAreaStruk.getText() + "Operator : Admin\n");
        
        Date obj = new Date();
        String date = obj.toString();
        jTextAreaStruk.setText((jTextAreaStruk.getText() + "Tanggal  : " + date + "\n\n"));
        
        jTextAreaStruk.setText(jTextAreaStruk.getText() + "============================================================================================\n");
        jTextAreaStruk.setText(jTextAreaStruk.getText() + "Nama Barang" + "\t\t" + "Harga Barang" + "\t\t" + "Quantity" + "\t\t" + "Total" + "\n"  );
        jTextAreaStruk.setText(jTextAreaStruk.getText() + "============================================================================================\n");
        
        for(int i = 0; i < jTable1.getRowCount(); i++)
        {
            String namaB = (String)tb.getValueAt(i, 0).toString();
            String hargaB = (String)tb.getValueAt(i, 1).toString();
            String jumlahB = (String)tb.getValueAt(i, 2).toString();
            String totalH = (String)tb.getValueAt(i, 3).toString();
            
            jTextAreaStruk.setText(jTextAreaStruk.getText() + namaB + "\t\t" + hargaB + "\t\t" + jumlahB + "\t\t\t" + totalH + "\n"  );
        }
        
        jTextAreaStruk.setText(jTextAreaStruk.getText() + "\n");
        jTextAreaStruk.setText(jTextAreaStruk.getText() + "\t\t\t" + "\t\t\t" + "Total Harga: " + txtJumlah.getText() + "\n");
        jTextAreaStruk.setText(jTextAreaStruk.getText() + "\t\t\t" + "\t\t\t" + cmbMetode.getSelectedItem().toString() + ": " + txtBayar.getText() + "\n");
        jTextAreaStruk.setText(jTextAreaStruk.getText() + "\t\t\t" + "\t\t\t" + "Kembalian: " + txtKembalian.getText() + "\n");
        
        jTextAreaStruk.setText(jTextAreaStruk.getText() + "\n");
        jTextAreaStruk.setText(jTextAreaStruk.getText() + "--------------------------------------------------------------------------------------------\n");
        jTextAreaStruk.setText(jTextAreaStruk.getText() + "                               TERIMA KASIH, SILAKAN DATANG KEMBALI                         \n");
    }//GEN-LAST:event_jButtonCetakStrukActionPerformed

    private void txtJumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJumlahActionPerformed

    private void txtKembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKembalianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKembalianActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        try{
            jTextAreaStruk.print();
        }
        catch(Exception e)
        {
            System.out.println("Exception are-" + e);
        }
    }//GEN-LAST:event_btnPrintActionPerformed

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
            java.util.logging.Logger.getLogger(Kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kasir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBayar;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnReset;
    private javax.swing.JComboBox<String> cmbMetode;
    private javax.swing.JButton jButtonCash;
    private javax.swing.JButton jButtonCetakStruk;
    private javax.swing.JButton jButtonDebit;
    private javax.swing.JButton jButtonPesanan;
    private javax.swing.JComboBox<String> jComboPilihan;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextAreaStruk;
    private javax.swing.JTextField txtBayar;
    private javax.swing.JTextField txtBeli;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtJumlah;
    private javax.swing.JTextField txtKembalian;
    // End of variables declaration//GEN-END:variables

}
