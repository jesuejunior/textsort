package start;
import sort.InsertionSort;

public class InsertionSortStart {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertionSort sortArray=new InsertionSort(10);
		
		System.out.println("Array não ordenado: ");
		System.out.println(sortArray+"\n");
		
		sortArray.sort();
		
		System.out.println("Array ordenado");
		System.out.println(sortArray);
	}


}
