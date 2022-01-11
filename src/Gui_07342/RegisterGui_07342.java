package Gui_07342;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RegisterGui_07342 extends ComponentGui_07342 {
    public RegisterGui_07342(){
        initComponent();
    }
    
    void initComponent(){
        setTitle("Register Akun");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(320, 480);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.lightGray);
        setLayout(null);
        setVisible(true);
        
        labelregister.setBounds(120, 30, 70, 25);
        add(labelregister);
        
        labelnama.setBounds(35, 80, 80, 25);
        add(labelnama);
        fieldnama.setBounds(130, 80, 130, 25);
        add(fieldnama);
        
        labelnpm.setBounds(35, 120, 80, 25);
        add(labelnpm);
        fieldnpm.setBounds(130, 120, 130, 25);
        add(fieldnpm);
        
        labeljurusan.setBounds(35, 160, 80, 25);
        add(labeljurusan);
        fieldjurusan.setBounds(130, 160, 130, 25);
        add(fieldjurusan);
        
        labelkelas.setBounds(35, 200, 80, 25);
        add(labelkelas);
        fieldkelas.setBounds(130, 200, 130, 25);
        add(fieldkelas);
        
        labelsesi.setBounds(35, 240, 80, 25);
        add(labelsesi);
        fieldsesi.setBounds(130, 240, 130, 25);
        add(fieldsesi);
        
        labeljeniskursus.setBounds(35, 280, 100, 25);
        add(labeljeniskursus);
        fieldjeniskursus.setBounds(130, 280, 130, 25);
        add(fieldjeniskursus);
        
        labelnotelp.setBounds(35, 320, 80, 25);
        add(labelnotelp);
        fieldnotelp.setBounds(130, 320, 130, 25);
        add(fieldnotelp);
        
        btnback.setBounds(10, 20, 80, 25);
        btnback.setBackground(Color.white);
        btnback.setFocusPainted(false);
        btnback.setBorder(null);
        add(btnback);
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
                Menu_07342 menu = new Menu_07342();
                menu.setVisible(true);
                dispose();
            }
        });
        
        btnregister.setBounds(80, 370, 140, 25);
        btnregister.setBorder(null);
        btnregister.setBackground(Color.black);
        btnregister.setForeground(Color.white);
        btnregister.setFocusPainted(false);
        add(btnregister);
        
        btnregister.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent e){
                btnregister.setForeground(Color.black);
                btnregister.setBackground(Color.green);
            }
            
            @Override
            public void mouseExited(MouseEvent e){
                btnregister.setForeground(Color.white);
                btnregister.setBackground(Color.black);
            }
        });
        
        btnregister.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String nama = fieldnama.getText();
                String npm = fieldnpm.getText();
                String jurusan = fieldjurusan.getText();
                String kelas = fieldkelas.getText();
                String sesi = fieldsesi.getText();
                String jeniskursus = fieldjeniskursus.getText();
                String notelp = fieldnotelp.getText();
                if(nama.length() != 0 && npm.length() != 0 && jurusan.length() != 0 && kelas.length() != 0 && sesi.length() != 0 && jeniskursus.length() != 0 && notelp.length() != 0){
                    AllObjectController_07342.mahasiswa.insertData(nama, npm, jurusan, kelas, sesi, jeniskursus, notelp);
                    JOptionPane.showMessageDialog(null, "Silahkan Login Kembali");
                    dispose();
                    new LoginGui_07342().setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Data Tidak Boleh Kosong");
                    kosong();
                }
            }
        });
    }
}
