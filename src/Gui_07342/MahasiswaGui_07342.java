package Gui_07342;

import Entity_07342.MahasiswaKursusEntity_07342;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MahasiswaGui_07342 extends ComponentGui_07342 {
    int id;
    String nama, npm, jurusan, kelas, sesi, jeniskursus, noTelp, path;
    String filemove = "./src/Images/";
    
    File file;
    public MahasiswaGui_07342(int cek){
        initComponent(cek);
    }
    
    void initComponent(int cek){
        for(MahasiswaKursusEntity_07342 mahasiswaEntities : AllObjectController_07342.mahasiswa.getById(cek)) {
            this.id       = mahasiswaEntities.getId_07342();
            this.nama     = mahasiswaEntities.getNama_07342();
            this.npm      = mahasiswaEntities.getNpm_07342();
            this.jurusan      = mahasiswaEntities.getJurusan_07342();
            this.kelas      = mahasiswaEntities.getKelas_07342();
            this.sesi      = mahasiswaEntities.getSesi_07342();
            this.jeniskursus      = mahasiswaEntities.getJenis_kursus_07342();
            this.noTelp   = mahasiswaEntities.getNoTelp_07342();
        }
        
        setTitle("PROGRAM VERIF MAHASISWA");
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(480,450);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setVisible(true);
        
        btnback.setBounds(10, 20, 80, 25);
        btnback.setBackground(Color.white);
        btnback.setFocusPainted(false);
        btnback.setBorder(null);
        add(btnback);
        
        labelid.setBounds(25, 50, 120, 25);
        add(labelid);
        fieldid.setBounds(150, 50, 120, 25);
        fieldid.setText(Integer.toString(id));
        fieldid.setEditable(false);
        add(fieldid);
        
        labelnama.setBounds(25, 90, 120, 25);
        add(labelnama);
        fieldnama.setBounds(150, 90, 120, 25);
        fieldnama.setText(nama);
        fieldnama.setEditable(false);
        add(fieldnama);
        
        labelnpm.setBounds(25, 135, 120, 25);
        add(labelnpm);
        fieldnpm.setBounds(150, 135, 120, 25);
        fieldnpm.setText(npm);
        fieldnpm.setEditable(false);
        add(fieldnpm);
        
        labeljurusan.setBounds(25, 180, 120, 25);
        add(labeljurusan);
        fieldjurusan.setBounds(150, 180, 120, 25);
        fieldjurusan.setText(jurusan);
        fieldjurusan.setEditable(false);
        add(fieldjurusan);
        
        labelkelas.setBounds(25, 225, 120, 25);
        add(labelkelas);
        fieldkelas.setBounds(150, 225, 120, 25);
        fieldkelas.setText(kelas);
        fieldkelas.setEditable(false);
        add(fieldkelas);
        
        labelsesi.setBounds(25, 270, 120, 25);
        add(labelsesi);
        fieldsesi.setBounds(150, 270, 120, 25);
        fieldsesi.setText(sesi);
        fieldsesi.setEditable(false);
        add(fieldsesi);
        
        labeljeniskursus.setBounds(25, 310, 120, 25);
        add(labeljeniskursus);
        fieldjeniskursus.setBounds(150, 310, 120, 25);
        fieldjeniskursus.setText(jeniskursus);
        fieldjeniskursus.setEditable(false);
        add(fieldjeniskursus);
        
        labelnotelp.setBounds(25, 355, 120, 25);
        add(labelnotelp);
        fieldnotelp.setBounds(150, 355, 120, 25);
        fieldnotelp.setText(noTelp);
        fieldnotelp.setEditable(false);
        add(fieldnotelp);
        
        bingkaigambar.setBounds(50, 225, 150, 200);
        add(bingkaigambar);
        
        btnubahnama.setBounds(300, 90, 80, 25);
        btnubahnpm.setBounds(300, 135, 80, 25);
        btnubahjurusan.setBounds(300, 180, 80, 25);
        btnubahkelas.setBounds(300, 225, 80, 25);
        btnubahsesi.setBounds(300, 270, 80, 25);
        btnubahjeniskursus.setBounds(300, 310, 80, 25);
        btnubahnotelp.setBounds(300, 355, 80, 25);
        
        add(btnubahnama);
        add(btnubahnpm);
        add(btnubahjurusan);
        add(btnubahkelas);
        add(btnubahsesi);
        add(btnubahjeniskursus);
        add(btnubahnotelp);
        
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
                LoginGui_07342 loginGui = new LoginGui_07342();
                loginGui.setVisible(true);
                dispose();
            }
        });
        
        btnubahnama.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    String inputnama = JOptionPane.showInputDialog("Masukkan Nama Baru");
                    if(inputnama.length() > 0){
                        AllObjectController_07342.mahasiswa.updateData(1, inputnama, cek);
                        fieldnama.setText(inputnama);
                    } else {
                        JOptionPane.showMessageDialog(null, "Data Kosong");
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Cancelled");
                }
            }
        });
        
        btnubahnpm.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    String inputnpm = JOptionPane.showInputDialog("Masukan NPM Baru");
                    if(inputnpm.length() > 0){
                        AllObjectController_07342.mahasiswa.updateData(2, inputnpm, cek);
                        fieldnpm.setText(inputnpm);
                    } else {
                        JOptionPane.showMessageDialog(null, "Data Kosong");
                    }
                } catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "Cancelled");
                }
            }
        });
        
        btnubahjurusan.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    String inputjurusan = JOptionPane.showInputDialog("Masukan Jurusan Baru");
                    if(inputjurusan.length() > 0){
                        AllObjectController_07342.mahasiswa.updateData(3, inputjurusan, id);
                        fieldjurusan.setText(inputjurusan);
                    } else {
                        JOptionPane.showMessageDialog(null, "Data Kosong");
                    }
                } catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Cancelled");
                }
            }
        });
        
        btnubahkelas.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    String inputkelas = JOptionPane.showInputDialog("Masukan Kelas Baru");
                    if(inputkelas.length() > 0){
                        AllObjectController_07342.mahasiswa.updateData(4, inputkelas, id);
                        fieldkelas.setText(inputkelas);
                    } else {
                        JOptionPane.showMessageDialog(null, "Data Kosong");
                    }
                } catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Cancelled");
                }
            }
        });
        
        btnubahsesi.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    String inputsesi = JOptionPane.showInputDialog("Masukan Sesi Baru");
                    if(inputsesi.length() > 0){
                        AllObjectController_07342.mahasiswa.updateData(5, inputsesi, id);
                        fieldsesi.setText(inputsesi);
                    } else {
                        JOptionPane.showMessageDialog(null, "Data Kosong");
                    }
                } catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Cancelled");
                }
            }
        });
        
        btnubahjeniskursus.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    String inputjeniskursus = JOptionPane.showInputDialog("Masukan Jenis Kursus Baru");
                    if(inputjeniskursus.length() > 0){
                        AllObjectController_07342.mahasiswa.updateData(6, inputjeniskursus, id);
                        fieldjeniskursus.setText(inputjeniskursus);
                    } else {
                        JOptionPane.showMessageDialog(null, "Data Kosong");
                    }
                } catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Cancelled");
                }
            }
        });
        
        btnubahnotelp.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    String inputNoTelp = JOptionPane.showInputDialog("Masukan Nomor Telepon Baru");
                    if(inputNoTelp.length() > 0){
                        AllObjectController_07342.mahasiswa.updateData(7, inputNoTelp, cek);
                        fieldnotelp.setText(inputNoTelp);
                    } else {
                        JOptionPane.showMessageDialog(null, "Data Kosong");
                    }
                } catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Cancelled");
                }
            }
        });
    }
}
