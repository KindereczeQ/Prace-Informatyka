package course;

import java.util.List;

public class Part {
	public String name;
	public List<Part> series;
	public double price;
	public Part(String name, List<Part> series, double price) {
		super();
		this.name = name;
		this.series = series;
		this.price = price;
	}
	public Part(String string, double d) {
		
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Part> getSeries() {
		return series;
	}

	public void setSeries(List<Part> series) {
		this.series = series;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
		
	}
	
		
		
		
		
		
		
		
	
		
	
	
	
	
}





	





