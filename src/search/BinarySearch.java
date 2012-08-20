package search;

import java.util.List;
import java.util.Collections;

public class BinarySearch {
	public static void search(List<String> list, String word) {
		int result = 0;

		System.out.printf("\nSearching for: %s\n", word);
		result = Collections.binarySearch(list, word);
		Integer qtde = Collections.frequency(list, word);

		if (result >= 0)
			if (qtde == 1) {
				System.out.printf("A palavra [%s] aparece apenas uma vez \n",word);
			} else
				System.out.printf("A palavra [%s] aparece [%d] vezes \n", word,	qtde);
		else
			System.out.printf("Palavra não existe!\n", result);
	}
}