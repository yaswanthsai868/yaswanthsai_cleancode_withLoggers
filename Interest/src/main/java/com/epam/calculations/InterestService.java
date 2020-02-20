package com.epam.calculations;
import java.util.Scanner;
import org.apache.logging.log4j.*;
public class InterestService {
	private Integer menuOption;
	private Data interestData;
	private Scanner input;
	private static final Logger LOGGER = LogManager.getLogger(InterestService.class);
	private CollectData interestDataCollector;
	public InterestService()
	{
		this.menuOption=new Integer(0);
		this.input=new Scanner(System.in);
		this.interestData=new Data();
		this.interestDataCollector=new CollectData(this.input,this.interestData);
	}
	public void consoleMenu()
	{
		do
		{
			LOGGER.info("Choose the options....");
			LOGGER.info("1:Simple Interest");
			LOGGER.info("2:Compound Interest");
			LOGGER.info("3:Exit");
			this.menuOption=this.input.nextInt();
			if(this.menuOption!=3)
			{
				this.interestDataCollector.getPrincipleData();
				this.interestDataCollector.getRateOfInterestData();
				this.interestDataCollector.getNumberOfYearsData();
			}
			switch(this.menuOption)
			{
			case 1:
				SimpleInterest calSimpleInterest=new SimpleInterest(interestData);
				calSimpleInterest.calculateInterest();
				LOGGER.info("The Simple Interest is "+calSimpleInterest.getSimpleInterestTotal());
				break;
			case 2:
				CompoundInterest calCompoundInterest=new CompoundInterest(interestData);
				calCompoundInterest.calculateCompoundInterest();
				LOGGER.info("The Compound Interest is "+calCompoundInterest.getCompoundInterestTotal());
				break;
			case 3:
				break;
			default:
				LOGGER.info("Invalid option");
			}
			if(this.menuOption!=3)
			{
				while(true)
				{
					LOGGER.info("Do you want to continue press 1 to continue or 0 to stop");
					Integer choice=new Integer(this.input.nextInt());
					if(choice==0)
					{
						this.menuOption=3;
						break;
					}
					else if(choice==1)
					{
						break;
					}
					else
					{
						LOGGER.info("Invalid Option");
					}
				}
			}
		}while(this.menuOption!=3);
	}
}
