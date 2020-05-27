package operation;
import java.util.*;
import domain.AddProperty;
import java.io.*;
/**
 * @author Jatin Bassi
 * @version 1.0
 
 * @created 20 may, 2020
 */

public class AddPropertyData {
	
	private ArrayList<AddProperty> AddProperties;
	public AddPropertyData()
	{
		AddProperties = new ArrayList<AddProperty>();
	}
	public void insert(AddProperty _property)
	{
		AddProperties.add(_property);
	}
	
	public int getSize()
	{
		return AddProperties.size();
	}
	public String toString()
	{
		String result="";
		for(AddProperty AddProperty: AddProperties)
		{
			result += "\n"+AddProperty.toString();
		}
		return result;
	}
	public void writeToFile()
	{
		File file = new File("C:\\Users\\Jatin\\git\\JatinGroup11\\ITECH2306_202007_Lab_Assignment1\\src\\files\\ITECH2306_2020_Load_Properties1.txt");
		//File file = new File("ITECH2306_2020_Load_Properties1.txt");
		
		FileOutputStream fos = null;
		PrintStream outFile = null;

		try {
			fos = new FileOutputStream(file);
			outFile = new PrintStream(fos);
			for(AddProperty property: AddProperties)
			{
				outFile.println(property.getunit()+","+property.getaddress()+","+property.getarea()+","+property.getsiteValue()+","+ property.getcapitalImprovedValue()+","+ property.getcapitalImprovedRate()","+ property.getnetAnnualValue()","+ property.getvaluationDate()+",false");
			}
		}
		catch(Exception ex)
		{
			System.out.println("Error Opening File");
		}

	}
	public void readFromFile()
	{
		
		try
		{
			File file = new File("C:\\Users\\Jatin\\git\\JatinGroup11\\ITECH2306_202007_Lab_Assignment1\\src\\files\\ITECH2306_2020_Load_Properties1.txt");
			//File file = new File("ITECH2306_2020_Load_Properties1.txt");
			Scanner input = new Scanner(file);
			while(input.hasNext()) {
				String line = input.nextLine();
				String values[] = line.split(",");
				AddProperty property = new AddProperty();
				payer.setunit(values[0]);
				payer.setAddress(values[1]);
				payer.setarea(values[2]);
				payer.setsiteValue(values[3]);
				payer.setcapitalImprovedValue(values[4]);
				payer.setcapitalImprovedRate(values[5]);
				payer.setnetAnnualValue(values[6]);
				payer.setvaluationDate(values[7]);
				AddProperties.add(property);
			}
			file = null;
		}
		catch(Exception ae)
		{
			System.out.println("Error Opening/Reading File");
		}
		
	}
}
