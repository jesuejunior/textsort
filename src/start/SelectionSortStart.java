package start;
import sort.SelectionSort;


public class SelectionSortStart {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SelectionSort sortArray=new SelectionSort(10);
		
		System.out.println("Array nao ordenado: ");
		System.out.println(sortArray+"\n");
		
		sortArray.sort();
		
		System.out.println("Array ordenado");
		System.out.println(sortArray);
	}

}
