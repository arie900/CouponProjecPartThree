package mdb;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.EJB;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import entity.Income;
import entity.IncomeService;

@MessageDriven(activationConfig={
		   @ActivationConfigProperty(propertyName="destinationType",
		                             propertyValue="javax.jms.Queue"),
		   @ActivationConfigProperty(propertyName="destination", 
		                             propertyValue="queue/Income-Queue")})
public class IncomeConsumerBean implements MessageListener {
	@EJB
	private IncomeService bean;
	
	
	public void onMessage(Message msg) {
		ObjectMessage om=(ObjectMessage)msg;
		Income income;
		try {
			income = (Income)om.getObject();
			bean.storeIncome(income);
		} catch (JMSException e) {
			e.printStackTrace();
		}
		

	}

}
