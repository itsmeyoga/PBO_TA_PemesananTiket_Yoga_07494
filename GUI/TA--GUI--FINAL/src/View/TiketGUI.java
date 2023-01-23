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
public class TiketGUI {
    public static TiketController tiketCon = new TiketController();
    public static TiketEntity tiket = new TiketEntity();
    public static ArrayList<TiketEntity> tiketArray = new ArrayList<TiketEntity>();
    JFrame Frametiket = new JFrame();
    JTable tabeltiket = new JTable();
    JScrollPane scroltiket = new JScrollPane(tabeltiket);
    JComboBox comboboxjenistiket = new JComboBox();
    JComboBox comboboxtujuantiket = new JComboBox();
    JComboBox comboboxjadwaltiket = new JComboBox();
    JLabel menu, top;
    JTextField textidtiket, textnamapemesan, textjumlahtiket;
    JLabel labelidtiket, labelnamapemesan, labeljenistiket, labeltujuantiket, labeljadwaltiket, labeljumlahtiket;
    JButton tambah, edit, hapus, kembali;
    int index;
    
public TiketGUI(){
    Frametiket.setSize(800, 700);
    Frametiket.setLayout(null);
    Frametiket.getContentPane().setBackground(Color.WHITE);
    top = new JLabel("KERETA API INDONESIA");
    top.setBounds(150, 10, 600, 50);
    top.setFont(new Font("Times New Roman", Font.BOLD, 40));
    Frametiket.add(top);
    menu = new JLabel("====== MENU TIKET ======");
    menu.setBounds(185, 60, 600, 50);
    menu.setFont(new Font("Times New Roman", Font.BOLD, 30));
    Frametiket.add(menu);
     
    scroltiket.setBounds(80,420,630,200);
    tabeltiket.setModel(tiketCon.listtiket());
    Frametiket.add(scroltiket);
    
    labelidtiket = new JLabel("ID TIKET");
    labelidtiket.setBounds(130, 120, 100, 30);
    Frametiket.add(labelidtiket);
    textidtiket = new JTextField();
    textidtiket.setBounds(250, 120, 400, 30);
    Frametiket.add(textidtiket);
    
    labelnamapemesan = new JLabel("NAMA PEMESAN");
    labelnamapemesan.setBounds(130, 160, 100, 30);
    Frametiket.add(labelnamapemesan);
    textnamapemesan = new JTextField();
    textnamapemesan.setBounds(250, 160, 400, 30);
    Frametiket.add(textnamapemesan);
    
    labeljenistiket = new JLabel("JENIS TIKET");
    labeljenistiket.setBounds(130, 200, 100, 30);
    Frametiket.add(labeljenistiket);
    comboboxjenistiket = new JComboBox();
    comboboxjenistiket.addItem("");
    comboboxjenistiket.addItem("EKONOMI");
    comboboxjenistiket.addItem("BISNIS");
    comboboxjenistiket.addItem("EKSEKUTIF");
    comboboxjenistiket.setBounds(250, 200, 400, 30);
    Frametiket.add(comboboxjenistiket);
    
    labeltujuantiket = new JLabel("TUJUAN TIKET");
    labeltujuantiket.setBounds(130, 240, 100, 30);
    Frametiket.add(labeltujuantiket);
    comboboxtujuantiket = new JComboBox();
    comboboxtujuantiket.addItem("");
    comboboxtujuantiket.addItem("SURABAYA - MALANG");
    comboboxtujuantiket.addItem("SURABAYA - PASURUAN");
    comboboxtujuantiket.addItem("SURABAYA - JEMBER");
    comboboxtujuantiket.setBounds(250, 240, 400, 30);
    Frametiket.add(comboboxtujuantiket);
    
    labeljadwaltiket = new JLabel("JADWAL TIKET");
    labeljadwaltiket.setBounds(130, 280, 100, 30);
    Frametiket.add(labeljadwaltiket);
    comboboxjadwaltiket = new JComboBox();
    comboboxjadwaltiket.addItem("");
    comboboxjadwaltiket.addItem("PAGI [07.00 - 08.15]");
    comboboxjadwaltiket.addItem("SIANG [14.55 - 16.05]");
    comboboxjadwaltiket.addItem("MALAM [19.20 - 19.35]");
    comboboxjadwaltiket.setBounds(250, 280, 400, 30);
    Frametiket.add(comboboxjadwaltiket);
    
    labeljumlahtiket = new JLabel("JUMLAH TIKET");
    labeljumlahtiket.setBounds(130, 320, 100, 30);
    Frametiket.add(labeljumlahtiket);
    textjumlahtiket = new JTextField();
    textjumlahtiket.setBounds(250, 320, 400, 30);
    Frametiket.add(textjumlahtiket);
    
    tambah = new JButton("TAMBAH");
    tambah.setBounds(160, 360, 100, 30);
    tambah.setBackground(Color.WHITE);
    Frametiket.add(tambah);
    
    edit = new JButton("EDIT");
    edit.setBounds(280, 360, 100, 30);
    edit.setBackground(Color.WHITE);
    Frametiket.add(edit);
    
    hapus = new JButton("HAPUS");
    hapus.setBounds(400, 360, 100, 30);
    hapus.setBackground(Color.WHITE);
    Frametiket.add(hapus);
    
    kembali = new JButton("KEMBALI");
    kembali.setBounds(520, 360, 100, 30);
    kembali.setBackground(Color.WHITE);
    Frametiket.add(kembali);
    
    Frametiket.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Frametiket.setVisible(true);
    Frametiket.setLocationRelativeTo(null);
    
    tabeltiket.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int i = tabeltiket.getSelectedRow();
                index=i;
                textidtiket.setText(AllObjectController.tiket.listtiket().getValueAt(i, 0).toString());
                textnamapemesan.setText(AllObjectController.tiket.listtiket().getValueAt(i, 1).toString());
                comboboxjenistiket.setSelectedItem(AllObjectController.tiket.listtiket().getValueAt(i, 2).toString());
                comboboxtujuantiket.setSelectedItem(AllObjectController.tiket.listtiket().getValueAt(i, 3).toString()); 
                comboboxjadwaltiket.setSelectedItem(AllObjectController.tiket.listtiket().getValueAt(i, 4).toString()); 
                textjumlahtiket.setText(AllObjectController.tiket.listtiket().getValueAt(i, 5).toString());
            }            
        });
        
    tambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                   try{
                    String idtiket = textidtiket.getText();
                    String namapemesan =  textnamapemesan.getText();
                    String jenistiket = (String) comboboxjenistiket.getSelectedItem();
                    String tujuantiket = (String) comboboxtujuantiket.getSelectedItem();
                    String jadwaltiket = (String) comboboxjadwaltiket.getSelectedItem();
                    String jumlahtiket =  textjumlahtiket.getText();
                    AllObjectController.tiket.insert(idtiket, namapemesan, jenistiket, tujuantiket, jadwaltiket, jumlahtiket);
                    JOptionPane.showMessageDialog(null,"Tambah Tiket Berhasil","INFO", JOptionPane.INFORMATION_MESSAGE);
                    kosong();
                    tiketArray.add(tiket);
                    tabeltiket.setModel(AllObjectController.tiket.listtiket());
                }catch(Exception exception){
                    JOptionPane.showMessageDialog(null,"Fomat penulisan salah","INFO", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });   
    
    edit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    String idtiket = textidtiket.getText();
                    String namapemesan =  textnamapemesan.getText();
                    String jenistiket = (String) comboboxjenistiket.getSelectedItem();
                    String tujuantiket = (String) comboboxtujuantiket.getSelectedItem();
                    String jadwaltiket = (String) comboboxjadwaltiket.getSelectedItem();
                    String jumlahtiket =  textjumlahtiket.getText();
                    AllObjectController.tiket.update(index,idtiket, namapemesan, jenistiket, tujuantiket, jadwaltiket, jumlahtiket);
                    JOptionPane.showMessageDialog(null,"Edit Tiket Berhasil","Information", JOptionPane.INFORMATION_MESSAGE);
                    kosong();
                    tiketArray.add(tiket);
                    tabeltiket.setModel(AllObjectController.tiket.listtiket());
            }
        } );
    
    hapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {       
                    AllObjectController.tiket.delete(index);
                    JOptionPane.showMessageDialog(null,"Tiket Berhasil Dihapus","INFO", JOptionPane.INFORMATION_MESSAGE);
                    tabeltiket.setModel(AllObjectController.tiket.listtiket());
                    kosong();
            }
        });
   
    kembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MenuGUI menu = new MenuGUI();
                Frametiket.dispose();
            }
        });
    }
void kosong() {
        textidtiket.setText(null);
        textnamapemesan.setText(null);
        comboboxjenistiket.setSelectedItem(null);
        comboboxtujuantiket.setSelectedItem(null);
        comboboxjadwaltiket.setSelectedItem(null);
        textjumlahtiket.setText(null);
    }
}