package start;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import sort.InsertionSort;
import utils.DoFile;

public class InsertionSortStart {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
		String[] lista = DoFile.read("arquivo_1M.txt");

		InsertionSort sort = new InsertionSort();
		long start = System.currentTimeMillis();
		Date now = new Date(start);
		System.out.println("Inicio: " + format.format(now));
		String[] fileSorted = sort.insertionSort(lista);

		System.out.println("QTDE de palavras: " + fileSorted.length);
		long end = System.currentTimeMillis();
		now = new Date(end);
		System.out.println("Fim: " + format.format(now));
		System.out.println("Tempo gasto em segundos: " + ((end - start) / 1000)	+ " s");
		System.out.println("Tempo gasto em milisegundos: " + (end - start) + " ms");

		for (int i = 0; i < fileSorted.length; i++) {

			DoFile.save("out_InsertionSort.txt", fileSorted[i] + "\n", true);
		}
	}

}
