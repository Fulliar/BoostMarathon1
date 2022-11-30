package soru4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DikdortgenCevreHesaplamaFormu {

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
					DikdortgenCevreHesaplamaFormu window = new DikdortgenCevreHesaplamaFormu();
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
	public DikdortgenCevreHesaplamaFormu() {
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
		
		JLabel lblKisa = new JLabel("Kısa Kenar :");
		lblKisa.setBounds(26, 33, 68, 14);
		frame.getContentPane().add(lblKisa);
		
		JLabel lblUzun = new JLabel("Uzun Kenar :");
		lblUzun.setBounds(26, 86, 86, 14);
		frame.getContentPane().add(lblUzun);
		
		JLabel lblSonuc = new JLabel("Sonuc :");
		lblSonuc.setBounds(24, 170, 193, 14);
		frame.getContentPane().add(lblSonuc);
		
		textKisa = new JTextField();
		textKisa.setBounds(122, 30, 86, 20);
		frame.getContentPane().add(textKisa);
		textKisa.setColumns(10);
		
		textUzun = new JTextField();
		textUzun.setBounds(122, 83, 86, 20);
		frame.getContentPane().add(textUzun);
		textUzun.setColumns(10);
		
		JButton btnHesapla = new JButton("Hesapla");
		btnHesapla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					DikdortgenCevreHesaplama dikdortgenCevreHesaplama = new DikdortgenCevreHesaplama(Double.valueOf(textKisa.getText()),
																									Double.valueOf(textUzun.getText()));
					lblSonuc.setText("Dikdörtgenin çevresi : " + dikdortgenCevreHesaplama.cevre());
				} catch(Exception ex) {
					lblSonuc.setText("Bir sayı giriniz");
				}
				
				
			}
		});
		btnHesapla.setBounds(119, 136, 89, 23);
		frame.getContentPane().add(btnHesapla);
		
		JLabel lblNewLabel = new JLabel("Dikdörtgen Cevre Hesaplama Formu");
		lblNewLabel.setBounds(69, 8, 172, 14);
		frame.getContentPane().add(lblNewLabel);
	}

}
