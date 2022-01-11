package Controller_07342;
import Entity_07342.MahasiswaKursusEntity_07342;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class MahasiswaController_07342 implements ControllerInterface_07342{

    @Override
    public void insertData(String nama_07342, String npm_07342, String jurusan_07342, String kelas_07342, String sesi_07342, String jenis_kursus_07342, String noTelp_07342) {
        MahasiswaKursusEntity_07342 mahasiswa = new MahasiswaKursusEntity_07342();
        mahasiswa.setNama_07342(nama_07342);
        mahasiswa.setNpm_07342(npm_07342);
        mahasiswa.setJurusan_07342(jurusan_07342);
        mahasiswa.setKelas_07342(kelas_07342);
        mahasiswa.setSesi_07342(sesi_07342);
        mahasiswa.setJenis_kursus_07342(jenis_kursus_07342);
        mahasiswa.setNoTelp_07342(noTelp_07342);
        AllObjectModel_07342.mahasiswaModel.insertData(mahasiswa);
    }
    
    public void updateData(int urut, String data, int id){
        switch(urut){
            case 1 :
                AllObjectModel_07342.mahasiswaModel.updateNama(data, id);
                break;
            case 2 :
                AllObjectModel_07342.mahasiswaModel.updateNpm(data, id);
                break;
            case 3 :
                AllObjectModel_07342.mahasiswaModel.updateJurusan(data, id);
                break;
            case 4 :
                AllObjectModel_07342.mahasiswaModel.updateKelas(data, id);
                break;
            case 5 :
                AllObjectModel_07342.mahasiswaModel.updateSesi(data, id);
                break;
            case 6 :
                AllObjectModel_07342.mahasiswaModel.updateJenisKursus(data, id);
                break;
            case 7 :
                AllObjectModel_07342.mahasiswaModel.updateNoTelp(data, id);
                break;
        }
    }
    
    public ArrayList<MahasiswaKursusEntity_07342> getDataMahasiswa(){
        return AllObjectModel_07342.mahasiswaModel.getMahasiswa();
    }
    
    public int login(String npm, String nama){
        int cek = AllObjectModel_07342.mahasiswaModel.cekLogin(npm, nama);
        return cek;
    }
    
    public ArrayList<MahasiswaKursusEntity_07342> getById(int ID){
        return AllObjectModel_07342.mahasiswaModel.getMahasiswa(ID);
    }
    
    public DefaultTableModel daftarMahasiswa(){
        DefaultTableModel dataDaftarMahasiswa = new DefaultTableModel();
        Object[] kolom = {"ID", "NAMA", "NPM", "JURUSAN", "KELAS", "SESI", "JENIS KURSUS", "NOTELP"};
        dataDaftarMahasiswa.setColumnIdentifiers(kolom);
        int size = getDataMahasiswa().size();
        for(int i = 0; i < size; i++ ){
            Object[] data = new Object[8];
            data[0] = AllObjectModel_07342.mahasiswaModel.getMahasiswa().get(i).getId_07342();
            data[1] = AllObjectModel_07342.mahasiswaModel.getMahasiswa().get(i).getNama_07342();
            data[2] = AllObjectModel_07342.mahasiswaModel.getMahasiswa().get(i).getNpm_07342();
            data[3] = AllObjectModel_07342.mahasiswaModel.getMahasiswa().get(i).getJurusan_07342();
            data[4] = AllObjectModel_07342.mahasiswaModel.getMahasiswa().get(i).getKelas_07342();
            data[5] = AllObjectModel_07342.mahasiswaModel.getMahasiswa().get(i).getSesi_07342();
            data[6] = AllObjectModel_07342.mahasiswaModel.getMahasiswa().get(i).getJenis_kursus_07342();
            data[7] = AllObjectModel_07342.mahasiswaModel.getMahasiswa().get(i).getNoTelp_07342();
            dataDaftarMahasiswa.addRow(data);
        }
        return dataDaftarMahasiswa;
    }
}
