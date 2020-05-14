package domain;

/**
 * @author Jatin
 * @version 1.1
 * @created 06-May-2020 8:30:00am
 */
public class SchoolCommunity {

	private String classification;
	private String public;
	private String private;
	private String category;
	
	    private static final double CIV_RATE = 0.0025;
		private static final int INDUSTRIAL_WASTE_DISPOSAL_UNITS = 2;
		private static final int FIRE_SEVICES_LEVY  = 200;
		private static final int TRAFFIC_MANAGEMENT_LEVY= 200;
		private static final double TRAFFIC_MANAGEMENT_LEVY_SMALL_ORGANISATION = 60;
		private static final double TRAFFIC_MANAGEMENT_LEVY_MEDIUM_ORGANISATION = 80;
		private static final double TRAFFIC_MANAGEMENT_LEVY_LARGE_ORGANISATION = 100;
		

		public SchoolCommunity() {
			this.classification="Public";
			this.category="";
			
			setCapitalImprovedRate(CIV_RATE);
			
			System.out.println("implemented");
		}
		/* Constructors */
		public Industrial(String classification, String category)
		{
			this.classification=classification;
			this.category=category;
			setCapitalImprovedRate(CIV_RATE);
		}
		/* Setter Methods */
		public void setclassification(String type)
		{
			this.classification =classification;
		}
		public void setcategory(String category)
		{
			this.category = category;
		}
		 
		
			
			/* Getter Methods */
			public String getclassification()
			{
				return classification;
			}
			public String getcategory()
			{
				return category;
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

}
