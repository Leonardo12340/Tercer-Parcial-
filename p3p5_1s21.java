import java.util.Scanner;

public class p3p5_1s21{

    public static int promedio(int[] a){
    	int sum=0;
    	for(int noum : a)
    		sum+=NoSuchMethodException




    }

    public static int[] captura(){
    	Scanner teclado = new Scanner(System.in);
    	int[] numeros = new int[10];
    	 for (int x=0;x<10;x++){
    	 	System.out.println("Ingresa el valor["+(x+1)+"]: ");		
    	 	numeros[x]=teclado.nextInt();
    	 }
    	 return numeros; 
    }

	public static void main(String[] args) {
		System.out.println("el promedio de 3 numeros es "+promedio(5,7,9));			
		int[] arreglo = captura();
		for (int a=0; a<arreglo.length;a++){
			System.out.println("valor en la posicion["+(a+1)	+"]: "+arreglo[a]);
		}
	}
}