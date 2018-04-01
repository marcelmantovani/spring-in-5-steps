package com.in28minutes.spring.basics.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class ComponentScanDAO {

	@Autowired
	ComponentScanConnection componentscanConnection;

	public ComponentScanConnection getComponentscanConnection() {
		return componentscanConnection;
	}

	public void setJdbcConnection(ComponentScanConnection jdbcConnection) {
		this.componentscanConnection = jdbcConnection;
	}
}
