package com.model;

import java.util.TreeSet;

public final class Global {
	final private static TreeSet<String> userList=new TreeSet<>();
	
	public static synchronized boolean add(String user) {
		if(userList.add(user)) {
			return true;
		}
		return false;		
	}
	
	public static synchronized boolean remove(String user) {
		if(userList.remove(user)) {
			return true;
		}
		return false;
	}
	
	
	public static int size() {
		return userList.size();
	}
}
