package utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {
	SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
	Date nowl;
	
	public long start() {
		long startl = System.currentTimeMillis(); //Adicionando a contagem de tempo ao inicio da busca
		Date nowl = new Date(startl);
		return startl;
	}
	
	public void finish(long startl){
		long endl = System.currentTimeMillis(); //Adicionando a contagem de tempo ao fim da busca.
		nowl = new Date(endl);
		System.out.println("Inicio: " + format.format(startl));
		System.out.println("Fim: " + format.format(endl));
		System.out.println("Tempo gasto em segundos: " + ((endl - startl) / 1000)	+ " s");
		System.out.println("Tempo gasto em milisegundos: " + (endl - startl)	+ " ms");
	}

}
