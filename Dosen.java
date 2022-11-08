public class Dosen extends Karyawan{
    protected String nidn;
    protected String jurusan;
    protected int sksPerminggu;
    protected int sks;


    public int hitungBonus(){
        sks = 100000*sksPerminggu;
        return sks;
    }

    public int hitungTotalGajiDosen(){
        return hitung(totLembur, sks, gaji);
    }

    public String getNidn() {
        return nidn;
    }

    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public int getsksPerminggu() {
        return sksPerminggu;
    }

    public void setsksPerminggu(int sksPerminggu) {
        this.sksPerminggu = sksPerminggu;
    }

    @Override
    public String getNama() {
        return nama;
    }

    @Override
    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String getNip() {
        return nip;
    }

    @Override
    public void setNip(String nip) {
        this.nip = nip;
    }

    @Override
    public String getAlamat() {
        return alamat;
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    @Override
    public int getTglLahir() {
        return tglLahir;
    }

    @Override
    public void setTglLahir(int tglLahir) {
        this.tglLahir = tglLahir;
    }

    @Override
    public int getBulanLahir() {
        return bulanLahir;
    }

    @Override
    public void setBulanLahir(int bulanLahir) {
        this.bulanLahir = bulanLahir;
    }

    @Override
    public int getTahunLahir() {
        return tahunLahir;
    }

    @Override
    public void setTahunLahir(int tahunLahir) {
        this.tahunLahir = tahunLahir;
    }

    @Override
    public String getJk() {
        return jk;
    }

    @Override
    public void setJk(String jk) {
        this.jk = jk;
    }

    @Override
    public int getTahunMasuk() {
        return tahunMasuk;
    }

    @Override
    public void setTahunMasuk(int tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

}
