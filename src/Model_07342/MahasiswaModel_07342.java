package Model_07342;
import Entity_07342.MahasiswaKursusEntity_07342;
import java.sql.*;
import java.util.ArrayList;

public class MahasiswaModel_07342 extends ModelAbstract_07342{
    private String sql;
    public ArrayList <MahasiswaKursusEntity_07342> getMahasiswa()
    {
        ArrayList <MahasiswaKursusEntity_07342> arraylistMahasiswa = new ArrayList<>();
        try{
            Statement stat = conn.createStatement();
            sql = "SELECT * FROM mahasiswa_07342";
            ResultSet rs = stat.executeQuery(sql);
            while (rs.next()){
                MahasiswaKursusEntity_07342 mahasiswa_07342 = new MahasiswaKursusEntity_07342();
                mahasiswa_07342.setId_07342(rs.getInt("id_07342"));
                mahasiswa_07342.setNama_07342(rs.getString("nama_07342"));
                mahasiswa_07342.setNpm_07342(rs.getString("npm_07342"));
                mahasiswa_07342.setJurusan_07342(rs.getString("jurusan_07342"));
                mahasiswa_07342.setKelas_07342(rs.getString("kelas_07342"));
                mahasiswa_07342.setSesi_07342(rs.getString("sesi_07342"));
                mahasiswa_07342.setJenis_kursus_07342(rs.getString("jenis_kursus_07342"));
                mahasiswa_07342.setNoTelp_07342(rs.getString("noTelp_07342"));
                arraylistMahasiswa.add(mahasiswa_07342);
            }
            }catch(SQLException e){
                System.out.println(e);
            }
            return arraylistMahasiswa;
    }
    
    public ArrayList <MahasiswaKursusEntity_07342> getMahasiswa(int id_07342)
    {
        ArrayList <MahasiswaKursusEntity_07342> arrMahasiswa = new ArrayList<>();
        try{
            sql = "SELECT * FROM mahasiswa_07342 where id_07342 = ?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setInt(1, id_07342);
            ResultSet rs = stat.executeQuery();
            while (rs.next()){
                MahasiswaKursusEntity_07342 mahasiswa_07342 = new MahasiswaKursusEntity_07342();
                mahasiswa_07342.setId_07342(rs.getInt("id_07342"));
                mahasiswa_07342.setNama_07342(rs.getString("nama_07342"));
                mahasiswa_07342.setNpm_07342(rs.getString("npm_07342"));
                mahasiswa_07342.setJurusan_07342(rs.getString("jurusan_07342"));
                mahasiswa_07342.setKelas_07342(rs.getString("kelas_07342"));
                mahasiswa_07342.setSesi_07342(rs.getString("sesi_07342"));
                mahasiswa_07342.setJenis_kursus_07342(rs.getString("jenis_kursus_07342"));
                mahasiswa_07342.setNoTelp_07342(rs.getString("noTelp_07342"));
                arrMahasiswa.add(mahasiswa_07342);
            }
            }catch(SQLException e){
                    System.out.println(e);
                    }
            return arrMahasiswa;
    }

