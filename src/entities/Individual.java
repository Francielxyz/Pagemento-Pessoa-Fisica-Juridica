package entities;

public class Individual extends TaxPayer {

	private Double healtheExpenditures;
	
	public Individual() {
		
	}
	
	public Individual(String name, Double anualIncome, Double healtheExpenditures) {
		super(name, anualIncome);
		this.healtheExpenditures = healtheExpenditures;
	}

	public Double getHealtheExpenditures() {
		return healtheExpenditures;
	}

	public void setHealtheExpenditures(Double healtheExpenditures) {
		this.healtheExpenditures = healtheExpenditures;
	}

	@Override
	public double tax() {
		/*
		if(getAnualIncome() < 20000.0) {
			basicTax = getAnualIncome() * 0.15;
		}
		else {
			basicTax = getAnualIncome() * 0.25;
		}*/
		
		//Realiza o IF de cima (? = então).
		double basicTax = (getAnualIncome() < 20000.0) ? getAnualIncome() * 0.15 : getAnualIncome() * 0.25;
		
		basicTax -= getHealtheExpenditures() * 0.5;
		
		if (basicTax < 0.0) {
			basicTax = 0.0;
		};
		
		return basicTax;
	}

}
