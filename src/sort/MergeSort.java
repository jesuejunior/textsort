package sort;

import java.util.Random;

public class MergeSort {
	
	private int[]data;
	private static final Random generator=new Random();
	
	public MergeSort(int size){
		data=new int[size];
		
		//preenche o array com inteiros aleatorios entre 10 e 99
		for(int i=0; i<size; i++)
			data[i]=10 + generator.nextInt(90);
	}
	
	public void sort()
	{
		sortArray(0, data.length-1);
	}
	

	//divide o array, classifica subarrayus e intercala subarrays no array classificado
	private void sortArray(int low, int high)
	{
		if((high-low)>=1)				//O array tem que ter pelo menos tamanho 1
		{
			int middle1=(low+high)/2;   //calcula o meio do array
			int middle2=middle1+1;      //calcula o proximo elemento
			
			System.out.println("split:");
			System.out.println(subarray(low, high));
			System.out.println(subarray(low, middle1));
			System.out.println(subarray(middle2, high));
			System.out.println();
			
			//divide o array pela metade e classifica cada metade recursivamente!
			sortArray(low, middle1);	//primeira metade do array
			sortArray(middle2, high);	//segunda metade do array
			
			//intercala dois arrays classificados depois que as chamadas de divisao retornam
			merge(low, middle1, middle2, high);
		}
		
	}
	
	private void merge(int left, int middle1, int middle2, int right)
	{
		int leftIndex=left;  	//indice no subarray esquerdo
		int rightIndex=middle2;	//indice no subarray direito
		int combinedIndex=left;	//indice no array temporário funcional
		int[] combined=new int[data.length]; //array funcional
		
		//gera uma saida de dois subarrays antes de mesclars
		System.out.println("merge:");
		System.out.println(subarray(left, middle1));
		System.out.println(subarray(middle2, right));
		
		//intercala arrays ate alcancar o fim de um deles
		while(leftIndex<=middle1 && rightIndex <=right)
		{
			//coloca o menor dos dois elementos atuais no resultado
			//e o move para o proximo espaco nos arrays
			if(data[leftIndex]<=data[rightIndex])
				combined[combinedIndex++]=data[leftIndex++];
			else
				combined[combinedIndex++]=data[rightIndex++];
		}
		
		//se o array esquerdo estiver vazio
		if(leftIndex==middle2)
			//copia o restante do array direito
			while(rightIndex<=right)
				combined[combinedIndex++]=data[rightIndex++];
		else	//o array direito esta vazio
			//copia o restante do array esquerdo
			while(leftIndex<=middle1)
				combined[combinedIndex++]=data[leftIndex++];
		//copia os valores de volta ao array original
		for (int i=left;i<=right;i++)
			data[i]=combined[i];
		
		//gera saida do array intercalado
		System.out.println(subarray(left, right));
		System.out.println();
	}

	/** Metodo para gerar saida de alguns valores do array
	 */
	public String subarray(int low, int high)
	{
		StringBuilder temporary=new StringBuilder();
		//gera espacos para alinhamento
		for(int i=0; i<low; i++)
			temporary.append("   ");
		
		//gera a saida dos elementos que permanecem no array
		for(int i=low; i<=high; i++)
			temporary.append(" "+data[i]);
		return temporary.toString();
	}
	
	//metodo para gerar saida de valores noa array
	public String toString()
	{
		return subarray(0,data.length-1);
	}
}
