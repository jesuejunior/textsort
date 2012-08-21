package sort;


public class InsertionSort {
	
	public String[] insertionSort(String[] list){
        String temp="";
        for(int i=0;i<list.length;i++){
            for(int j=i+1;j<list.length;j++){
               if(list[i].compareToIgnoreCase(list[j])>0){
                   temp = list[i];
                   list[i]=list[j];
                   list[j]=temp;
               }
            }
        }
        return list;
    }
}
