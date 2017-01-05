package forca;

public class Palavras {

	public String palavras() {
		String palavras[] = {
                "one", "tiger", "three", "arroz", "esdruxulo", "yolo", "bacon", "estoiro", "peperoni", "mascote"};
            String palavra = palavras[(int) (Math.random() * palavras.length)];
            
            return palavra;
	}

}