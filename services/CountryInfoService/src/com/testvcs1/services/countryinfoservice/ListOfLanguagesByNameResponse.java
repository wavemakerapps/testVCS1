/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.testvcs1.services.countryinfoservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ListOfLanguagesByNameResult" type="{http://www.oorsprong.org/websamples.countryinfo}ArrayOftLanguage"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "listOfLanguagesByNameResult"
})
@XmlRootElement(name = "ListOfLanguagesByNameResponse")
public class ListOfLanguagesByNameResponse {

    @XmlElement(name = "ListOfLanguagesByNameResult", required = true)
    protected ArrayOftLanguage listOfLanguagesByNameResult;

    /**
     * Gets the value of the listOfLanguagesByNameResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftLanguage }
     *     
     */
    public ArrayOftLanguage getListOfLanguagesByNameResult() {
        return listOfLanguagesByNameResult;
    }

    /**
     * Sets the value of the listOfLanguagesByNameResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftLanguage }
     *     
     */
    public void setListOfLanguagesByNameResult(ArrayOftLanguage value) {
        this.listOfLanguagesByNameResult = value;
    }

}