package utils;

public class Helper {
	
	public String clean(String filename){
		
		filename = filename.replace(" ", "").replace(".", "").replace(",", "");
		
		return filename;
		
	}

}