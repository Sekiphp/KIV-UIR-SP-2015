package sp_better;

/**
 * Zadani: 2004OR17 - Znalostni system pro prevod cisel
 * Modul: Spousteci trida
 * 
 * @author Lubos Hubacek A13B0326P
 * @version 0.2
 * @since 17.4.2015
 */
public class Main {
	/**
	 * Spousteci metoda
	 * 
	 * @param args Argumenty prikazove radky - vyzadovany dva (rezim a cislo)
	 * rezim - r (rimske), d (dekadicke), s (slovo) - urcuje jaky typ cisla jsem zadal
	 */
	public static void main(String[] args){
		if(args.length != 2){
			System.out.println("Nespravny pocet parametru!");
			System.exit(-1);
		}
		
		String rezim = args[0];
		String vstup = args[1];
		
		//System.out.println("Prijato:\nRezim: " + rezim + "\nVstup: " + vstup);
		
		// zadal rimske
		if(rezim.equals("r")){
			String cislo1 = Rimske.fromRome(vstup);
			String cislo2 = Slovni.toWord(Integer.valueOf(cislo1));
			
			System.out.println("Dekadicky: " + cislo1);
			System.out.println("Slovne: " + cislo2);
			System.out.println("Rimsky: " + vstup);
		}
		
		// zadal slovni
		if(rezim.equals("s")){
			int cislo1 = Slovni.fromWord(vstup);
			String cislo2 = Rimske.toRome(cislo1);		
			
			System.out.println("Dekadicky: " + cislo1);
			System.out.println("Slovne: " + vstup);
			System.out.println("Rimsky: " + cislo2);
		}
		
		// zadal dekadicke
		if(rezim.equals("d")){			
			System.out.println("Dekadicky: " + vstup);
			System.out.println("Slovne: " + Slovni.toWord(Integer.valueOf(vstup)));
			System.out.println("Rimsky: " + Rimske.toRome(Integer.valueOf(vstup)));			
		}
	}
}
