package Gui_07342;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RegisterAdminGui_07342 extends ComponentGui_07342 {
    public RegisterAdminGui_07342(){
        initComponent();
    }
    
    void initComponent(){
        setTitle("Register Admin");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(320, 480);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.gray.brighter());
        setLayout(null);
        setVisible(true);
        
        labelregister.setText("REGISTER ADMIN");
        labelregister.setBounds(100, 50, 110, 25);
        add(labelregister);
        
        labelnama.setBounds(35, 95, 40, 25);
        add(labelnama);
        fieldnama.setBounds(130, 95, 130, 25);
        add(fieldnama);
        
        labelpassword.setBounds(35, 140, 80, 25);
        add(labelpassword);
        fieldpass.setBounds(130, 140, 130, 25);
        add(fieldpass);
        
        labelnotelp.setBounds(35, 185, 80, 25);
        add(labelnotelp);
        fieldnotelp.setBounds(130, 185, 130, 25);
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
        
        btnregister.setBounds(80, 230, 140, 25);
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
                String password = fieldpass.getText();
                String notelp = fieldnotelp.getText();
                if(nama.length() != 0 && password.length() != 0 && notelp.length() != 0){
                    AllObjectController_07342.admin.insertData(nama, password, notelp);
                    JOptionPane.showMessageDialog(null, nama + "Adalah Admin");
                    dispose();
                    new LoginAdminGui_07342().setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Data Tidak Boleh Kosong");
                    kosong();
                }
            }
        });
    }
}
