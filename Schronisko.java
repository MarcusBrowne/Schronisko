package schronisko;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Schronisko {
	
	List<Zwierzaczek> ListaZwierzat = new ArrayList<Zwierzaczek>(10);
	
	public static void main(String[] args) {
		
	Scanner odczyt = new Scanner(System.in);
	Schronisko program = new Schronisko();
	System.out.println(
	"Witamy w schronisku dla zwierzat! Co chcesz zrobic?" + "\n" +
	"Wybierz 1 aby wyswietlic liste zwierzat" + "\n" +
	"Wybierz 2 aby dodac zwierzaka do schroniska" + "\n" +
	"Wybierz 3 aby usunac zwierzaka ze schroniska");
	
	int i = odczyt.nextInt();
	
	if(i>0){ 
	switch (i) {
	case 1: 
		program.WyswietlListe();
		break;
	case 2:
		program.DodajZwierzaka();
		break;
	case 3:
		program.UsunZwierzaka();
		break;
			
		
	}
	}
	odczyt.close();
	}
	
	
	
	void WyswietlListe() {
		for(Zwierzaczek d: ListaZwierzat){
			System.out.println(d);
		}
	}
	
	void DodajZwierzaka() {
		
		System.out.println("Podaj imie");
		Scanner odczyt2 = new Scanner(System.in);
		String a = odczyt2.nextLine();
		System.out.println("Podaj typ");
		String b = odczyt2.nextLine();
		
		ListaZwierzat.add(new Zwierzaczek(a, b));
		odczyt2.close();
	}
	
	void UsunZwierzaka() {
		
		
		System.out.println("Ktorego zwierzaczka usunac? Podaj numer");
		for(Zwierzaczek d: ListaZwierzat){
			System.out.println(d);
		}
		Scanner odczyt3 = new Scanner(System.in);
		int a = odczyt3.nextInt();
		
		ListaZwierzat.remove(a);
		
		odczyt3.close();
	}
	
	
}

