package topicosBasicos;

import java.util.Scanner;

public class EstudoEntradaDeDados {
	public static void main(String[] args) {
		
		/*
		 Exemplo basico de Scanner:
		 Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		System.out.println(sentence);
		sc.close();
		}
		*/
		
		Scanner sc = new Scanner(System.in);
		String x , y ,z ,sentence;
		sentence = sc.nextLine();
		x = sc.next();
		y = sc.next();
		z = sc.next();
		
		
		System.out.println(sentence+x+y+z);
		
		
		
		sc.close();
		}
	
	
}
	
	 

	


