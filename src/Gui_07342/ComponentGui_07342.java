package Gui_07342;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class ComponentGui_07342 extends JFrame {
    protected JButton btnregister = new JButton("OK");
    protected JButton btnnotregA = new JButton("REGISTRASI ADMIN");
    protected JButton btnnotregM = new JButton("REGISTRASI MAHASISWA KURSUS");
    protected JButton btnlogin = new JButton("LOG IN");
    protected JButton btnback = new JButton("<< KEMBALI");
    protected JButton btndelete = new JButton("DELETE");
    protected JButton btnmenu = new JButton("MENU");
    protected JButton btnAdmin = new JButton("ADMIN");
    protected JButton btnMahasiswa = new JButton("MAHASISWA KURSUS");
    
    protected JLabel labelregister = new JLabel("REGISTER");
    protected JLabel labellogin = new JLabel("LOGIN");
    protected JLabel labelid = new JLabel("ID");
    protected JLabel labelnama = new JLabel("NAMA");
    protected JLabel labelnpm = new JLabel("NPM");
    protected JLabel labelpassword = new JLabel("PASSWORD");
    protected JLabel labeljurusan = new JLabel("JURUSAN");
    protected JLabel labelsesi = new JLabel("SESI");
    protected JLabel labelkelas = new JLabel("KELAS");
    protected JLabel labeljeniskursus = new JLabel("JENIS KURSUS");
    protected JLabel labelnotelp = new JLabel("NO TELEPON");
    protected JLabel bingkaigambar = new JLabel();
    
    protected JTextField fieldid = new JTextField();
    protected JTextField fieldnama = new JTextField();
    protected JTextField fieldnpm = new JTextField();
    protected JPasswordField fieldpassword = new JPasswordField();
    protected JTextField fieldpass = new JTextField();
    protected JTextField fieldjurusan = new JTextField();
    protected JTextField fieldsesi = new JTextField();
    protected JTextField fieldkelas = new JTextField();
    protected JTextField fieldjeniskursus = new JTextField();
    protected JTextField fieldnotelp = new JTextField();
    
    protected JButton btnubahnama = new JButton("Ubah");
    protected JButton btnubahnpm = new JButton("Ubah");
    protected JButton btnubahpassword = new JButton("Ubah");
    protected JButton btnubahjurusan = new JButton("Ubah");
    protected JButton btnubahsesi = new JButton("Ubah");
    protected JButton btnubahkelas = new JButton("Ubah");
    protected JButton btnubahjeniskursus = new JButton("Ubah");
    protected JButton btnubahnotelp = new JButton("Ubah");
    
    BufferedImage bufferedImage = null;
    Image gambarresize;
    
    void kosong(){
        fieldnama.setText(null);
        fieldnpm.setText(null);
        fieldpassword.setText(null);
        fieldnotelp.setText(null);
        fieldjurusan.setText(null);
        fieldkelas.setText(null);
        fieldsesi.setText(null);
        fieldjeniskursus.setText(null);
    }
}