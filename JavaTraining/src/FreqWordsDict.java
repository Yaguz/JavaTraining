import java.io.*;
import java.util.*;

public class FreqWordsDict {
	String path;
	private Map<Character, Integer> dict = new HashMap<Character, Integer>();
	public ArrayList<Map.Entry<Character, Integer>> dictSort;
	
	public FreqWordsDict(String path) {
		this.path = path;
	}

	public void fillDict() {
		try { 
			FileReader fr = new FileReader(path);
			
			int c;
			Character cc;
			while((c = fr.read()) != -1) {
				cc = (char)c;
				cc = Character.toLowerCase(cc);
				
				if(!(cc >= 'а' && cc <= 'я')) {continue;}
				
				Integer x = dict.get(Character.valueOf(cc));
				dict.put(Character.valueOf(cc), 
						(x == null ? Integer.valueOf(1) : Integer.valueOf(++x)));
				
			}
			fr.close();
			
			// надо упорядочить мапу
			dictSort = new ArrayList<>(dict.entrySet());
			dictSort.sort((x1, x2) -> Integer.compare(x2.getValue(), x1.getValue()));
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	
	
	/*
	private File getFile() {
		try(File f = new File(path)){
			return f;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	*/
	
	
}
