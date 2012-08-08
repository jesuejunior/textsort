package start;
import sort.MergeSort;


public class MergeSortStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeSort sortArray=new MergeSort(0);
		
		System.out.println("Array nao ordenado: ");
		System.out.println(sortArray+"\n");
		
		sortArray.sort();
		
		System.out.println("Array ordenado");
		System.out.println(sortArray);
	}


}
