package Comparadores;

import java.util.Comparator;

public class ComparadorInteger implements Comparator<Integer>{

	public ComparadorInteger() {
	}

	@Override
	public int compare(Integer i1, Integer i2) {
		return i1.compareTo(i2);
	}

}
