package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DoFile {

	public static void save(String file, String content, boolean add)
			throws IOException {

		FileWriter fw = new FileWriter(file, add);

		fw.write(content);
		fw.close();
	}
/*
	public static String carregar(String arquivo) throws FileNotFoundException, IOException {

		File file = new File(arquivo);

		if (!file.exists()) {
			return null;
		}

		BufferedReader br = new BufferedReader(new FileReader(arquivo));
		StringBuffer bufSaida = new StringBuffer();

		String linha;
		while ((linha = br.readLine()) != null) {
			bufSaida.append(linha + "\n");
		}
		br.close();
		return bufSaida.toString();
	}
	*/
	public static String[] read(String filename) throws IOException {
		BufferedReader inputStream = new BufferedReader(new FileReader(filename));
		List<String> fileList = new ArrayList<String>();
		String[] sample = null;
		String l;
		while ((l = inputStream.readLine()) != null) {
			sample = l.split(" ");
			for (int x = 0; x < sample.length; x++) {
				fileList.add(sample[x]);
			}
		}
		inputStream.close();
		return fileList.toArray(new String[fileList.size()]);
	}
}
