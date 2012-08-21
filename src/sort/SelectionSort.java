package sort;


public class SelectionSort {

	public String[] selectionSort(String[] list) {
		for (int index = 1; index < list.length; index++) {
			// Procura pelo primeiro elemento
			int count = index - 1;
			for (int j = index; j < list.length; j++) {
				if (list[j].compareTo(list[count]) < 0) {
					count = j;
				}
			}

			// swap com o menor valor i-1
			String temp = list[index - 1];
			list[index - 1] = list[count];
			list[count] = temp;

		}
		return list;
	}
}