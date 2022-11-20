package entities;

public class Individual extends TaxPayer {
       private Double healthExpenditures;
       
    public Individual() {
    	
    }
    
	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}
	

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		double taxsalary=0;
		if(getAnualIncome()<20000) {
			taxsalary=(getAnualIncome()*15)/100;
		}
		else {
			taxsalary=(getAnualIncome()*25)/100;
		}
		
		return taxsalary-((getHealthExpenditures()*50)/100);
	}
	@Override
	public String toString() {
		return getName()+": $ "+String.format("%.2f",tax());
	}
	   
   
}
