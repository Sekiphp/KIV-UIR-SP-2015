package sp_better;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Zadani: 2004OR17 - Znalostni system pro prevod cisel
 * Modul: JUnit test - prevod z textu na dekadickou
 * 
 * @author Lubos Hubacek A13B0326P
 * @since 17.5.2015
 * @version 0.1
 */
public class TestFromWord {
	@Test
	public void test1() {
		assertEquals(1, Slovni.fromWord("jedna"));
	}
	@Test
	public void test2() {
		assertEquals(0, Slovni.fromWord("nula"));
	}
	@Test
	public void test3() {
		assertEquals(1000000000, Slovni.fromWord("miliarda"));
	}
	@Test
	public void test4() {
		assertEquals(5, Slovni.fromWord("pìt"));
	}
	@Test
	public void test5() {
		assertEquals(10, Slovni.fromWord("deset"));
	}
	@Test
	public void test6() {
		assertEquals(12, Slovni.fromWord("dvanáct"));
	}
	@Test
	public void test7() {
		assertEquals(20, Slovni.fromWord("dvacet"));
	}
	@Test
	public void test8() {
		assertEquals(31, Slovni.fromWord("tøicet jedna"));
	}
	@Test
	public void test9() {
		assertEquals(68, Slovni.fromWord("šedesát osm"));
	}
	@Test
	public void test10() {
		assertEquals(50, Slovni.fromWord("padesát"));
	}
	@Test
	public void test11() {
		assertEquals(100, Slovni.fromWord("sto"));
	}
	@Test
	public void test12() {
		assertEquals(200, Slovni.fromWord("dvì stì"));
	}
	@Test
	public void test13() {
		assertEquals(517, Slovni.fromWord("pìt set sedmnáct"));
	}
	@Test
	public void test14() {
		assertEquals(608, Slovni.fromWord("šest set osm"));
	}
	@Test
	public void test15() {
		assertEquals(999, Slovni.fromWord("devìt set devadesát devìt"));
	}
	@Test
	public void test16() {
		assertEquals(1000, Slovni.fromWord("tisíc"));
	}
	@Test
	public void test17() {
		assertEquals(3000, Slovni.fromWord("tøi tisíce"));
	}
	@Test
	public void test18() {
		assertEquals(5010, Slovni.fromWord("pìt tisíc deset"));
	}
	@Test
	public void test19() {
		assertEquals(5808, Slovni.fromWord("pìt tisíc osm set osm"));
	}
	@Test
	public void test20() {
		assertEquals(9999, Slovni.fromWord("devìt tisíc devìt set devadesát devìt"));
	}
	@Test
	public void test21() {
		assertEquals(10005, Slovni.fromWord("deset tisíc pìt"));
	}
	@Test
	public void test22() {
		assertEquals(17025, Slovni.fromWord("sedmnáct tisíc dvacet pìt"));
	}
	@Test
	public void test23() {
		assertEquals(85470, Slovni.fromWord("osmdesát pìt tisíc ètyøi sta sedmdesát"));
	}
	@Test
	public void test24() {
		assertEquals(99999, Slovni.fromWord("devadesát devìt tisíc devìt set devadesát devìt"));
	}
	@Test
	public void test25() {
		assertEquals(100000, Slovni.fromWord("sto tisíc"));
	}
	@Test
	public void test26() {
		assertEquals(205000, Slovni.fromWord("dvì stì pìt tisíc"));
	}
	@Test
	public void test27() {
		assertEquals(985017, Slovni.fromWord("devìt set osmdesát pìt tisíc sedmnáct"));
	}
	@Test
	public void test28() {
		assertEquals(917017, Slovni.fromWord("devìt set sedmnáct tisíc sedmnáct"));
	}
	@Test
	public void test29() {
		assertEquals(999999, Slovni.fromWord("devìt set devadesát devìt tisíc devìt set devadesát devìt"));
	}
}
