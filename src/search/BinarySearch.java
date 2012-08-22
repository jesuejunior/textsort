package search;

public class BinarySearch {
	public synchronized static int search(String[] list, String word, int fator) {
		int left = 0;
		int right = list.length - 1;
		int middle = 0;

		while (left <= right) {
			middle = left + ((right - left) / 2);
			if (word.equals(list[middle])) {
				if (middle == 0 || middle == list.length - 1) {
					return middle;
				}
				if (word.equals(list[middle + fator])) {
					if (fator < 0) {
						right = middle + fator;
					} else {
						left = middle + fator;
					}

				} else {
					return middle;
				}
			} else if (word.compareTo(list[middle]) < 0) {
				right = middle - 1;
			} else {
				left = middle + 1;
			}
		}
		return -1;
		// result = Collections.binarySearch(list, word);
		// Integer qtde = Collections.frequency(list, word);

		// int qtde = 0;
		// if (qtde >= 0)
		// if (qtde == 1) {
		// System.out.printf("A palavra [%s] aparece apenas uma vez \n",word);
		// } else
		// System.out.printf("A palavra [%s] aparece [%d] vezes \n", word,
		// qtde);
		// else
		// System.out.printf("Palavra não existe!\n", result);
	}

	public static int qtdElementos(String[] words, String word) {
		int maior = search(words, word, 1);
		int menor = 0;
		if (maior > -1) {
			menor = search(words, word, -1);
			return maior - menor + 1;
		}

		return 0;

	}
}
