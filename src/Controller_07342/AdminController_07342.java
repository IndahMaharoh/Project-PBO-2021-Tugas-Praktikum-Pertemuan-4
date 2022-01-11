package Controller_07342;
import Entity_07342.AdminKursusEntity_07342;
import Entity_07342.MahasiswaKursusEntity_07342;

public class AdminController_07342 {
    
    public void insertData(String nama_07342, String password_07342, String noTelp_07342) {
        AdminKursusEntity_07342 admin = new AdminKursusEntity_07342();
        admin.setNama_07342(nama_07342);
        admin.setPassword_07342(password_07342);
        admin.setNoTelp_07342(noTelp_07342);
        AllObjectModel_07342.adminModel.insertData(admin);
    }
    public int login(String nama, String password){
        int cek = AllObjectModel_07342.adminModel.cekLogin(nama, password);
        return cek;
    }
    public void deleteData(int id_07342){
        AllObjectModel_07342.adminModel.deleteData(id_07342);
    }
    
    public void updateNama(String nama, int id){
        AllObjectModel_07342.adminModel.updateNama(nama, id);
    }
    
    public void updatePassword(String pass, int id){
        AllObjectModel_07342.adminModel.updatePassword(pass, id);
    }
    
    public void updateNoTelp(String noTelp, int id){
        AllObjectModel_07342.adminModel.updateNoTelp(noTelp, id);
    }
    
}
