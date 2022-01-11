package Model_07342;
import Entity_07342.AdminKursusEntity_07342;
import java.sql.*;

public class AdminModel_07342 extends ModelAbstract_07342{
    private String sql;
    
    public void insertData(AdminKursusEntity_07342 AdminKursusEntity_07342){
        try{
            sql="INSERT INTO admin_07342 (nama_07342, password_07342, noTelp_07342) Values(?,?,?)";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, AdminKursusEntity_07342.getNama_07342());
            stat.setString(2, AdminKursusEntity_07342.getPassword_07342());
            stat.setString(3, AdminKursusEntity_07342.getNoTelp_07342());
            
            int rows=stat.executeUpdate();
            System.out.println(rows + "row(s) updated !");
        }catch(SQLException e){
            System.out.println("GAGAL INPUT DATA !!!");
            e.printStackTrace();
        }
    }
    
    public void updateNama(String nama_07342, int id_07342){
        try{
            sql="UPDATE admin_07342 SET nama_07342 =? WHERE id_07342=?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, nama_07342);
            stat.setInt(2, id_07342);
            stat.executeUpdate();
        }catch(SQLException e){
            System.out.println("GAGAL RUBAH NAMA !!!");
            e.printStackTrace();
        }
    }
    
    public void updatePassword(String password_07342, int id_07342){
        try{
            sql="UPDATE admin_07342 SET password_07342 =? WHERE id_07342=?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, password_07342);
            stat.setInt(2, id_07342);
            int rows=stat.executeUpdate();
            System.out.println(rows + "row(s) updated !");
        }catch(SQLException e){
            System.out.println("GAGAL RUBAH PASSWORD !!!");
            e.printStackTrace();
        }
    }
    
    public void updateNoTelp(String noTelp_07342, int id_07342){
        try{
            sql="UPDATE admin_07342 SET noTelp_07342 =? WHERE id_07342=?";
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
    
    public void deleteData(int id_07342){
        try{
            sql="DELETE FROM mahasiswa_07342 WHERE id_07342=?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setInt(1, id_07342);
            stat.executeUpdate();
        }catch(SQLException e){
            System.out.println("GAGAL HAPUS DATA !!!");
            System.out.println(e);
        }
    }
    
    public int cekLogin(String nama, String password){
        int cek = 0;
        try{
            sql = "SELECT * FROM admin_07342 where nama_07342 = ? and password_07342 = ?"; 
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, nama);
            stat.setString(2, password);
            ResultSet rs = stat.executeQuery();
            if(rs.next()){
                nama = rs.getString("nama_07342");
                password = rs.getString("password_07342");
                cek = rs.getInt("id_07342");
                System.out.println("Selamat Datang " + nama);
            } else {
                cek = 0;
            }
        } catch (SQLException e){
            e.printStackTrace();
        } return cek;
    }

}