package sp_better;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Zadani: 2004OR17 - Znalostni system pro prevod cisel
 * Modul: JUnit test - prevod z dekadickych na rimska
 * 
 * @author Lubos Hubacek A13B0326P
 * @since 16.5.2015
 * @version 0.1
 */
public class TestToRome {
	@Test
	public void testToRome1() {
		assertEquals("I", Rimske.toRome(1));
	}
	@Test
	public void testToRome2() {
		assertEquals("III", Rimske.toRome(3));
	}
	@Test
	public void testToRome3() {
		assertEquals("IV", Rimske.toRome(4));
	}
	@Test
	public void testToRome4() {
		assertEquals("VI", Rimske.toRome(6));
	}
	@Test
	public void testToRome5() {
		assertEquals("X", Rimske.toRome(10));
	}
	@Test
	public void testToRome6() {
		assertEquals("XIX", Rimske.toRome(19));
	}
	@Test
	public void testToRome7() {
		assertEquals("MMXV", Rimske.toRome(2015));
	}
	@Test
	public void testToRome8() {
		assertEquals("XCIX", Rimske.toRome(99));
	}
	@Test
	public void testToRome9() {
		assertEquals("MCMXCVI", Rimske.toRome(1996));
	}
	@Test
	public void testToRome10() {
		assertEquals("XCI", Rimske.toRome(91));
	}
	@Test
	public void testToRome11() {
		assertEquals("CDXCII", Rimske.toRome(492));
	}
	@Test
	public void testToRome12() {
		assertEquals("D", Rimske.toRome(500));
	}
	@Test
	public void testToRome13() {
		assertEquals("DXIX", Rimske.toRome(519));
	}
	@Test
	public void testToRome14() {
		assertEquals("MMM", Rimske.toRome(3000));
	}
	@Test
	public void testToRome15() {
		assertEquals("MMDXCIV", Rimske.toRome(2594));
	}
	@Test
	public void testToRome16() {
		assertEquals("MMMCM", Rimske.toRome(3900));
	}
	

}
