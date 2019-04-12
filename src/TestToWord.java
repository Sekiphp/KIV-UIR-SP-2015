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
		assertEquals("tøi", Slovni.toWord(3));
	}
	@Test
	public void test5() {
		assertEquals("pìt", Slovni.toWord(5));
	}	
	@Test
	public void test6() {
		assertEquals("ètrnáct", Slovni.toWord(14));
	}
	@Test
	public void test7() {
		assertEquals("sedmnáct", Slovni.toWord(17));
	}
	@Test
	public void test8() {
		assertEquals("dvacet", Slovni.toWord(20));
	}
	@Test
	public void test9() {
		assertEquals("tøicet dva", Slovni.toWord(32));
	}
	@Test
	public void test10() {
		assertEquals("osmdesát devìt", Slovni.toWord(89));
	}
	@Test
	public void test11() {
		assertEquals("osmdesát", Slovni.toWord(80));
	}
	@Test
	public void test12() {
		assertEquals("sto", Slovni.toWord(100));
	}
	@Test
	public void test13() {
		assertEquals("dvì stì dvacet dva", Slovni.toWord(222));
	}
	@Test
	public void test14() {
		assertEquals("osm set ètyøi", Slovni.toWord(804));
	}
	@Test
	public void test15() {
		assertEquals("devìt set devatenáct", Slovni.toWord(919));
	}
	@Test
	public void test16() {
		assertEquals("sedm set dvacet", Slovni.toWord(720));
	}
	@Test
	public void test17() {
		assertEquals("tøi sta devìt", Slovni.toWord(309));
	}
	@Test
	public void test18() {
		assertEquals("devìt set devadesát devìt", Slovni.toWord(999));
	}
	@Test
	public void test19() {
		//assertEquals("nula", Slovni.toWord(000));
	}
	@Test
	public void test20() {
		assertEquals("tisíc", Slovni.toWord(1000));
	}
	@Test
	public void test21() {
		assertEquals("dva tisíce", Slovni.toWord(2000));
	}
	@Test
	public void test22() {
		assertEquals("pìt tisíc", Slovni.toWord(5000));
	}
	@Test
	public void test23() {
		assertEquals("deset tisíc", Slovni.toWord(10000));
	}
	@Test
	public void test24() {
		assertEquals("jedenáct tisíc osm", Slovni.toWord(11008));
	}
	@Test
	public void test25() {
		assertEquals("osmnáct tisíc devìt set dvacet sedm", Slovni.toWord(18927));
	}
	@Test
	public void test26() {
		assertEquals("dvacet tisíc osm set jedna", Slovni.toWord(20801));
	}
	@Test
	public void test27() {
		assertEquals("sedmdesát sedm tisíc sto", Slovni.toWord(77100));
	}
	@Test
	public void test28() {
		assertEquals("devìt set sedm tisíc sto", Slovni.toWord(907100));
	}
	@Test
	public void test29() {
		assertEquals("dvacet pìt tisíc osm set sedmdesát devìt", Slovni.toWord(25879));
	}
	@Test
	public void test30() {
		assertEquals("devìt set devadesát devìt tisíc devìt set devadesát devìt", Slovni.toWord(999999));
	}
	@Test
	public void test31() {
		assertEquals("miliarda", Slovni.toWord(1000000000));
	}
	@Test
	public void test32() {
		assertEquals("devìt set osmdesát sedm milionù", Slovni.toWord(987000000));
	}
	@Test
	public void test33() {
		assertEquals("devìt set devadesát devìt milionù devìt set devadesát devìt tisíc devìt set devadesát devìt", Slovni.toWord(999999999));
	}
	@Test
	public void test34() {
		assertEquals("deset milionù dva tisíce", Slovni.toWord(10002000));
	}
	@Test
	public void test35() {
		assertEquals("devatenáct milionù sto", Slovni.toWord(19000100));
	}
	@Test
	public void test36() {
		assertEquals("sedm set dva milionù devìt set sedmdesát ètyøi tisíc dvacet ètyøi", Slovni.toWord(702974024));
	}
	
	@Test
	public void test37() {
		assertEquals("dvì stì dvacet dva milionù dvì stì dvacet dva tisíc dvì stì dvacet dva", Slovni.toWord(222222222));
	}
	@Test
	public void test38() {
		assertEquals("tøi sta pìt milionù sedmnáct tisíc", Slovni.toWord(305017000));
	}
}