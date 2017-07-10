package entity;

import java.util.List;

import javax.ejb.Local;

@Local
public interface IncomeService {

	public void storeIncome(Income income);
	
	public List<Income> viewAllIncome();
	
	public List<Income> viewIncomeByCustomer(String customerName);
	
	public List<Income> viewIncomeByCompany(String companyName);
}
