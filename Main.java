import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Dosen dosen1 = new Dosen();
        System.out.print("Masukkan NIP Dosen : ");
        dosen1.setNip(input.nextLine());
        System.out.print("Masukkan NIDN Dosen : ");
        dosen1.setNidn(input.nextLine());
        System.out.print("Masukkan Nama Dosen : ");
        input.nextLine();
        dosen1.setNama(input.nextLine());
        System.out.print("Masukkan Alamat : ");
        input.nextLine();
        dosen1.setAlamat(input.nextLine());
        System.out.print("Masukkan Tanggal Lahir : ");
        dosen1.setTglLahir(input.nextInt());
        System.out.print("Masukkan Bulan Lahir : ");
        dosen1.setBulanLahir(input.nextInt());
        System.out.print("Masukkan Tahun Lahir : ");
        dosen1.setTahunLahir(input.nextInt());
        System.out.print("Masukkan Jenis Kelamin : ");
        input.nextLine();
        dosen1.setJk(input.nextLine());
        System.out.print("Masukkan Tahun Masuk : ");
        dosen1.setTahunMasuk(input.nextInt());
        System.out.print("Masukkan Jurusan : ");
        input.nextLine();
        dosen1.setJurusan(input.nextLine());
        System.out.print("Kelebihan Mengajar per SKS (1 sks/Minggu dan maks 6 Minggu) : ");
        dosen1.setsksPerminggu(input.nextInt());

        System.out.println("NIP    : "+dosen1.getNip());
        System.out.println("NIDN   : "+dosen1.getNidn());
        System.out.println("Nama   : "+dosen1.getNama());
        System.out.println("Alamat : "+dosen1.getAlamat());
        System.out.print("Tanggal Lahir : "+dosen1.getTglLahir());
        System.out.print(dosen1.getBulanLahir());
        System.out.println(dosen1.getTahunLahir());
        System.out.println("Jenis Kelamin : "+dosen1.getJk());
        System.out.println("Tahun Masuk : "+dosen1.getTahunMasuk());
        System.out.println("Jurusan : "+dosen1.getJurusan());
        System.out.println("Gaji Pokok : "+dosen1.getGaji());
        System.out.println("Bonus Gaji Mengajar/Minggu : "+dosen1.hitungBonus());
        System.out.println("Bonus Gaji Lembur/Minggu : "+dosen1.hitungLembur());
        System.out.println("Total Gaji : "+dosen1.hitungTotalGaji());
        System.out.println("\n\n");

        Tendik tendik1 = new Tendik();
        System.out.print("Masukkan NIP Tendik : ");
        tendik1.setNip(input.nextLine());
        System.out.print("Masukkan Nama Tendik : ");
        input.nextLine();
        tendik1.setNama(input.nextLine());
        System.out.print("Masukkan Alamat : ");
        input.nextLine();
        tendik1.setAlamat(input.nextLine());
        System.out.print("Masukkan Tanggal Lahir : ");
        tendik1.setTglLahir(input.nextInt());
        System.out.print("Masukkan Bulan Lahir : ");
        tendik1.setBulanLahir(input.nextInt());
        System.out.print("Masukkan Tahun Lahir : ");
        tendik1.setTahunLahir(input.nextInt());
        System.out.print("Masukkan Jenis Kelamin : ");
        input.nextLine();
        tendik1.setJk(input.nextLine());
        System.out.print("Masukkan Tahun Masuk : ");
        tendik1.setTahunMasuk(input.nextInt());

        System.out.println("NIP    : "+tendik1.getNip());
        System.out.println("Nama   : "+tendik1.getNama());
        System.out.println("Alamat : "+tendik1.getAlamat());
        System.out.print("Tanggal Lahir : "+tendik1.getTglLahir());
        System.out.print(tendik1.getBulanLahir());
        System.out.println(tendik1.getTahunLahir());
        System.out.println("Jenis Kelamin : "+tendik1.getJk());
        System.out.println("Tahun Masuk : "+tendik1.getTahunMasuk());
        System.out.println("Gaji Pokok : "+tendik1.getGaji());
        System.out.println("Bonus Gaji Lembur/Minggu : "+tendik1.hitungLembur());
        System.out.println("Total Gaji : "+tendik1.hitungTotalGaji());
    }
}