package com.epam.calculations;

public class Data {
	private Double principleAmount;
	private Double rateOfInterest;
	private Double timeRequiredToPay;
	public Data()
	{
		this.principleAmount=new Double(0);
		this.rateOfInterest=new Double(0);
		this.timeRequiredToPay=new Double(0);
	}
	public Double getPrincipleAmount() {
		return principleAmount;
	}
	public void setPrincipleAmount(Double principleAmount) {
		this.principleAmount = principleAmount;
	}
	public Double getRateOfInterest() {
		return rateOfInterest;
	}
	public void setRateOfInterest(Double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	public Double getTimeRequiredToPay() {
		return timeRequiredToPay;
	}
	public void setTimeRequiredToPay(Double timeRequiredToPay) {
		this.timeRequiredToPay = timeRequiredToPay;
	}

}
