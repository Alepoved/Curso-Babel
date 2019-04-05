package cmp;

import java.util.Comparator;

import org.springframework.stereotype.Component;

import modelo.entidades.Coche;

@Component
public class CmpMarca implements Comparator<Coche> {

	@Override
	public int compare(Coche o1, Coche o2) {
		return o1.getMarca().compareToIgnoreCase(o2.getMarca());
	}

}
