package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.model.InjuryCentre;

@Service
public class InjuryCentreService {
	@Autowired
	InjuryCentreDAO injurycentredaoimpl;
	public void addInjury(InjuryCentre centre) {
		injurycentredaoimpl.addInjury(centre);
	}
	public InjuryCentre findCentre(int id) {
		return injurycentredaoimpl.findInjury(id);
		
	}
	public List<InjuryCentre> findAllCentre() {
		return injurycentredaoimpl.findAllInjury();
	}
	public boolean updateCentre(InjuryCentre centre) {
		return injurycentredaoimpl.updateInjury(centre);
	}
	public boolean deleteCentre(int id) {
		return injurycentredaoimpl.deleteInjury(id);
	}
	
}
