package Gui_07342;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginGui_07342 extends ComponentGui_07342 {
    String pathicon;
    public LoginGui_07342(){
        initComponent();
    }
    
    void initComponent(){
        setTitle("Login Mahasiswa Kursus");
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(320,480);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setVisible(true);
        
        labelnpm.setBounds(35, 250, 40, 25);
        add(labelnpm);
        fieldnpm.setBounds(130, 250, 130, 25);
        add(fieldnpm);
        
        labelnama.setBounds(35, 290, 80, 25);
        add(labelnama);
        fieldnama.setBounds(130, 290, 130, 25);
        add(fieldnama);
        
        btnlogin.setBounds(110, 350, 100, 25);
        btnlogin.setBackground(Color.black);
        btnlogin.setForeground(Color.white);
        btnlogin.setBorder(null);
        add(btnlogin);
        
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
        
        bingkaigambar.setBounds(80,70,150,150);
        add(bingkaigambar);
        
        pathicon = "./src/Images/keys.png";
        
        try{
            bufferedImage = ImageIO.read(new File(pathicon));
        } catch (IOException ex) {
            Logger.getLogger(LoginGui_07342.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        gambarresize = bufferedImage.getScaledInstance(150, 150,    Image.SCALE_SMOOTH);
        bingkaigambar.setIcon(new ImageIcon(gambarresize));
        
        btnlogin.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent e) {
                btnlogin.setForeground(Color.black);
                btnlogin.setBackground(Color.green);
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                btnlogin.setForeground(Color.white);
                btnlogin.setBackground(Color.black);
            }
        });
        
        btnlogin.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String npm = fieldnpm.getText();
                String nama = fieldnama.getText();
                int cek = AllObjectController_07342.mahasiswa.login(npm, nama);
                if(cek > 0){
                    dispose();
                    MahasiswaGui_07342 mahasiswaGui = new MahasiswaGui_07342(cek);
                    mahasiswaGui.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "GAGAL LOGIN");
                    kosong();
                }
            }
        });
    }
}
