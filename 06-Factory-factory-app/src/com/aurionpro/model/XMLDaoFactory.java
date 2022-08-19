package com.aurionpro.model;

public class XMLDaoFactory implements DAOAbstractfactory {

	@Override
	public IDao create(String type) {
		if(type.equalsIgnoreCase("emp")) {
			return new XMLEmpdao();
		}
		if(type.equalsIgnoreCase("dept")) {
			return new XMLDeptDao();
		}
		return null;

}
}
