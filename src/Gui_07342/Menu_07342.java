package Gui_07342;

import javax.imageio.ImageIO;
import java.awt.image.ColorModel;
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

public class Menu_07342 extends ComponentGui_07342 {
    String pathicon;
    
    public Menu_07342(){
        initComponent();
    }
    
    void initComponent(){
        setTitle("MENU");
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,350);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.gray.brighter());
        setLayout(null);
        setVisible(true);
        
        btnAdmin.setBounds(170, 50, 70, 25);
        btnAdmin.setBackground(Color.blue.brighter());
        btnAdmin.setForeground(Color.WHITE);
        btnAdmin.setBorder(null);
        add(btnAdmin);
        
        btnMahasiswa.setBounds(120, 100, 160, 25);
        btnMahasiswa.setBackground(Color.blue.brighter());
        btnMahasiswa.setForeground(Color.WHITE);
        btnMahasiswa.setBorder(null);
        add(btnMahasiswa);
        
        btnnotregA.setBounds(120, 150, 160, 25);
        btnnotregA.setBackground(Color.blue.brighter());
        btnnotregA.setForeground(Color.WHITE);
        btnnotregA.setBorder(null);
        add(btnnotregA);
        
        btnnotregM.setBounds(80, 200, 250, 25);
        btnnotregM.setBackground(Color.blue.brighter());
        btnnotregM.setForeground(Color.WHITE);
        btnnotregM.setBorder(null);
        add(btnnotregM);
        
        bingkaigambar.setBounds(0, 0, 400, 350);
        add(bingkaigambar);
        
        pathicon = "./src/Images/g3.png";
        
        try{
            bufferedImage = ImageIO.read(new File(pathicon));
        } catch (IOException ex) {
            Logger.getLogger(Menu_07342.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        gambarresize = bufferedImage.getScaledInstance(400, 350,    Image.SCALE_SMOOTH);
        bingkaigambar.setIcon(new ImageIcon(gambarresize));
        
        btnnotregM.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e){
                btnnotregM.setForeground(Color.black);
            }
            
            @Override
            public void mouseExited(MouseEvent e){
                btnnotregM.setForeground(Color.white);
            }
        });
        btnnotregM.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)  {
                dispose();
                new RegisterGui_07342().setVisible(true);
            }
        });
        
        btnnotregA.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e){
                btnnotregA.setForeground(Color.black);
            }
            
            @Override
            public void mouseExited(MouseEvent e){
                btnnotregA.setForeground(Color.white);
            }
        });
        btnnotregA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                RegisterAdminGui_07342 regA = new RegisterAdminGui_07342();
                regA.setVisible(true);
            }
        });
        
        btnAdmin.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent e) {
                btnAdmin.setForeground(Color.black);
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                btnAdmin.setForeground(Color.white);
            }
        });
        
        btnAdmin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                LoginAdminGui_07342 loginA = new LoginAdminGui_07342();
                loginA.setVisible(true);
            }
        });
        
        btnMahasiswa.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e){
                btnMahasiswa.setForeground(Color.black);
            }
            
            @Override
            public void mouseExited(MouseEvent e){
                btnMahasiswa.setForeground(Color.white);
            }
        });
        
        btnMahasiswa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                LoginGui_07342 loginm = new LoginGui_07342();
                loginm.setVisible(true);
            }
        });       
    }
}