    public void insertData(MahasiswaKursusEntity_07342 MahasiswaKursusEntity_07342){
        try{
            sql="INSERT INTO mahasiswa_07342 (nama_07342, npm_07342, jurusan_07342, kelas_07342, sesi_07342, jenis_kursus_07342, noTelp_07342) Values(?,?,?,?,?,?,?)";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, MahasiswaKursusEntity_07342.getNama_07342());
            stat.setString(2, MahasiswaKursusEntity_07342.getNpm_07342());
            stat.setString(3, MahasiswaKursusEntity_07342.getJurusan_07342());
            stat.setString(4, MahasiswaKursusEntity_07342.getKelas_07342());
            stat.setString(5, MahasiswaKursusEntity_07342.getSesi_07342());
            stat.setString(6, MahasiswaKursusEntity_07342.getJenis_kursus_07342());
            stat.setString(7, MahasiswaKursusEntity_07342.getNoTelp_07342());
            
            int rows=stat.executeUpdate();
            System.out.println(rows + "row(s) updated !");
        }catch(SQLException e){
            System.out.println("GAGAL INPUT DATA !!!");
            e.printStackTrace();
        }
    }
    
    public void updateNama(String nama_07342, int id_07342){
        try{
            sql="UPDATE mahasiswa_07342 SET nama_07342 =? WHERE id_07342=?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, nama_07342);
            stat.setInt(2, id_07342);
            stat.executeUpdate();
        }catch(SQLException e){
            System.out.println("GAGAL RUBAH NAMA !!!");
            e.printStackTrace();
        }
    }
    
    public void updateNpm(String npm_07342, int id_07342){
        try{
            sql="UPDATE mahasiswa_07342 SET npm_07342 =? WHERE id_07342=?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, npm_07342);
            stat.setInt(2, id_07342);
            int rows=stat.executeUpdate();
            System.out.println(rows + "row(s) updated !");
        }catch(SQLException e){
            System.out.println("GAGAL RUBAH NPM !!!");
            e.printStackTrace();
        }
    }
    
    public void updateJurusan(String jurusan_07342, int id_07342){
        try{
            sql="UPDATE mahasiswa_07342 SET jurusan_07342 =? WHERE id_07342=?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, jurusan_07342);
            stat.setInt(2, id_07342);
            int rows=stat.executeUpdate();
            System.out.println(rows + "row(s) updated !");
        }catch(SQLException e){
            System.out.println("GAGAL RUBAH JURUSAN !!!");
            e.printStackTrace();
        }
    }
    
    public void updateKelas(String kelas_07342, int id_07342){
        try{
            sql="UPDATE mahasiswa_07342 SET kelas_07342 =? WHERE id_07342=?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, kelas_07342);
            stat.setInt(2, id_07342);
            int rows=stat.executeUpdate();
            System.out.println(rows + "row(s) updated !");
        }catch(SQLException e){
            System.out.println("GAGAL RUBAH KELAS !!!");
            e.printStackTrace();
        }
    }
    
    public void updateSesi(String sesi_07342, int id_07342){
        try{
            sql="UPDATE mahasiswa_07342 SET sesi_07342 =? WHERE id_07342=?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, sesi_07342);
            stat.setInt(2, id_07342);
            int rows=stat.executeUpdate();
            System.out.println(rows + "row(s) updated !");
        }catch(SQLException e){
            System.out.println("GAGAL RUBAH SESI !!!");
            e.printStackTrace();
        }
    }
    
    public void updateJenisKursus(String jenis_kursus_07342, int id_07342){
        try{
            sql="UPDATE mahasiswa_07342 SET jenis_kursus_07342 =? WHERE id_07342=?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, jenis_kursus_07342);
            stat.setInt(2, id_07342);
            int rows=stat.executeUpdate();
            System.out.println(rows + "row(s) updated !");
        }catch(SQLException e){
            System.out.println("GAGAL RUBAH Jenis Kursus !!!");
            e.printStackTrace();
        }
    }
    
    public void updateNoTelp(String noTelp_07342, int id_07342){
        try{
            sql="UPDATE mahasiswa_07342 SET noTelp_07342 =? WHERE id_07342=?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, noTelp_07342);
            stat.setInt(2, id_07342);
            int rows=stat.executeUpdate();
            System.out.println(rows + "row(s) updated !");
        }catch(SQLException e){
            System.out.println("GAGAL RUBAH No. Telepon !!!");
            e.printStackTrace();
        }
    }
    
    public int cekLogin(String npm, String nama){
        int cek =0;
        try{
            sql = "SELECT * FROM mahasiswa_07342 where npm_07342 = ? and nama_07342 =?"; 
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, npm);
            stat.setString(2, nama);
            ResultSet rs = stat.executeQuery();
            if(rs.next()){
                npm  = rs.getString("npm_07342");
                nama = rs.getString("nama_07342");
                cek = rs.getInt("id_07342");;
                System.out.println("Selamat Datang " + nama);
            } else {
                cek = 0;
            }
        } catch (SQLException e){
            e.printStackTrace();
        }return cek;
    }
    
}
