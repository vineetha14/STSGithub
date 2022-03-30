package com.zensar.CityMockitoDemo;
import static org.junit.Assert.*;
public class BusinessAppTest {
@Test
	public void testBusinessApp() {
		CityService cityService=new CityServiceImpl();
		BusinessApp businessApp=new BusinessApp(cityService);
		assertEquals(businessApp.retrieveCityListByCountry("INDIA").size(),5);
		CityService cityService2=new CityServiceStub();
	}

}
