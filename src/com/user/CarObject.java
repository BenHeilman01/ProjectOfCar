package com.user;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class CarObject {

	private String name;
	private String model;
	private String year;
	private String price;
	private String description;
	private File picture;
	private String vin;
	private String boughtBy;
	private String dateOfPurchase;
	
	
	public String getBoughtBy() {
		return boughtBy;
	}


	public String getDatePurchase() {
		return dateOfPurchase;
	}


	public void setDatePurchase(String datePurchase) {
		this.dateOfPurchase = datePurchase;
	}


	public void setBoughtBy(String boughtBy) {
		this.boughtBy = boughtBy;
	}

	private final static String path = "C:\\Software\\ServletProject\\carFolder\\";
	
	public CarObject() {}
	
	
	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public void setPicture(File picture) {
		this.picture = picture;
	}

	
	


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public String getDateOfPurchase() {
		return dateOfPurchase;
	}

	public void setDateOfPurchase(String dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}
	public void saveToFile() {
	String fileName = path+name+".txt";
	
	try {
	BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
	bw.write(formatData());
	bw.close();
	}catch(IOException e) {
		System.out.println("Save to file failed");
	}
	
	}
	//parse by comma's
	private String formatData() {
		return this.name+","+this.model+","+this.year+","+this.price + "," + this.description + "," + this.vin + "," + this.dateOfPurchase;
}
	//assign what it prints as
	public String toString() {
		return "Name: "+ this.name +" Model: " + this.model+ " Year: "+this.year + " Price: "+this.price + " Description: " + this.description + " VIN: " + this.vin + "Date Of Purchase: " + this.dateOfPurchase;
	}
	public boolean checkSpecialPricing(String purchaseDate) {
		// Over 120 days?
		boolean specialPricing = false;
		// Today
		LocalDate today = LocalDate.now();
		
		// Formatting the purchaseDate we grab from the data
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate dateConvert = LocalDate.parse(purchaseDate, formatter);
		
		// This is the today's date minus 120
		LocalDate day120 = today.minusDays(120);
//		System.out.println("Day 120: " + day120);
		
		Long timeLapsed = ChronoUnit.DAYS.between(dateConvert, day120);
//		System.out.println("Number of days since added into system: " + timeLapsed);
		
		if(timeLapsed > 120) {
			specialPricing = true;
		}
		return specialPricing;
	}

}
