package com.wipro.bank.acc;

abstract class Account {
	int tenure;
	float principal;
	float rateOfInterest;
	public void setInterest(int age,String gender) {
		if (gender.equals("Male") && age<60){
			this.rateOfInterest=9.8f;
		}
		else if (gender.equals("Male") && age>=60){
			this.rateOfInterest=10.5f;
		}
		else if (gender.equals("Female")&& age<58){
			this.rateOfInterest=10.2f;
		}
		else if (gender.equals("Female") && age>=58){
			this.rateOfInterest=10.8f;
		}
	}
	
	public float calculateMaturityAmount(float totalPrincipleDeposited,float maturityInterest) {
		return (totalPrincipleDeposited + maturityInterest);
	}
	
	
	//This is an abstract method used to calculate the interest
	public abstract float calculateInterest(); 
	
	
	//This is an abstract method which return the amount the user has deposited for the given tenure
	public abstract float calculateAmountDeposited(); 
}























