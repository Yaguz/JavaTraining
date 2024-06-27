import java.util.*;

public class Program {

	public static void main(String[] args) {
		FreqWordsDict dw = new FreqWordsDict("C:/Yury/Test.txt");
		dw.fillDict();
		for(Map.Entry<Character, Integer> c: dw.dictSort) {
			System.out.printf("%s \t\t %d \n", c.getKey(), c.getValue());
		}
		
	}

}
