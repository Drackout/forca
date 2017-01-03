package forca;

import java.util.Random;

public class main {

	public static void main(String[] args) {
		System.out.println("Jogo da forca");
		
		Random gerador = new Random();
		
		String[] nomes = new String[]{ "um", "dois", "tres", "coisa", 
				"etc", "yolo", "bananas", "repolhos", "manteiga", "olicos" };
		
		
		int val = gerador.nextInt(10);
		
		
		System.out.println(nomes[val]);
		
		
		
		
		
		
		
		

	}

}
