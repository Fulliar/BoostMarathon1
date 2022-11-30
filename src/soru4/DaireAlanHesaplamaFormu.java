package soru4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DaireAlanHesaplamaFormu {

	private JFrame frame;
	private JTextField textYariCap;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DaireAlanHesaplamaFormu window = new DaireAlanHesaplamaFormu();
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
	public DaireAlanHesaplamaFormu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLUE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Daire Alan Hesaplama Formu");
		lblNewLabel.setBounds(57, 10, 229, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Yarıçap :");
		lblNewLabel_1.setBounds(21, 71, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textYariCap = new JTextField();
		textYariCap.setBounds(104, 68, 86, 20);
		frame.getContentPane().add(textYariCap);
		textYariCap.setColumns(10);
		
		JLabel lblSonuc = new JLabel("Sonuç");
		lblSonuc.setBounds(20, 154, 170, 14);
		frame.getContentPane().add(lblSonuc);
		
		JButton btnHesapla = new JButton("Hesapla");
		btnHesapla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					DaireAlanHesaplama daireAlanHesaplama = new DaireAlanHesaplama(Double.valueOf(textYariCap.getText()));
					lblSonuc.setText("Dairenin Alanı : " + daireAlanHesaplama.alan());
				}catch(Exception ex) {
					lblSonuc.setText("Bir sayı giriniz");
				}
			}
		});
		btnHesapla.setBounds(104, 114, 89, 23);
		frame.getContentPane().add(btnHesapla);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
