package sp_better;

import java.text.DecimalFormat;
import java.util.Arrays;

/**
 * Zadani: 2004OR17 - Znalostni system pro prevod cisel
 * Modul: Prevodnik ZE SLOV a NA SLOVA
 * 
 * @author Lubos Hubacek A13B0326P
 * @since 16.5.2015
 * @version 0.4
 */
public class Slovni {
	/**
	 * Ostatni cisla lze ziskat kombinacemi cisel v tecto polich
	 */
	/** Cisla do dvaceti */
	private static String[] do_dvaceti = new String[]{"", "jedna", "dva", "tøi", "ètyøi", "pìt", "šest", "sedm", "osm", "devìt", "deset", "jedenáct", "dvanáct", "tøináct", "ètrnáct", "patnáct", "šestnáct", "sedmnáct", "osmnáct", "devatenáct", "dvacet"};
	/** Jednotky */
	private static String[] jednotky = new String[]{"jedna", "dva", "tøi", "ètyøi", "pìt", "šest", "sedm", "osm", "devìt"};	
	/** Destiky */
	private static String[] desitky = new String[]{"", "deset", "dvacet", "tøicet", "ètyøicet", "padesát", "šedesát", "sedmdesát", "osmdesát", "devadesát"};
	/** Stovky */
	private static String[] stovky = new String[]{"", "sto", "dvì stì", "tøi sta", "ètyøi sta", "pìt set", "šest set", "sedm set", "osm set", "devìt set"};
	
	/**
	 * Prevede int cislo na retezcove cislo
	 * 
	 * @param cislo Cislo v desitkove soustave
	 * @return Textove vyjadreni
	 */
	public static String toWord(int cislo){
		String ret = "";		
		
		// vyjimky
		if(cislo == 0) return "nula";
		if(cislo == 1000000000) return "miliarda";
		
		// prevedeme na devitimistny format - chybejici pozice zaplnime nulami
		String mask = "000000000";
	    DecimalFormat df = new DecimalFormat(mask);
	    String sNumber = df.format((long)cislo);
		
	    // rozparsovani po trojicich cifer
	    int prvniTri = Integer.valueOf(sNumber.substring(0, 3));
	    int druheTri = Integer.valueOf(sNumber.substring(3, 6));
	    int tretiTri = Integer.valueOf(sNumber.substring(6, 9));
		
	    // konverzni sub-algoritmy	
		ret += konvertujNaSlova(prvniTri, 'M');
		ret += konvertujNaSlova(druheTri, 'T');
		ret += konvertujDoTisice(tretiTri);
		
		return ret.trim().replaceAll(" +", " ");
	}
	
	/**
	 * Prevede stovky na cislovku
	 * 
	 * @param stovek Pøíklady pøíchozích hodnot: osm set, devìt set, ...
	 * @return Pocet stovek
	 */
	private static int parsujStovky(String sta){
		 int ret = 0;
		 
		 for(int i = 1; i < stovky.length; i++){
			 if(sta.equals(stovky[i])){
				 //System.out.println(i + "ýkvls" + stovky[i]);
				 ret = i * 100;
				 break;
			 }
		 }
		 
		 //System.out.println("ret=" + ret);
		 return ret;
	}

