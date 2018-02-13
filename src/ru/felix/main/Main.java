
package ru.felix.main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import javassist.bytecode.Descriptor.Iterator;
import ru.felix.connection.ConnectionDb;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:META-INF/spring/app-context.xml");
		ctx.refresh();
		
		ConnectionDb connDb = ctx.getBean("connDb", ConnectionDb.class);
		System.out.println("this is end of program, YAPPPYYYYYY!!!!!!!! " + connDb.toString());
		List a = (List) connDb.query(null, null);
		for (java.util.Iterator i = a.iterator() ; i.hasNext();) {
			System.out.println(i.next());
		}
	}

}
