package com.zensar.CityMockitoDemo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class CityServiceStub implements CityService{
public List<String> findCitiesByCountries(String country){
	List<String> cities =new ArrayList<String>();
	if(country.equalsIgnoreCase("INDIA")) {
		cities=Arrays.asList("Pune","Mumbai","Delhi");
	}
	else if(country.equalsIgnoreCase("USA")){
		cities=Arrays.asList("New York","WashingTon");
		
	}
	return cities;
}
}
