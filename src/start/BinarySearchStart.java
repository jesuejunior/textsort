package start;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import search.BinarySearch;
import sort.MergeSort;
import utils.DoFile;


public class BinarySearchStart {
	public static void main(String[] args) throws IOException {
		MergeSort sort = new MergeSort();
		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
		String[] listFile = DoFile.read("files/arquivo_40M.txt");
		String[] list = listFile;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite a palavra: ");
		String word = input.nextLine();
		
		list = sort.mergeSort(list); // Ordenamos o Array, pois é obrigatorio para a busca binaria funcionar
		long start = System.currentTimeMillis(); //Adicionando a contagem de tempo ao inicio da busca
		Date now = new Date(start);
		System.out.println("Inicio: " + format.format(now));
		
		int qtde = BinarySearch.qtdElementos(list, word);
		
		long end = System.currentTimeMillis(); //Adicionando a contagem de tempo ao fim da busca.
		now = new Date(end);
		System.out.println("Qtde de [" + word +  "] encontrados:" + qtde);
		System.out.println("Fim: " + format.format(now));
		System.out.println("Tempo gasto em segundos: " + ((end - start) / 1000)	+ " s");
		System.out.println("Tempo gasto em milisegundos: " + (end - start)	+ " ms");
		
	}
}
