package schronisko;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JPanel;

public class Schronisko {

	List<Zwierzaczek> ListaZwierzat = new ArrayList<Zwierzaczek>(5);
	Scanner sc = new Scanner(System.in);
	Zwierzaczek z;

	
	
	
	public void ZaladujListe() {
		String file = "BazaDanych.txt";
		try {
			InputStream is = new FileInputStream(file);
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			String line;	
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();
			} catch (Exception e) {
				System.out.println(e.toString());
			}		
	}
	
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
	
	public void DodajZwierzaka() throws IOException {
		System.out.println("Wpisz imie zwierzaka");
		String imie = sc.nextLine();
		z = new Zwierzaczek(imie);
		if (ListaZwierzat.size() > 4) {
			System.out.println("Schronisko jest pe³ne. Nie mo¿esz dodaæ zwierzaka!");
		} else {
			ListaZwierzat.add(z);
			System.out.println("Dodano " +imie + " do schroniska");
		}
	}
	
	public void UsunZwierzaka() {
		System.out.println("Wybierz ktorego z kolei zwierzaka chcesz usunac? [OD 0]");
		for (Zwierzaczek lista: ListaZwierzat){
			System.out.println(lista);
		}
		int ktory = sc.nextInt();
		ListaZwierzat.remove(ktory);
		System.out.println("Usunieto " +ktory + " ze schroniska");
	}
	
	public void ZapiszStan() throws IOException {
		File bazaDanych = new File("BazaDanych.txt");
		String listaArray = ListaZwierzat.toString();
		PrintWriter pw = new PrintWriter(bazaDanych);
		pw.write(listaArray);
		pw.close();
	}
	
	
	public void Wlacz() {
		while (true) {
			System.out.println("---------------------");
			System.out.println("Witamy w schronisku dla zwierzat! Co chcesz zrobic?" + "\n" +
			"Wybierz 1 aby wyswietlic liste zwierzat" + "\n" +
			"Wybierz 2 aby dodac zwierzaka do schroniska" +"\n" +
			"Wybierz 3 aby usun¹æ zwierzaka ze schroniska" +"\n" +
			"Wybierz 4 aby zapisac stan schroniska" +"\n" +
			"Wybierz 5 aby obejrzec baze danych zwierzat");
			
			try {
				Scanner odczyt = new Scanner(System.in);
				int o = odczyt.nextInt();

				switch (o) {
				case 1:
					WyswietlListe();
					break;
				case 2:
					DodajZwierzaka();
					break;
				case 3:
					UsunZwierzaka();
					break;
				case 4:
					ZapiszStan();
					break;
				case 5:
					ZaladujListe();
					break;
				default:
					System.out.println("Blad! Wybierz liczbe od 1 do 5!");
				}
			} catch (Exception e) {
				System.out.println("Blad programu!");
			}
			
			
			
		}
		
		
	}
	
	public static void main(String[] args) throws IOException {
		

		
		Schronisko program = new Schronisko();
		program.Wlacz();
		
		
	}
	
}

