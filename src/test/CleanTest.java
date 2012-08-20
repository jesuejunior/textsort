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
		
		assertEquals(resultadoEsperado, h.clean("jesué júnior"));
		
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
