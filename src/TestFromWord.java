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
		assertEquals(5, Slovni.fromWord("p�t"));
	}
	@Test
	public void test5() {
		assertEquals(10, Slovni.fromWord("deset"));
	}
	@Test
	public void test6() {
		assertEquals(12, Slovni.fromWord("dvan�ct"));
	}
	@Test
	public void test7() {
		assertEquals(20, Slovni.fromWord("dvacet"));
	}
	@Test
	public void test8() {
		assertEquals(31, Slovni.fromWord("t�icet jedna"));
	}
	@Test
	public void test9() {
		assertEquals(68, Slovni.fromWord("�edes�t osm"));
	}
	@Test
	public void test10() {
		assertEquals(50, Slovni.fromWord("pades�t"));
	}
	@Test
	public void test11() {
		assertEquals(100, Slovni.fromWord("sto"));
	}
	@Test
	public void test12() {
		assertEquals(200, Slovni.fromWord("dv� st�"));
	}
	@Test
	public void test13() {
		assertEquals(517, Slovni.fromWord("p�t set sedmn�ct"));
	}
	@Test
	public void test14() {
		assertEquals(608, Slovni.fromWord("�est set osm"));
	}
	@Test
	public void test15() {
		assertEquals(999, Slovni.fromWord("dev�t set devades�t dev�t"));
	}
	@Test
	public void test16() {
		assertEquals(1000, Slovni.fromWord("tis�c"));
	}
	@Test
	public void test17() {
		assertEquals(3000, Slovni.fromWord("t�i tis�ce"));
	}
	@Test
	public void test18() {
		assertEquals(5010, Slovni.fromWord("p�t tis�c deset"));
	}
	@Test
	public void test19() {
		assertEquals(5808, Slovni.fromWord("p�t tis�c osm set osm"));
	}
	@Test
	public void test20() {
		assertEquals(9999, Slovni.fromWord("dev�t tis�c dev�t set devades�t dev�t"));
	}
	@Test
	public void test21() {
		assertEquals(10005, Slovni.fromWord("deset tis�c p�t"));
	}
	@Test
	public void test22() {
		assertEquals(17025, Slovni.fromWord("sedmn�ct tis�c dvacet p�t"));
	}
	@Test
	public void test23() {
		assertEquals(85470, Slovni.fromWord("osmdes�t p�t tis�c �ty�i sta sedmdes�t"));
	}
	@Test
	public void test24() {
		assertEquals(99999, Slovni.fromWord("devades�t dev�t tis�c dev�t set devades�t dev�t"));
	}
	@Test
	public void test25() {
		assertEquals(100000, Slovni.fromWord("sto tis�c"));
	}
	@Test
	public void test26() {
		assertEquals(205000, Slovni.fromWord("dv� st� p�t tis�c"));
	}
	@Test
	public void test27() {
		assertEquals(985017, Slovni.fromWord("dev�t set osmdes�t p�t tis�c sedmn�ct"));
	}
	@Test
	public void test28() {
		assertEquals(917017, Slovni.fromWord("dev�t set sedmn�ct tis�c sedmn�ct"));
	}
	@Test
	public void test29() {
		assertEquals(999999, Slovni.fromWord("dev�t set devades�t dev�t tis�c dev�t set devades�t dev�t"));
	}
}
