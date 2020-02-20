package com.epam.calculations;

public class SimpleInterest {
	private Double simpleInterestTotal;
	private Data simpleInterestData;
	public SimpleInterest(Data simpleInterestData)
	{
		this.simpleInterestTotal=new Double(0);
		this.simpleInterestData=simpleInterestData;
	}
	public void calculateInterest()
	{
		this.simpleInterestTotal=(this.simpleInterestData.getPrincipleAmount()*this.simpleInterestData.getRateOfInterest()*this.simpleInterestData.getTimeRequiredToPay())/100;
	}
	public Double getSimpleInterestTotal()
	{
		return this.simpleInterestTotal;
	}
}
