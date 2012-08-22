package sort;


public class QuickSort {

	public synchronized String[] quickSort(String list[], int inicio, int fim) {
		int meio = 0;

		if (inicio < fim) {
			meio = partition(list, inicio, fim);
			quickSort(list, inicio, meio);
			quickSort(list, meio+1, fim);
		}
		return list;
	}

	public synchronized int partition(String[] list, int inicio, int end) {
		int top, i;
		String pivo;
		pivo = list[inicio];
		top = inicio;

		for (i = inicio + 1; i <= end; i++) {
			if (list[i].compareTo(pivo) < 0) {
				list[top] = list[i];
				list[i] = list[top + 1];
				top++;
			}
		}
		list[top] = pivo;
		return top;
	}
}