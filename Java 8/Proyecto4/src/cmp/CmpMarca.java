package cmp;

import java.util.Comparator;

import modelo.entidades.Coche;

public class CmpMarca implements Comparator<Coche> {

	@Override
	public int compare(Coche o1, Coche o2) {
		return o1.getMarca().compareToIgnoreCase(o2.getMarca());
	}

}
