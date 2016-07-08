package schronisko;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Schronisko {
	
	List<Zwierzaczek> ListaZwierzat = new ArrayList<Zwierzaczek>();
	Scanner sc = new Scanner(System.in);
	Zwierzaczek z;
	
	
	public void WyswietlListe() {
		for (Zwierzaczek lista: ListaZwierzat){
			System.out.println("Lista Zwierzat: " + lista);
		}
	}
	
	public void DodajZwierzaka() {
		System.out.println("Wpisz imie zwierzaka");
		String imie = sc.nextLine();
		z = new Zwierzaczek(imie);
		ListaZwierzat.add(z);
		System.out.println("Dodano: " +imie + "do schroniska");
	}
	
	
	public void Wlacz() {
		while (true) {
			System.out.println("Witamy w schronisku dla zwierzat! Co chcesz zrobic?" + "\n" +
			"Wybierz 1 aby wyswietlic liste zwierzat" + "\n" +
			"Wybierz 2 aby dodac zwierzaka do schroniska");
			
			try {
				Scanner odczyt = new Scanner(System.in);
				int o = odczyt.nextInt();
				
				switch (o) {
				case 1:
					System.out.println("gonwno");
				case 2:
					
					
				}
				
				
			} catch (Exception e) {
				
			}
			
			
			
		}
		
		
	}
	
	public static void main(String[] args) {
		Schronisko program = new Schronisko();
		program.Wlacz();
	}
	
}

