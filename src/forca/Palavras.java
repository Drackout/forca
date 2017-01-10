package forca;

public class Palavras {
	//Dicionario
	public static String palavras[] = {
            "one", "tiger", "three", "arroz", "esdruxulo", "yolo", "bacon", "estoiro", "peperoni", "mascote"};

	public static String palavras() {
		
            String palavra = palavras[(int) (Math.random() * palavras.length)];
            
            return palavra;
	}

}