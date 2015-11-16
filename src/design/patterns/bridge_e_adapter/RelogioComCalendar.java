package design.patterns.bridge_e_adapter;

import java.util.Calendar;

public class RelogioComCalendar implements Relogio {

	@Override
	public Calendar dataAtual() {
		return Calendar.getInstance();
	}
	
}
