package lletresRepetides;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Fase3 {

	public static void main(String[] args) {
		List<Character> name = new ArrayList<>(Arrays.asList('J','i','n','s','o','0','o','n'));		
		LinkedHashMap<Character, Integer> numLleteres = new LinkedHashMap<>();
		for (int i = 0; i < name.size(); ++i) {
			Character c = name.get(i);
			numLleteres.put(c, numLleteres.containsKey(c) ? numLleteres.get(c) + 1 : 1);
		}
		for (Map.Entry<Character, Integer> entry : numLleteres.entrySet())
		    System.out.println(entry.getKey() + " => " + entry.getValue());
	}
}
