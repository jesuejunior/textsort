package search;

import java.util.List;
import java.util.Collections;

public class BinarySearch {
	public synchronized static void search(String[] list, String word) {
		int result = 0;
		int left = 0;
        int right = list.length - 1;
        int middle;
 
        while ( left <= right ) {
                middle = left + ((right - left) / 2);
                if ( word.equals(list[middle])) {
                	break;
                } else if( word.equals(list[middle])) {
                        right = middle - 1;
                } else {
                	left = middle + 1;
                }
        }
		System.out.printf("\nSearching for: %s\n", word);
	//	result = Collections.binarySearch(list, word);
	//	Integer qtde = Collections.frequency(list, word);

		int qtde = 0;
		if (result >= 0)
			if (qtde == 1) {
				System.out.printf("A palavra [%s] aparece apenas uma vez \n",word);
			} else
				System.out.printf("A palavra [%s] aparece [%d] vezes \n", word,	qtde);
		else
			System.out.printf("Palavra não existe!\n", result);
	}
}
//
//public static int buscaBinaria( int[] list, String word )
//{
//        int left = 0;
//        int right = list.length - 1;
//        int middle;
// 
//        while ( left <= right ) {
//                middle = left + ((right - left) / 2);
//                if ( word.equals(list[middle])) {
//                	return middle;
//                } else if( word.equals(list[middle])) {
//                        right = middle - 1;
//                } else {
//                	left = middle + 1;
//                }
//        }
//        return -1;
//}