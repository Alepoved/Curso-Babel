package cmp;

import java.util.Comparator;

import modelo.entidades.Coche;

public class CmpMatricula implements Comparator<Coche> {

	@Override
	public int compare(Coche o1, Coche o2) {
		return o1.getMatricula().compareToIgnoreCase(o2.getMatricula());
	}

}
