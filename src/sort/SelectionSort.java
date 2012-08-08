package sort;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {
	
	private int[]data;
	private static final Random generator=new Random();
	
	public SelectionSort(int size){
		data=new int[size];
		
		//preenche o array com inteiros aleatorios entre 10 e 99
		for(int i=0; i<size; i++)
			data[i]=10 + generator.nextInt(90);
	}
	
	public void sort()
	{
		int smallest;
		
		for(int i=0; i<data.length; i++)
		{
			smallest=i;
			//faz um loop para localizar o indice do menor elemento
			for(int index=i+1; index<data.length; index++)
				if (data[index]<data[smallest])
					smallest=index;
			
			swap(i,smallest); //troca o menor elemento na posicao
			printPass(i+1, smallest); //passagem de saida para o algoritmo
		}
	}
	
	/** metodo auxiliar para trocar valores entre dois elementos */
	public void swap(int first, int second){
		int temporary=data[first];
		data[first]=data[second];
		data[second]=temporary;
	}
	
	/** imprime uma iteracao do algoritmo de "sort" */
	public void printPass(int pass, int index){
		System.out.println(String.format("depois da passagem %2d:", pass));
		
		//saida de elementos ate o item selecionado
		for(int i=0; i<index; i++)
			System.out.print(data[i]+" ");
		
		System.out.print(data[index]+"*"); //indica a troca
		
		//termina de gerar a saida do array
		for(int i=index+1; i<data.length; i++)
			System.out.print(data[i]+" ");
		
		System.out.print("\n"); //para alinhamento
		
		//indica a quantidade do array que e classificado
		for(int j=0;j<pass;j++)
			System.out.print("-- ");
		System.out.println("\n"); //adiciona fim de linha
				
	}
	public String toString()
	{
		return Arrays.toString(data);
	}
}
