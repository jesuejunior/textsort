package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class CompareTest {

	@Test
	public void test() {
		assertEquals(0, "e".compareTo("é"));
	}

}
