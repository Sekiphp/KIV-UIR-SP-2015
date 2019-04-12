package sp_better;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Zadani: 2004OR17 - Znalostni system pro prevod cisel
 * Modul: JUnit test - prevod z rimskych na dekadicka
 * 
 * @author Lubos Hubacek A13B0326P
 * @since 16.5.2015
 * @version 0.1
 */
public class TestFromRome {

	@Test
	public void testFromRome0() {	
		assertEquals("14", Rimske.fromRome("XIV"));
	}
	
	@Test
	public void testFromRome1() {	
		assertEquals("1", Rimske.fromRome("I"));
	}
	@Test
	public void testFromRome2() {		
		assertEquals("2", Rimske.fromRome("II"));
	}
	@Test
	public void testFromRome3() {
		assertEquals("3", Rimske.fromRome("III"));
	}
	@Test
	public void testFromRome4() {		
		assertEquals("8", Rimske.fromRome("VIII"));
	}
	@Test
	public void testFromRome5() {		
		assertEquals("10", Rimske.fromRome("X"));
	}
	@Test
	public void testFromRome6() {		
		assertEquals("30", Rimske.fromRome("XXX"));
	}
	@Test
	public void testFromRome7() {	
		assertEquals("22", Rimske.fromRome("XXII"));
	}
	@Test
	public void testFromRome8() {		
		assertEquals("1900", Rimske.fromRome("MCM"));
	}
	@Test
	public void testFromRome9() {		
		assertEquals("36", Rimske.fromRome("XXXVI"));
	}
	@Test
	public void testFromRome10() {		
		assertEquals("91", Rimske.fromRome("XCI"));
	}
	@Test
	public void testFromRome11() {		
		assertEquals("1996", Rimske.fromRome("MCMXCVI"));
	}
	@Test
	public void testFromRome12() {	
		assertEquals("2012", Rimske.fromRome("MMXII"));
	}
	@Test
	public void testFromRome13() {	
		assertEquals("2015", Rimske.fromRome("MMXV"));
	}
	@Test
	public void testFromRome14() {	
		assertEquals("99", Rimske.fromRome("XCIX"));
	}
	@Test
	public void testFromRome15() {	
		assertEquals("1800", Rimske.fromRome("MDCCC"));
	}
	@Test
	public void testFromRome16() {	
		assertEquals("85", Rimske.fromRome("LXXXV"));
	}
	@Test
	public void testFromRome17() {	
		assertEquals("62", Rimske.fromRome("LXII"));
	}
	@Test
	public void testFromRome18() {
		assertEquals("1903", Rimske.fromRome("MCMIII"));
	}
	@Test
	public void testFromRome19() {	
		assertEquals("2064", Rimske.fromRome("MMLXIV"));
	}
	@Test
	public void testFromRome20() {	
		assertEquals("3000", Rimske.fromRome("MMM"));
	}
	@Test
	public void testFromRome21() {
		assertEquals("890", Rimske.fromRome("DCCCXC"));
	}
	@Test
	public void testFromRome22() {
		assertEquals("1227", Rimske.fromRome("MCCXXVII"));
	}

}
