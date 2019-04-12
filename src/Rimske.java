package sp_better;

/**
 * Zadani: 2004OR17 - Znalostni system pro prevod cisel
 * Modul: Prevodnik z rimskych a na rimske cislice
 * 
 * @author Lubos Hubacek A13B0326P
 * @version 0.2
 * @since 10.4.2015
 */
public class Rimske {
	/**
	 * Prevede desitkove cislo do rimskych cislic
	 * 
	 * @param cislo Vstupni cislo v desitkove soustave
	 * @return Prelozene rimske cislo jako String
	 */
	public static String toRome(int cislo) {
		String res = "";
		
		// klicova pole pro konverzi
	    String stovky[] = new String[]{"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
	    String desitky[] = new String[]{"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
	    String jednotky[] = new String[]{"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

	    // pokud mame cislo > 1000, tak odecitame tisicovku tak dlouho, dokud je cislo > 1000
	    while (cislo >= 1000) {
	        res += "M";
	        cislo -= 1000;
	    }

	    // rad stovek
	    res += stovky[cislo / 100];
	    cislo = cislo % 100;
	    
	    // rad desitek
	    res += desitky[cislo / 10];
	    cislo = cislo % 10;
	    
	    // rad jednotek
	    res += jednotky[cislo];
	    
	    return res;
	}
	

	/**
	 * Prevod rismekho cisla do desitkove soustavy
	 * Princip: hledame co nejvetsi shodu v poli a pokud ji nalezneme, tak pripocteme a pokracujeme dokud nevypotrebujeme vsechny znaky ze vstupu
	 * 
	 * @param cislo Retezec s rimskym cislem
	 * @return Desitkove cislo
	 */
	public static String fromRome(String cislo){
		String prevodnik[] = new String[]{"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
		Integer vahy[] = new Integer[]{	   1,   4,    5,    9,   10,  40,  50,   90,  100, 400,  500,  900, 1000};
		
		int out = 0, index = 0, pripocitano_znaku = 0;
		String tento, dohromady;

		
		// projizdime cislo od leva
		int delka = cislo.length();
		for(int i = 0; i < delka; i++){
			tento = String.valueOf(cislo.charAt(i));
			dohromady = (delka-i != 1) ? tento + String.valueOf(cislo.charAt(i+1)) : "_";
			
			// kontrola vypotrebovanych znaku
			if(pripocitano_znaku == delka){
				break;
			}
			
			// hledame vyskyty v poli
			for(int j = 0; j < 13; j++){
				if(dohromady.equals(prevodnik[j])){
					index = j;
					i += 1;
					continue;
				}
				if(tento.equals(prevodnik[j])){
					index = j;
				}				
			}
			
			// pripocteni hodnot
			pripocitano_znaku += prevodnik[index].length();
			out += vahy[index];
			index = 0;					
		}
		
		return String.valueOf(out);
	}


}