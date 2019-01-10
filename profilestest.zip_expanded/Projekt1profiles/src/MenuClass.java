import java.util.Scanner;

public class MenuClass {
	// Make an object of menuclass
	//MenuClass mc = new MenuClass();
	//objekt of profilemethod
	ProfileMethod pr = new ProfileMethod();
	
	
	WriteFile wf=new WriteFile(null, false);
	
        
	// classens variabler

	// MyOwnMethods classen
	MyOwnMethods mm = new MyOwnMethods();
	Scanner sc = new Scanner(System.in);
	int inp;

	public void menumethod() {
while (true) {
		System.out.println("\n|===========================================|"
				+ "\n|------------------ MENU--------------------|" + "\n|===========================================|"
				+ " \nAnge vad du vill göra: " + "\n[1]-checkPasswordForLetters "
				+ "\n[2]-evenOdd" + "\n[3]-myProfileMethodd " + "\n[4]-palidrom "
				+ "\n[5]-searchANumber " + "\n[6]-medelTal "
				+ "\n[7]-Ta reda på vad ett ord blir baklänges "
				+ "\n[8]-Vill du skriva in 10 tal  i en lista och se största resp minsta talet "
				+ "\n[9]-genereraMultiplikation " + "\n[10]-Kasta tärning " + "\n[11]-Skapa en txtfile "
				+ "\n[12]-Läsa en txtfil från datorn " + "  \n[13]-WriteToFile "
				+ "\n[14]-Skapa en profil " + "  \n[15]-Söka i profil databasen " + "\n[16]-Räkna ut +,-,*,/,%  "
				+ "  \n[17]-{!!-Under Construction-!!} " + "\n[18]-gissaTalet "
				+ "  \n[19]-{!!-Under Construction-!!} " + "\n[20]-Spela quiz{!!-Under Construction-!!} "
				+ " \n[21]-Rita{!!-Under Construction-!!} " + "\n[0]-{Avsluta} "
				+ "\n|===========================================| "
				+ "+ |------------- More is coming! -------------| "
				+ "+ |===========================================|\n " + " >>>\t ");

		// Valen i menu
		inp = sc.nextInt();

		switch (inp) {

		case  1:
			mm.checkPasswordForLetters();
			break;

		case  2:
			mm.evenOdd(0);
			break;
		case  3:
			pr.myProfileMethodd();
			break;
		case  4:
			mm.palidrom();
			break;
		case  5:
			mm.searchANumber();
			break;
		case  6:
			mm.medelTal();
			break;
		case (int) 7:
			mm.genereraMultiplikation(0);
			break;
		case  13:
			mm.WriteToFile();
			break;
		case 14:
			pr.myProfileMethodd();
			break;
			
			
			
			
			
		case 0: 
			System.out.println("Bye....");
			System.out.println("\tBye....");
			System.out.println("\t\tBye....");
			System.exit(0);
			

		default:
			System.out.println("no match");
			System.out.println("\t try again........");
		}

	
}
		/// END

	}

}
