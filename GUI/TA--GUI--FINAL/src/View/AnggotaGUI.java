package View;

import Controller.*;
import View.*;
import Entity.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import java.util.ArrayList;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
/**
 *
 * @author Yoga Pratama
 */
public class AnggotaGUI {
    public static AnggotaController anggotaCon = new AnggotaController();
    public static AnggotaEntity anggota = new AnggotaEntity();
    public static ArrayList<AnggotaEntity> anggotaArray = new ArrayList<AnggotaEntity>();
    JFrame FrameAnggota = new JFrame();
    JTable tabelanggota = new JTable();
    JScrollPane scrolanggota = new JScrollPane(tabelanggota);
    JLabel menu, top;
    JTextField textidanggota, textnamaanggota, textalamatanggota, textnotelp;
    JLabel labelidanggota, labelnamaanggota, labelalamatanggota, labelnotelp;
    JButton tambah, hapus, kembali;
    int index;
    
public AnggotaGUI(){
    FrameAnggota.setSize(800, 700);
    FrameAnggota.setLayout(null);
    FrameAnggota.getContentPane().setBackground(Color.WHITE);
    top = new JLabel("KERETA API INDONESIA");
    top.setBounds(150, 10, 600, 50);
    top.setFont(new Font("Times New Roman", Font.BOLD, 40));
    FrameAnggota.add(top);
    menu = new JLabel("====== MENU ANGGOTA ======");
    menu.setBounds(155, 60, 600, 50);
    menu.setFont(new Font("Times New Roman", Font.BOLD, 30));
    FrameAnggota.add(menu);
     
    scrolanggota.setBounds(100,350,600,270);
    tabelanggota.setModel(anggotaCon.listanggota());
    FrameAnggota.add(scrolanggota);
    
    labelidanggota = new JLabel("ID");
    labelidanggota.setBounds(155, 120, 100, 30);
    FrameAnggota.add(labelidanggota);
    textidanggota = new JTextField();
    textidanggota.setBounds(230, 120, 400, 30);
    FrameAnggota.add(textidanggota);
    
    labelnamaanggota = new JLabel("NAMA");
    labelnamaanggota.setBounds(155, 160, 100, 30);
    FrameAnggota.add(labelnamaanggota);
    textnamaanggota = new JTextField();
    textnamaanggota.setBounds(230, 160, 400, 30);
    FrameAnggota.add(textnamaanggota);
    
    labelalamatanggota = new JLabel("ALAMAT");
    labelalamatanggota.setBounds(155, 200, 100, 30);
    FrameAnggota.add(labelalamatanggota);
    textalamatanggota = new JTextField();
    textalamatanggota.setBounds(230, 200, 400, 30);
    FrameAnggota.add(textalamatanggota);
    
    labelnotelp = new JLabel("NO.TELP");
    labelnotelp.setBounds(155, 240, 100, 30);
    FrameAnggota.add(labelnotelp);
    textnotelp = new JTextField();
    textnotelp.setBounds(230, 240, 400, 30);
    FrameAnggota.add(textnotelp);
    
    tambah = new JButton("TAMBAH");
    tambah.setBounds(230, 300, 100, 30);
    tambah.setBackground(Color.WHITE);
    FrameAnggota.add(tambah);
    
    hapus = new JButton("HAPUS");
    hapus.setBounds(350, 300, 100, 30);
    hapus.setBackground(Color.WHITE);
    FrameAnggota.add(hapus);
    
    kembali = new JButton("KEMBALI");
    kembali.setBounds(470, 300, 100, 30);
    kembali.setBackground(Color.WHITE);
    FrameAnggota.add(kembali);
    
    FrameAnggota.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    FrameAnggota.setVisible(true);
    FrameAnggota.setLocationRelativeTo(null);
    
    tabelanggota.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int i = tabelanggota.getSelectedRow();
                index=i;
                textidanggota.setText(AllObjectController.anggota.listanggota().getValueAt(i, 0).toString());
                textnamaanggota.setText(AllObjectController.anggota.listanggota().getValueAt(i, 1).toString());
                textalamatanggota.setText(AllObjectController.anggota.listanggota().getValueAt(i, 2).toString());
                textnotelp.setText(AllObjectController.anggota.listanggota().getValueAt(i, 3).toString()); 
            }            
        });
        
    tambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                   try{
                    String idanggota = textidanggota.getText();
                    String namaanggota =  textnamaanggota.getText();
                    String alamatanggota = textalamatanggota.getText();
                    String notelp = textnotelp.getText();
                    AllObjectController.anggota.insert(idanggota, namaanggota, alamatanggota, notelp);
                    JOptionPane.showMessageDialog(null,"Tambah Anggota Berhasil","INFO", JOptionPane.INFORMATION_MESSAGE);
                    kosong();
                    anggotaArray.add(anggota);
                    tabelanggota.setModel(AllObjectController.anggota.listanggota());
                }catch(Exception exception){
                    JOptionPane.showMessageDialog(null,"Fomat penulisan salah","INFO", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });   
    
    hapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{                 
                    AllObjectController.anggota.delete(index);
                    JOptionPane.showMessageDialog(null,"Anggota Berhasil Dihapus","INFO", JOptionPane.INFORMATION_MESSAGE);
                    tabelanggota.setModel(AllObjectController.anggota.listanggota());
                    kosong();
                }catch(Exception exception){
                    JOptionPane.showMessageDialog(null,"Fomat penulisan salah","INFO", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
   
    kembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MenuGUI menu = new MenuGUI();
                FrameAnggota.dispose();
            }
        });
    }
void kosong() {
        textidanggota.setText(null);
        textnamaanggota.setText(null);
        textalamatanggota.setText(null);
        textnotelp.setText(null);
    }
}