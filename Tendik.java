public class Tendik extends Karyawan{
    public int hitungTotalGajiTendik(){
        return hitung(totLembur, gaji);
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
