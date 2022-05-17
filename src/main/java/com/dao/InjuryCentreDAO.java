package com.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.model.InjuryCentre;



@Repository
public interface InjuryCentreDAO {
	public void addInjury(InjuryCentre centre);
	public InjuryCentre findInjury(int id);
	public List<InjuryCentre> findAllInjury();
	public boolean updateInjury(InjuryCentre centre);
	public boolean deleteInjury(int id);
	


}
