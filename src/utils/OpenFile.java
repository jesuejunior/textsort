package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class OpenFile {

	public static void salvar(String arquivo, String conteudo, boolean adicionar)
			throws IOException {

		FileWriter fw = new FileWriter(arquivo, adicionar);

		fw.write(conteudo);
		fw.close();
	}

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
}
