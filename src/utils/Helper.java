package utils;

import java.util.ArrayList;

public class Helper {

	public ArrayList<String> clean(String word) {
		
		String remover = "[!@\\$%&*()-_=+{}\"# ]";
				
		String[] r = word.split(remover);
		ArrayList<String> resultadoFinal = new ArrayList<String>();
		
		for (String a: r){
			if (!a.isEmpty() && !a.trim().isEmpty()){
				resultadoFinal.add(a);
			}
		}

		return resultadoFinal;
	}

}
