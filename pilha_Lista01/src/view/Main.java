package view;
import java.util.ArrayList;
import java.util.Arrays;
import controller.Manipula;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Integer> vet = new ArrayList<>(Arrays.asList(0, 5, 7, -4, 3, 5, -2, -1, 10, 4, 3, -6, 2, -9, 1, -5));

		System.out.println("Tamanho pilha: " + Manipula.manipula(vet));
		
	}

}
