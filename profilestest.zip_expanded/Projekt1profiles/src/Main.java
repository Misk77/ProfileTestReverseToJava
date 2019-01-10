import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scanner
		Scanner sc = new Scanner(System.in);

		// Make objekcts of my superclass
		//används EJ nu Profile pc = new Profile();
		// make subclass objekt
		// används EJ nu PersonalInfo perinc = new PersonalInfo(null, null, 0);
		// Make an object of menuclass
		GuiClass gc = new GuiClass();
		gc.StartDialog();
		// Make an object of menuclass
		MenuClass mc = new MenuClass();
		mc.menumethod();
		
	

		

		/*
		 * // main variable String svar; svar = sc.
		 * next("Inmatningen har avslutats:\n vill du söker efter profil kriterier:(j/n)"
		 * ); sc.next(svar); if (svar == "j" && svar == "J") {
		 * System.out.println("Till profilsearch"); } else if (svar == "j" && svar ==
		 * "J") { mc.menumethod();
		 * 
		 * }
		 */
		sc.close();
		// END
	}

}
