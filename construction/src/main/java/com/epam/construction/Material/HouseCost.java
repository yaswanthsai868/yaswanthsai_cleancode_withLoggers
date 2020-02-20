package com.epam.construction.Material;

public class HouseCost {
	private Double costOfTheHouse;
	private HouseParameters typeOfHouse;
	public HouseCost(HouseParameters typeOfHouse)
	{
		this.typeOfHouse=typeOfHouse;
	}
	private Integer mapTypeToCost()
	{
		Integer k=0;
		k=((k|this.typeOfHouse.getHouseStandard())<<1)|this.typeOfHouse.getHouseAutomation();
		return this.typeOfHouse.getHouseStandardCostMapping().get(k);
	}
	public void calculateCostOfHouse()
	{
		this.costOfTheHouse=this.typeOfHouse.getHouseAreaInSqft()*this.mapTypeToCost();
	}
	public Double getCostOfTheHouse()
	{
		return this.costOfTheHouse;
	}

}
