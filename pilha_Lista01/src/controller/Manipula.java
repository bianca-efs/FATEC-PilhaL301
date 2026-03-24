package controller;
import util.pilha;
import java.util.ArrayList;

public class Manipula {

	public static int manipula (ArrayList <Integer> vet) {
		
		pilha p = new pilha ();
		
		for (int i : vet) {
			if(i >= 0) {
				p.push(i);
			} else if (p.tamanho() >= 2){ 
				int a = p.pop() + p.pop();
				p.push(i);
				p.push(a);
			}
		}
		
		return p.tamanho();	
	}
	
}
