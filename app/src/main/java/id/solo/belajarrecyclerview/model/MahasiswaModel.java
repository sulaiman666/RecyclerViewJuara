package id.solo.belajarrecyclerview.model;

public class MahasiswaModel {
    private String nama;
    private String nik;
    private String noHp;

    public MahasiswaModel() {
    }

    public MahasiswaModel(String nama, String nik, String noHp) {
        this.nama = nama;
        this.nik = nik;
        this.noHp = noHp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }
}
