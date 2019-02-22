package lletresRepetides;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;;

public class Fase2 {

	public static Character getLowerChar(Character c) {
		return Character.toLowerCase(c);
	}
	
	public static void main(String[] args) {
		List<Character> name = new ArrayList<>(Arrays.asList('J','i','n','s','o','0','O','n'));
		
		for (Character c : name) {
			if (Character.isDigit(c))
				System.out.println(c + " => Els noms de persones no contenen números!.");
			else if (getLowerChar(c) == 'a' || getLowerChar(c) == 'e' || getLowerChar(c) == 'i'|| getLowerChar(c) == 'o'|| getLowerChar(c) == 'u') 
				System.out.println(c + " => VOCAL");
			else 
				System.out.println(c + " => CONSONTANT");
		}
	}

}