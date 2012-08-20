package start;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import search.LinearSearch;
import utils.DoFile;

public class LinearSearchStart {

	public static void main(String[] args) throws IOException {
		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
		String[] listFile = DoFile.read("arquivo.txt");
		List<String> list = new ArrayList<String>(Arrays.asList(listFile));

		Scanner input = new Scanner(System.in);
		System.out.print("Digite a palavra: ");
		String word = input.nextLine();
		
		long start = System.currentTimeMillis(); //Adicionando a contagem de tempo ao inicio da busca
		Date now = new Date(start);
		System.out.println("Inicio: " + format.format(now));
		
		LinearSearch.search(list, word);
		
		long end = System.currentTimeMillis(); //Adicionando a contagem de tempo ao fim da busca.
		now = new Date(end);
		System.out.println("Fim: " + format.format(now));
		System.out.println("Tempo gasto em segundos: " + ((end - start) / 1000)	+ " s");
		System.out.println("Tempo gasto em milisegundos: " + (end - start)	+ " ms");

	}

}
