package course;

public class JedzenieProjekt {

	public static void main(String[] args) {
		int PozadanyProszek = 600;
		int PozadaneMydlo = 400;
		int PozadanySzampon = 200;
		
		
		int DeficytSzampon = 400;
		int DeficytMydlo = 300;
		int DeficytProszek = 700;
		
		boolean holidays = false;
		 
		
		if ( PozadanyProszek  >= DeficytProszek )
		{
			int AktualnyProszek = PozadanyProszek  - DeficytProszek ;
			System.out.println("Aktualnie posiadasz" + " " + AktualnyProszek + " " + "gram�w proszku.");
		}
		else
		{
			int AktualnyProszek = PozadanyProszek  - DeficytProszek ;
			System.out.println("Aktualnie posiadasz" + " " + AktualnyProszek + " " + "gram�w proszku.");
		}
		
				if ( PozadaneMydlo >= DeficytMydlo && holidays )
		{
			int AktualneMydloHol = PozadaneMydlo /2   - DeficytMydlo ;
			System.out.println("Aktualnie posiadasz" + " " + AktualneMydloHol + " " + "mililitr�w myd�a.");
		}
		else    
		{
			int AktualneMydlo = PozadaneMydlo - DeficytMydlo;
			System.out.println("Aktualnie posiadasz" + " " + AktualneMydlo + " " + "mililitr�w myd�a.");
		}
		
	
		if ( PozadanySzampon >= DeficytSzampon && holidays )
		{
			int AktualnySzamponHol = PozadanySzampon /2  - DeficytSzampon;
			System.out.println("Aktualnie posiadasz" + " " + AktualnySzamponHol + " " + "mililitr�w szamponu.");
		}
		else
		{
			int AktualnySzampon = PozadanySzampon - DeficytSzampon;
			System.out.println("Aktualnie posiadasz" + " " + AktualnySzampon + " " + "mililitr�w szamponu.");
		}
		
		
		
		
		
		
		
		
		
		
				
		
	
		
		
			
			
	
			
		

	}

}
