package start;

import utils.OpenFile;

public class FileStart {
	
	public static void main(String[] args) {
		try {
		//String texto = "Jesué Junior \n jesuesousa@gmail.com";

		//OpenFile.salvar("arquivo.txt", texto, false);

		String texto = OpenFile.carregar("arquivo.txt");

		System.out.println(texto);

		} catch (Exception e) {
		e.printStackTrace();
		}

		}

}
