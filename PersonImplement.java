package com.assignment;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.jws.WebService;
@WebService(endpointInterface="com.assignment.PersonService")
public class PersonImplement implements PersonService{

private static HashMap<Integer,Person> hm = new HashMap<Integer,Person>();
	@Override
	public boolean deleteRecord(int id) {
		if(hm.get(id) == null) return false;
		hm.remove(id);
		return true;
	}

	@Override
	public Person getRecord(int id) {
		return hm.get(id);
	}

	@Override
	public Person[] getAllPersons() {
		Set<Integer> idset = hm.keySet();
		Person[] p = new Person[idset.size()];
		int i=0;
		for(Integer id : idset){
			p[i] = hm.get(id);
			i++;
		}
		return p;
	}

	@Override
	public boolean createRecord(int id,String name) {
		// TODO Auto-generated method stub
		Person p=new Person();
		p.setId(id);
		p.setName(name);
		hm.put(id, p);
		return true;
	}

	@Override
	public boolean updateRecord(int id,String name) {
		// TODO Auto-generated method stub
		Person p=hm.get(id);
		p.setName(name);
		
		return false;
	}

}
	


