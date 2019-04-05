package cmp;

import java.util.Comparator;

import org.springframework.stereotype.Component;

import modelo.entidades.Coche;

@Component
public class CmpKm implements Comparator<Coche> {

	@Override
	public int compare(Coche arg0, Coche arg1) {
		return (int) (arg0.getKm() - arg1.getKm());
	}

}
