package topicosBasicos;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		 int numeroUm , numeroDois = 2;
		 double restoDiv=  0.0;
		 
		 
		 
		 for(numeroUm = 1; numeroUm <= 10; numeroUm++) {
			 restoDiv = numeroUm % numeroDois;
			 
			// System.out.printf("Numero %d \n",+numeroUm);
			// System.out.printf("Resto %.2f \n",+restoDiv);
			 
			 if(restoDiv != 0) {
				 System.out.printf("numero %d é impar \n" , + numeroUm);
				 
			 }else {
				 System.out.printf("numero %d é par \n", + numeroUm);
			 }
			 
			 
		 }
		 


	}
	

}
