package h3;

public class Mensch {

	public String name;
	public int gebJahr, alter;
	
	public void setName(String pName) {
		name = pName;
	}
	public String getName() {
		return name;
	}
	
	public void setGebJahr(int jahr) {
		gebJahr = jahr;
	}
	public int getGebJahr() {
		return gebJahr;
	}
	
	public void setAlter() {
		alter = 2025 - gebJahr;
	}
	public int getAlter() {
		return alter;
	}
	
}
