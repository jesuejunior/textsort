package utils;

import java.util.ArrayList;
import java.util.HashMap;

public class Helper {

	private static final HashMap<String, String> MAP_ACENTOS = new HashMap<String, String>();

	static {
		MAP_ACENTOS.put("[áàãâ]", "a");
		MAP_ACENTOS.put("[éèê]", "e");
		MAP_ACENTOS.put("[íìî]", "i");
		MAP_ACENTOS.put("[óòôõº]", "o");
		MAP_ACENTOS.put("[úùû]", "u");
		MAP_ACENTOS.put("ç", "c");
	}
	
	public ArrayList<String> clean(String word) {
		
		String remover = "[\\'\\[\\]\\`!@\\$%&*()-_=+{}\"# ]";
				
		String[] r = word.split(remover);
		ArrayList<String> resultadoFinal = new ArrayList<String>();
		
		for (String a: r){
			if (!a.isEmpty() && !a.trim().isEmpty()){
				resultadoFinal.add(removeAcentos(a.toLowerCase()));
			}
		}

		return resultadoFinal;
	}
	
	private String removeAcentos(String s){
		for (String k: MAP_ACENTOS.keySet()){
			s = s.replaceAll(k, MAP_ACENTOS.get(k));
		}
		return s;
	}
	
}
