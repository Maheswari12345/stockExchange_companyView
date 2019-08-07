package com.example.stockspring.dao;

import java.sql.SQLException;
import java.util.List;

import com.example.stockspring.model.Company;

public interface CompanyDao {
	public int insert(Company c) throws Exception;

	public List<Company> getCompanyList() throws Exception;
	public int updateCompanyList(Company c) throws Exception;

}
