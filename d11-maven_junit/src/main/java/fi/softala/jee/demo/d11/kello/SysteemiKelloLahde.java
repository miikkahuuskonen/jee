package fi.softala.jee.demo.d11.kello;

import java.util.Date;

public class SysteemiKelloLahde implements KelloLahde {
	
	public Date haeAjanhetki() {
		return new Date(System.currentTimeMillis());
	}

}
