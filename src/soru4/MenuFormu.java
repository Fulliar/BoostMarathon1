package soru4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuFormu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuFormu window = new MenuFormu();
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
	public MenuFormu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 378, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnKareAlan = new JButton("Basınız");
		btnKareAlan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnKareAlan.setBounds(263, 46, 89, 23);
		frame.getContentPane().add(btnKareAlan);
		
		JButton btnKareCevre = new JButton("Basınız");
		btnKareCevre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnKareCevre.setBounds(263, 80, 89, 23);
		frame.getContentPane().add(btnKareCevre);
		
		JButton btnDikdörtgenAlan = new JButton("Basınız");
		btnDikdörtgenAlan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDikdörtgenAlan.setBounds(263, 114, 89, 23);
		frame.getContentPane().add(btnDikdörtgenAlan);
		
		JButton btnDikdörtgenCevre = new JButton("Basınız");
		btnDikdörtgenCevre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDikdörtgenCevre.setBounds(263, 148, 89, 23);
		frame.getContentPane().add(btnDikdörtgenCevre);
		
		JButton btnDaireAlan = new JButton("Basınız");
		btnDaireAlan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDaireAlan.setBounds(263, 182, 89, 23);
		frame.getContentPane().add(btnDaireAlan);
		
		JButton btnDaireCevre = new JButton("Basınız");
		btnDaireCevre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDaireCevre.setBounds(263, 216, 89, 23);
		frame.getContentPane().add(btnDaireCevre);
		
		JLabel lblKareAlan = new JLabel("Kare Alan Hesaplama :");
		lblKareAlan.setBounds(10, 50, 124, 14);
		frame.getContentPane().add(lblKareAlan);
		
		JLabel lblKareCevre = new JLabel("Kare Cevre Hesaplama :");
		lblKareCevre.setBounds(10, 84, 124, 14);
		frame.getContentPane().add(lblKareCevre);
		
		JLabel lblDikdörtgenAlan = new JLabel("Dikdörtgen Alan Hesaplama :");
		lblDikdörtgenAlan.setBounds(10, 118, 138, 14);
		frame.getContentPane().add(lblDikdörtgenAlan);
		
		JLabel lblDikdrtgenevre = new JLabel("Dikdörtgen Çevre Hesaplama :");
		lblDikdrtgenevre.setBounds(10, 152, 164, 14);
		frame.getContentPane().add(lblDikdrtgenevre);
		
		JLabel lblDaireAlan = new JLabel("Daire Alan Hesaplama :");
		lblDaireAlan.setBounds(10, 186, 124, 14);
		frame.getContentPane().add(lblDaireAlan);
		
		JLabel lblDaireCevre = new JLabel("Daire Çevre Hesaplama :");
		lblDaireCevre.setBounds(10, 220, 124, 14);
		frame.getContentPane().add(lblDaireCevre);
	}
}
