package forca;

import java.util.Random;

public class Palavras {

		private String[] nomes = new String[]{ "um", "dois", "tres", "coisa", 
				"etc", "yolo", "bananas", "repolhos", "manteiga", "olicos" };

		Random gerador = new Random();
		
		
		public Palavras(){
			int val = gerador.nextInt(10);
			System.out.println(nomes[val]);
		}
		
		
		public String[] getNomes() {
			return nomes;
		}


}
