package soru4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DikdortgenAlanHesaplamaFormu {

	private JFrame frame;
	private JTextField textKisa;
	private JTextField textUzun;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DikdortgenAlanHesaplamaFormu window = new DikdortgenAlanHesaplamaFormu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DikdortgenAlanHesaplamaFormu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.RED);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Dikdörtgen Alan Hesaplama Formu");
		lblNewLabel.setBounds(76, 9, 228, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblKisa = new JLabel("Kısa Kenar :");
		lblKisa.setBounds(20, 62, 89, 14);
		frame.getContentPane().add(lblKisa);
		
		JLabel lblUzun = new JLabel("Uzun Kenar :");
		lblUzun.setBounds(20, 116, 89, 14);
		frame.getContentPane().add(lblUzun);
		
		textKisa = new JTextField();
		textKisa.setBounds(119, 59, 86, 20);
		frame.getContentPane().add(textKisa);
		textKisa.setColumns(10);
		
		textUzun = new JTextField();
		textUzun.setBounds(119, 113, 86, 20);
		frame.getContentPane().add(textUzun);
		textUzun.setColumns(10);
		
		JLabel lblSonuc = new JLabel("Sonuc :");
		lblSonuc.setBounds(20, 204, 185, 14);
		frame.getContentPane().add(lblSonuc);
		
		JButton btnHesapla = new JButton("Hesapla");
		btnHesapla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					DikdortgenAlanHesaplama dikdortgenAlanHesaplama = new DikdortgenAlanHesaplama(Double.valueOf(textKisa.getText()),
																								Double.valueOf(textUzun.getText()));
					lblSonuc.setText("Dikdörtgenin çevresi : " + dikdortgenAlanHesaplama.alan());
				} catch(Exception ex) {
					lblSonuc.setText("Bir sayı giriniz");
				}
			}
		});
		btnHesapla.setBounds(119, 156, 89, 23);
		frame.getContentPane().add(btnHesapla);
	}

}
