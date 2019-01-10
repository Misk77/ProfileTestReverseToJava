import java.util.Scanner;

public class ProfileMethod {
	String personinfo;
	String userList[] = {}; 
	Scanner sc = new Scanner(System.in);
	//ProfileMethod pr=new ProfileMethod();
	
	

	public void myProfileMethodd() { // metod huvud

		System.out.println("Ange FirstName: \n");
        sc.next();
        System.out.println("Ange LastName: \n");
        sc.next();
		System.out.println("Ange Ålder: \n");
		 sc.next();
		System.out.println("Ange Yrke: \n");
		 sc.next();
		System.out.println("Ange Land: \n");
		 sc.next();
		System.out.println("Ange Hobby: \n");
		 sc.next();
		System.out.println("Ange sex: \n");
		 sc.next();
		System.out.println("Ange längd: \n");
		 sc.next();
		//userList.append();

		/*
		 * with open('profiles.txt', 'a+') as f: f.write('\n{0}'.format(userList))
		 * f.close() personinfo = input('\nVill du gå vidare: press enter \nFor exit
		 * press {n/N] to exit\n') if personinfo == 'n' and 'N': exit() else:
		 * print("vidare") }
		 * 
		 */

		// Make an object of menuclass
		MenuClass mc = new MenuClass();
		mc.menumethod();

	}
}