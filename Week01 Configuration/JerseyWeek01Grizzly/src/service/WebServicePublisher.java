package service;

import java.net.URI;

import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

public class WebServicePublisher {
	private static final String BASE_URI= "http://localhost:8080/JerseyWeek01Grizzly/";
	
	public static void main(String[] args) {
		
		ResourceConfig rc= new ResourceConfig().register(MessageService.class);
		GrizzlyHttpServerFactory.createHttpServer(URI.create(BASE_URI),rc);
		System.out.println("Webservice is runnig");
	}
}

//main metotunda Grizzly ile Webservice publish edecegiz. ilgili adres �zerinde
//resource config yard�m� ile register edecegiz (paket seviyesinde veya class seviyesinde)