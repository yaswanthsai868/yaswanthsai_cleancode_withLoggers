package com.epam.construction.Material;
import java.util.*;

public class HouseParameters {
	private Integer houseStandard;
	private Double houseAreaInSqft;
	private Integer houseAutomation;
	private HashMap<Integer,Integer> houseStandardCostMapping;
	public HouseParameters()
	{
		this.houseStandardCostMapping=new HashMap<Integer,Integer>();
		this.houseStandardCostMapping.put(0,1200);
		this.houseStandardCostMapping.put(1, 1500);
		this.houseStandardCostMapping.put(2,1800);
		this.houseStandardCostMapping.put(3, 2500);
	}
	public Integer getHouseStandard() {
		return houseStandard;
	}
	public void setHouseStandard(Integer houseStandard) {
		this.houseStandard = houseStandard;
	}
	public Double getHouseAreaInSqft() {
		return houseAreaInSqft;
	}
	public void setHouseAreaInSqft(Double houseAreaInSqft) {
		this.houseAreaInSqft = houseAreaInSqft;
	}
	public Integer getHouseAutomation() {
		return houseAutomation;
	}
	public void setHouseAutomation(Integer houseAutomation) {
		this.houseAutomation = houseAutomation;
	}
	public HashMap<Integer,Integer> getHouseStandardCostMapping()
	{
		return this.houseStandardCostMapping;
	}
}
