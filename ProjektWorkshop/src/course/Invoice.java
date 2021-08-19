package course;


import java.util.List;

public class Invoice {
	
	public List<Part> parts;
	public int number;
	
	
	
	public Invoice(List<Part> parts, int number) {
		super();
		this.parts = parts;
		this.number = number;
	}

	public Invoice(String string, List<Part> thirdPack) {
			}

	public List<Part> getParts() {
		return parts;
	}
	public void setParts(List<Part> parts) {
		this.parts = parts;
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int Number) {
	this.number = number;
	
	
	
	
	
	}
}


