
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class MyOwnMethods {

	/*
	 * // METOD 1
	 * 
	 */
	//

	Scanner sc = new Scanner(System.in);

	// Make an object of menuclass
	// FÖRSTÖR MenuClass mc = new MenuClass();
			
	

	//
	public void myFirstMethod() { // metod huvud
		// Metod kroppen
		System.out.println("My First Method, Från MyOwnMethods");
		System.out.println("Detta kommer från Objektet MyOwnMethods\noch metoden i MyOwnMethods");

	}

	/*
	 * // Räkna METOD
	 * 
	 */
	public void countMethod() {
		int times = 10;
		int total;

		for (int i = 1; i <= 10; i++) {
			total = times * i;
			System.out.println(total);
		}

	}

	/*
	 * // ARRAY METDO
	 * 
	 */
	public void arrayMethod() {
		int[] arrayMethodINT = { 99, 34, 76, 82 };

		for (int arrayElement : arrayMethodINT) {
			System.out.println(arrayElement);
		}

	}

	/*
	 * // INT PARAMETRAR METOD
	 * 
	 */
	public void intParameterMetod(int parameter1, int parameter2) {
		int total;
		total = parameter1 * parameter2;
		System.out.println(total);

	}

	/*
	 * // STRING PARAMETRAR METOD
	 * 
	 */
	public void stringParameterMetod(String name) {
		System.out.println("Hej " + name);

	}

	//
	private int x; // initierar x som private

	public void setX(int x) {
		this.x = x; // nyckelord this. tar instansen av värdet x från private variabeln x
	}

	// Sedan måste man ha en get, som hämtar den private x
	// måste vara int, samma värde som datatyp parameter i set
	public int getx() { // inte void, utan den ska returnera int, samma type som set datatypen
		return x;
	}

	public void SkrivUtNamn() {

		String firstName;
		String lastName;

		System.out.println("Write your Firstname");
		firstName = sc.next();
		System.out.println("Write your Lastname");
		lastName = sc.next();
		System.out.println("Hej " + firstName + " " + lastName);

	}

	/*
	 * // Sqrt metod
	 * 
	 */
	private double root;// Gör en private variabel, mest för att kunna ha olika namn på ingående och
						// return

	public double kvadratRooten(double number) {// Metoden: number kmr från main
		root = Math.sqrt(number);// number går in i metoden Math.sqrt och ger oss rooten ur number
		return root;// returnerar double root svaret
	}

	/*
	 * // PiTest Metod
	 * 
	 */
	private double calculate;

	public double piTestMetod(double pinumber) {
		calculate = Math.PI * pinumber;
		return calculate;
	}

	// final, man låser ett värde som ej kan ändras
	// ex; final int 57;
	final int a = 57;
// vanligt att man skriver:
	public static final int b = 58;

	/*
	 * // Gissa talet metod
	 */
	public void gissaTalet() {
		Random random = new Random();

		int x = random.nextInt(100);
		int guess = 0;
		while (x != guess) {
			System.out.println("Gissa på et tal mellan 1-100");
			guess = sc.nextInt();
			if (x == guess) {
				System.out.println("Du gissade rätt!\nTalet var: " + x);
				break;
			} else if (x > guess) {
				System.out.println("Du gissade för lågt");
			} else if (x < guess) {
				System.out.println("Du gissade för Högt");
			} else
				System.out.println("Något blev fel");

		}
	}

	/*
	 * // Generera Multiplikationstabellen
	 */
	// Skapa objekt namn scanner
	int num;
	int answer;

	public void genereraMultiplikation(int num) {

		System.out.println("Mata in ett tal");
		num = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			answer = num * i;
			System.out.println(answer);
		}
		
	}

	/*
	 * // Cirkel Metoden
	 */

	// Scanner objektet

	// variabler
	double diameter_svar; // radie*2
	// radie(input) Användaren skriver in(halva diametern)
	double omkrets_svar; // 2⋅π⋅radien
	double area_svar; // 2⋅π⋅radien .... pi*r*r
	double input;

	public void cirkelMetoden(double input) {

		System.out.println("Skriv in radie");

		input = sc.nextDouble();
		omkrets_svar = 2 * (Math.PI * input);
		area_svar = (input * input) * Math.PI;
		diameter_svar = input * 2;
		System.out.println("Du skrev in radie: " + input);
		System.out.println("Omkretsen är: " + omkrets_svar);
		System.out.println("Area är: " + area_svar);
		System.out.println("Diametern är: " + diameter_svar);

	}

	/*
	 * // Udda jämnt METOD
	 */

	public void evenOdd(int input) {
		// variabler
		int input1 = 0;
		System.out.println("Vi ska kolla om talet är udda eller jämnt: skriv ett tal");
		input1 = sc.nextInt();
		if (input1 % 2 == 0) {
			System.out.println("Talet är jämnt");
		} else
			System.out.println("Talet är udda");
		//  FÖRSTÖR!!!   mc.menumethod();
		
	}

	/*
	 * ///// Miniräknare 1 med string till wrapp integer
	 */

	public void MiniräknareEtt() {

		String num1;
		String num2;
		int svar;
		String operator;

		System.out.println("Skriv in tal 1");
		num1 = sc.next();
		System.out.println("Välj operator:[ +, -  / , %, * ]");
		operator = sc.next();
		System.out.println("Skriv in tal 2");
		num2 = sc.next();
		Integer x = new Integer(num1);
		Integer z = new Integer(num2);

		if (operator.contains("+")) {
			svar = x + z;
			System.out.println(num1 + " " + operator + " " + num2 + " =" + " " + svar);
		} else if (operator.contains("-")) {
			svar = x - z;
			System.out.println(num1 + " " + operator + " " + num2 + " =" + " " + svar);
		} else if (operator.contains("/")) {
			svar = x / z;
			System.out.println(num1 + " " + operator + " " + num2 + " =" + " " + svar);
		} else if (operator.contains("%")) {
			svar = x % z;
			System.out.println(num1 + " " + operator + " " + num2 + " =" + " " + svar);
		} else if (operator.contains("*")) {
			svar = x * z;
			System.out.println(num1 + " " + operator + " " + num2 + " =" + " " + svar);
		}

	}

	/*
	 * // Miniräknar med säkring FLOAT
	 */
	public void säkrareMiniröäknare() {

		String num1;
		String num2;
		double svar;
		String operator;
		System.out.println("Skriv in tal 1");
		num1 = sc.next();
		System.out.println("Välj operator:[ +, -  / , %, * ]");
		operator = sc.next();
		System.out.println("Skriv in tal 2");
		num2 = sc.next();
		// Använder Float, mindre bytes, använder . (punkt)
		Float x = new Float(num1);
		Float z = new Float(num2);

		if (operator.contains("+")) {
			svar = x + z;
			System.out.println(num1 + " " + operator + " " + num2 + " =" + " " + svar);
		} else if (operator.contains("-")) {
			svar = x - z;
			System.out.println(num1 + " " + operator + " " + num2 + " =" + " " + svar);
		} else if (operator.contains("/")) {
			svar = x / z;
			System.out.println(num1 + " " + operator + " " + num2 + " =" + " " + svar);
		} else if (operator.contains("%")) {
			svar = x % z;
			System.out.println(num1 + " " + operator + " " + num2 + " =" + " " + svar);
		} else if (operator.contains("*")) {
			svar = x * z;
			System.out.println(num1 + " " + operator + " " + num2 + " =" + " " + svar);
		} else {

			System.out.println("Något blev fel");
		}

		System.out.println();
		System.out.println("Beräkningen klar");
	}

	/*
	 * // MiniRäknareMed SWITCH
	 */
	public void miniräknareMedSwitch() {
		double num1, num2;

		System.out.print("Enter num 1: ");

		num1 = sc.nextDouble();
		System.out.print("Enter num 2: ");
		num2 = sc.nextDouble();

		System.out.print("choose an operator to calculate with: (+, -, *, /, %): ");
		char operator = sc.next().charAt(0); // switcha på string bättre

		double output;
		switch (operator) {
		case '+':
			output = num1 + num2;
			break;

		case '-':
			output = num1 - num2;
			break;

		case '*':
			output = num1 * num2;
			break;

		case '/':
			output = num1 / num2;
			break;

		case '%':
			output = num1 % num2;
			break;

		default:
			System.out.printf("Something Went wrong");
			return;
		}

		System.out.println("Heres yours request: ");
		System.out.println("You entered num 1: " + num1 + "\nYou choose operator: " + operator
				+ " \nYou entered num 1: " + num2 + "\nAnswere is  = " + output);

	}

	/*
	 * // checkPasswordForLetters METOD
	 */
	public void checkPasswordForLetters() {

		System.out.println("Enter Password");
		String pw = sc.next();

		for (int i = 0; i < pw.length(); i++) {
			char charcheck = pw.charAt(i);
			if (Character.isUpperCase(charcheck)) {
				System.out.println(charcheck + " is uppercase.");
			}

			else if (Character.isLowerCase(charcheck)) {
				System.out.println(charcheck + " is lowercase.");
			} else
				System.out.println(charcheck + " is not a real letter");

		}

	}

