package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.model.RequestAction;
import java.util.List;

@Service
public class RequestActionService {
	
	@Autowired
	RequestActionDAO requestactionDAOImpl;
	public void addRequest(RequestAction action) 
	{
		requestactionDAOImpl.addRequest(action);
	}
	public RequestAction findAction(int id)
	{
		return requestactionDAOImpl.findRequest(id);
		
	}
	public List<RequestAction> findAllAction() 
	{
		return requestactionDAOImpl.findAllRequest();
	}
	public boolean updateAction(RequestAction action) 
	{
		return requestactionDAOImpl.updateRequest(action);
	}
	public boolean deleteAction(int id) {
		return requestactionDAOImpl.deleteRequest(id);
	}

}