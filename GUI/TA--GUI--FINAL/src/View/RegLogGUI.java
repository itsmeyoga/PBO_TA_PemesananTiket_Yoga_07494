package View;

import Controller.*;
import Entity.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author Yoga Pratama
 */
public class RegLogGUI {
    public static RegLogEntity reglog = new RegLogEntity();
    public static ArrayList<RegLogEntity> reglogArray = new ArrayList<>();
    JFrame FrameRegLog = new JFrame();
    JLabel login, regis, top;
    JTextField textidpetugas, textnamapetugas, textusernamereg, textusernamelog;
    JLabel labelidpetugas, labelnamapetugas, labelusernamereg, labelpasswordreg, labelusernamelog, labelpasswordlog;
    JButton log, reg;
    JPasswordField passwordregis, passwordlog;
    
public RegLogGUI(){
    FrameRegLog.setSize(800, 400);
    FrameRegLog.setLayout(null);
    FrameRegLog.getContentPane().setBackground(Color.WHITE);
    top = new JLabel("KERETA API INDONESIA");
    top.setBounds(150, 10, 600, 50);
    top.setFont(new Font("Times New Roman", Font.BOLD, 40));
    FrameRegLog.add(top);
    regis = new JLabel("REGISTRASI");
    regis.setBounds(100, 50, 200, 100);
    regis.setFont(new Font("Times New Roman", Font.BOLD, 30));
    FrameRegLog.add(regis);
    login = new JLabel("LOGIN");
    login.setBounds(450, 50, 200, 100);
    login.setFont(new Font("Times New Roman", Font.BOLD, 30));
    FrameRegLog.add(login);
     
    labelidpetugas = new JLabel("ID PETUGAS");
    labelidpetugas.setBounds(100, 120, 100, 30);
    FrameRegLog.add(labelidpetugas);
    textidpetugas = new JTextField();
    textidpetugas.setBounds(200, 120, 200, 30);
    FrameRegLog.add(textidpetugas);
    
    labelnamapetugas = new JLabel("NAMA PETUGAS");
    labelnamapetugas.setBounds(100, 160, 100, 30);
    FrameRegLog.add(labelnamapetugas);
    textnamapetugas = new JTextField();
    textnamapetugas.setBounds(200, 160, 200, 30);
    FrameRegLog.add(textnamapetugas);
    
    labelusernamereg = new JLabel("USERNAME");
    labelusernamereg.setBounds(100, 200, 100, 30);
    FrameRegLog.add(labelusernamereg);
    textusernamereg = new JTextField();
    textusernamereg.setBounds(200, 200, 200, 30);
    FrameRegLog.add(textusernamereg);
    
    labelpasswordreg = new JLabel("PASSWORD");
    labelpasswordreg.setBounds(100, 240, 100, 30);
    FrameRegLog.add(labelpasswordreg);
    passwordregis = new JPasswordField();
    passwordregis.setBounds(200, 240, 200, 30);
    FrameRegLog.add(passwordregis);
    
    labelusernamelog = new JLabel("USERNAME");
    labelusernamelog.setBounds(450, 120, 100, 30);
    FrameRegLog.add(labelusernamelog);
    textusernamelog = new JTextField();
    textusernamelog.setBounds(550, 120, 200, 30);
    FrameRegLog.add(textusernamelog);
    
    labelpasswordlog = new JLabel("PASSWORD");
    labelpasswordlog.setBounds(450, 160, 100, 30);
    FrameRegLog.add(labelpasswordlog);
    passwordlog = new JPasswordField();
    passwordlog.setBounds(550, 160, 200, 30);
    FrameRegLog.add(passwordlog);
    
    reg = new JButton("REGISTER");
    reg.setBounds(200, 300, 100, 30);
    reg.setBackground(Color.WHITE);
    FrameRegLog.add(reg);
    
    log = new JButton("LOGIN");
    log.setBounds(550, 230, 100, 30);
    log.setBackground(Color.WHITE);
    FrameRegLog.add(log);
    FrameRegLog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    FrameRegLog.setVisible(true);
    FrameRegLog.setLocationRelativeTo(null);
        
    reg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                    String id = textidpetugas.getText();
                    reglog.setId(id);
                    String nama = textnamapetugas.getText();
                    reglog.setNama(nama);
                    String username = textusernamereg.getText();
                    reglog.setUsername(username);
                    String password = passwordregis.getText();
                    reglog.setPassword(password);
                    reglogArray.add(reglog);
                    JOptionPane.showMessageDialog(null, "REGISTRASI BERHASIL", "INFO", JOptionPane.INFORMATION_MESSAGE);
                    kosong();
            }
        });
    
    log.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                    String username = textusernamereg.getText();
                    reglog.getUsername();
                    String password = passwordregis.getText();
                    reglog.getPassword();
                    reglogArray.add(reglog);
                    JOptionPane.showMessageDialog(null, "SELAMAT DATANG " +reglog.getNama(), "INFO", JOptionPane.INFORMATION_MESSAGE);
                    MenuGUI menu = new MenuGUI();
                    FrameRegLog.dispose();
                    kosong();
            }
        });
    }
void kosong() {
        textidpetugas.setText(null);
        textnamapetugas.setText(null);
        textusernamereg.setText(null);
        passwordregis.setText(null);
        textusernamelog.setText(null);
        passwordlog.setText(null);
    }
}