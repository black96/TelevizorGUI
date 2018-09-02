package edu.gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import edu.tv.Televizor;



public class TvGui {

	private JFrame frame;
    Televizor t=new Televizor();
    private JButton btnchminus;
    private JButton btnVolplus;
    private JButton btnVolminus;
    private JLabel label;
    private JLabel label_1;
    private JButton btnOn;
    private JButton btnOff;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TvGui window = new TvGui();
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
	public TvGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnCh = new JButton("CH+");
		btnCh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				t.promenaKanala();
				label_1.setText(String.valueOf(t.getKanal()));
				
			}
		});
		btnCh.setBounds(66, 107, 89, 23);
		frame.getContentPane().add(btnCh);
		
		btnchminus = new JButton("CH-");
		btnchminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				t.smanjivanjeKanala();
				label_1.setText(String.valueOf(t.getKanal()));
				
			}
		});
		btnchminus.setBounds(227, 107, 89, 23);
		frame.getContentPane().add(btnchminus);
		
		btnVolplus = new JButton("Vol+");
		btnVolplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				t.promenaZvuka();
				label.setText(String.valueOf(t.getZvuk()));
				
			}
		});
		btnVolplus.setBounds(66, 141, 89, 23);
		frame.getContentPane().add(btnVolplus);
		
		btnVolminus = new JButton("Vol-");
		btnVolminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				t.smanjivanjeZvuka();
				label.setText(String.valueOf(t.getZvuk()));
				
			}
		});
		btnVolminus.setBounds(227, 141, 89, 23);
		frame.getContentPane().add(btnVolminus);
		
		label = new JLabel("");
		label.setBounds(240, 37, 76, 14);
		frame.getContentPane().add(label);
		
		label_1 = new JLabel("");
		label_1.setBounds(66, 37, 78, 14);
		frame.getContentPane().add(label_1);
		
		btnOn = new JButton("ON");
		btnOn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				t.ukljucen();
				label.setText(String.valueOf(10));
				label_1.setText(String.valueOf(0));
				btnCh.setEnabled(true);
				btnchminus.setEnabled(true);
				btnVolplus.setEnabled(true);
				btnVolminus.setEnabled(true);
				label.setEnabled(true);
				label_1.setEnabled(true);
				
			}
		});
		btnOn.setBounds(66, 73, 89, 23);
		frame.getContentPane().add(btnOn);
		
		btnOff = new JButton("OFF");
		btnOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				t.iskljucen();
				btnCh.setEnabled(false);
				btnchminus.setEnabled(false);
				btnVolplus.setEnabled(false);
				btnVolminus.setEnabled(false);
				label.setEnabled(false);
				label_1.setEnabled(false);
				
			}
		});
		btnOff.setBounds(227, 73, 89, 23);
		frame.getContentPane().add(btnOff);
	}
}
