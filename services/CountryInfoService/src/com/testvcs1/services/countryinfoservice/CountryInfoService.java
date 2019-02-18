/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.testvcs1.services.countryinfoservice;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This DataFlex Web Service opens up country information. 2 letter ISO codes are used for Country code. There are functions to retrieve the used Currency, Language, Capital City, Continent and Telephone code.
 *
 * This class was generated by Apache CXF 3.2.2
  * 2019-02-18T12:15:55.793Z
 * Generated source version: 3.2.2
 *
 */
@WebServiceClient(name = "CountryInfoService",
                  wsdlLocation = "CountryInfoService.wsdl",
                  targetNamespace = "http://www.oorsprong.org/websamples.countryinfo")
public class CountryInfoService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.oorsprong.org/websamples.countryinfo", "CountryInfoService");
    public final static QName CountryInfoServiceSoap12 = new QName("http://www.oorsprong.org/websamples.countryinfo", "CountryInfoServiceSoap12");
    public final static QName CountryInfoServiceSoap = new QName("http://www.oorsprong.org/websamples.countryinfo", "CountryInfoServiceSoap");
    static {
        URL url = CountryInfoService.class.getResource("CountryInfoService.wsdl");
        if (url == null) {
            url = CountryInfoService.class.getClassLoader().getResource("CountryInfoService.wsdl");
        }
        if (url == null) {
            java.util.logging.Logger.getLogger(CountryInfoService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "CountryInfoService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public CountryInfoService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CountryInfoService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CountryInfoService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public CountryInfoService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public CountryInfoService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public CountryInfoService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns CountryInfoServiceSoapType
     */
    @WebEndpoint(name = "CountryInfoServiceSoap12")
    public CountryInfoServiceSoapType getCountryInfoServiceSoap12() {
        return super.getPort(CountryInfoServiceSoap12, CountryInfoServiceSoapType.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CountryInfoServiceSoapType
     */
    @WebEndpoint(name = "CountryInfoServiceSoap12")
    public CountryInfoServiceSoapType getCountryInfoServiceSoap12(WebServiceFeature... features) {
        return super.getPort(CountryInfoServiceSoap12, CountryInfoServiceSoapType.class, features);
    }


    /**
     *
     * @return
     *     returns CountryInfoServiceSoapType
     */
    @WebEndpoint(name = "CountryInfoServiceSoap")
    public CountryInfoServiceSoapType getCountryInfoServiceSoap() {
        return super.getPort(CountryInfoServiceSoap, CountryInfoServiceSoapType.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CountryInfoServiceSoapType
     */
    @WebEndpoint(name = "CountryInfoServiceSoap")
    public CountryInfoServiceSoapType getCountryInfoServiceSoap(WebServiceFeature... features) {
        return super.getPort(CountryInfoServiceSoap, CountryInfoServiceSoapType.class, features);
    }

}