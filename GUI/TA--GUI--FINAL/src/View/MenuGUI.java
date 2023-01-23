package View;

import Controller.*;
import Entity.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.Font;
import java.util.ArrayList;
/**
 *
 * @author Yoga Pratama
 */
public class MenuGUI {
    public static RegLogEntity petreg = new RegLogEntity();
    public static ArrayList<RegLogEntity> petArray = new ArrayList<>();
    JFrame FrameMenu = new JFrame();
    JLabel top, menu;
    JButton dataanggota, datatiket, logout;
    
public MenuGUI(){
    FrameMenu.setSize(600, 400);
    FrameMenu.setLayout(null);
    FrameMenu.getContentPane().setBackground(Color.WHITE);
    top = new JLabel("KERETA API INDONESIA");
    top.setBounds(50, 10, 600, 50);
    top.setFont(new Font("Times New Roman", Font.BOLD, 40));
    FrameMenu.add(top);
    
    menu = new JLabel("====== MENU UTAMA ======");
    menu.setBounds(150, 70, 600, 50);
    menu.setFont(new Font("Times New Roman", Font.BOLD, 20));
    FrameMenu.add(menu);
    
    dataanggota = new JButton("1. DATA ANGGOTA");
    dataanggota.setBounds(190, 130, 200, 30);
    dataanggota.setBackground(Color.WHITE);
    FrameMenu.add(dataanggota);
    
    datatiket = new JButton("2. DATA TIKET");
    datatiket.setBounds(190, 180, 200, 30);
    datatiket.setBackground(Color.WHITE);
    FrameMenu.add(datatiket);
    
    logout = new JButton("3. LOGOUT");
    logout.setBounds(190, 230, 200, 30);
    logout.setBackground(Color.WHITE);
    FrameMenu.add(logout);
    FrameMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    FrameMenu.setVisible(true);
    FrameMenu.setLocationRelativeTo(null);
        
    dataanggota.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                AnggotaGUI anggota = new AnggotaGUI();
                FrameMenu.dispose();
            }
        });
    
    datatiket.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                TiketGUI tiket = new TiketGUI();
                FrameMenu.dispose();
            }
        });
    
    logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                RegLogGUI reglog = new RegLogGUI();
                FrameMenu.dispose();
            }
        });
    }
}