package domain;

/**
 * @author Jatin
 * @version 1.1
 * @created 06-May-2020 8:30:00am
 */
public class Industrial extends Property {

	private String hazardStatus;
	private String heavyVehicleStatus;
	private static final double CIV_RATE = 0.0059;
	private static final int INDUSTRIAL_WASTE_DISPOSAL_UNITS = 4;
	private static final int FIRE_SEVICES_LEVY  = 200;
	private static final double FIRE_SERVICES_PERCENT = 0.00006;

	public Industrial() {
		this.type="Public";
		this.hazardStatus="";
		this.heavyVehicleStatus=0;
		setCapitalImprovedRate(CIV_RATE);
		
		System.out.println("implemented");
	}
	/* Constructors */
	public Industrial(String type, String hazardStatus, int heavyVehicleStatus)
	{
		this.type=type;
		this.hazardStatus=hazardStatus;
		this.heavyVehicleStatus=heavyVehicleStatus;
		setCapitalImprovedRate(CIV_RATE);
	}
	/* Setter Methods */
	public void setType(String type)
	{
		this.type =type;
	}
	public void hazardStatus(String hazardStatus)
	{
		this.hazardStatus = hazardStatus;
	}
	 public void heavyVehicleStatus(String heavyVehicleStatus)
	 {
		 this.heavyVehicleStatus = heavyVehicleStatus;
	 }
	
		
		/* Getter Methods */
		public String getType()
		{
			return type;
		}
		public String gethazardStatus()
		{
			return hazardStatus;
		}
		public int getheavyVehicleStatus()
		{
			return heavyVehicleStatus;
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
			return  super.toString() + "Industrial [\n" + 
										industrialWasteDisposal.toString() + "\n" +
										fireServicesLevy.toString() + " ]\n ";
	
		
	}

	
}
