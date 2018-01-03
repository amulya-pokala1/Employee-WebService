package com.assignment;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style=Style.RPC) 

public interface PersonService {
	Person getRecord(int id);
	boolean createRecord(int id,String name);
	boolean deleteRecord(int id);
	boolean updateRecord(int id,String name);
	Person[] getAllPersons();
}
