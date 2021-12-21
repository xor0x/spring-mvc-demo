package com.klon.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String lastName;
	private String country;
	
//	private LinkedHashMap<String, String> countryOptions;
	private LinkedHashMap<String, String> favoriteLanguageOptions;
	
	private String favoriteLanguage;
	private String[] operationSystems;

	public Student() {
//		countryOptions = new LinkedHashMap<>();
//		countryOptions.put("BR", "Brazil");
//		countryOptions.put("FR", "France");
//		countryOptions.put("DE", "Germany");
//		countryOptions.put("IN", "India");
//		countryOptions.put("US", "Unated States of America");
		
        // populate favorite language options
        favoriteLanguageOptions = new LinkedHashMap<>();
        // parameter order: value, display label
        //
        favoriteLanguageOptions.put("Java", "Java");
        favoriteLanguageOptions.put("Python", "Python");
        favoriteLanguageOptions.put("GO", "GO");
        favoriteLanguageOptions.put("Rust", "Rust");  
        favoriteLanguageOptions.put("TypeScript", "TypeScript");  
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

//	public LinkedHashMap<String, String> getCountryOptions() {
//		return countryOptions;
//	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}
	
    public LinkedHashMap<String, String> getFavoriteLanguageOptions() {
        return favoriteLanguageOptions;
    }

	public String[] getOperationSystems() {
		return operationSystems;
	}

	public void setOperationSystems(String[] operationSystems) {
		this.operationSystems = operationSystems;
	}
	
}
