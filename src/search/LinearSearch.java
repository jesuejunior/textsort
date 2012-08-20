package search;

import java.util.Collections;
import java.util.List;

public class LinearSearch {

	public static void search(List<String> list, String word) {
		// int qtde = Collections.frequency(list, word);
		int qtde = 0;
		for (int i = 0; i < list.size(); i++)
			if (list.get(i).equals(word)) {
				qtde += 1;
			}

		if (qtde == 1) {
			System.out.printf("A palavra [%s] existe [%d] vez \n", word, qtde);
		} else
			System.out.printf("A palavra [%s] existe [%d] vezes \n", word, qtde);
		// else
		// System.out.printf("Palavra não existe!\n");
	}
}
