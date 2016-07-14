package schronisko;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JLabel;

public class SchroniskoApp {

	private JFrame frmSchroniskoapp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SchroniskoApp window = new SchroniskoApp();
					window.frmSchroniskoapp.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	class SchroniskoIni {
		
		List<Zwierzaczek> ListaZwierzat = new ArrayList<Zwierzaczek>(5);
		Scanner sc = new Scanner(System.in);
		Zwierzaczek z;
		
		public void WyswietlListe() {
			boolean pusta = ListaZwierzat.isEmpty();
			int pelna = ListaZwierzat.size();
			if (pusta == true) {
				System.out.println("Brak zwierzat w schronisku!");
			} else if (pelna > 4) {
				System.out.println("Schronisko jest pe³ne. Lista zwierzat:");
			}
			for (Zwierzaczek lista: ListaZwierzat){
				System.out.println("Imie: " + lista);
			}
		}
		
	}
	
	
	public SchroniskoApp() {
		initialize();
	}
	
	private void initialize() {
		frmSchroniskoapp = new JFrame();
		frmSchroniskoapp.setTitle("SchroniskoApp");
		frmSchroniskoapp.setBounds(100, 100, 450, 300);
		frmSchroniskoapp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSchroniskoapp.getContentPane().setLayout(null);
		
		JButton btnWyswieltliste = new JButton("WyswieltListe");
		btnWyswieltliste.setBounds(0, 0, 120, 41);
		frmSchroniskoapp.getContentPane().add(btnWyswieltliste);
		
		JButton btnDodajZwierzaka = new JButton("DodajZwierzaka");
		btnDodajZwierzaka.setBounds(0, 41, 120, 41);
		frmSchroniskoapp.getContentPane().add(btnDodajZwierzaka);
		
		JButton btnUsunZwierzaka = new JButton("UsunZwierzaka");
		btnUsunZwierzaka.setBounds(0, 80, 120, 41);
		frmSchroniskoapp.getContentPane().add(btnUsunZwierzaka);
		
		JButton btnZapiszStan = new JButton("ZapiszStan");
		btnZapiszStan.setBounds(0, 119, 120, 41);
		frmSchroniskoapp.getContentPane().add(btnZapiszStan);
		
		JButton btnBazaDanych = new JButton("BazaDanych");
		btnBazaDanych.setBounds(0, 159, 120, 41);
		frmSchroniskoapp.getContentPane().add(btnBazaDanych);
		
		JLabel lblNoWitam = new JLabel("No witam");
		lblNoWitam.setBounds(150, 6, 99, 28);
		frmSchroniskoapp.getContentPane().add(lblNoWitam);
	}
}
