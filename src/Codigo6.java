import java.util.Scanner;

public class Codigo6 {
	//Se agrego el main
	public static void main(String[] args) {
		// le falto el new para crear 
		int[] n = new int[20];

		//Le falto un + al 
	    for (int i = 0; i < 20; i++) {
	      n[i] = (int)(Math.random() * 381) + 20;
	      //le falto el out
	      System.out.print(n[i] + " ");
	      
	    }
	    Scanner sc = new Scanner(System.in);
	    //Print estaba mal escrito
	    System.out.print("\n¿Qué números quiere resaltar? ");
	    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
	    //Provacaba error la forma en que se recibian los datos
	    int opcion = sc.nextInt();

	    //Esta en mal escritor el operador ternario 
	    int multiplo = (opcion == 1)? 5 : 7;
	    
	    //Solo se debe escribir for y el tipo de dato debe ser entero
	    for(int e : n) {
		      if (e % multiplo == 0) {
		    	//Se le agrego un salto de linea al print
		        System.out.println("[" + e + "] ");
		        //El else debe estar afuera del if
		    }else {
		        //En vez de in debe ser out
		        System.out.println(e + " ");
		    }
	    }
	    //Cerrar el scanner
	    sc.close();
	}
}
