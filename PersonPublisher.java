package com.assignment;

import javax.xml.ws.Endpoint;

public class PersonPublisher {

	public static void main(String[] args) {
		 Endpoint.publish("http://localhost:8897/ws/person", new PersonImplement());  
	}

}