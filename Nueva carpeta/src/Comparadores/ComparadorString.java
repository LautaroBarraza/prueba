package Comparadores;

import java.util.Comparator;

public class ComparadorString implements Comparator<String>{

	public ComparadorString() {
	}

	@Override
	public int compare(String s1, String s2) {
		return s1.compareTo(s2);
	}

}
