package com.epam.calculations;
import java.util.Scanner;
import org.apache.logging.log4j.*;
public class CollectData {
	private Data interestData;
	private Scanner input;
	private static final Logger LOGGER=LogManager.getLogger(CollectData.class);
	public CollectData(Scanner input,Data interestData)
	{
		this.interestData=interestData;
		this.input=input;
	}
	public void getPrincipleData()
	{
		LOGGER.info("Enter the principle amount");
		this.interestData.setPrincipleAmount(this.input.nextDouble());
	}
	public void getRateOfInterestData()
	{
		LOGGER.info("Enter the Rate of Interest");
		this.interestData.setRateOfInterest(this.input.nextDouble());
	}
	public void getNumberOfYearsData()
	{
		LOGGER.info("Enter the Number of years");
		this.interestData.setTimeRequiredToPay(this.input.nextDouble());
	}
}
