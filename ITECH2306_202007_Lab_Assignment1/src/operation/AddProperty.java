package operation;
import java.io.File;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

import domain.OtherProperty;
import domain.Property;
import domain.Residential;
import domain.AddProperty;

/**
 * @author jatin bassi
 * @version 1.1
 * @created 21 may, 2020
 */
public class AddProperty extends FunctionalDialog {
	
	CalculatePropertyTypeRates propertydata;
	public AddProperty(Scanner console) {
		super(1, console);
		propertydata = new CalculatePropertyTypeRates();
		propertydata.readFromFile();
	}

	@Override
	public void obtainInput(int i) {

String unit,address,area,siteValue,capitalImprovedValue,capitalImprovedRate,netAnnualValue,valuationDate;
		System.out.println("Enter units's name : ");
		name = super.getScanner().nextLine();
		System.out.println("Enter property's Address : ");
		address = super.getScanner().nextLine();
		System.out.println("Enter property area : ");
		postcode = super.getScanner().nextLine();
		System.out.println("Enter property's siteValue : ");
		phone = super.getScanner().nextLine();
		System.out.println("Enter property's capitalImprovedValue : ");
		type = super.getScanner().nextLine();
		System.out.println("Enter property's capitalImprovedRate : ");
		type = super.getScanner().nextLine();
		System.out.println("Enter property's netAnnualValue : ");
		type = super.getScanner().nextLine();
		System.out.println("Enter property's valuationDate : ");
		type = super.getScanner().nextLine();
		
		AddProperty addproperty = new AddProperty();
		addproperty.setUnit(unit);
		addproperty.setAddress(address);
		addproperty.setArea(area);
		addproperty.setSiteValue(siteValue);
		addproperty.setCapitalImprovedValue(capitalImprovedValue);
		addproperty.setCapitalImprovedRate(capitalImprovedRate);
		addproperty.setNetAnnualValue(netAnnualValue);
		addproperty.setValuationDate(valuationDate);
		propertydata.insert(ratePayer);
		setStillRunning(false);
	}

	@Override
	public void respondToInput() {
		
		System.out.println("\nList of Property type is : \n"+propertydata.toString());
		propertydata.writeToFile();
		
	}
	
	
}
