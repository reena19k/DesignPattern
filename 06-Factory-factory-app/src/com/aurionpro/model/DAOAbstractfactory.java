package com.aurionpro.model;

public interface DAOAbstractfactory {
	IDao create(String type);
}
