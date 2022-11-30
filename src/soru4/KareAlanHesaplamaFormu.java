package soru4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class KareAlanHesaplamaFormu {

	private JFrame frame;
	private JTextField textKenar;
	private JLabel lblSonuc;
	private JLabel lblKareAlanHesaplama;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KareAlanHesaplamaFormu window = new KareAlanHesaplamaFormu();
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
	public KareAlanHesaplamaFormu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.setBackground(Color.ORANGE);
		frame.getContentPane().setForeground(Color.WHITE);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblKenar = new JLabel("Kenar :");
		lblKenar.setBounds(29, 63, 46, 14);
		frame.getContentPane().add(lblKenar);
		
		textKenar = new JTextField();
		textKenar.setBounds(111, 60, 86, 20);
		frame.getContentPane().add(textKenar);
		textKenar.setColumns(10);
		
		lblSonuc = new JLabel("Sonuc :");
		lblSonuc.setBounds(29, 131, 168, 14);
		frame.getContentPane().add(lblSonuc);
		
		JButton btnHesaplama = new JButton("Hesapla");
		btnHesaplama.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					KareAlanHesaplama kareAlanHesaplama = new KareAlanHesaplama(Double.valueOf(textKenar.getText()));
					lblSonuc.setText("Karenin alanı : " + kareAlanHesaplama.alan());
				}catch(Exception ex) {
					lblSonuc.setText("Bir sayı giriniz");
				}
				
			}
		});
		btnHesaplama.setBounds(111, 101, 89, 23);
		frame.getContentPane().add(btnHesaplama);
		
		lblKareAlanHesaplama = new JLabel("Kare Alan Hesaplama Formu");
		lblKareAlanHesaplama.setBounds(80, 14, 195, 14);
		frame.getContentPane().add(lblKareAlanHesaplama);
	}
}
