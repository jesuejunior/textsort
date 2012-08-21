package sort;


public class SelectionSort {

	public String[] selectionSort(String[] list) {
		for (int count = 1; count < list.length; count++) {
			// Procura pelo primeiro elemento
			int index = count - 1;
			for (int j = count; j < list.length; j++) {
				if (list[j].compareTo(list[index]) < 0) {
					index = j;
				}
			}

			// swap com o menor valor i-1
			String temp = list[count - 1];
			list[count - 1] = list[index];
			list[index] = temp;

		}
		return list;
	}
}