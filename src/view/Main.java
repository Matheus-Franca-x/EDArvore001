package view;

import model.matheus.libArvoreInt.ArvoreInt;

public class Main {

	public static void main(String[] args) 
	{
		int[] vet = {30, 15, 60, 40, 80, 20, 10};
		
		
		ArvoreInt arvore = new ArvoreInt();
		
		for (int each : vet)
			arvore.insert(each);
		
		try {
			arvore.prefixSearch();
			System.out.println("\n");
			arvore.infixSearch(); //O que faz ficar na ordem crescente e o Infix
			System.out.println("\n");			
			arvore.postfixSearch();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
