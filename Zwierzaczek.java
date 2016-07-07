package schronisko;

public class Zwierzaczek {

	private final String name;
	private final String type;
	
	Zwierzaczek(String name, String type){
		this.name = name;
		this.type = type;
	}
	
	@Override
	public String toString(){
		return "Imie:" +name + " " + "Typ:" +type;
	}
	
	
}
