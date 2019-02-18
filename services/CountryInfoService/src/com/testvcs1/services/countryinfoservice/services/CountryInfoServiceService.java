/**This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

package com.testvcs1.services.countryinfoservice.services;
import com.testvcs1.services.countryinfoservice.*;
import java.util.List;

import com.wavemaker.runtime.soap.util.SoapSettingsResolver;
import com.wavemaker.runtime.soap.SoapServiceSettings;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import javax.xml.ws.BindingProvider;



@Service
public class CountryInfoServiceService{

    @Autowired
    @Qualifier("CountryInfoServiceSoapServiceSettings")
    private SoapServiceSettings soapServiceSettings;


	public FullCountryInfoResponse fullCountryInfo(  com.testvcs1.services.countryinfoservice.FullCountryInfo parameters )
	          {
 	    CountryInfoService countryinfoservice = new CountryInfoService();
 CountryInfoServiceSoapType countryinfoservicesoaptype = countryinfoservice.getCountryInfoServiceSoap12();
 SoapSettingsResolver.setBindingProperties((BindingProvider)countryinfoservicesoaptype, soapServiceSettings);
 return countryinfoservicesoaptype.fullCountryInfo(parameters );
	}

	public CountryFlagResponse countryFlag(  com.testvcs1.services.countryinfoservice.CountryFlag parameters )
	          {
 	    CountryInfoService countryinfoservice = new CountryInfoService();
 CountryInfoServiceSoapType countryinfoservicesoaptype = countryinfoservice.getCountryInfoServiceSoap12();
 SoapSettingsResolver.setBindingProperties((BindingProvider)countryinfoservicesoaptype, soapServiceSettings);
 return countryinfoservicesoaptype.countryFlag(parameters );
	}

	public CountryNameResponse countryName(  com.testvcs1.services.countryinfoservice.CountryName parameters )
	          {
 	    CountryInfoService countryinfoservice = new CountryInfoService();
 CountryInfoServiceSoapType countryinfoservicesoaptype = countryinfoservice.getCountryInfoServiceSoap12();
 SoapSettingsResolver.setBindingProperties((BindingProvider)countryinfoservicesoaptype, soapServiceSettings);
 return countryinfoservicesoaptype.countryName(parameters );
	}

	public CountryCurrencyResponse countryCurrency(  com.testvcs1.services.countryinfoservice.CountryCurrency parameters )
	          {
 	    CountryInfoService countryinfoservice = new CountryInfoService();
 CountryInfoServiceSoapType countryinfoservicesoaptype = countryinfoservice.getCountryInfoServiceSoap12();
 SoapSettingsResolver.setBindingProperties((BindingProvider)countryinfoservicesoaptype, soapServiceSettings);
 return countryinfoservicesoaptype.countryCurrency(parameters );
	}

	public ListOfCountryNamesByCodeResponse listOfCountryNamesByCode(  com.testvcs1.services.countryinfoservice.ListOfCountryNamesByCode parameters )
	          {
 	    CountryInfoService countryinfoservice = new CountryInfoService();
 CountryInfoServiceSoapType countryinfoservicesoaptype = countryinfoservice.getCountryInfoServiceSoap12();
 SoapSettingsResolver.setBindingProperties((BindingProvider)countryinfoservicesoaptype, soapServiceSettings);
 return countryinfoservicesoaptype.listOfCountryNamesByCode(parameters );
	}

	public ListOfCurrenciesByNameResponse listOfCurrenciesByName(  com.testvcs1.services.countryinfoservice.ListOfCurrenciesByName parameters )
	          {
 	    CountryInfoService countryinfoservice = new CountryInfoService();
 CountryInfoServiceSoapType countryinfoservicesoaptype = countryinfoservice.getCountryInfoServiceSoap12();
 SoapSettingsResolver.setBindingProperties((BindingProvider)countryinfoservicesoaptype, soapServiceSettings);
 return countryinfoservicesoaptype.listOfCurrenciesByName(parameters );
	}

	public CountryIntPhoneCodeResponse countryIntPhoneCode(  com.testvcs1.services.countryinfoservice.CountryIntPhoneCode parameters )
	          {
 	    CountryInfoService countryinfoservice = new CountryInfoService();
 CountryInfoServiceSoapType countryinfoservicesoaptype = countryinfoservice.getCountryInfoServiceSoap12();
 SoapSettingsResolver.setBindingProperties((BindingProvider)countryinfoservicesoaptype, soapServiceSettings);
 return countryinfoservicesoaptype.countryIntPhoneCode(parameters );
	}

	public CurrencyNameResponse currencyName(  com.testvcs1.services.countryinfoservice.CurrencyName parameters )
	          {
 	    CountryInfoService countryinfoservice = new CountryInfoService();
 CountryInfoServiceSoapType countryinfoservicesoaptype = countryinfoservice.getCountryInfoServiceSoap12();
 SoapSettingsResolver.setBindingProperties((BindingProvider)countryinfoservicesoaptype, soapServiceSettings);
 return countryinfoservicesoaptype.currencyName(parameters );
	}

	public ListOfCurrenciesByCodeResponse listOfCurrenciesByCode(  com.testvcs1.services.countryinfoservice.ListOfCurrenciesByCode parameters )
	          {
 	    CountryInfoService countryinfoservice = new CountryInfoService();
 CountryInfoServiceSoapType countryinfoservicesoaptype = countryinfoservice.getCountryInfoServiceSoap12();
 SoapSettingsResolver.setBindingProperties((BindingProvider)countryinfoservicesoaptype, soapServiceSettings);
 return countryinfoservicesoaptype.listOfCurrenciesByCode(parameters );
	}

	public ListOfLanguagesByCodeResponse listOfLanguagesByCode(  com.testvcs1.services.countryinfoservice.ListOfLanguagesByCode parameters )
	          {
 	    CountryInfoService countryinfoservice = new CountryInfoService();
 CountryInfoServiceSoapType countryinfoservicesoaptype = countryinfoservice.getCountryInfoServiceSoap12();
 SoapSettingsResolver.setBindingProperties((BindingProvider)countryinfoservicesoaptype, soapServiceSettings);
 return countryinfoservicesoaptype.listOfLanguagesByCode(parameters );
	}

	public LanguageISOCodeResponse languageISOCode(  com.testvcs1.services.countryinfoservice.LanguageISOCode parameters )
	          {
 	    CountryInfoService countryinfoservice = new CountryInfoService();
 CountryInfoServiceSoapType countryinfoservicesoaptype = countryinfoservice.getCountryInfoServiceSoap12();
 SoapSettingsResolver.setBindingProperties((BindingProvider)countryinfoservicesoaptype, soapServiceSettings);
 return countryinfoservicesoaptype.languageISOCode(parameters );
	}

	public CapitalCityResponse capitalCity(  com.testvcs1.services.countryinfoservice.CapitalCity parameters )
	          {
 	    CountryInfoService countryinfoservice = new CountryInfoService();
 CountryInfoServiceSoapType countryinfoservicesoaptype = countryinfoservice.getCountryInfoServiceSoap12();
 SoapSettingsResolver.setBindingProperties((BindingProvider)countryinfoservicesoaptype, soapServiceSettings);
 return countryinfoservicesoaptype.capitalCity(parameters );
	}

	public ListOfLanguagesByNameResponse listOfLanguagesByName(  com.testvcs1.services.countryinfoservice.ListOfLanguagesByName parameters )
	          {
 	    CountryInfoService countryinfoservice = new CountryInfoService();
 CountryInfoServiceSoapType countryinfoservicesoaptype = countryinfoservice.getCountryInfoServiceSoap12();
 SoapSettingsResolver.setBindingProperties((BindingProvider)countryinfoservicesoaptype, soapServiceSettings);
 return countryinfoservicesoaptype.listOfLanguagesByName(parameters );
	}

	public ListOfCountryNamesGroupedByContinentResponse listOfCountryNamesGroupedByContinent(  com.testvcs1.services.countryinfoservice.ListOfCountryNamesGroupedByContinent parameters )
	          {
 	    CountryInfoService countryinfoservice = new CountryInfoService();
 CountryInfoServiceSoapType countryinfoservicesoaptype = countryinfoservice.getCountryInfoServiceSoap12();
 SoapSettingsResolver.setBindingProperties((BindingProvider)countryinfoservicesoaptype, soapServiceSettings);
 return countryinfoservicesoaptype.listOfCountryNamesGroupedByContinent(parameters );
	}

	public ListOfCountryNamesByNameResponse listOfCountryNamesByName(  com.testvcs1.services.countryinfoservice.ListOfCountryNamesByName parameters )
	          {
 	    CountryInfoService countryinfoservice = new CountryInfoService();
 CountryInfoServiceSoapType countryinfoservicesoaptype = countryinfoservice.getCountryInfoServiceSoap12();
 SoapSettingsResolver.setBindingProperties((BindingProvider)countryinfoservicesoaptype, soapServiceSettings);
 return countryinfoservicesoaptype.listOfCountryNamesByName(parameters );
	}

	public ListOfContinentsByNameResponse listOfContinentsByName(  com.testvcs1.services.countryinfoservice.ListOfContinentsByName parameters )
	          {
 	    CountryInfoService countryinfoservice = new CountryInfoService();
 CountryInfoServiceSoapType countryinfoservicesoaptype = countryinfoservice.getCountryInfoServiceSoap12();
 SoapSettingsResolver.setBindingProperties((BindingProvider)countryinfoservicesoaptype, soapServiceSettings);
 return countryinfoservicesoaptype.listOfContinentsByName(parameters );
	}

	public LanguageNameResponse languageName(  com.testvcs1.services.countryinfoservice.LanguageName parameters )
	          {
 	    CountryInfoService countryinfoservice = new CountryInfoService();
 CountryInfoServiceSoapType countryinfoservicesoaptype = countryinfoservice.getCountryInfoServiceSoap12();
 SoapSettingsResolver.setBindingProperties((BindingProvider)countryinfoservicesoaptype, soapServiceSettings);
 return countryinfoservicesoaptype.languageName(parameters );
	}

	public ListOfContinentsByCodeResponse listOfContinentsByCode(  com.testvcs1.services.countryinfoservice.ListOfContinentsByCode parameters )
	          {
 	    CountryInfoService countryinfoservice = new CountryInfoService();
 CountryInfoServiceSoapType countryinfoservicesoaptype = countryinfoservice.getCountryInfoServiceSoap12();
 SoapSettingsResolver.setBindingProperties((BindingProvider)countryinfoservicesoaptype, soapServiceSettings);
 return countryinfoservicesoaptype.listOfContinentsByCode(parameters );
	}

	public CountriesUsingCurrencyResponse countriesUsingCurrency(  com.testvcs1.services.countryinfoservice.CountriesUsingCurrency parameters )
	          {
 	    CountryInfoService countryinfoservice = new CountryInfoService();
 CountryInfoServiceSoapType countryinfoservicesoaptype = countryinfoservice.getCountryInfoServiceSoap12();
 SoapSettingsResolver.setBindingProperties((BindingProvider)countryinfoservicesoaptype, soapServiceSettings);
 return countryinfoservicesoaptype.countriesUsingCurrency(parameters );
	}

	public CountryISOCodeResponse countryISOCode(  com.testvcs1.services.countryinfoservice.CountryISOCode parameters )
	          {
 	    CountryInfoService countryinfoservice = new CountryInfoService();
 CountryInfoServiceSoapType countryinfoservicesoaptype = countryinfoservice.getCountryInfoServiceSoap12();
 SoapSettingsResolver.setBindingProperties((BindingProvider)countryinfoservicesoaptype, soapServiceSettings);
 return countryinfoservicesoaptype.countryISOCode(parameters );
	}

	public FullCountryInfoAllCountriesResponse fullCountryInfoAllCountries(  com.testvcs1.services.countryinfoservice.FullCountryInfoAllCountries parameters )
	          {
 	    CountryInfoService countryinfoservice = new CountryInfoService();
 CountryInfoServiceSoapType countryinfoservicesoaptype = countryinfoservice.getCountryInfoServiceSoap12();
 SoapSettingsResolver.setBindingProperties((BindingProvider)countryinfoservicesoaptype, soapServiceSettings);
 return countryinfoservicesoaptype.fullCountryInfoAllCountries(parameters );
	}
}
