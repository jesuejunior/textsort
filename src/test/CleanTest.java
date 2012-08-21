package test;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;
import utils.Helper;

public class CleanTest {

	@Test
	public void cleanWord() {
		Helper h = new Helper();
		ArrayList<String> resultadoEsperado = new ArrayList<String>();
		resultadoEsperado.add("jesue");
		resultadoEsperado.add("junior");

		assertEquals("@", resultadoEsperado, h.clean("jesue@junior"));
		assertEquals("!", resultadoEsperado, h.clean("jesue!junior"));
		assertEquals("#", resultadoEsperado, h.clean("jesue#junior"));
		assertEquals("*", resultadoEsperado, h.clean("jesue*junior"));
		assertEquals("&", resultadoEsperado, h.clean("jesue&junior"));
		assertEquals("%", resultadoEsperado, h.clean("jesue%junior"));
		assertEquals("+", resultadoEsperado, h.clean("jesue+junior"));
		assertEquals("=", resultadoEsperado, h.clean("jesue=junior"));
		assertEquals("\"", resultadoEsperado, h.clean("jesue\"junior"));
		assertEquals(resultadoEsperado, h.clean("jesue junior"));

	}

	@Test
	public void retiraAcentos() {
		Helper h = new Helper();
		ArrayList<String> resultadoEsperado = new ArrayList<String>();
		resultadoEsperado.add("jesue");
		resultadoEsperado.add("junior");

		ArrayList<String> esperado = new ArrayList<String>();
		esperado.add("aeiou");
		esperado.add("aeiou");
		esperado.add("aoc");

		ArrayList<String> acentos = new ArrayList<String>();
		acentos.addAll(h.clean("àèìòù"));
		acentos.addAll(h.clean("áéíóú"));
		acentos.addAll(h.clean("ãõç"));

		assertEquals(esperado, acentos);

	}

	@Test
	public void retiraEmBranco() {
		Helper h = new Helper();
		ArrayList<String> resultadoEsperado = new ArrayList<String>();
		resultadoEsperado.add("jesue");
		resultadoEsperado.add("junior");

		assertEquals(resultadoEsperado, h.clean("jesue\"junior#"));
		assertEquals(resultadoEsperado, h.clean("jesue\"junior#  "));
		assertEquals(resultadoEsperado, h.clean("jesue\"junior#  $  "));
	}

}
