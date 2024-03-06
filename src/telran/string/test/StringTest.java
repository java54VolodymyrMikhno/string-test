package telran.string.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StringTest {
    
	String hello = "Hello";
	String word1 = "abc";
	String word2 = "ABC";
	
	@Test
	@DisplayName("TEST OF THE METHOD CONCAT")
	void concatTest() {
		assertEquals("Hello World!!!", hello.concat(" World").concat("!!!"));
	}
	
	@Test
	@DisplayName("TEST OF THE METHOD CONTAINS")
	void containsTest() {
		assertTrue(hello.contains("ell"));
		assertFalse(hello.contains("elo"));
	}
	
	@Test
	@DisplayName("TEST OF THE METHOD COMPARE_TO")
	void compareToTest() {
		assertTrue(word1.compareTo(word2) > 0);
	}
	
	@Test
	@DisplayName("TEST OF THE METHOD COMPARE_TO_IGNORE_CASE")
	void compareToIgnoreCaseTest() {
		assertTrue(word1.compareToIgnoreCase(word2) == 0);
	}
	
	@Test
	@DisplayName("TEST OF THE METHOD START_WITH")
	void startsWithTest() {
		assertTrue(hello.startsWith("Hel"));
		assertFalse(hello.startsWith("el"));
		assertTrue(hello.startsWith("Hello",0));
	}
	
	@Test
	@DisplayName("TEST OF THE METHOD ENDS_WITH")
	void endsWithTest() {
		assertTrue(hello.endsWith("llo"));
		assertTrue(hello.endsWith("o"));
		assertFalse(hello.endsWith("el"));
	}
	
	@Test
	@DisplayName("TEST OF THE METHOD EQUALS_iGNORE_CASE")
	void equalsIgnoreCaseTest() {
		assertTrue(word1.equalsIgnoreCase("ABC"));
	}
	
	@Test
	@DisplayName("TEST OF THE METHOD INDEX_OF (STRING)")
	void indexOfTest() {
		assertTrue((word1 +" "+ hello +" "+ word1).indexOf("abc") == 0);
	}
	@Test
	@DisplayName("TEST OF THE METHOD LAST_INDEX_OF (CHAR)")
	void lastIndexOfTest() {
		assertTrue(hello .lastIndexOf("l") == 3);
	}
	
}