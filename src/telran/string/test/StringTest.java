package telran.string.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StringTest {
    

	@Test
	@DisplayName("TEST OF THE METHOD CONCAT")
	void concatTest() {
		
		String word = "Hello";
		
		assertEquals("Hello World!!!", word.concat(" World").concat("!!!"));
		assertEquals("Hello", word.concat(""));
		assertEquals("Hello", "".concat(word));
		assertEquals("", "".concat(""));
	}
	
	@Test
	@DisplayName("TEST OF THE METHOD CONTAINS")
	void containsTest() {
		
		String word = "Hello";
		
		assertTrue(word.contains("ell"));
		assertFalse(word.contains("elo"));
		assertTrue(word.contains("He"));
		assertFalse(word.contains("he"));
	}
	
	@Test
	@DisplayName("TEST OF THE METHOD COMPARE_TO")
	void compareToTest() {
		
		assertEquals(6, "7".compareTo("123456"));
		assertEquals(-1, "12345".compareTo("12346"));
		assertEquals(2, "12345699".compareTo("123456"));
		assertEquals(0, "Telran".compareTo("Telran"));
		assertEquals('T'-'t', "Telran".compareTo("telran"));
		assertTrue("telran".compareTo("Telran")> 0);
		
	}
	
	@Test
	@DisplayName("TEST OF THE METHOD COMPARE_TO_IGNORE_CASE")
	void compareToIgnoreCaseTest() {
		
		assertEquals(6, "7".compareToIgnoreCase("123456"));
		assertEquals(-1, "12345".compareToIgnoreCase("12346"));
		assertEquals(2, "12345699".compareToIgnoreCase("123456"));
		assertEquals(0, "Telran".compareToIgnoreCase("TelRan"));
		assertEquals(0, "TELRAN".compareToIgnoreCase("TelRan"));
	}
	
	@Test
	@DisplayName("TEST OF THE METHOD START_WITH")
	void startsWithTest() {
		
		String word = "Telran";
		
		assertTrue(word.startsWith("Tel"));
		assertFalse(word.startsWith("tel"));
		assertTrue(word.startsWith(""));
		assertTrue(word.startsWith("Telran"));
	}
	
	@Test
	@DisplayName("TEST OF THE METHOD ENDS_WITH")
	void endsWithTest() {
		
		String word = "Telran";
		
		assertTrue(word.endsWith("an"));
		assertFalse(word.endsWith("Ran"));
		assertTrue(word.endsWith(""));
	}
	
	@Test
	@DisplayName("TEST OF THE METHOD EQUALS_iGNORE_CASE")
	void equalsIgnoreCaseTest() {
		
		String word = "Telran";
		
		assertTrue(word.equalsIgnoreCase("tElraN"));
		assertFalse(word.equalsIgnoreCase("telrann"));
		assertFalse(word.equalsIgnoreCase(null));
	}
	
	@Test
	@DisplayName("TEST OF THE METHOD INDEX_OF (STRING)")
	void indexOfTest() {
		
		String word = "Telran";
		
		assertEquals(0, word.indexOf("Te"));
		assertEquals(2, word.indexOf("lra"));
		assertEquals(4, word.indexOf("an"));
		assertEquals(-1, word.indexOf("NNN"));
		assertEquals(0,word.indexOf(""));
		assertEquals(0,"".indexOf(""));
	}
	
	@Test
	@DisplayName("TEST OF THE METHOD LAST_INDEX_OF (CHAR)")
	void lastIndexOfTest() {
		
		String word = "HHelloo";
		
		assertEquals(1 ,word.lastIndexOf('H'));
		assertEquals(4 ,word.lastIndexOf('l'));
		assertEquals(6 ,word.lastIndexOf('o'));
		assertEquals(-1 ,word.lastIndexOf('Y'));
		assertEquals(word.length() ,word.lastIndexOf(""));
	}
	
}
