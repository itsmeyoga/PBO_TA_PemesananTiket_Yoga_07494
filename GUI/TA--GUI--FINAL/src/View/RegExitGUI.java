package View;

import Controller.*;
import View.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.Font;

/**
 *
 * @author Yoga Pratama
 */
public class RegExitGUI {
JFrame Frameregexit = new JFrame();
    JLabel judul;
    JButton reg, exit;

public RegExitGUI(){
    Frameregexit.setSize(700, 300);
    Frameregexit.setLayout(null);
    Frameregexit.getContentPane().setBackground(Color.WHITE);
    judul = new JLabel("KERETA API INDONESIA");
    judul.setBounds(100, 10, 600, 50);
    judul.setFont(new Font("Times New Roman", Font.BOLD, 40));
    Frameregexit.add(judul);
    reg = new JButton("REGISTRASI");
    reg.setBounds(250, 100, 180, 40);
    reg.setBackground(Color.WHITE);
    Frameregexit.add(reg);
    exit = new JButton("EXIT");
    exit.setBounds(250, 150, 180, 40);
    exit.setBackground(Color.WHITE);
    Frameregexit.add(exit);
    Frameregexit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Frameregexit.setVisible(true);
    Frameregexit.setLocationRelativeTo(null);
        
    reg.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            RegLogGUI regis = new RegLogGUI();
            Frameregexit.dispose();
        } 
    });
        
    exit.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            JOptionPane.showMessageDialog(null, "Anda Berhasil Keluar", "INFO", JOptionPane.INFORMATION_MESSAGE);
            Frameregexit.dispose();
        }
    });
    }   
}
