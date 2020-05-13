package domain;

/**
 * @author Jatin
 * @version 1.1
 * @created 06-May-2020 8:30:00am
 */
public class Commercial {
	private String Business_name;
	private String ABN;
	private static final double CIV_RATE = 0.0059;
	private static final int INDUSTRIAL_WASTE_DISPOSAL_UNITS = 2;
	private static final int FIRE_SEVICES_LEVY  = 200;
	private static final double FIRE_SERVICES_PERCENT = 0.00006;

	public Commercial() {
		this.type="Public";
		this.Business_name="";
		this.ABN=0;
		setCapitalImprovedRate(CIV_RATE);
		
		System.out.println("implemented");
	}
	/* Constructors */
	public Industrial(String type, String Business_name, int ABN)
	{
		this.type=type;
		this.Business_name=Business_name;
		this.ABN=ABN;
		setCapitalImprovedRate(CIV_RATE);
	}
	/* Setter Methods */
	public void setType(String type)
	{
		this.type =type;
	}
	public void Business_name(String Business_name)
	{
		this.Business_name = Business_name;
	}
	 public void ABN(String ABN)
	 {
		 this.ABN = ABN;
	 }
	
		
		/* Getter Methods */
		public String getType()
		{
			return type;
		}
		public String Business_name()
		{
			return Business_name;
		}
		public int ABN()
		{
			return ABN; 
		} 

	@Override
	public double calculateExtraServices() { 
		industrialWasteDisposal = new UnitAndRateService("Waste Management",
				INDUSTRIAL_WASTE_DISPOSAL_UNITS,
				INDUSTRIAL_WASTE_DISPOSAL_FEES);
		fireServicesLevy = new BaseAndPercentageOfValueService("Fire Levy",
																FIRE_SERVICES_BASE,
																FIRE_SERVICES_PERCENT,
																getCapitalImprovedValue())
		
	}

	@Override
	public void setUpExtraServices() {
		public String toString() {
			return  super.toString() + "C [\n" + 
										industrialWasteDisposal.toString() + "\n" +
										fireServicesLevy.toString() + " ]\n ";
	
		
	}

	
}

	

	
	}
}
