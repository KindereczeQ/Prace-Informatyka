package course;

public class JedzenieProjekt {

	public static void main(String[] args) {
		int Proszek = 100;
		int Szampon = 250;          
		int Mydlo = 200;            
		boolean Holidays = true;
		int WymaganyProszek = 100;
		int WymaganySzampon = 500;
		int WymaganeMydlo = 400;
		
		
		
		if ( WymaganyProszek <= Proszek && Holidays )
		{
			System.out.println("Masz wystarczaj�c� ilo�� proszku.");
		}
		
		else if ( WymaganyProszek <= Proszek && Holidays == false )
		{
			System.out.println("Masz wystarczaj�c� ilo�� prszku.");
		}
		
		else if ( WymaganyProszek > Proszek && Holidays == false )
			
		
		{
			int DokupProszek = WymaganyProszek - Proszek;
				System.out.println("Musisz dokupi� nast�puj�c� liczb� "
					+ "gram�w proszku:");
				System.out.println("-" + " " + DokupProszek);
		}
		
		
		if ( Holidays && WymaganySzampon  > Szampon /2 )
		{
			int DokupSzampon = (WymaganySzampon /2)  - Szampon;
			System.out.println("Musisz dokupi� nast�puj�c� liczb� "
					+ "mililitr�w szamponu:");
			System.out.println("-" +  " " + DokupSzampon);
		}
		
		else if ( WymaganySzampon <= Szampon && Holidays == false)
		{
			System.out.println("Masz wystarczaj�c� ilo�� szamponu.");
		}
	
		else if ( WymaganySzampon <= Szampon && Holidays )
		{
			System.out.println("Masz wystarczaj�c� ilo�� szamponu.");
		}
		else if ( WymaganySzampon > Szampon && Holidays == false  )
		{
			int DokupSzampon = 	WymaganySzampon - Szampon;
				System.out.println("Musisz dokupi� nast�puj�c� liczb� "
					+ "mililitr�w szamponu:");
				System.out.println("-" + " " +
					DokupSzampon);
		}
		 
		 if ( Holidays && WymaganeMydlo > Mydlo ) 
		{
			
			int DokupMydlo = 	(WymaganeMydlo /2) - Mydlo;
			System.out.println("Musisz dokupi� nast�puj�c� liczb� "
				+ "mililitr�w myd�a:");
			System.out.println("-" + " " +
				DokupMydlo);
		}
		
		else if ( WymaganeMydlo < Mydlo && Holidays && WymaganeMydlo - Mydlo == 0 )
		
		{
			System.out.println("Masz wystarczaj�c� ilo�� myd�a.");
		}
		
		else if ( WymaganeMydlo < Mydlo && Holidays == false && WymaganeMydlo - Mydlo == 0 )
		{
			System.out.println("Masz wystarczaj�c� ilo�� myd�a.");
		}
			  
		else if ( WymaganeMydlo > Mydlo && Holidays == false  )
		{
			int DokupMydlo = 	WymaganeMydlo - Mydlo;
				System.out.println("Musisz dokupi� nast�puj�c� liczb� "
					+ "mililitr�w myd�a:");
				System.out.println("-" + " " +
					DokupMydlo);
		}
	
		
		
			
			
		{
			
		}

	}

}
