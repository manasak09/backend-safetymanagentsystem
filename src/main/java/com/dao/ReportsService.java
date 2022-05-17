package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.InjuryCentre;
import com.model.Reports;

@Service
public class ReportsService {
	@Autowired
	ReportsDAO reportsdaoimpl;
	public void addReports(Reports report) {
		reportsdaoimpl.addReports(report);
	}
	public Reports findReports(int id) {
		return reportsdaoimpl.findReports(id);
		
	}
	public List<Reports> findAllReports(){
		return reportsdaoimpl.findAllReports();
	}
	public boolean updateReports(Reports reports) {
		return reportsdaoimpl.updateReports(reports);
	}
	public boolean deleteReports(int id) {
		return reportsdaoimpl.deleteReports(id);
	}

}
