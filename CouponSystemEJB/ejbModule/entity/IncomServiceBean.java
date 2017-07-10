package entity;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
@Stateless(name="IncomeManager")
public class IncomServiceBean implements IncomeService {
	
	@PersistenceContext(unitName="couponSystem")
	private EntityManager manager;

	
	
	
	public void storeIncome(Income income) {
		manager.persist(income);
		
	}

	public List<Income> viewAllIncome() {
		Query query=manager.createQuery("SELECT e FROM Income e");
		return query.getResultList();
	}

	public List<Income> viewIncomeByCustomer(String customerName) {
		Query query=manager.createQuery("SELECT i FROM Income AS i WHERE i.name=?1");
		query.setParameter(1, customerName);
		return query.getResultList();
	}

	public List<Income> viewIncomeByCompany(String companyName) {
		Query query=manager.createQuery("SELECT i FROM Income AS i WHERE i.name=?1");
		query.setParameter(1, companyName);
		return query.getResultList();
	}

}
