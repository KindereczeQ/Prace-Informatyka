package course;

import java.util.Date;
import java.util.List;

public class Invoice {
	
	public String parts;
	public int number;
	public Date date;
	public Invoice(Date date) {
		super();
		this.parts = parts;
		this.date = new Date();
		this.number = number;
	}
	
	public Invoice(String string, List<Part> thirdPack) {
			}

	public String getParts() {
		return parts;
	}
	public void setParts(String parts) {
		this.parts = parts;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int Number) {
	this.number = number;
	
	
	
	
	
	}
}


