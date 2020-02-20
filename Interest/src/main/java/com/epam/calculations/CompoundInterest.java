package com.epam.calculations;
import java.lang.Math;
public class CompoundInterest {
	private Double compoundInterestTotal;;
	private Data compoundInterestData;
	public CompoundInterest(Data compoundInterestData) {
		this.compoundInterestTotal = new Double(0);
		this.compoundInterestData=compoundInterestData;
	}
	public void calculateCompoundInterest()
	{
		this.compoundInterestTotal=(this.compoundInterestData.getPrincipleAmount()*(Math.pow(1+this.compoundInterestData.getRateOfInterest()/100,this.compoundInterestData.getTimeRequiredToPay())));
	}
	public Double getCompoundInterestTotal()
	{
		return this.compoundInterestTotal;
	}
}
