/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.vaannila;

import java.util.ArrayList;

/**
 *
 * @author eswar@vaannila.com
 */
public class InputForm extends org.apache.struts.action.ActionForm {
    
    private String country;
    
    private String state;

    private ArrayList countryList;

    private ArrayList stateList;

    public InputForm() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the countryList
     */
    public ArrayList getCountryList() {
        return countryList;
    }

    /**
     * @param countryList the countryList to set
     */
    public void setCountryList(ArrayList countryList) {
        this.countryList = countryList;
    }

    /**
     * @return the stateList
     */
    public ArrayList getStateList() {
        return stateList;
    }

    /**
     * @param stateList the stateList to set
     */
    public void setStateList(ArrayList stateList) {
        this.stateList = stateList;
    }

    
}
