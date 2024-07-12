package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.akki.Product;

public class Manager1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		AnnotationConfiguration acf= new AnnotationConfiguration();
		acf.configure("Resource/hibernate.cfg.xml");
		SessionFactory sf=acf.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction trn= ss.beginTransaction();
		
		Product pd= new Product();
		pd.setId(2021);
		pd.setName("Malabar beedi");
		pd.setQty(20);
		
		ss.save(pd);
		trn.commit();
		
		

	}

}