	/**
	 * Prevede tisice na cislovku
	 * 
	 * @param stovek Pøíklady pøíchozích hodnot: tisíc, pìt tisíc, ...
	 * @return Tisice
	 */
	private static int parsujTisice(String tisicu){
		//System.out.println("tis: " + tisicu);
		 int ret = 0;
		 int bylTu = 0;
		 
		 if(tisicu.equals("tisíc"))
			 return 1000;
		 
		 // 2 - 20 tisíc
		 String[] parts = tisicu.split(" ");
		 for(int i = 0; i < do_dvaceti.length; i++){
			 if(parts[parts.length -2].equals(do_dvaceti[i])){
				 //System.out.println("tu"+i + ": " + do_dvaceti[i]);
				 ret = i * 1000;
				 bylTu = 1;
				 
				 if(parts.length == 2) return ret;
			 }
		 }
		 
		 // desitky tisicu
		 if(ret < 10000 && (parts.length != 2 && !Arrays.asList(new String[]{"sto", "stì", "sta", "set"}).contains(parts[0]))){
			 for(int i = 0; i < desitky.length; i++){
				 if(parts[parts.length - 3].equals(desitky[i])){
					 ret += (i) * 10000;
					 //System.out.println("tu2: "+ret);
					 break;
				 }
			 }	
		 }
		 
		 // stovky tisicu
		 if(parts.length != 1){
			 String hledej = (!Arrays.asList(new String[]{"tisíc", "tisíce"}).contains(parts[1])) ? parts[0] + " " + parts[1] : parts[0];
			 for(int i = 0; i < stovky.length; i++){
				 //System.out.println("f" + hledej);
				 if(hledej.equals(stovky[i])){ 
					 //System.out.println("nope");
					 ret += i * 100000;
				 }
			 }
		 }
		 
		 // zbyle tisice
		 if(bylTu == 0){
			 for(int i = 0; i < jednotky.length; i++){
				 if(parts[parts.length - 2].equals(jednotky[i])){
					 //System.out.println("h=" + (i+1));
					 ret += (i+1) * 1000;
				 }
			 }			 
		 }
		 
		 return ret;
	}
	
	/**
	 * Prevede zbyle jednotky a desitky na dekadicke cislo
	 * 
	 * @param jednotkyDesitky Pocet
	 * @return Dekadicke cislo
	 */
	private static int parsujJednotky(String jednotkyDesitky){
		//System.out.println("jednotky: " + jednotkyDesitky);
		int ret = 0;		
		String[] parts = jednotkyDesitky.split(" ");
		
		// desitky do dvaceti
		if(parts.length == 1){
			for(int i = 0; i < do_dvaceti.length; i++){
				if(parts[0].equals(do_dvaceti[i])){
					ret = i;
				}
			}	
		}
		
		if(parts.length == 1 && ret != 0) return ret; // pokud je to vsechno
		
		// desitky nad dvacet
		for(int i = 0; i < desitky.length; i++){
			if(parts[0].equals(desitky[i])){
				ret += i * 10;
			}
		}	
		
		// zbyle jednotky
		if(parts.length > 1){
			for(int i = 0; i < jednotky.length; i++){
				if(parts[1].equals(jednotky[i])){
					ret += i + 1;
				}
			}
		}
		
		return ret;
	}
	
