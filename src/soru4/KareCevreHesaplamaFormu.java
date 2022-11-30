package soru4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class KareCevreHesaplamaFormu {

	private JFrame frame;
	private JTextField textKenar;
	private JLabel lblSonuc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KareCevreHesaplamaFormu window = new KareCevreHesaplamaFormu();
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
	public KareCevreHesaplamaFormu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Kenar :");
		lblNewLabel.setBounds(36, 60, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textKenar = new JTextField();
		textKenar.setBounds(126, 56, 86, 20);
		frame.getContentPane().add(textKenar);
		textKenar.setColumns(10);
		
		JLabel lblSonuc = new JLabel("Sonuç :");
		lblSonuc.setBounds(32, 114, 187, 14);
		frame.getContentPane().add(lblSonuc);
		
		JButton btnHesapla = new JButton("Hesapla");
		btnHesapla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					KareCevreHesaplama kareCevreHesaplama = new KareCevreHesaplama(Double.valueOf(textKenar.getText()));
					lblSonuc.setText("Karenin çevresi : " + kareCevreHesaplama.cevre());
				} catch (Exception ex) {
					lblSonuc.setText("Bir sayı giriniz");
				}
				
			}
		});
		btnHesapla.setBounds(125, 85, 89, 23);
		frame.getContentPane().add(btnHesapla);
		
		JLabel lblNewLabel_2 = new JLabel("Kare Çevre Hesaplama Formu");
		lblNewLabel_2.setBounds(67, 11, 218, 14);
		frame.getContentPane().add(lblNewLabel_2);
	}

}
