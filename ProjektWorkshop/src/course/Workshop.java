package course;

import java.util.ArrayList;
import java.util.List;

public class Workshop {
	

	public Workshop(String string, double d) {
	}

public List<Part> aloneparts() {
	Part First = new Part("Opony Zimowe", 399.99);
	Part Second = new Part("Opony Letnie", 499.99);
	Part Third = new Part("Felgi Samochodowe", 599.99);
	Part Forth = new Part("Szyby", 299.99);
	Part Fifth = new Part("Hamulce", 799.99);
	Part Sixth = new Part("Zawieszenie", 129.99);
	Part Seventh = new Part("Ch³odzenie", 895.49);
	Part Eighth = new Part("Silnik", 2599.99);
	Part Ninth = new Part("P³yn Do Spryskiwaczy", 49.99);
	

		List<Part> FirstPack = new ArrayList<Part>();
		FirstPack.add(First);
		FirstPack.add(Seventh);
		FirstPack.add(Ninth);
		
		List<Part> SecondPack = new ArrayList<Part>();
		SecondPack.add(Sixth);
		SecondPack.add(Third);
		SecondPack.add(Second);
		
		List<Part> ThirdPack = new ArrayList<Part>();
		ThirdPack.add(Eighth);
		ThirdPack.add(Forth);
		ThirdPack.add(Fifth);
		Invoice FirstInvoice = new Invoice("13/12/2015", FirstPack);
		Invoice SecondInvoice = new Invoice("01/04/2017", SecondPack);
		Invoice ThirdInvoice = new Invoice("29/09/2020", ThirdPack);
		return aloneparts();
}
		public double sumAll(List<Invoice> suminvoices) {
		    double sum = 0;
		     
		    for(Invoice invoice : suminvoices) {
		      for(Part part : ThirdPack().getParts() ) {
		        sum += part.getPrice();
		      }
		    }
		    return sum;
		}
		    
		
		
		
public void  FindPart (List<Part> findparts ) {
		    	for(int i = 0; i <= Invoice.length)
		    }
		
		
		
		
		
		


}

