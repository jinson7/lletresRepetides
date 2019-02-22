package lletresRepetides;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Fase4 {
	
	public static void printList(String nameList, List<Character> list) {
		System.out.print(nameList + ": ['" + list.get(0) + "'");
		for (int i=1; i<list.size(); ++i) 
			System.out.print(",'" + list.get(i)+ "'");
		System.out.println("]");
	}

	public static void main(String[] args) {
		List<Character> name = new ArrayList<>(Arrays.asList('J','i','n','s','o','0','o','n'));
		List<Character> surname = new ArrayList<>(Arrays.asList('P','a','r','d','o','0'));
		List<Character> fullName = new ArrayList<>();
		for (Character c : name) fullName.add(c);
		for (Character c : surname) fullName.add(c);
		printList("Name", name);
		printList("Surname", surname);
		printList("FullName", fullName);
	}
}
