package Generics;

import java.util.Comparator;

public class carSpeedComparator implements Comparator<car> {

	@Override
	public int compare(car tcar, car ocar) {
		// TODO Auto-generated method stub
		return ocar.speed - tcar.speed;
	}
	
}
