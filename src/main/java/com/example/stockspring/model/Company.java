package com.example.stockspring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Company {
	
	@Id
	@Column(name="company_code")
	private int companyCode;
	public int getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(int companyCode) {
		this.companyCode = companyCode;
	}
	@Column(name="company_Name")
	private String companyName;
	
	@Column(name="turnover")
	private BigDecimal turnOver;
	@Column(name="ceo")
	private String ceoName;
	@Column(name="boardofdirectors")
	private String directorsName;
	//private List<StockExchange> stockExchange;

	@Column(name="breifwriteup")
	private String briefWriteUp;
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public BigDecimal getTurnOver() {
		return turnOver;
	}
	public void setTurnOver(BigDecimal turnOver) {
		this.turnOver = turnOver;
	}
	public String getCeoName() {
		return ceoName;
	}
	public void setCeoName(String ceoName) {
		this.ceoName = ceoName;
	}
	public String getDirectorsName() {
		return directorsName;
	}
	public void setDirectorsName(String directorsName) {
		this.directorsName = directorsName;
	}
	/*public List<StockExchange> getStockExchange() {
		return stockExchange;
	}
	public void setStockExchange(List<StockExchange> stockExchange) {
		this.stockExchange = stockExchange;
	}*/
	
	public String getBriefWriteUp() {
		return briefWriteUp;
	}
	public void setBriefWriteUp(String briefWriteUp) {
		this.briefWriteUp = briefWriteUp;
	}

	@Override
	public String toString() {
		return "Company [companyCode=" + companyCode + ", companyName=" + companyName + ", turnOver=" + turnOver
				+ ", ceoName=" + ceoName + ", directorsName=" + directorsName + ", sectorId=" 
				+ ", briefWriteUp=" + briefWriteUp + ", stockCode=" +  "]";
	}
}
