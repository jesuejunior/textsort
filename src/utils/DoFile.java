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

	public static String[] read(String filename) throws IOException {
		BufferedReader inputStream = new BufferedReader(
				new FileReader(filename));
		List<String> fileList = new ArrayList<String>();
		String[] sample = null;
		String l;
		while ((l = inputStream.readLine()) != null) {
			fileList.addAll(new Helper().clean(l));
		}
		inputStream.close();
		return fileList.toArray(new String[fileList.size()]);
	}
}
