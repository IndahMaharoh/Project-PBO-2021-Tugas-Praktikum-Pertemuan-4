package Gui_07342;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class AdminGui_07342 extends ComponentGui_07342 {
    JTable tabelmahasiswa = new JTable();
    JScrollPane spmahasiswa = new JScrollPane(tabelmahasiswa);
    JTextField textpilih = new JTextField();
    int kode;
    
    public AdminGui_07342(int cek){
        initComponent(cek);
    }
    
    void initComponent(int cek){
        setTitle("MENU ADMIN");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700,480);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.white);
        
        setLayout(null);
        setVisible(true);
        
        spmahasiswa.setBounds(20, 50, 500, 350);
        tabelmahasiswa.setModel(AllObjectController_07342.mahasiswa.daftarMahasiswa());
        add(spmahasiswa);
        
        btndelete.setBounds(540, 95, 110, 25);
        btndelete.setFocusPainted(false);
        btndelete.setBorder(null);
        btndelete.setBackground(Color.black);
        btndelete.setForeground(Color.white);
        add(btndelete);
        
        btnubahpassword.setText("UBAH PASSWORD");
        btnubahpassword.setBounds(540, 140, 110, 25);
        btnubahpassword.setFocusPainted(false);
        btnubahpassword.setBorder(null);
        btnubahpassword.setBackground(Color.black);
        btnubahpassword.setForeground(Color.white);
        add(btnubahpassword);
        
        btnubahnama.setText("UBAH NAMA ADMIN");
        btnubahnama.setBounds(540, 185, 110, 25);
        btnubahnama.setFocusPainted(false);
        btnubahnama.setBorder(null);
        btnubahnama.setBackground(Color.black);
        btnubahnama.setForeground(Color.white);
        add(btnubahnama);
        
        btnubahnotelp.setText("UBAH NO TELEPON ADMIN");
        btnubahnotelp.setBounds(540, 230, 110, 25);
        btnubahnotelp.setFocusPainted(false);
        btnubahnotelp.setBorder(null);
        btnubahnotelp.setBackground(Color.black);
        btnubahnotelp.setForeground(Color.white);
        add(btnubahnotelp);
        
        btnback.setBounds(25, 20, 80, 25);
        btnback.setBackground(Color.white);
        btnback.setFocusPainted(false);
        btnback.setBorder(null);
        add(btnback);
        
        tabelmahasiswa.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                int i = tabelmahasiswa.getSelectedRow();
                textpilih.setText(AllObjectController_07342.mahasiswa.daftarMahasiswa().getValueAt(i, 0).toString());
            }
        });
        
        btndelete.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                kode = Integer.parseInt(textpilih.getText());
                AllObjectController_07342.admin.deleteData(kode);
                tabelmahasiswa.setModel(AllObjectController_07342.mahasiswa.daftarMahasiswa());
                JOptionPane.showMessageDialog(null, "Berhasil HAPUS DATA");
            }
        });
        
        btnback.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent e){
                btnback.setForeground(Color.yellow);
            }
            
            @Override
            public void mouseExited(MouseEvent e){
                btnback.setForeground(Color.black);
            }
        });
        
        btnback.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                LoginAdminGui_07342 loginAdminGui = new LoginAdminGui_07342();
                loginAdminGui.setVisible(true);
                dispose();
            }
        });
        
        btnubahpassword.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    String inputpass = JOptionPane.showInputDialog("Masukkan Password Baru");
                    if(inputpass.length() > 0){
                        AllObjectController_07342.admin.updatePassword(inputpass, cek);
                        JOptionPane.showMessageDialog(null, "Berhasil Ubah Password");
                    } else {
                        JOptionPane.showMessageDialog(null, "Data Kosong");
                    }
                } catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "Cancelled");
                }
            }
        });
        
        btnubahnama.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    String inputnama = JOptionPane.showInputDialog("Masukkan Nama Baru");
                    if(inputnama.length() > 0){
                        AllObjectController_07342.admin.updateNama(inputnama, cek);
                        JOptionPane.showMessageDialog(null, "Berhasil Ubah Nama");
                    } else {
                        JOptionPane.showMessageDialog(null, "Data Kosong");
                    }
                } catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "Cancelled");
                }
            }
        });
        
        btnubahnotelp.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    String inputnotelp = JOptionPane.showInputDialog("Masukkan No Telepon Baru");
                    if(inputnotelp.length() > 0){
                        AllObjectController_07342.admin.updateNoTelp(inputnotelp, cek);
                        JOptionPane.showMessageDialog(null, "Berhasil No Telepon");
                    } else {
                        JOptionPane.showMessageDialog(null, "Data Kosong");
                    }
                } catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "Cancelled");
                }
            }
        });
        
    } 
}