	/**
	 * Metoda pro prevod paneho cisla na dekadicke cislo - vola dalsi metody
	 * 
	 * @param slova Verbalne vyjadrene slovo
	 * @return Ekvivalentni dekadicke cislo
	 */
	public static int fromWord(String slova){
		//System.out.println("=== " + slova + " ===");
		int ret = 0;
		
		// vyjimky
		if(slova.equalsIgnoreCase("miliarda"))
			return 1000000000;
		if(slova.equalsIgnoreCase("nula"))
			return 0;
		
		String[] parts = slova.split(" ");
		int count = parts.length;
		
		String stovecky = "";
		String tisicovky = "";
		int budouTisice = 0;
		
		for(int i = 0; i < count; i++){
			if(Arrays.asList(new String[]{"tisíc", "tisíce"}).contains(parts[i])){
				budouTisice = 1;
			}
		}
		
		for(int i = count-1; i >= 0; i--){

			// hledame miliony
			/*
			if(Arrays.asList(new String[]{"milion", "miliony", "milionù"}).contains(parts[i])){
				
				for(int j = 0; j < count; j++){
					if(Arrays.asList(new String[]{"milion", "miliony", "milionù"}).contains(parts[count - 1 - j])) break;
					
					doMilionu += parts[count - 1 - j] + " ";
				}
				pom += "M";
				System.out.print("M");
				
			}
			*/
			
			// hledame tisice
			if(Arrays.asList(new String[]{"tisíc", "tisíce"}).contains(parts[i])){
				for(int j = 0; j < count; j++){
					tisicovky += parts[j] + " ";
					
					if(Arrays.asList(new String[]{"tisíc", "tisíce"}).contains(parts[j])){
						//budouTisice = 1;
						ret += parsujTisice(tisicovky.trim());
						break;
					}
				}
			}
			
			// hledame sta
			if(Arrays.asList(new String[]{"sto", "stì", "sta", "set"}).contains(parts[i])){
				int bylyTisice = 0;
				for(int j = 0; j < count; j++){
					if(Arrays.asList(new String[]{"tisíc", "tisíce"}).contains(parts[j])){
						bylyTisice = 1;
						continue;
					}
					
					if(bylyTisice == 1){
						stovecky += parts[j] + " ";
						//System.out.println("byly tisíce " + parts[j] );
						
						if(Arrays.asList(new String[]{"sto", "stì", "sta", "set"}).contains(parts[j])){
							//System.out.println("s " + stovecky);
							ret += parsujStovky(stovecky.trim());
							break;
						}
						continue;
					}
					if(budouTisice == 0){
						//System.out.println("budou T " + parts[j] );
						stovecky += parts[j] + " ";
					}
					
					if(Arrays.asList(new String[]{"sto", "stì", "sta", "set"}).contains(parts[j])){
						//System.out.println("S: " + stovecky);
						ret += parsujStovky(stovecky.trim());
						//System.out.println(parsujStovky(stovecky.trim()));
						break;
					}
				}
				
			}
		}
		
		// vycistime retezec od jiz vypoctenych hodnot
		if(!stovecky.equals(""))
			slova = slova.replace(stovecky, " ");
		if(!tisicovky.equals("")){
			slova = slova.replace(tisicovky.trim(), " ");
		}

		// zbyva rad ejdnotek a desitek
		ret += parsujJednotky(slova.trim());

		
		//System.out.println("ret= " + ret + "\n=== END ===");
		return ret;
	}
	

	
	/**
	 * Prevede dany rad do psane formy
	 * 
	 * @param number Rad na tri mista
	 * @param prepinac Vyber radu (hodnoty: M - miliony, T - tisice)
	 * @return Slovni vyjadreni
	 */
	private static String konvertujNaSlova(int number, char prepinac){
		String[] vyrazy = new String[3];
		if(number == 0) return "";	// skip dalsiho pocitani pokud je dany rad zcela prazdny	
		String pom = "";

		// vyber popisku za rad
		if(prepinac == 'M'){
			vyrazy[0] = "milion";
			vyrazy[1] = " miliony ";
			vyrazy[2] = " milionù ";
		}
		else if(prepinac == 'T'){
			vyrazy[0] = "tisíc";
			vyrazy[1] = " tisíce ";
			vyrazy[2] = " tisíc ";	
		}
			
		// algoritmu na vypocet
		if(number > 20){
			// 1 misto - nejvic vlevo
			pom = stovky[number / 100] + " "; 
			number %= 100;
			
			// 2 misto - stred
			if(number > 20){
				pom += desitky[number/10] + " ";
				number %= 10;
			}
			
			// 3 misto - nejvic vpravo
			pom += do_dvaceti[number] + vyrazy[2];	
		}
		else{
			if(number % 100 == 1) return vyrazy[0];

			// cisla od jedne do dvaceti
			pom = do_dvaceti[number % 100];
			if(number % 100 >= 2 && number % 100 <= 4) pom += vyrazy[1];
			else pom += vyrazy[2];
		}
		
		return pom;
	}
	
	/**
	 * Prevede cislo mensi nez tisic na slovni vyjadreni
	 * 
	 * @param number Vstupni cislo 1 - 999
	 * @return Slovni vyjadreni
	 */
	private static String konvertujDoTisice(int number) {
		String pom;

		if(number > 20){
			// stovky
			pom = stovky[number / 100] + " "; 
			number %= 100;
			
			// desitky
			if(number > 20){
				pom += desitky[number/10] + " ";
				number %= 10;
			}
			
			// jednotky
			pom += do_dvaceti[number];	
		}
		else{
			// cisla do dvaceti
			pom = do_dvaceti[number % 100];
		    number /= 100;
		}

		return pom.trim();
	}

	
}