package com.dao;

import org.springframework.stereotype.Repository;
import java.util.List;
import com.model.RequestAction;


@Repository
public interface RequestActionDAO {
	public void addRequest(RequestAction action);
	public RequestAction findRequest(int id);
	public List<RequestAction> findAllRequest();
	public boolean updateRequest(RequestAction action);
	public boolean deleteRequest(int id);

}
