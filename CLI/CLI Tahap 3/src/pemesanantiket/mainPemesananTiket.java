package pemesanantiket;

import Entity.*;
import Controller.*;
import java.util.Scanner;
import java.util.ArrayList;

public class mainPemesananTiket {
    public static Scanner in = new Scanner(System.in);
    public static AnggotaController anggota = new AnggotaController();
    public static PetugasController petugas = new PetugasController();
    public static TiketController tiket = new TiketController();
    
    public static PetugasEntity pet = new PetugasEntity();
    public static ArrayList<PetugasEntity> petArray = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        mainPemesananTiket main = new mainPemesananTiket();
        
        System.out.println(" KERETA API INDONESIA ");
        
        int pil;
        
        do{
            System.out.println("1. Registrasi ");
            System.out.println("0. Exit ");
            System.out.print(" Masukan : ");
            pil = inp.nextInt();
            
            switch(pil){
                case 1 :
                    authReg();
                    break;
            }
        } while(pil != 0);
        System.out.println("~~~ Sampai Jumpa ~~~");
    }
    
    public static void authReg(){
        System.out.println("===  Registrasi Petugas  ===");
        System.out.print(" ID Petugas         : ");
        String id = in.nextLine();
        pet.setId(id);
        System.out.print(" Nama Petugas       : ");
        String nama = in.nextLine();
        pet.setNama(nama);
        System.out.print(" Password Petugas   : ");
        String pass = in.nextLine();
        pet.setPasswordPtgs(pass);
        System.out.print(" Alamat Petugas     : ");
        String alamat = in.nextLine();
        pet.setAlamat(alamat);
        petArray.add(pet);
        
        authLogin();
        menuUtama();
    }
    
    public static void authLogin(){
        System.out.println("=== Login Petugas ===");
        System.out.print(" Nama Petugas       : ");
        String nama = in.nextLine();
        System.out.print(" Password Petugas   : ");
        String pass = in.nextLine();
        if(nama.equals(pet.getNama()) && pass.equals(pet.getPasswordPtgs())){
            System.out.println("Login Berhasil !!!");
        }
        else {
            System.out.println("Login Gagal !!!");
        }
    }
    
    public static void menuUtama(){
        int pilih;
        do{
            System.out.println("\n====== MENU UTAMA ======");
            System.out.println("1. Data Anggota ");
            System.out.println("2. Data Tiket ");
            System.out.println("0. EXIT ");
            System.out.print(" Masukkan : ");
            pilih = in.nextInt();
            
            switch(pilih){
                case 1 :
                    menuAnggota();
                    break;
                case 2 :
                    menuTiket();
                    break;
            }
        }while(pilih != 0);
    }
    
    public static void menuTiket(){
        int pil2;
        do{
            System.out.println("");
            System.out.println("====== MENU TIKET ======");
            System.out.println("1. Tambah Tiket ");
            System.out.println("2. Lihat Tiket ");
            System.out.println("3. Ubah Tiket ");
            System.out.println("4. Hapus Tiket ");
            System.out.println("0. Keluar ");
            System.out.println(" Masukkan : ");
            pil2 = in.nextInt();
            switch(pil2){
                case 1:
                    tambahTiket();
                    break;
                case 2:
                    viewTiket();
                    break;
                case 3:
                    ubahTiket();
                    break;
                case 4:
                    hapusTiket();
                    break;
                
            }
        }
        while(pil2 != 0);
    }
    
    public static void tambahTiket(){
        System.out.println("");
        System.out.println("========= INSERT TIKET HERE =========");
        System.out.print(" ID Tiket : ");
        String id = in.next();
        
        jenisTiket();
        System.out.print(" Jenis Tiket : ");
        String jenis = in.next();
        tujuanTiket();
        
        System.out.print(" Tujuan Tiket : ");
        String tujuan = in.next();
        
        jadwalTiket();
        System.out.print(" Jadwal Tiket : ");
        String jadwal = in.next();
        
        System.out.print(" Jumlah Tiket : ");
        int jum = in.nextInt();
        
        tiket.insert(new TiketEntity(id, tujuan, tujuan, jadwal, jum));
        System.out.println(" Data Tiket Berhasil Disimpan ! ");
        System.out.println("");
    }
    
    public static void jenisTiket(){
        System.out.println("*********** JENIS TIKET *********** ");
        System.out.println("[] Ekonomi             ");
        System.out.println("[] Bisnis              ");
        System.out.println("[] Eksekutif           ");
    }
    
    public static void tujuanTiket(){
        System.out.println("*********** TUJUAN TIKET *********** ");
        System.out.println("[] Surabaya - Pasuruan    ");
        System.out.println("[] Surabaya - Malang      ");
        System.out.println("[] Surabaya - Jember      ");
        System.out.println("Input dengan format 'Tujuan' saja wkwk ");
    }
    
    public static void jadwalTiket(){
        System.out.println("*********** JADWAL TIKET *********** ");
        System.out.println("[] Pagi     [07.00 - 08.15]    ");
        System.out.println("[] Sore     [14.55 - 16.05]    ");
        System.out.println("[] Malam    [19.20 - 19.35]    ");
        System.out.println("Format : 'Pagi' | 'Sore' | 'Malam' ");
    }
    
    public static void ubahTiket(){
        if(tiket.tiketM.getDataTiket().size() > 0){
            for(int i = 0; i < tiket.tiketM.getDataTiket().size(); i++){
                System.out.println("");
                System.out.println("[" + i + "]" + tiket.tiketM.getDataTiket().get(i).getJenis());
            }
            System.out.println("------------------------");
            System.out.println(" Pilih Index Tiket : ");
            int index = in.nextInt();
            System.out.println(" ========= UPDATE TICKET HERE =========");
            System.out.print(" Input ID Tiket : ");
            String id = in.next();
            System.out.print(" Input Jenis Tiket : ");
            String jenis = in.next();
            System.out.print(" Input Tujuan Tiket : ");
            String tujuan = in.next();
            System.out.print(" Input Jadwal Tiket : ");
            String jadwal = in.next();
            System.out.print(" Input Jumlah Tiket : ");
            int jum = in.nextInt();
            tiket.update(index, new TiketEntity(id, jenis, tujuan, jadwal, jum));
            System.out.println(" Data Tiket Berhasil Diubah ! ");
        }
        else {
            System.out.println(" Data Tiket Tidak Terdaftar ! ");
        }
    }
    
    public static void hapusTiket(){
        if(tiket.tiketM.getDataTiket().size()>0){
            for (int i = 0; i < tiket.tiketM.getDataTiket().size(); i++) {
                System.out.println("["+ i +"] " + tiket.tiketM.getDataTiket().get(i).getJenis());
            }
            System.out.println("------------------------");
            System.out.print("Pilih Index Tiket : ");
            int index = in.nextInt();
            
            tiket.tiketM.getDataTiket().remove(index);
            System.out.println("Data Tiket Berhasil Dihapus ! ");
        }else{
            System.out.println("Data Tiket Tidak Terdaftar ! ");
        }
    }
    
    public static void viewTiket(){
        if(tiket.tiketM.getDataTiket().size() > 0){
            int index = 0;
            for(int i = 0; i < tiket.tiketM.getDataTiket().size(); i++){
                index++;
                System.out.println("=====================================");
                System.out.println(" Tiket [" + i + "]");
                System.out.println(" ID Tiket : " + tiket.tiketM.getDataTiket().get(i).getIdTiket());
                System.out.println(" Jenis Tiket : " + tiket.tiketM.getDataTiket().get(i).getJenis());
                System.out.println(" Tujuan Tiket : " + tiket.tiketM.getDataTiket().get(i).getTujuan());
                System.out.println(" Jadwal Tiket : " + tiket.tiketM.getDataTiket().get(i).getJadwal());
                System.out.println(" Jumlah Tiket : " + tiket.tiketM.getDataTiket().get(i).getJumlah());
            }
        }
        else{
            System.out.println(" Data Tiket Masih Kosong ! ");
        }
    }

    public static void menuAnggota(){
        int pil3;
        do{
            System.out.println("");
            System.out.println("===== MENU ANGGOTA =====");
            System.out.println("1. Tambah Anggota ");
            System.out.println("2. Lihat Anggota");
            System.out.println("3. Hapus Anggota");
            System.out.println("0. Keluar");
            System.out.println(" Masukkan : ");
            pil3 = in.nextInt();
            switch(pil3){
                case 1 :
                    tambahAnggota();
                    break;
                case 2 :
                    viewAnggota();
                    break;
                case 3 :
                    hapusAnggota();
                    break;
            }
        }while(pil3 != 0);
    }
    
    public static void tambahAnggota(){
        System.out.println("");
        System.out.println("========== INSERT USER HERE =========");
        System.out.print("ID Anggota :  ");
        String id = in.next();
        System.out.print("Nama Anggota : ");
        String nama = in.next();
        System.out.print("Alamat Anggota : ");
        String alamat = in.next();
        System.out.print("NoTelp Anggota : ");
        String noTelp = in.next();
        
        anggota.insert(new AnggotaEntity(id, nama, alamat, noTelp));
        System.out.println("Data Anggota Berhasil Disimpan ! ");
    }
    
    public static void viewAnggota(){
        if(anggota.anggotaM.getDataAnggota().size()>0){
            int index = 0;
            for (int i = 0; i < anggota.anggotaM.getDataAnggota().size(); i++) {
                index++;
                System.out.println("=====================================");
                System.out.println("[Anggota " + index + "]");
                System.out.println("No ID      : "+anggota.anggotaM.getDataAnggota().get(i).getId());
                System.out.println("Nama       : "+anggota.anggotaM.getDataAnggota().get(i).getNama());
                System.out.println("Alamat     : "+anggota.anggotaM.getDataAnggota().get(i).getAlamat());
                System.out.println("No Telepon : "+anggota.anggotaM.getDataAnggota().get(i).getNoTelp());
            }
        }else{
            System.out.println("Data Anggota Masih Kosong ! ");
        }
    }
    
    public static void hapusAnggota(){
        if(anggota.anggotaM.getDataAnggota().size()>0){
            for (int i = 0; i < anggota.anggotaM.getDataAnggota().size(); i++) {
                System.out.println("[" + i + "] "+anggota.anggotaM.getDataAnggota().get(i).getNama());
            }
            System.out.println("------------------------");
            System.out.println("Pilih Index Nama : ");
            int index = in.nextInt();
            
            anggota.anggotaM.getDataAnggota().remove(index);
            System.out.println("Data Anggota Berhasil Dihapus ! ");
        }else{
            System.out.println("Data Anggota Tidak Terdaftar ! ");
        }
    }
}
