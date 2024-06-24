import java.io.*;
import java.util.*;

public class FreqWordsDict {
	String path;
	public Map<Character, Integer> dict = new HashMap<Character, Integer>();
	
	public FreqWordsDict(String path) {
		this.path = path;
	}

	public void fillDict() {
		try { 
			FileReader fr = new FileReader(path);
			
			int c;
			while((c = fr.read()) != -1) {
				Integer x = dict.get((char) c);
				dict.put(Character.valueOf((char)c), 
						(x.equals(null) ? Integer.valueOf(1) : Integer.valueOf(++x)));
//				dict.put((char) c, Integer.valueOf(++x));
				
			}
			fr.close();
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
