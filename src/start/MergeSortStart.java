package start;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import sort.MergeSort;
import utils.DoFile;
import utils.Helper;

public class MergeSortStart {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
		Helper help = new Helper();
		String[] lista = DoFile.read("arquivo.txt");

		MergeSort sort = new MergeSort();
		long start = System.currentTimeMillis();
		Date now = new Date(start);
		System.out.println("Inicio: " + format.format(now));
		String[] fileSorted = sort.mergeSort(lista);

		System.out.println("QTDE de palavras: " + fileSorted.length);
		for (int i = 0; i < fileSorted.length; i++) {
			fileSorted[i].trim();

			DoFile.save("out.txt", help.clean(fileSorted[i]) + "\n", true);
		}
		long end = System.currentTimeMillis();
		now = new Date(end);
		System.out.println("Fim: " + format.format(now));
		System.out.println("Tempo gasto em segundos: " + ((end - start) / 1000)	+ " s");
		System.out.println("Tempo gasto em milisegundos: " + (end - start)	+ " ms");
	}

}
