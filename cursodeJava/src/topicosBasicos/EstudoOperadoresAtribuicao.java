package topicosBasicos;

public class EstudoOperadoresAtribuicao {

	public static void main(String[] args) {
		double n1 = 10.0;
		double n2 = 20.0;
		
		String palavra = "PETERSON ";
		
		palavra += " MILEO";
		n1 += n1;
		System.out.printf("N1+N1 = %.1f \n", +n1);
		n2 /= n2;
		System.out.printf("N2 / N2 = %.1f \n", +n2);
		
		n1 = n2++;
		System.out.printf("N1 + N2++ = %.1f \n", +n1);
		n1 = ++n2;
		System.out.printf("N2 + ++N2 = %.1f \n", +n1);
		
		System.out.println(palavra);

	}

}