// Mata in ett tal while loop
	public void mataInTalet() {
		int input;

		while (true) {
			System.out.println("Mata in ett tal:");
			input = sc.nextInt();
			if (input == 0)
				break;
		}
		System.out.println("programmet avslutades");

	}

	// Palidrom
	public void palidrom() {
		String originalWord;
		String newWord;

		System.out.print("Check if its a Palindrom:\nWrite your word: ");
		originalWord = sc.next();

		newWord = new StringBuffer(originalWord).reverse().toString();
		if (originalWord.equals(newWord)) {
			System.out.println("Its a Palindrom");
			System.out.println("Du skrev ordet: " + originalWord);
			System.out.println("Backlänges blir det: " + newWord);
		} else
			System.out.println("Its NOT a  Palindrom ");
		System.out.println("Du skrev ordet: " + originalWord);
		System.out.println("Backlänges blir det: " + newWord);
	}

	// User input array number and user search for a number
	// user input search
	public void searchANumber() {

		int numbers11[] = new int[5];
		int valueToSearchFor11;
		boolean found11 = false;

		for (int i = 0; i < numbers11.length; i++) {
			System.out.println("Skriv in fem st tal: ");
			numbers11[i] = sc.nextInt();
		}

		System.out.println("Vilket tal letar du effter? ");
		valueToSearchFor11 = sc.nextInt();
		for (int valueToCompare : numbers11) {

			if (valueToSearchFor11 == valueToCompare) {
				found11 = true;
				break;
			}
		}
		System.out.println("Du letade efter: " + valueToSearchFor11);
		System.out.println("Svaret ifall talet finns är: " + found11);

	}

	// tar emot två parametrar int , Overload method,en metdon som kan ta emot
	// flera parametrar(kan vara olika parametrar)
	public int area(int b, int h) {
		return b * h;
	}

	// tar emot två parametrar double, Overload method,en metdon som kan ta emot
	// flera parametrar(kan vara olika parametrar)
	public double area(double b, double h) {
		return b * h;
	}

	// flera parametrar(kan vara olika parametrar)
	public String area(String s) {
		return s;
	}

	// Variable length argument list
	// ... gör så att man kan lägga in hur många man vill i arrayen,list
	// int parameter
	public int medelTal(int... vitsord) {
		int total = 0;
		for (int x : vitsord)
			total += x;
		return total / vitsord.length;
	}

	// Variable length argument list
	// ... gör så att man kan lägga in hur många man vill i arrayen,list
	// double parameter
	public double medelTal(double... vitsord) {
		double total = 0;
		for (double x : vitsord)
			total += x;
		return total / vitsord.length;
	}

	// Skriva till en fil
	// main metoden där man skriver in till texten och som hämtar metoden i
	// writefile classen
	public void WriteToFile() {
		/*
		 * Must  check this then time, if user input filepath/filename it will bugg,cuz probably scanner aint closed properly
		 * im using more than one scanner in dirreferbt location, not good
		 * String filepath;
		System.out.println("Skriv in filnamnet du vill spara: ");
		 filepath = sc.next();
		 
		 String filepath2 = "C:\\\\Users\\\\miche\\\\Desktop\\\\"+filepath+".txt";
		WriteFile wf = new WriteFile(filepath2, true);
		
		String filepath;
		System.out.println("Skriv in filnamnet du vill spara: ");
		 filepath = sc.next();
		 */
		 String filepath = "C:\\\\Users\\\\miche\\\\Desktop\\\\writemytextfile.txt";
		WriteFile wf = new WriteFile(filepath, true);

		try {
			System.out.println("Skriv till filen\n");
			String usertext = sc.nextLine();
			wf.writeToFile(usertext);
			System.out.printf("Du har skrivit till filen:\n%s", filepath);
		}

		catch (IOException e) {
			System.out.println(e.getMessage());
			System.out.println("Du har inte skrivit till filen.\nNågot gick fel");
		}

		
	}

	///////////////// END

}
