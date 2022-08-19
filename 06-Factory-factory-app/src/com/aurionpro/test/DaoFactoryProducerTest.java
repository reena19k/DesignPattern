package com.aurionpro.test;

import com.aurionpro.model.DAOAbstractfactory;
import com.aurionpro.model.DaoFactoryProducer;
import com.aurionpro.model.IDao;

public class DaoFactoryProducerTest {

	public static void main(String[] args) {
		DAOAbstractfactory daf = DaoFactoryProducer.getInstance().produce("xml");
		IDao dao = daf.create("emp");
		dao.save();

		DAOAbstractfactory daf1 = DaoFactoryProducer.getInstance().produce("db");
		IDao dao1 = daf1.create("dept");
		dao1.save();
	}
}
