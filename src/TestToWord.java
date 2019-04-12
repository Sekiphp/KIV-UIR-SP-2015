package sp_better;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Zadani: 2004OR17 - Znalostni system pro prevod cisel
 * Modul: JUnit test - prevod z dekadickych na slova
 * 
 * @author Lubos Hubacek A13B0326P
 * @since 16.5.2015
 * @version 0.1
 */
public class TestToWord {

	@Test
	public void test1() {
		assertEquals("nula", Slovni.toWord(0));
	}
	@Test
	public void test2() {
		assertEquals("jedna", Slovni.toWord(1));
	}
	@Test
	public void test3() {
		assertEquals("dva", Slovni.toWord(2));
	}
	@Test
	public void test4() {
		assertEquals("t�i", Slovni.toWord(3));
	}
	@Test
	public void test5() {
		assertEquals("p�t", Slovni.toWord(5));
	}	
	@Test
	public void test6() {
		assertEquals("�trn�ct", Slovni.toWord(14));
	}
	@Test
	public void test7() {
		assertEquals("sedmn�ct", Slovni.toWord(17));
	}
	@Test
	public void test8() {
		assertEquals("dvacet", Slovni.toWord(20));
	}
	@Test
	public void test9() {
		assertEquals("t�icet dva", Slovni.toWord(32));
	}
	@Test
	public void test10() {
		assertEquals("osmdes�t dev�t", Slovni.toWord(89));
	}
	@Test
	public void test11() {
		assertEquals("osmdes�t", Slovni.toWord(80));
	}
	@Test
	public void test12() {
		assertEquals("sto", Slovni.toWord(100));
	}
	@Test
	public void test13() {
		assertEquals("dv� st� dvacet dva", Slovni.toWord(222));
	}
	@Test
	public void test14() {
		assertEquals("osm set �ty�i", Slovni.toWord(804));
	}
	@Test
	public void test15() {
		assertEquals("dev�t set devaten�ct", Slovni.toWord(919));
	}
	@Test
	public void test16() {
		assertEquals("sedm set dvacet", Slovni.toWord(720));
	}
	@Test
	public void test17() {
		assertEquals("t�i sta dev�t", Slovni.toWord(309));
	}
	@Test
	public void test18() {
		assertEquals("dev�t set devades�t dev�t", Slovni.toWord(999));
	}
	@Test
	public void test19() {
		//assertEquals("nula", Slovni.toWord(000));
	}
	@Test
	public void test20() {
		assertEquals("tis�c", Slovni.toWord(1000));
	}
	@Test
	public void test21() {
		assertEquals("dva tis�ce", Slovni.toWord(2000));
	}
	@Test
	public void test22() {
		assertEquals("p�t tis�c", Slovni.toWord(5000));
	}
	@Test
	public void test23() {
		assertEquals("deset tis�c", Slovni.toWord(10000));
	}
	@Test
	public void test24() {
		assertEquals("jeden�ct tis�c osm", Slovni.toWord(11008));
	}
	@Test
	public void test25() {
		assertEquals("osmn�ct tis�c dev�t set dvacet sedm", Slovni.toWord(18927));
	}
	@Test
	public void test26() {
		assertEquals("dvacet tis�c osm set jedna", Slovni.toWord(20801));
	}
	@Test
	public void test27() {
		assertEquals("sedmdes�t sedm tis�c sto", Slovni.toWord(77100));
	}
	@Test
	public void test28() {
		assertEquals("dev�t set sedm tis�c sto", Slovni.toWord(907100));
	}
	@Test
	public void test29() {
		assertEquals("dvacet p�t tis�c osm set sedmdes�t dev�t", Slovni.toWord(25879));
	}
	@Test
	public void test30() {
		assertEquals("dev�t set devades�t dev�t tis�c dev�t set devades�t dev�t", Slovni.toWord(999999));
	}
	@Test
	public void test31() {
		assertEquals("miliarda", Slovni.toWord(1000000000));
	}
	@Test
	public void test32() {
		assertEquals("dev�t set osmdes�t sedm milion�", Slovni.toWord(987000000));
	}
	@Test
	public void test33() {
		assertEquals("dev�t set devades�t dev�t milion� dev�t set devades�t dev�t tis�c dev�t set devades�t dev�t", Slovni.toWord(999999999));
	}
	@Test
	public void test34() {
		assertEquals("deset milion� dva tis�ce", Slovni.toWord(10002000));
	}
	@Test
	public void test35() {
		assertEquals("devaten�ct milion� sto", Slovni.toWord(19000100));
	}
	@Test
	public void test36() {
		assertEquals("sedm set dva milion� dev�t set sedmdes�t �ty�i tis�c dvacet �ty�i", Slovni.toWord(702974024));
	}
	
	@Test
	public void test37() {
		assertEquals("dv� st� dvacet dva milion� dv� st� dvacet dva tis�c dv� st� dvacet dva", Slovni.toWord(222222222));
	}
	@Test
	public void test38() {
		assertEquals("t�i sta p�t milion� sedmn�ct tis�c", Slovni.toWord(305017000));
	}
}