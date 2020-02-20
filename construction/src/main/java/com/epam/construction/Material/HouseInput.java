package com.epam.construction.Material;
import java.util.Scanner;

import org.apache.logging.log4j.*;
public class HouseInput {
	private Scanner input;
	private HouseParameters houseQuality;
	private final static Logger logger=LogManager.getLogger(HouseParameters.class);
	public HouseInput(Scanner input,HouseParameters houseQuality)
	{
		this.houseQuality=houseQuality;
		this.input=input;
	}
	public void setHouseArea()
	{
		logger.info("Enter the Area of the house");
		this.houseQuality.setHouseAreaInSqft(this.input.nextDouble());
	}
}
