package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;
@Entity
@XmlRootElement
public class Income implements Serializable {
	private long id;
	private String name;
	private Date date;
	private IncomeType description;
	private double amount;
	
	
	
	
	@Id
	@GeneratedValue
	@Column(name="ID")
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name="NAME")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(name="DATE")
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Column(name="DESCRIPTION")
	public IncomeType getDescription() {
		return description;
	}
	public void setDescription(IncomeType description) {
		this.description = description;
	}
	@Column(name="AMOUNT")
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Income [id=" + id + ", name=" + name + ", date=" + date + ", description=" + description + ", amount="
				+ amount + "]";
	}
	

	
}
