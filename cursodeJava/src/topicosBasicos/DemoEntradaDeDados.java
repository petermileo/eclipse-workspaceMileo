package topicosBasicos;

import java.util.Scanner;

public class DemoEntradaDeDados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		sc.nextLine();
		String name = sc.nextLine();
		char gender = sc.nextLine().charAt(0);
		
		System.out.println(n1);
		
		System.out.println(name);
		System.out.println(gender);
sc.close();
	}

}
