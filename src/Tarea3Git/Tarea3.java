package Tarea3Git;
//20/11/2024
import java.util.Random;
public class Tarea3 {

	public static void main(String[] args) {
		        Random rand = new Random();
		        
		        for (int i = 0; i < 20; i++) {
		            int numeroAleatorio = rand.nextInt(10) + 1; 
		            System.out.println(numeroAleatorio);
		        }
	}
}