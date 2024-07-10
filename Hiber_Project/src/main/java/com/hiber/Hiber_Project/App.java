package com.hiber.Hiber_Project;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.hiber.pojo.Userdetails;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	AnnotationConfiguration an=new AnnotationConfiguration();
    	an.configure("./Resources.hiber.cfg.xml");
    	 SessionFactory sf= an.buildSessionFactory();
         Session ss = sf.openSession();
         Transaction trn= ss.beginTransaction();
        // ss.save(st);
         trn.commit();
    	
         Query qr = ss.createQuery("select us from Userdetails us");
         List<Userdetails> l= qr.list();
         l.stream().forEach(e->
         {
        	System.out.print(e.getU_name()+": ");
        	e.getOrderdetails().stream().forEach(t->
        	System.out.println(t.getProduct_name()+"/ "+t.getPrice()));
         });
    }
 }