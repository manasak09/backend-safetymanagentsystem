package com.dao;

import java.util.List;

import com.model.InjuryCentre;
import com.model.Reports;

public interface ReportsDAO {
	public void addReports(Reports report);
	public Reports findReports(int id);
	public List<Reports> findAllReports();
	public boolean updateReports(Reports reports);
	public boolean deleteReports(int id);


}
