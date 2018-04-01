package com.in28minutes.spring.basics.springin5steps.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SomeCdiBusiness {
	
	@Inject
	SomeCdiDAO someCDIDAO;

	public SomeCdiDAO getSomeCdiDAO() {
		return someCDIDAO;
	}

	public void setSomeCdiDAO(SomeCdiDAO someCDIDAO) {
		this.someCDIDAO = someCDIDAO;
	}
	
	
}
