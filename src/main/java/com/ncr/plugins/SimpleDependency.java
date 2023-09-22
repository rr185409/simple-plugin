package com.ncr.plugins;

import org.gradle.api.artifacts.Dependency;

public class SimpleDependency implements Dependency {

	@Override
	public void because(String arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contentEquals(Dependency arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Dependency copy() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getGroup() {
		// TODO Auto-generated method stub
		return "com.ncr.Tools";
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Forms";
	}

	@Override
	public String getReason() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getVersion() {
		// TODO Auto-generated method stub
		return "1.1.0";
	}

}
