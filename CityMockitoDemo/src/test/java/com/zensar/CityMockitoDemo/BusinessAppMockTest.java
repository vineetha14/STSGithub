package com.zensar.CityMockitoDemo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;



import java.util.Arrays;



import org.junit.Test;



public class BusinessAppMockTest {

@Test
public void testBusinessApp() {
CityService cityService = mock(CityService.class);
LoginService loginService = mock(LoginService.class);

when(cityService.findCitiesByCountries("INDIA")).
thenReturn(Arrays.asList("Pune", "Mumbai", "Delhi"));
when(cityService.findCitiesByCountries("USA")).
thenReturn(Arrays.asList("New York", "Washington"));

when(loginService.authenticate("Shadow", "hello")).
thenReturn(true);
when(loginService.authenticate("0000", "0000")).
thenReturn(true);

//matcher
when(cityService.findCitiesByCountries(anyString())).
thenReturn(Arrays.asList("city1", "city2", "city3"));
when(cityService.findCitiesByCountries("SWEDEN")).
thenThrow(NullPointerException.class);

when(loginService.authenticate("admin", "admin")).
thenThrow(NoSuchFieldError.class);

BusinessApp businessApp = new BusinessApp(cityService, loginService);
//assertEquals(businessApp.retrieveCityListByCountry("SWEDEN").size(), 3);
businessApp.retrieveCityListByCountry("INDIA");
businessApp.authenticate("Shadow", "hello");

}
}