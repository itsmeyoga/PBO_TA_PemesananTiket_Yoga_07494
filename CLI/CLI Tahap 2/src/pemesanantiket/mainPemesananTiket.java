package Entity;

import Entity.*;
import java.util.Scanner;
import java.util.ArrayList;

public class mainPemesananTiket {
    public static Scanner in = new Scanner(System.in);
    public static AnggotaEntity anggota = new AnggotaEntity();
    public static PetugasEntity petugas = new PetugasEntity();
    public static TiketEntity tiket = new TiketEntity();
    
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
            System.out.println("1. Data Tiket ");
            System.out.println("0. EXIT ");
            System.out.print(" Masukkan : ");
            pilih = in.nextInt();
            
            switch(pilih){
                case 1 :
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
            System.out.println("0. Keluar ");
            System.out.println(" Masukkan : ");
            pil2 = in.nextInt();
            switch(pil2){
                case 1:
                    tambahTiket();
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
        tiket.setIdTiket(id);
        
        jenisTiket();
        System.out.print(" Jenis Tiket : ");
        String jenis = in.next();
        tiket.setJenis(jenis);
        
        tujuanTiket();
        System.out.print(" Tujuan Tiket : ");
        String tujuan = in.next();
        tiket.setTujuan(tujuan);
        
        jadwalTiket();
        System.out.print(" Jadwal Tiket : ");
        String jadwal = in.next();
        tiket.setJadwal(jadwal);
        
        System.out.print(" Jumlah Tiket : ");
        int jum = in.nextInt();
        tiket.setJumlah(jum);
        
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
}
