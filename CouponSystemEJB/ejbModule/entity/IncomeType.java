package entity;


public enum IncomeType {
	CUSTOMER_PURCHASE("Customer purchased coupon"),
	COMPANY_NEW_COUPON("Company created new coupons"),
	COMPANY_UPDATE("Company updated coupon");
	
	private String description;
	
	private IncomeType(String description) {
		this.description = description;
	}

	
	public String getDescription() {
		return description;
	}



	
	
}
